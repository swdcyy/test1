package com.yxcorp.gifshow.prettify.makeup.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.prettify.makeup.c$a;
import nsd.u;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import java.lang.String;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.prettify.makeup.h;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupKey;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.yxcorp.gifshow.prettify.makeup.c$c;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import j8c.a;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.gifshow.prettify.makeup.d;
import com.yxcorp.gifshow.prettify.makeup.m;
import com.yxcorp.gifshow.prettify.makeup.c$b;
import com.yxcorp.gifshow.prettify.makeup.c$d;
import erd.g;
import crd.b;
import android.content.Intent;
import java.lang.StringBuilder;
import android.net.Uri;

public final class c extends d	// class@001171
{
    public final MakeupKey n;
    public int o;
    public String p;
    public CameraPageType q;
    public b r;
    public h s;
    public static final String t;
    public static final c$a u;

    static {
       c.u = new c$a(null);
       c.t = m0.d(c.class).N5();
    }
    public void c(CameraPageType p0,b p1,h p2){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       a.p(p2, "makeupController");
       super(p0, p1);
       this.q = p0;
       this.r = p1;
       this.s = p2;
       this.n = MakeupKey.RECORD;
    }
    public final void f2(MakeupSuite p0,long p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoc, "4")) {
          return;
       }
       k1.r(new c$c(this, p0), p1);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       super.k(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w(c.t, "onViewCreated", objArray);
       c tp = this.p;
       if (tp == null || !tp.length()) {
          i = 1;
       }
       if (i) {
          return;
       }else {
          m om = d.a().b(this.n);
          a.o(om, "MakeupConfigManager.getI¡­tMakeupModule\(mMakeupKey\)");
          om.p(null);
          this.d.l(c$b.class, new c$d(this));
          return;
       }
    }
    public void w1(Intent p0){
       Uri data;
       String str1;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "1")) {
          return;
       }
       super.w1(p0);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "5")) {
          a uoa = a.D();
          String t = c.t;
          StringBuilder str = "parseMakeUpUriParams data: ";
          if (p0 != null) {
             data = p0.getData();
             if (data != null) {
                str1 = data.toString();
             label_0035 :
                Object[] objArray = new Object[0];
                uoa.w(t, str+str1, objArray);
                if (p0 != null) {
                   this.p = p0.getStringExtra("makeupSuitId");
                   this.o = p0.getIntExtra("delayedTimeInSecond", 0);
                }
             }
          }
          str1 = null;
          goto label_0035 ;
       }
       return;
    }
}
