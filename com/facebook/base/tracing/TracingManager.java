package com.facebook.base.tracing.TracingManager;
import java.util.concurrent.CopyOnWriteArraySet;
import com.facebook.jni.HybridData;
import java.lang.Object;
import java.lang.String;

public class TracingManager	// class@001037
{
    public final HybridData a;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d;
    public static String e;
    public static final CopyOnWriteArraySet f;

    static {
       TracingManager.f = new CopyOnWriteArraySet();
    }
    public void TracingManager(HybridData p0){
       super();
       this.a = p0;
    }
    public static void a(String p0){
       if (TracingManager.f()) {
          TracingManager.jniBegin("Main", p0, "", "");
       }
       return;
    }
    public static void b(String p0,double p1,long p2){
       if (TracingManager.f()) {
          TracingManager.jniBeginKds("Main", p0, "", "", p1, p2);
       }
       return;
    }
    public static void c(String p0){
       if (TracingManager.f()) {
          TracingManager.jniEnd("Main", p0);
       }
       return;
    }
    public static void d(String p0,double p1,long p2){
       if (TracingManager.f()) {
          TracingManager.jniEndKds("Main", p0, p1, p2);
       }
       return;
    }
    public static void e(String p0){
       if (TracingManager.f()) {
          TracingManager.jniInstant("Main", p0);
       }
       return;
    }
    public static boolean f(){
       boolean b = (TracingManager.b && TracingManager.c)? true: false;
       return b;
    }
    public static void g(String p0){
       if (TracingManager.f()) {
          TracingManager.jniSetThreadName(p0);
       }
       return;
    }
    public static void h(String p0,int p1){
       if (TracingManager.f()) {
          TracingManager.jniSetThreadNameWithId(p0, p1);
       }
       return;
    }
    public static void i(String p0,int p1){
       if (TracingManager.f()) {
          TracingManager.jniSetThreadSortIndex(p0, p1);
       }
       return;
    }
    public static native void jniAsynBegin(String p0,String p1,int p2);
    public static native void jniAsynEnd(String p0,String p1,int p2);
    public static native void jniBegin(String p0,String p1,String p2,String p3);
    public static native void jniBeginKds(String p0,String p1,String p2,String p3,double p4,long p5);
    public static native void jniEnd(String p0,String p1);
    public static native void jniEndKds(String p0,String p1,double p2,long p3);
    public static native void jniFinish();
    public static native void jniInit(String p0);
    public static native void jniInstant(String p0,String p1);
    public static native double jniMtrTimeS();
    public static native void jniSetProcessName(String p0);
    public static native void jniSetThreadName(String p0);
    public static native void jniSetThreadNameWithId(String p0,int p1);
    public static native void jniSetThreadSortIndex(String p0,int p1);
    public static native void jniStart();
}
