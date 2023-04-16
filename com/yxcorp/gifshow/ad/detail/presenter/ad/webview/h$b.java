package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h$b;
import jta.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.h;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import joc.q;
import android.view.View;
import android.view.ViewGroup;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import u09.x;
import erd.g;
import tkd.b;
import tkd.d;
import nl9.m;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i;
import rf5.u;
import io.reactivex.subjects.PublishSubject;
import java.lang.StringBuilder;
import yx.j0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public class h$b extends f	// class@001649
{
    public final String a;
    public final h b;

    public void h$b(h p0,String p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(float p0){
       h m;
       h d;
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "3")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          m = this.b.M;
          if (m != null) {
             m.f(false);
          }
          this.b.R8();
       }else if(!p0){
          m = this.b.M;
          int b = true;
          if (m != null) {
             m.f(b);
          }
          View view = this.b.C.findViewById(R.id.root_webview_mask);
          h$b tb = this.b;
          if (tb.L == null || (tb.N == null && !PatchProxy.applyVoidOneRefs(view, this, uob, "4"))) {
             if (view.getVisibility()) {
                b = false;
             }
             b = (b)? 74: 12;
             o.z().e(2, this.b.q.mEntity).d(new x(b)).a();
          }
       label_0083 :
          this.b.N = false;
          view.setVisibility(8);
          QPhoto mEntity = this.b.q.mEntity;
          if (!PatchProxy.applyVoidOneRefs(mEntity, this, uob, "5")) {
             AdDataWrapper uAdDataWrapp = d.a(-2125799450).Pl(mEntity);
             if (uAdDataWrapp != null) {
                d = this.b.D;
                if (d != null) {
                   d.d(uAdDataWrapp, this.a);
                }
             }
             m = this.b.E;
             if (m != null) {
                m.d();
             }
          }
          h$b tb1 = this.b;
          if (tb1.L != null) {
             tb1.V8(false);
          }
       }
       m.L = false;
       return;
    }
    public void b(float p0){
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "6")) {
          return;
       }
       h$b tb = this.b;
       tb.L = tb.x.x();
       this.b.u.onNext(new Object());
       return;
    }
    public void c(float p0){
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "2")) {
          return;
       }
       float f = (float)h.V * p0;
       Object[] objArray = new Object[0];
       j0.a("AdH5PreloadPresenter", "onSwipeProgressChanged: progress: "+p0+", finalTransitionX: "+f, objArray);
       this.b.C.setTranslationX(f);
       return;
    }
    public float d(float p0){
       h$b uob = h$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       uob = this.b;
       if (uob.G == null) {
          uob.G = Float.valueOf(uob.C.getTranslationX());
       }
       float f = 0x3f800000;
       float f1 = 0;
       if (!this.b.G.floatValue() - f1) {
          if (p0 - f1 >= 0) {
             f1 = Math.min(f, ((Math.abs(p0) * f) / (float)h.V));
          }
          return f1;
       }else if(p0 - f1 > 0){
          f = Math.max(f1, (f - ((Math.abs(p0) * f) / (float)h.V)));
       }
       return f;
    }
}
