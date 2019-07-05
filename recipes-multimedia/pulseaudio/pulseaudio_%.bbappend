
#https://tls.mbed.org/kb/development/arm-thumb-error-r7-cannot-be-used-in-asm-here
CFLAGS_append = " -fomit-frame-pointer"