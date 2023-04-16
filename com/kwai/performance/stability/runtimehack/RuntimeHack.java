package com.kwai.performance.stability.runtimehack.RuntimeHack;
import java.lang.Object;
import android.content.Context;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.System;
import java.io.File;
import dalvik.system.DexFile;

public final class RuntimeHack	// class@000e52
{
    public static int a = 1;

    public void RuntimeHack(){
       super();
    }
    public static void a(Context p0){
       if (Build$VERSION.SDK_INT != 23 || (p0 != null && RuntimeHack.b(p0.getPackageCodePath()))) {
          System.loadLibrary("runtime_hack");
          RuntimeHack.a = RuntimeHack.applyPatch(p0.getFilesDir().getAbsolutePath());
       }
    label_0026 :
       return;
    }
    public static native int applyPatch(String p0);
    public static boolean b(String p0){
       return DexFile.isDexOptNeeded(p0);
    }
}
