package com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.bridge.JavaScriptExecutor;
import java.lang.String;
import com.facebook.soloader.SoLoader;
import mc.b;
import com.facebook.jni.HybridData;
import java.lang.StringBuilder;

public class HermesExecutor extends JavaScriptExecutor	// class@0010e1
{
    public static String a;

    static {
       String str = "hermes";
       try{
          SoLoader.b(str);
          SoLoader.b("hermes-executor-debug");
          HermesExecutor.a = "Debug";
       }catch(java.lang.UnsatisfiedLinkError e0){
          SoLoader.b("hermes-executor-release");
          HermesExecutor.a = "Release";
       }
    }
    public void HermesExecutor(b p0){
       HybridData hybridData = (p0 == null)? HermesExecutor.initHybridDefaultConfig(): HermesExecutor.initHybrid(p0.a, p0.c, p0.d, p0.e);
       super(hybridData);
       return;
    }
    public static native boolean canLoadFile(String p0);
    public static native HybridData initHybrid(long p0,boolean p1,int p2,boolean p3);
    public static native HybridData initHybridDefaultConfig();
    public String getName(){
       return "HermesExecutor"+HermesExecutor.a;
    }
}
