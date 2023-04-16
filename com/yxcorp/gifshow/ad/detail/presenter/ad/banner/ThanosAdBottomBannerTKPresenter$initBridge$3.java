package com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter$initBridge$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.banner.ThanosAdBottomBannerTKPresenter;
import java.lang.Object;
import org.json.JSONObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Application;
import o56.a;
import java.lang.System;
import android.content.Context;
import g59.l;

public final class ThanosAdBottomBannerTKPresenter$initBridge$3 extends Lambda implements l	// class@00159d
{
    public final ThanosAdBottomBannerTKPresenter this$0;

    public void ThanosAdBottomBannerTKPresenter$initBridge$3(ThanosAdBottomBannerTKPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdBottomBannerTKPresenter$initBridge$3.class, "1")) {
          return;
       }
       a.p(p0, "it");
       ThanosAdBottomBannerTKPresenter$initBridge$3 tthis$0 = this.this$0;
       if (tthis$0.p != null) {
          this.this$0.X8(p0.optString("surveyId"));
          l.c(a.b(), this.this$0.V8(), System.currentTimeMillis());
       }else {
          tthis$0.X8(null);
       }
       return;
    }
}
