package com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter$d;
import tz8.a$c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.interaction.PhotoAdRotatePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import com.yxcorp.gifshow.util.CommercialKtUtil;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import nx8.n;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n49.d;
import n49.o;
import n49.e;

public final class PhotoAdRotatePresenter$d implements a$c	// class@0015ae
{
    public final PhotoAdRotatePresenter a;

    public void PhotoAdRotatePresenter$d(PhotoAdRotatePresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       PhotoAdRotatePresenter obj;
       PhotoAdRotatePresenter$d ta;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoAdRotatePresenter$d.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       j0.f("PhotoAdRotatePresenter", "enter onRotate", objArray1);
       if (!this.a.R8()) {
          return;
       }
       this.a.S8(i);
       CommercialKtUtil.g(500);
       PhotoAdvertisement photoAdverti = k.B(PhotoAdRotatePresenter.P8(this.a));
       n on = n.class;
       if (PatchProxy.isSupport(on)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(161), photoAdverti, objArray, on, "9");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
          label_0052 :
             PhotoAdvertisement$ItemClickActionInfo itemClickAct = n.c(161, photoAdverti);
             if (itemClickAct != null) {
                i = itemClickAct.mConversionAreaType;
             }
          }
       }else {
          goto label_0052 ;
       }
       if (i == 2) {
          ta = this.a;
          obj = ta.r;
          if (obj != null) {
             d uod = d.a();
             uod.b(161);
             obj.c(PhotoAdRotatePresenter.P8(ta), this.a.getActivity(), uod);
          }
       }else {
          ta = this.a;
          obj = ta.r;
          if (obj != null) {
             obj.a(PhotoAdRotatePresenter.P8(ta), this.a.getActivity(), new e(161));
          }
       }
       return;
    }
}
