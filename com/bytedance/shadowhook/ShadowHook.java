package com.bytedance.shadowhook.ShadowHook;
import com.bytedance.shadowhook.ShadowHook$Mode;
import java.lang.Object;
import com.bytedance.shadowhook.ShadowHook$a;
import java.lang.System;
import com.bytedance.shadowhook.ShadowHook$c;
import java.lang.String;

public final class ShadowHook	// class@000f19
{
    public static boolean a = false;
    public static int b;
    public static long c;
    public static final ShadowHook$c d;
    public static final int e;

    static {
       ShadowHook.e = ShadowHook$Mode.SHARED.getValue();
    }
    public void ShadowHook(){
       super();
    }
    public static synchronized int a(ShadowHook$a p0){
       _monitor_enter(ShadowHook.class);
       if (ShadowHook.a) {
          _monitor_exit(ShadowHook.class);
          return ShadowHook.b;
       }else {
          boolean b = true;
          ShadowHook.a = b;
          long l = System.currentTimeMillis();
          String str = "shadowhook";
          if (p0.a() == null) {
             System.loadLibrary(str);
          }else {
             p0.a().loadLibrary(str);
          }
          if (!b) {
             ShadowHook.b = 100;
             ShadowHook.c = System.currentTimeMillis() - l;
             _monitor_exit(ShadowHook.class);
             return ShadowHook.b;
          }else {
             ShadowHook.b = ShadowHook.nativeInit(p0.b, p0.c);
             ShadowHook.c = System.currentTimeMillis() - l;
             _monitor_exit(ShadowHook.class);
             return ShadowHook.b;
          }
       }
    }
    public static native String nativeGetArch();
    public static native int nativeGetInitErrno();
    public static native String nativeGetRecords(int p0);
    public static native int nativeInit(int p0,boolean p1);
    public static native void nativeSetDebuggable(boolean p0);
    public static native String nativeToErrmsg(int p0);
}
