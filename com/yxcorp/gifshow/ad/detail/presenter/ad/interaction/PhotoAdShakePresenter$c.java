package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter$c;
import by.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdShakePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import im8.f;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.CommercialKtUtil;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n49.e;
import n49.o;

public final class PhotoAdShakePresenter$c implements g	// class@0015b7
{
    public final PhotoAdShakePresenter a;

    public void PhotoAdShakePresenter$c(PhotoAdShakePresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       PhotoAdShakePresenter$c uoc = PhotoAdShakePresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       PhotoAdShakePresenter$c ta = this.a;
       if (ta.x == null) {
          PhotoAdShakePresenter b = ta.B;
          Boolean uBoolean = (b != null)? b.get(): null;
          if (!a.g(uBoolean, Boolean.TRUE)) {
             ta = this.a;
             if (ta.C == null) {
                ta.x = true;
                CommercialKtUtil.g(500);
                ta = this.a;
                PhotoAdShakePresenter r = ta.r;
                if (r != null) {
                   r.a(PhotoAdShakePresenter.P8(ta), this.a.getActivity(), new e(157));
                }
             }
          }
       }
    label_005a :
       return;
    }
}
