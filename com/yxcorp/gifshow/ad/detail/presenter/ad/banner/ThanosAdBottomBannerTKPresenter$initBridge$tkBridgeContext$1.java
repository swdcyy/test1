package com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$initBridge$tkBridgeContext$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import java.lang.Integer;

public final class ThanosAdBottomBannerTKPresenter$initBridge$tkBridgeContext$1 extends Lambda implements a	// class@00159e
{
    public final ThanosAdBottomBannerTKPresenter this$0;

    public void ThanosAdBottomBannerTKPresenter$initBridge$tkBridgeContext$1(ThanosAdBottomBannerTKPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       ThanosAdBottomBannerTKPresenter$initBridge$tkBridgeContext$1 obj = PatchProxy.apply(null, this, ThanosAdBottomBannerTKPresenter$initBridge$tkBridgeContext$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       ThanosAdBottomBannerTKPresenter y = obj.y;
       y.put("photoId", ThanosAdBottomBannerTKPresenter.P8(obj).getPhotoId());
       ThanosAdBottomBannerTKPresenter u = this.this$0.u;
       PhotoAdvertisement$TkTemplateData tkTemplateDa = null;
       int i = (u != null)? (int)u.mTemplateDelayTime: 0;
       y.put("templateDelayTime", Integer.valueOf(i));
       u = this.this$0.u;
       if (u != null) {
          tkTemplateDa = u.mShowControlType;
       }
       y.put("showControlType", Integer.valueOf(tkTemplateDa));
       return y;
    }
}
