package com.kwai.kmalloc.KMalloc;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.System;

public class KMalloc	// class@000cf8
{

    public void KMalloc(){
       super();
    }
    public static native void disable();
    public static native void disableMemoryCorruptDetection();
    public static boolean doReplace(){
       KMalloc kMalloc = KMalloc.class;
       Object obj = PatchProxy.applyWithListener(null, null, kMalloc, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       System.loadLibrary("kmalloc_loader");
       int i = KMalloc.enableStatus();
       if (i != 1) {
          if (i != 2) {
             PatchProxy.onMethodExit(kMalloc, "1");
             return false;
          }else {
             System.loadLibrary("kscudo");
             PatchProxy.onMethodExit(kMalloc, "1");
             return KMalloc.isReplaced();
          }
       }else {
          System.loadLibrary("kmalloc");
          PatchProxy.onMethodExit(kMalloc, "1");
          return KMalloc.isReplaced();
       }
    }
    public static native void enable();
    public static native void enableMemoryCorruptDetection();
    public static native int enableStatus();
    public static native void forbid(String p0);
    public static native String getForbiddenReason();
    public static native int getLaunchCounter();
    public static native boolean isEnabled();
    public static native boolean isForbidden();
    public static native boolean isReplaced();
    public static boolean isReplacedIndeed(){
       KMalloc kMalloc = KMalloc.class;
       Object obj = PatchProxy.applyWithListener(null, null, kMalloc, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(kMalloc, "3");
       return KMalloc.isReplaced();
    }
    public static native boolean lockLib(String p0);
    public static boolean memoryCorruptionEnabled(){
       KMalloc kMalloc = KMalloc.class;
       Object obj = PatchProxy.applyWithListener(null, null, kMalloc, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (KMalloc.enableStatus() == 2) {
          b = true;
       }
       PatchProxy.onMethodExit(kMalloc, "2");
       return b;
    }
    public static native void recordLaunchSuccess();
    public static native void recordLaunchSuccessAsync();
    public static native void unForbid();
}
