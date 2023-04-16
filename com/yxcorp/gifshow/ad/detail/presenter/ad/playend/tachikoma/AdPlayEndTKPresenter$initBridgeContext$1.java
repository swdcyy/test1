package com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter$initBridgeContext$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$PlayEndInfo;

public final class AdPlayEndTKPresenter$initBridgeContext$1 extends Lambda implements a	// class@0015ee
{
    public final AdPlayEndTKPresenter this$0;

    public void AdPlayEndTKPresenter$initBridgeContext$1(AdPlayEndTKPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       PhotoAdvertisement$PlayEndInfo mUserIconUrl;
       Object[] objArray = null;
       PhotoAdvertisement obj = PatchProxy.apply(objArray, this, AdPlayEndTKPresenter$initBridgeContext$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = k.B(AdPlayEndTKPresenter.P8(this.this$0));
       AdPlayEndTKPresenter n = this.this$0.N;
       if (obj != null) {
          PhotoAdvertisement$AdData adData = obj.getAdData();
          if (adData != null) {
             adData = adData.mPlayEndInfo;
             if (adData != null) {
                mUserIconUrl = adData.mUserIconUrl;
             label_002e :
                n.put("productIconUrl", mUserIconUrl);
                if (obj != null) {
                   PhotoAdvertisement$AdData adData1 = obj.getAdData();
                   if (adData1 != null) {
                      adData1 = adData1.mPlayEndInfo;
                      if (adData1 != null) {
                         objArray = adData1.mUserName;
                      }
                   }
                }
                n.put("productName", objArray);
                return n;
             }
          }
       }
       mUserIconUrl = objArray;
       goto label_002e ;
    }
}
