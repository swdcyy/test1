package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.PhotoAdFloatingStyle13Presenter;
import com.smile.gifmaker.mvps.presenter.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.PhotoAdFloatingStyle13Presenter$mMyOuterView$2;
import msd.a;
import qrd.p;
import qrd.s;
import mz8.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.a;
import mz8.c;
import mz8.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import android.view.ViewParent;
import android.view.ViewStub;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;

public final class PhotoAdFloatingStyle13Presenter extends a	// class@00155e
{
    public QPhoto r;
    public ViewStub s;
    public PhotoAdvertisement t;
    public final p u;

    public void PhotoAdFloatingStyle13Presenter(){
       super();
       this.u = s.c(new PhotoAdFloatingStyle13Presenter$mMyOuterView$2(this));
       this.U7(new j());
       this.U7(new a());
       this.U7(new c());
       this.U7(new p());
    }
    public void E8(){
       PhotoAdFloatingStyle13Presenter photoAdFloat = PhotoAdFloatingStyle13Presenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoAdFloat, "6")) {
          return;
       }
       PhotoAdFloatingStyle13Presenter tr = this.r;
       String str = "mPhoto";
       if (tr == null) {
          a.S(str);
       }
       if (s.J(tr)) {
          tr = this.r;
          if (tr == null) {
             a.S(str);
          }
          if (!s.L(tr)) {
             tr = this.r;
             if (tr == null) {
                a.S(str);
             }
             PhotoAdvertisement photoAdverti = k.B(tr);
             this.t = photoAdverti;
             if (photoAdverti != null) {
                tr = this.s;
                str = "mMyViewStub";
                if (tr == null) {
                   a.S(str);
                }
                if (tr.getParent() != null) {
                   tr = this.s;
                   if (tr == null) {
                      a.S(str);
                   }
                   tr.setLayoutResource(R.layout.arg_RES_7f0d003e);
                   View view = PatchProxy.apply(objArray, this, photoAdFloat, "5");
                   if (view == PatchProxyResult.class) {
                      view = this.u.getValue();
                   }
                   view.setVisibility(8);
                   this.P8(true);
                }
             }
          }
       }
    label_0071 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoAdFloatingStyle13Presenter.class, "4")) {
          return;
       }
       a.p(p0, "view");
       p0 = m1.f(p0, R.id.ad_action_bar_floating_container);
       a.o(p0, "bindWidget\(view, R.id.ad¡­n_bar_floating_container\)");
       this.s = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdFloatingStyle13Presenter.class, "1")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.r = obj;
       return;
    }
}
