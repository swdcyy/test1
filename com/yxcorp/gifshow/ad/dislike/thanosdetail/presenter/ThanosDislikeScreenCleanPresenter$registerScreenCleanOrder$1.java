package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeScreenCleanPresenter$registerScreenCleanOrder$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import n29.j;
import java.lang.Object;
import fy8.b;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import lnc.h5;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController;
import msd.a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.screenclean.ScreenCleanController$DefaultImpls;

public final class ThanosDislikeScreenCleanPresenter$registerScreenCleanOrder$1 extends Lambda implements l	// class@00174e
{
    public final j this$0;

    public void ThanosDislikeScreenCleanPresenter$registerScreenCleanOrder$1(j p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       ThanosDislikeScreenCleanPresenter$registerScreenCleanOrder$1 tthis$0;
       h5 a;
       j r;
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosDislikeScreenCleanPresenter$registerScreenCleanOrder$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       p0 = p0.a;
       String str = "mScreenCleanController";
       String str1 = "mDetailParam";
       Object[] objArray = null;
       if (p0 != null) {
          boolean b = true;
          if (p0 != b) {
             if (p0 == 3) {
                tthis$0 = this.this$0;
                Objects.requireNonNull(tthis$0);
                if (!PatchProxy.applyVoid(objArray, tthis$0, oj, "14")) {
                   a = h5.a;
                   j p = tthis$0.p;
                   if (p == null) {
                      a.S(str1);
                   }
                   if (!a.a(p.getBizType())) {
                      r = tthis$0.r;
                      if (r == null) {
                         a.S(str);
                      }
                      ScreenCleanController screenCleanC = r.get();
                      if (screenCleanC != null) {
                         ScreenCleanController$DefaultImpls.b(screenCleanC, b, objArray, 2, objArray);
                      }
                   }
                }
             }
          }else {
          label_0059 :
             tthis$0 = this.this$0;
             Objects.requireNonNull(tthis$0);
             if (!PatchProxy.applyVoid(objArray, tthis$0, oj, "13")) {
                a = h5.a;
                j p1 = tthis$0.p;
                if (p1 == null) {
                   a.S(str1);
                }
                if (!a.a(p1.getBizType())) {
                   r = tthis$0.r;
                   if (r == null) {
                      a.S(str);
                   }
                   Object obj = r.get();
                   if (obj != null) {
                      ScreenCleanController$DefaultImpls.a(obj, true, 0, null, 6, null);
                   }
                }
             }
          }
       }else {
          goto label_0059 ;
       }
    label_0093 :
       return;
    }
}
