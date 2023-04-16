package com.kwai.feature.post.api.startup.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.String;
import lnc.t;
import lnc.p3;
import q87.c;
import java.lang.System;
import o46.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.feature.post.api.startup.PredictStatus;
import lnc.y6;
import brd.a0;
import com.kwai.feature.post.api.startup.c;
import com.kwai.feature.post.api.startup.d;
import erd.g;
import crd.b;

public class e	// class@001443
{
    public static boolean a;
    public static boolean b;

    public void e(){
       super();
    }
    public static void a(long p0,boolean p1,boolean p2,Throwable p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), p3, null, e.class, "2")) {
          return;
       }
       if (!p1) {
          t.k("post", "preload", p0, p2, 0, false, p3);
       }
       return;
    }
    public static void b(){
       c e;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, objArray, e.class, str)) {
          return;
       }
       Object[] objArray1 = new Object[0];
       p3.D().w("PostPluginPreload", "preInstallPostPlugin start ", objArray1);
       boolean b = true;
       e.b = b;
       long l = System.currentTimeMillis();
       if (PatchProxy.applyVoid(objArray, objArray, c.class, str) || (c.a && !c.c)) {
          c.c = b;
          e = c.e;
          g.a(c.b.edit().putLong("last_positive_predict_day", e.a()));
          e.b(PredictStatus.POSITIVE);
       }
    label_0051 :
       y6.e.i().R(new c(l), d.b);
       return;
    }
}
