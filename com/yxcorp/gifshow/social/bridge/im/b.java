package com.yxcorp.gifshow.social.bridge.im.b;
import java.lang.Object;
import f55.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Integer;
import tkd.b;
import tkd.d;
import hw5.e;
import mjc.a;
import tv5.c;
import vv5.l1;

public final class b	// class@001d5f
{

    public void b(){
       super();
    }
    public static void a(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       if (p0 != null) {
          p0.a(412, "", null);
       }
       return;
    }
    public static void b(GifshowActivity p0,String p1,int p2,String p3,int p4,g p5){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uob, "9")) {
             return;
          }
       }
       d.a(-854594802).yU(p0, p1, p2, p3, p4, new a(p1, p2, p3, p5));
       return;
    }
}
