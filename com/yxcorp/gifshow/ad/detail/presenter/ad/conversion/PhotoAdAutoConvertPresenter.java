package com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.PhotoAdAutoConvertPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import da6.c;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n49.d;
import com.yxcorp.gifshow.ad.detail.presenter.ad.conversion.PhotoAdAutoConvertPresenter$onBind$1$1$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import n49.o;
import tw.e;

public final class PhotoAdAutoConvertPresenter extends PresenterV2	// class@0015a6
{
    public QPhoto p;
    public o q;

    public void PhotoAdAutoConvertPresenter(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoAdAutoConvertPresenter.class, "2")) {
          return;
       }
       PhotoAdAutoConvertPresenter tp = this.p;
       if (tp != null && tp.mEntity != null) {
          PhotoAdvertisement photoAdverti = k.B(tp);
          if (photoAdverti != null) {
             Boolean extra = photoAdverti.getExtra("search_ad_auto_convert");
             if (extra != null && extra.booleanValue()) {
                Activity activity = this.getActivity();
                if (activity instanceof GifshowActivity) {
                   objArray = activity;
                }
                if (objArray != null) {
                   PhotoAdAutoConvertPresenter tq = this.q;
                   if (tq != null) {
                      d uod = d.a();
                      uod.b(1);
                      uod.d(PhotoAdAutoConvertPresenter$onBind$1$1$1.INSTANCE);
                      tq.c(this.p, objArray, uod);
                   }
                }
                e.h(photoAdverti, false);
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdAutoConvertPresenter.class, "1")) {
          return;
       }
       this.p = this.s8(QPhoto.class);
       this.q = this.s8(o.class);
       return;
    }
}
