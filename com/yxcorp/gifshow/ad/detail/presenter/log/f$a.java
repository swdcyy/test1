package com.yxcorp.gifshow.ad.detail.presenter.log.f$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.log.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import tw.l;
import tw.e;
import tkd.b;
import tkd.d;
import ol9.a;
import mxb.j;
import com.kuaishou.commercial.log.a;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import java.lang.Number;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache;
import com.yxcorp.gifshow.ad.fill.AdNotShownCache$a;
import java.lang.Long;
import androidx.collection.LruCache;
import com.yxcorp.gifshow.util.rx.RxBus;
import wl9.x;
import brd.t;
import t45.d;
import brd.z;
import y09.t;
import erd.g;

public class f$a extends a	// class@001666
{
    public b b;
    public final f c;

    public void f$a(f p0){
       this.c = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "2")) {
          return;
       }
       b9.a(this.b);
       return;
    }
    public void i2(){
       boolean b;
       int i1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       f$a tc = this.c;
       Objects.requireNonNull(tc);
       f$a obj = PatchProxy.apply(null, tc, uof, "3");
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(l.j(tc.q.mEntity) || (e.d(tc.q) || d.a(0x4ffa335e).nJ(tc.q))){
          b = false;
       }else {
          b = true;
       }
       if (b) {
          j oj = a.a(this.c.q.mEntity);
          obj = this.c;
          f p = obj.p;
          if (p != null) {
             oj.m(p).n(1);
          }else {
             oj.m(obj.m8()).n(i);
          }
          j0 oj0 = o.z();
          f$a tc1 = this.c;
          Objects.requireNonNull(tc1);
          Object obj1 = PatchProxy.apply(null, tc1, uof, "4");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          }else {
             f s = tc1.s;
             i1 = (s == null || s.s1())? 0: tc1.s.z();
          }
          Objects.requireNonNull(tc1);
          if (i1) {
             if (i1 != 1) {
                if (i1 == 2) {
                   i = 5;
                }
             }else {
                i = 4;
             }
          }else {
             i = 1;
          }
          oj0.i(oj, i);
          f$a tc2 = this.c;
          Objects.requireNonNull(tc2);
          if (!PatchProxy.applyVoid(null, tc2, uof, "5")) {
             PhotoAdvertisement photoAdverti = k.B(tc2.q);
             if (photoAdverti != null) {
                k.B(tc2.q).mShowAdItemReported = true;
                AdNotShownCache.c.a().remove(Long.valueOf(photoAdverti.mCreativeId));
             }
          }
       }
    label_00df :
       this.b = RxBus.f.f(x.class).observeOn(d.a).subscribe(new t(this.c));
       return;
    }
}
