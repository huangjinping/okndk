#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_org_diss_okndk_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jint JNICALL
Java_org_diss_okndk_MainActivity_sumByJNI(JNIEnv *env, jobject thiz, jint a, jint b) {
    return a + b;
}