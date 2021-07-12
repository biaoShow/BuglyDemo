package com.biao.buglydemo;

public class NativeJni {
    static {
        System.loadLibrary("hotfix");
    }

    public static native String stringFromJNI();

    public static native void createNativeCrash();
}
