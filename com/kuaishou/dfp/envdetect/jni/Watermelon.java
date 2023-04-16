package com.kuaishou.dfp.envdetect.jni.Watermelon;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.util.Base64;
import i30.t;
import android.content.Context;
import rg.d;
import java.lang.System;
import l30.l;

public class Watermelon	// class@000835
{
    public static boolean sLibLoadFail = true;
    public static Watermelon singleton;

    public void Watermelon(){
       super();
       this.loadSoLib();
    }
    public static Watermelon getInstance(){
       Watermelon watermelon = Watermelon.class;
       Object obj = PatchProxy.apply(null, null, watermelon, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (Watermelon.singleton == null) {
          _monitor_enter(watermelon);
          if (Watermelon.singleton == null) {
             Watermelon.singleton = new Watermelon();
          }
          _monitor_exit(watermelon);
       }
       return Watermelon.singleton;
    }
    public native Object jniCommand(int p0,Object p1,Object p2,Object p3);
    public final void loadSoLib(){
       if (PatchProxy.applyVoid(null, this, Watermelon.class, "2")) {
          return;
       }
       String str = new String(Base64.decode("a3NzZQ==", 0));
       Context uContext = t.c().d();
       if (uContext != null) {
          d.a(uContext, str);
       }else {
          System.loadLibrary(str);
       }
       Watermelon.sLibLoadFail = false;
       l.c("so loaded");
       return;
    }
    public native byte[] ssec(byte[] p0,byte[] p1,Object p2);
}
