package com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$initBridge$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import fg6.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.AdBottomBannerTkData;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.google.gson.Gson;
import qrd.l1;

public final class ThanosAdBottomBannerTKPresenter$initBridge$1 extends Lambda implements l	// class@00159b
{
    public final ThanosAdBottomBannerTKPresenter this$0;

    public void ThanosAdBottomBannerTKPresenter$initBridge$1(ThanosAdBottomBannerTKPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(JSONObject p0){
       Gson a;
       ThanosAdBottomBannerTKPresenter u;
       AdBottomBannerTkData obj = PatchProxy.applyOneRefs(p0, this, ThanosAdBottomBannerTKPresenter$initBridge$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       a = a.a;
       obj = new AdBottomBannerTkData();
       obj.setAd(k.B(ThanosAdBottomBannerTKPresenter.P8(this.this$0)));
       ThanosAdBottomBannerTKPresenter$initBridge$1 tthis$0 = this.this$0;
       PhotoAdvertisement$TkTemplateData tkTemplateDa = null;
       if (tthis$0.p != null) {
          u = tthis$0.u;
          if (u != null) {
             tkTemplateDa = u.mData;
          }
          obj.setDataString(tkTemplateDa);
       }else {
          u = tthis$0.u;
          if (u != null) {
             tkTemplateDa = u.mData;
          }
          obj.setTemplateData(a.h(tkTemplateDa, Object.class));
       }
       String str = a.q(obj);
       a.o(str, "Gsons.KWAI_GSON.toJson\(A¡­.java\)\n        }\n      }\)");
       return str;
    }
}
