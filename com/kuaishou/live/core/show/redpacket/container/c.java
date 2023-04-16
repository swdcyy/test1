package com.kuaishou.live.core.show.redpacket.container.c;
import java.lang.Object;
import android.view.animation.Interpolator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c2.a;
import android.view.animation.AccelerateDecelerateInterpolator;

public class c	// class@000e70
{

    public void c(){
       super();
    }
    public static Interpolator a(float[] p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, uoc, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 == null || p0.length < 2) {
          return new AccelerateDecelerateInterpolator();
       }
       Object obj2 = PatchProxy.applyOneRefs(p0, obj, uoc, "3");
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else {
          int i = 1;
          int i1 = 0;
          if (p0.length == 2) {
             obj = a.a(p0[i1], p0[i]);
          }else if(p0.length >= 4){
             obj = a.b(p0[i1], p0[i], p0[2], p0[3]);
          }
       }
       return obj;
    }
}
