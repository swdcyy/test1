package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdActionBarTKPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.android.model.ads.PhotoAdvertisement$ActionbarInfo;

public final class ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$1 extends Lambda implements a	// class@001575
{
    public final ThanosAdActionBarTKPresenter this$0;

    public void ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$1(ThanosAdActionBarTKPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$1 obj = PatchProxy.apply(null, this, ThanosAdActionBarTKPresenter$initTkBridge$tkBridgeContext$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       ThanosAdActionBarTKPresenter n = obj.N;
       Long longx = obj.V8();
       PhotoAdvertisement$ActionbarInfo uActionbarIn = null;
       int i = (longx != null)? (int)longx.longValue(): 0;
       n.put("realShowDelayTime", Integer.valueOf(i));
       ThanosAdActionBarTKPresenter d = this.this$0.D;
       PhotoAdvertisement$ActionbarInfo mActionBarLo = (d != null)? d.mActionBarLoadTime: 0;
       n.put("actionBarLoadTime", Integer.valueOf(mActionBarLo));
       d = this.this$0.D;
       mActionBarLo = (d != null)? d.mDownloadedBarLoadTime: 0;
       n.put("downloadedActionBarLoadTime", Integer.valueOf(mActionBarLo));
       d = this.this$0.D;
       if (d != null) {
          mActionBarLo = d.mActionbarTag;
          if (mActionBarLo != null) {
          label_005e :
             n.put("actionBarTag", mActionBarLo);
             d = this.this$0.D;
             if (d != null) {
                uActionbarIn = d.mActionBarLocation;
             }
             n.put("actionBarLocation", Integer.valueOf(uActionbarIn));
             return n;
          }
       }
       String str = "";
       goto label_005e ;
    }
}
