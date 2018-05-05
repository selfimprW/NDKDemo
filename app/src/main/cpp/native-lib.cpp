#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_com_zhuan_ndkdemo_JNITest_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
//
//extern "C"
//JNIEXPORT jstring JNICALL
//Java_com_zhuan_ndkdemo_JNITest_stringFromJNI(JNIEnv *env, jobject instance) {
//
//    // TODO
//
//
//    return env->NewStringUTF(returnValue);
//}