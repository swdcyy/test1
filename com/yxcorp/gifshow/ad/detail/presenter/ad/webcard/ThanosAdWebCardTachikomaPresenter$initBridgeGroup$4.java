package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$initBridgeGroup$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdCardTemplateInfo;
import java.lang.Boolean;
import lnc.y0;

public final class ThanosAdWebCardTachikomaPresenter$initBridgeGroup$4 extends Lambda implements a	// class@001627
{
    public final PhotoAdvertisement $ad;
    public final ThanosAdWebCardTachikomaPresenter this$0;

    public void ThanosAdWebCardTachikomaPresenter$initBridgeGroup$4(ThanosAdWebCardTachikomaPresenter p0,PhotoAdvertisement p1){
       this.this$0 = p0;
       this.$ad = p1;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       Object[] objArray = null;
       ThanosAdWebCardTachikomaPresenter obj = PatchProxy.apply(objArray, this, ThanosAdWebCardTachikomaPresenter$initBridgeGroup$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.P;
       ThanosAdWebCardTachikomaPresenter$initBridgeGroup$4 t$ad = this.$ad;
       if (t$ad != null) {
          PhotoAdvertisement$AdData adData = t$ad.getAdData();
          if (adData != null) {
             adData = adData.mAdCardTemplateInfo;
             if (adData != null) {
                objArray = Boolean.valueOf(adData.mHasInteractionFinished);
             }
          }
       }
       obj.put("cardInteractionFinish", Boolean.valueOf(y0.p(objArray)));
       return obj;
    }
}
