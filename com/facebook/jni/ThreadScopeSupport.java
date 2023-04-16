package com.facebook.jni.ThreadScopeSupport;
import java.lang.String;
import gg.a;
import java.lang.Object;

public class ThreadScopeSupport	// class@00115f
{

    static {
       a.c("fbjni");
    }
    public void ThreadScopeSupport(){
       super();
    }
    public static void runStdFunction(long p0){
       ThreadScopeSupport.runStdFunctionImpl(p0);
    }
    public static native void runStdFunctionImpl(long p0);
}
