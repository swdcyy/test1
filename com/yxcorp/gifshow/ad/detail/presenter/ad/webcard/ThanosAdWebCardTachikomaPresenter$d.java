package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$d;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.animation.AdWebCardAnimationDelegate;
import z49.a;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import java.lang.Runnable;
import android.widget.FrameLayout;
import de5.a;
import p5a.e;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import kotlin.jvm.internal.a;
import n49.o;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo;
import java.lang.Boolean;
import lnc.y0;
import com.kuaishou.android.model.ads.PhotoAdvertisement$RequestEApiInfo$CardStyleInfo;
import java.lang.Math;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;

public final class ThanosAdWebCardTachikomaPresenter$d extends a	// class@00161d
{
    public ViewTreeObserver$OnGlobalLayoutListener b;
    public final ThanosAdWebCardTachikomaPresenter c;

    public void ThanosAdWebCardTachikomaPresenter$d(ThanosAdWebCardTachikomaPresenter p0){
       this.c = p0;
       super();
    }
    public void F1(){
       ThanosAdWebCardTachikomaPresenter l;
       if (PatchProxy.applyVoid(null, this, ThanosAdWebCardTachikomaPresenter$d.class, "1")) {
          return;
       }
       ThanosAdWebCardTachikomaPresenter$d tc = this.c;
       tc.p = false;
       if (tc.Y8()) {
          l = this.c.L;
          if (l != null) {
             l.a();
          }
       }
       ThanosAdWebCardTachikomaPresenter.P8(this.c).g();
       tc = this.c;
       ThanosAdWebCardTachikomaPresenter e = tc.E;
       if (e != null) {
          e.removeCallbacks(tc.T);
       }
       tc = this.c;
       e = tc.E;
       if (e != null) {
          e.removeCallbacks(tc.S);
       }
       e player = ThanosAdWebCardTachikomaPresenter.S8(this.c).getPlayer();
       if (player != null) {
          player.removeOnInfoListener(this.c.R);
       }
       tc = this.b;
       if (tc != null) {
          e = this.c.E;
          if (e != null) {
             ViewTreeObserver viewTreeObse = e.getViewTreeObserver();
             if (viewTreeObse != null) {
                viewTreeObse.removeOnGlobalLayoutListener(tc);
             }
          }
       }
       l = this.c.u;
       if (l == null) {
          a.S("mPhotoAdActionBarClickProcessor");
       }
       l.c = false;
       this.c.e9();
       this.c.b9();
       return;
    }
    public void i2(){
       this.c.p = true;
    }
    public void k1(){
       PhotoAdvertisement$AdData mRequestEApi;
       PhotoAdvertisement$RequestEApiInfo$CardStyleInfo mTemplateDel;
       ThanosAdWebCardTachikomaPresenter$d uod = ThanosAdWebCardTachikomaPresenter$d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       ThanosAdWebCardTachikomaPresenter$d tc = this.c;
       tc.N = false;
       ThanosAdWebCardTachikomaPresenter.P8(tc).h();
       if (!PatchProxy.applyVoid(objArray, this, uod, "3")) {
          this.b = new a(this);
          ThanosAdWebCardTachikomaPresenter e = this.c.E;
          if (e != null) {
             ViewTreeObserver viewTreeObse = e.getViewTreeObserver();
             if (viewTreeObse != null) {
                viewTreeObse.addOnGlobalLayoutListener(this.b);
             }
          }
          PhotoAdvertisement photoAdverti = k.B(ThanosAdWebCardTachikomaPresenter.R8(this.c));
          if (photoAdverti != null) {
             photoAdverti = photoAdverti.mAdData;
             if (photoAdverti != null) {
                mRequestEApi = photoAdverti.mRequestEApiInfo;
             label_004e :
                if (mRequestEApi != null) {
                   objArray = Boolean.valueOf(mRequestEApi.isWaitingForReplaceData());
                }
                long l = 500;
                if (y0.p(objArray)) {
                   if (mRequestEApi != null) {
                      PhotoAdvertisement$RequestEApiInfo mCardStyleIn = mRequestEApi.mCardStyleInfo;
                      if (mCardStyleIn != null) {
                         mTemplateDel = mCardStyleIn.mTemplateDelayTime;
                      label_006b :
                         this.c.j9(Math.max(l, mTemplateDel));
                      }
                   }
                   mTemplateDel = 0;
                   goto label_006b ;
                }else {
                   uod = this.c;
                   ThanosAdWebCardTachikomaPresenter j = uod.J;
                   if (j != null) {
                      if (j.mCardDelayReplay == null && uod.h9(j)) {
                         this.c.j9(Math.max(l, j.mTemplateDelayTime));
                      }else {
                         e player = ThanosAdWebCardTachikomaPresenter.S8(this.c).getPlayer();
                         if (player != null) {
                            player.addOnInfoListener(this.c.R);
                         }
                      }
                   }
                }
             }
          }
          mRequestEApi = objArray;
          goto label_004e ;
       }
    label_00a4 :
       return;
    }
}
