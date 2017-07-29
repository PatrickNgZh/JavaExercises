#include<iostream>
#include"JNIUsage_HelloJNI_testJNI.h"

using namespace std;

JNIEXPORT void JNICALL Java_JNIUsage_HelloJNI_testJNI_sayHelloFromCPP
(JNIEnv *, jclass) {
	cout << "Hello JNI" << endl;
}