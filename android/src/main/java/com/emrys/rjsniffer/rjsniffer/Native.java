package com.emrys.rjsniffer.rjsniffer;

class Native {

    static {
        System.loadLibrary("native-lib");
    }

    static native boolean isMagiskPresentNative();

}
