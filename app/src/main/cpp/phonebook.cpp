#include <jni.h>
#include <string>

using namespace std;
extern "C" JNIEXPORT jobjectArray JNICALL Java_com_example_a2_MainActivity_phone(JNIEnv *env, jobject jobj){

    jobjectArray ter;
    int i;
    const char *phone[5]= {"89003009030",
                           "89003009031",
                           "89003009032",
                           "89003009033",
                           "89003009034"};
    ter= (jobjectArray)env->NewObjectArray(5,
                                           env->FindClass("java/lang/String"),
                                           env->NewStringUTF(""));

    for (i=0;i<5;i++) {
        env->SetObjectArrayElement(
                ter,i,env->NewStringUTF(phone[i]));
    }
    return(ter);
}

extern "C" JNIEXPORT jobjectArray JNICALL Java_com_example_a2_MainActivity_name (JNIEnv *env, jobject jobj){

    jobjectArray ret;
    int i;

    const char *name[5]= {"Petrov",
                          "Egorov",
                          "Ivanov",
                          "Sidarov",
                          "Istomin"};
    ret = (jobjectArray)env->NewObjectArray(5,
                                            env->FindClass("java/lang/String"),
                                            env->NewStringUTF(""));

    for(i=0;i<5;i++)  {
        env->SetObjectArrayElement(
                ret, i, env->NewStringUTF(name[i]));
    }
    return(ret);
}