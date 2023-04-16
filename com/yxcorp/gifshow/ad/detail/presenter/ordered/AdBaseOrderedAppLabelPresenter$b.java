package com.yxcorp.gifshow.ad.detail.presenter.ordered.AdBaseOrderedAppLabelPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ordered.AdBaseOrderedAppLabelPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import java.util.Objects;
import wkd.b;
import mxb.f0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Boolean;
import java.util.HashSet;
import com.yxcorp.gifshow.ad.detail.presenter.ordered.AdBaseOrderedAppLabelPresenter$a;
import e17.i;

public final class AdBaseOrderedAppLabelPresenter$b extends a	// class@00166a
{
    public final AdBaseOrderedAppLabelPresenter b;

    public void AdBaseOrderedAppLabelPresenter$b(AdBaseOrderedAppLabelPresenter p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, AdBaseOrderedAppLabelPresenter$b.class, "2")) {
          return;
       }
       this.b.V8();
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdBaseOrderedAppLabelPresenter$b.class, "1")) {
          return;
       }
       this.b.V8();
       Activity activity = this.b.getActivity();
       if (activity != null) {
          a.o(activity, "it");
          this.b.S8(activity, AdBaseOrderedAppLabelPresenter.P8(this.b));
          AdBaseOrderedAppLabelPresenter$b tb = this.b;
          tb.R8(AdBaseOrderedAppLabelPresenter.P8(tb));
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, AdBaseOrderedAppLabelPresenter.class, "10")) {
             f0 uof0 = b.a(-762347696);
             AdBaseOrderedAppLabelPresenter p = tb.p;
             if (p == null) {
                a.S("photo");
             }
             if (a.g(uof0.x1(p.mEntity, "key_auto_download_ordered_app"), Boolean.TRUE)) {
                AdBaseOrderedAppLabelPresenter$a w = AdBaseOrderedAppLabelPresenter.w;
                HashSet hashSet = w.a();
                AdBaseOrderedAppLabelPresenter p1 = tb.p;
                if (p1 == null) {
                   a.S("photo");
                }
                if (!hashSet.contains(p1.getPhotoId())) {
                   i.a(R.style.arg_RES_7f11066a, 0x7f1000b9);
                   HashSet hashSet1 = w.a();
                   AdBaseOrderedAppLabelPresenter p2 = tb.p;
                   if (p2 == null) {
                      a.S("photo");
                   }
                   hashSet1.add(p2.getPhotoId());
                }
             }
          }
       }
       return;
    }
}
