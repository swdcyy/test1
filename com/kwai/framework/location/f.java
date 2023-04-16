package com.kwai.framework.location.f;
import u07.u;
import java.lang.String;
import t96.a;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.framework.location.j$a;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import p96.a;
import java.lang.StringBuilder;
import q87.c;
import e66.e;
import com.kwai.framework.location.j;
import vb6.a;
import o96.f0;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import s96.a;
import wk7.j;
import com.kwai.framework.location.k;
import com.tbruyelle.rxpermissions2.g;
import o96.w;
import erd.o;
import o96.v;
import o96.d0;
import erd.g;
import crd.b;

public final class f implements u	// class@00162d
{
    public final String b;
    public final a c;
    public final ConcurrentHashMap d;
    public final String e;
    public final j$a f;
    public final Activity g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;

    public void f(String p0,a p1,ConcurrentHashMap p2,String p3,j$a p4,Activity p5,String p6,String p7,String p8,boolean p9){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
    }
    public final void a(t p0,View p1){
       Object[] objArray1;
       f uof1;
       f uof2;
       f uof3;
       f uof4;
       t ot;
       t ot1;
       f uof = this;
       f b = uof.b;
       f c = uof.c;
       f d = uof.d;
       f e = uof.e;
       f f = uof.f;
       f g = uof.g;
       f h = uof.h;
       f i = uof.i;
       f j = uof.j;
       f k = uof.k;
       int i1 = 0;
       Object[] objArray = new Object[i1];
       String str = "ks.location.log:SDK:Dialog";
       a.C().w(str, "[biz dialog] action= true  | featureKey = "+b, objArray);
       boolean b1 = true;
       int i2 = 3;
       if (e.a()) {
          c.a = b1;
          j.g(b, d, c);
          a.a(e, c.a);
          f.a(j.a(i1, 0x2721));
          PermissionUtils.s(g);
          objArray1 = new Object[i2];
          objArray1[i1] = "featureKey = ";
          objArray1[b1] = b;
          objArray1[2] = " | biz_permission=true | system_permission=false";
          a.C().w(str, "[jump system_setting] ", objArray1);
          uof1 = k;
          uof2 = j;
          uof3 = i;
          uof4 = h;
       }else {
          objArray1 = new Object[i1];
          a.C().w(str, "show system dialog", objArray1);
          j oj = j.class;
          if (PatchProxy.isSupport(oj)) {
             objArray1 = new Object[]{g,c,e,h,i,j};
             v obj = PatchProxy.apply(objArray1, null, oj, "5");
             if (obj != PatchProxyResult.class) {
                ot = obj;
                uof1 = k;
                uof2 = j;
                uof4 = h;
             label_010c :
                uof3 = i;
                obj = new v(b, d, c, e, f, g, uof4, i, uof2);
                ot.subscribe(h, new d0(c, e, f));
             }
          }
          if (g != null && (g.isFinishing() || g.isDestroyed())) {
             uof1 = k;
             uof2 = j;
             uof4 = h;
             c.a = true;
             ot1 = t.just(j.a(i1, 0x2720));
          }else {
             a.c(e, "SYSTEM", h, i, j);
             j.g("location", e, i, j, "1");
             String[] stringArray = new String[]{"android.permission.ACCESS_FINE_LOCATION","android.permission.ACCESS_COARSE_LOCATION"};
             w ow = b1;
             w ow1 = b1;
             uof4 = h;
             uof1 = k;
             uof2 = j;
             ow = new w(c, e, h, i, j, k.f());
             ot1 = new g(g).f(stringArray).flatMap(ow1);
          }
          ot = ot1;
          goto label_010c ;
       }
       a.a(b, "CONFIRM", "BUSINESS", uof4, uof3, uof2, true, uof1);
       j.f("location", b, uof3, uof2, true, 0x21ab5, "0", false, false);
       return;
    }
}
