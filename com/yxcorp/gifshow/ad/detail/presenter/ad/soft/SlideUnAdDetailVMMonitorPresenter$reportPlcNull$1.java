package com.yxcorp.gifshow.ad.detail.presenter.ad.soft.SlideUnAdDetailVMMonitorPresenter$reportPlcNull$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Long;
import java.lang.Number;

public final class SlideUnAdDetailVMMonitorPresenter$reportPlcNull$1 extends Lambda implements l	// class@001619
{
    public final PhotoAdvertisement $ad;

    public void SlideUnAdDetailVMMonitorPresenter$reportPlcNull$1(PhotoAdvertisement p0){
       this.$ad = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideUnAdDetailVMMonitorPresenter$reportPlcNull$1.class, "1")) {
          return;
       }
       a.p(p0, "jsonObject");
       p0.c0("error_type", "0");
       p0.a0("creative_id", Long.valueOf(this.$ad.mCreativeId));
       p0.a0("page_id", Long.valueOf(this.$ad.mPageId));
       p0.a0("sub_page_id", Long.valueOf(this.$ad.mSubPageId));
       return;
    }
}
