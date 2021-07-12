//
// Created by DM on 2021/7/9.
//

#include <jni.h>
#include <string>

extern "C" jstring
Java_com_biao_buglydemo_NativeJni_stringFromJNI(
        JNIEnv *env, jclass clazz) {
    std::string hello = "Hello from C++ patch2";
    return env->NewStringUTF(hello.c_str());
}

extern "C" void
Java_com_biao_buglydemo_NativeJni_createNativeCrash(
        JNIEnv *env, jclass clazz) {
    int *p = 0;
    *p = 1;
}

