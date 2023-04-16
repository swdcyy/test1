package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeBackPressedPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.ThanosDislikeBackPressedPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n29.a;
import msd.a;
import hka.a;

public final class ThanosDislikeBackPressedPresenter$a extends a	// class@001748
{
    public final ThanosDislikeBackPressedPresenter b;

    public void ThanosDislikeBackPressedPresenter$a(ThanosDislikeBackPressedPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeBackPressedPresenter$a.class, "2")) {
          return;
       }
       Activity activity = this.b.getActivity();
       if (activity != null) {
          ThanosDislikeBackPressedPresenter s = this.b.s;
          if (s != null) {
             s = new a(s);
          }
          activity.l3(s);
       }
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, ThanosDislikeBackPressedPresenter$a.class, "1")) {
          return;
       }
       Activity activity = this.b.getActivity();
       if (activity != null) {
          ThanosDislikeBackPressedPresenter s = this.b.s;
          if (s != null) {
             s = new a(s);
          }
          activity.F2(s);
       }
       return;
    }
}
