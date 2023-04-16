package com.kwai.performance.stability.hprof.dump.NativeHandler;
import java.lang.Object;
import java.lang.String;
import yf7.t;

public class NativeHandler	// class@001228
{
    public static boolean sSoLoaded;

    static {
       NativeHandler.load();
    }
    public void NativeHandler(){
       super();
    }
    public static native boolean isARM64();
    public static boolean load(){
       if (NativeHandler.sSoLoaded) {
          return true;
       }
       boolean b = t.a("koom-java");
       NativeHandler.sSoLoaded = b;
       return b;
    }
}
