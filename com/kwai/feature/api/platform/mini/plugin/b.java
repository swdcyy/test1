package com.kwai.feature.api.platform.mini.plugin.b;
import rj8.l;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.platform.mini.plugin.a;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ju5.g;
import ju5.e;
import z1.a;
import com.mini.widget.menu.MiniMenuItem;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Bundle;
import l88.c;
import ju5.d;
import tkd.b;
import tkd.d;

public class b implements l	// class@001072
{

    public void b(){
       super();
    }
    public void a(String p0,List p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "1")) {
          return;
       }
       int i = CollectionsKt___CollectionsKt.O2(p1, a.b);
       if (i < 0) {
          return;
       }
       if (!this.c().gl()) {
          p1.remove(i);
          p2.run();
       }else {
          this.c().CT(p0, new e(p0, p1, i, p2));
       }
       return;
    }
    public boolean b(MiniMenuItem p0){
       boolean b;
       b uob = b.class;
       String obj = PatchProxy.applyOneRefs(p0, this, uob, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (!this.c().gl()) {
          return b;
       }
       if (("favorite").equalsIgnoreCase(p0.d)) {
          p0 = p0.f;
          if (p0 != null) {
             obj = "EXTRA_APP_ID";
             if (p0.containsKey(obj)) {
                String str = "EXTRA_IS_FAVORITE";
                if (p0.containsKey(str)) {
                   obj = p0.getString(obj);
                   int booleanx = p0.getBoolean(str, b);
                   if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(booleanx), this, uob, "4")) {
                      booleanx = booleanx ^ true;
                      this.c().oQ(obj, c.b, booleanx, new d(this, booleanx));
                   }
                   return true;
                }
             }
          }
       }
       return b;
    }
    public final g c(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x6ea0c3d0);
    }
    public void d(boolean p0,boolean p1){
    }
}
