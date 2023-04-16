package com.yxcorp.gifshow.ad.webview.jshandler.GetDataHandler;
import zl9.b;
import p59.t;
import java.lang.Object;
import java.lang.String;
import zl9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.webview.jshandler.GetDataHandler$WebCardData;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdWebCardInfo;
import tw.j;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import zl9.a;

public class GetDataHandler implements b	// class@0018e7
{
    public final t a;

    public void GetDataHandler(t p0){
       super();
       this.a = p0;
    }
    public void e(String p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GetDataHandler.class, "1")) {
          return;
       }
       if (this.a.d == null) {
          p1.onError(-1, "native photo is null");
          return;
       }else {
          QPhoto qPhoto = new QPhoto(this.a.d);
          GetDataHandler$WebCardData webCardData = new GetDataHandler$WebCardData();
          webCardData.mFeed = qPhoto;
          webCardData.mAd = k.B(qPhoto);
          PhotoAdvertisement$AdWebCardInfo uAdWebCardIn = j.u(qPhoto);
          if (uAdWebCardIn != null) {
             webCardData.mCardData = uAdWebCardIn.mCardData;
          }
          GetDataHandler$WebCardData mAd = webCardData.mAd;
          if (mAd != null) {
             PhotoAdvertisement mAdData = mAd.mAdData;
             if (mAdData != null) {
                webCardData.mH5Data = mAdData.mH5Data;
             }
          }
          p1.onSuccess(webCardData);
          return;
       }
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "getData";
    }
    public void onDestroy(){
       a.a(this);
    }
}
