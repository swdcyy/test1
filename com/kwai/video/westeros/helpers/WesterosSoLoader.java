package com.kwai.video.westeros.helpers.WesterosSoLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import n65.a;
import com.kwai.video.westeros.helpers.WesterosSoLoader$1;
import wt6.b$b;
import wt6.b;
import java.lang.System;

public class WesterosSoLoader	// class@000e86
{
    public static boolean sloadNativeSuccessed;

    public void WesterosSoLoader(){
       super();
    }
    public static void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, WesterosSoLoader.class, "2")) {
          return;
       }
       a.a(p0);
       return;
    }
    public static void loadNative(){
       if (PatchProxy.applyVoid(null, null, WesterosSoLoader.class, "1")) {
          return;
       }
       if (WesterosSoLoader.sloadNativeSuccessed) {
          return;
       }
       a.b();
       a.a("c++_shared");
       b.a("v5.15.0.13", new WesterosSoLoader$1());
       a.a("westeros");
       WesterosSoLoader.sloadNativeSuccessed = true;
       System.currentTimeMillis();
       return;
    }
}
