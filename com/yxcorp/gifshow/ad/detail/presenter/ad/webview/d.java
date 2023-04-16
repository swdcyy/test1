package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.d;
import jta.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import u09.k;
import erd.g;
import tkd.b;
import tkd.d;
import nl9.m;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i;
import rf5.u;
import java.lang.StringBuilder;
import yx.j0;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public class d extends f	// class@001644
{
    public final String a;
    public final c b;

    public void d(c p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(float p0){
       c d;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "3")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          this.b.S8(false);
          this.b.R8();
          this.b.V8(false);
       }else if(!p0){
          this.b.S8(true);
          if (this.b.J != null && !PatchProxy.applyVoid(null, this, uod, "4")) {
             o.z().e(2, this.b.r.mEntity).d(new k(12)).a();
          }
          QPhoto mEntity = this.b.r.mEntity;
          if (!PatchProxy.applyVoidOneRefs(mEntity, this, uod, "5")) {
             AdDataWrapper uAdDataWrapp = d.a(-2125799450).Pl(mEntity);
             if (uAdDataWrapp != null) {
                d = this.b.D;
                if (d != null) {
                   d.d(uAdDataWrapp, this.a);
                }
             }
             c e = this.b.E;
             if (e != null) {
                e.d();
             }
          }
       }
       p0.J = false;
       return;
    }
    public void b(float p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "6")) {
          return;
       }
       d tb = this.b;
       tb.J = tb.p.x();
       return;
    }
    public void c(float p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uod, "2")) {
          return;
       }
       float f = (float)c.R * p0;
       Object[] objArray = new Object[0];
       j0.a("AdPLCWebViewPreloadPresenter", "onSwipeProgressChanged: progress: "+p0+", finalTransitionX: "+f, objArray);
       this.b.C.setTranslationX(f);
       return;
    }
    public float d(float p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       uod = this.b;
       if (uod.G == null) {
          uod.G = Float.valueOf(uod.C.getTranslationX());
       }
       float f = 0x3f800000;
       float f1 = 0;
       if (!this.b.G.floatValue() - f1) {
          if (p0 - f1 >= 0) {
             f1 = Math.min(f, ((Math.abs(p0) * f) / (float)c.R));
          }
          return f1;
       }else if(p0 - f1 > 0){
          f = Math.max(f1, (f - ((Math.abs(p0) * f) / (float)c.R)));
       }
       return f;
    }
}
