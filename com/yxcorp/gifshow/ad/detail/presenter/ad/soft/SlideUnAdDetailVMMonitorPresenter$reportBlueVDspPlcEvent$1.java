package com.yxcorp.gifshow.ad.detail.presenter.ad.soft.SlideUnAdDetailVMMonitorPresenter$reportBlueVDspPlcEvent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import r09.b;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Object;
import com.google.gson.JsonObject;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Enum;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;

public final class SlideUnAdDetailVMMonitorPresenter$reportBlueVDspPlcEvent$1 extends Lambda implements l	// class@001618
{
    public final PhotoAdvertisement $ad;
    public final b this$0;

    public void SlideUnAdDetailVMMonitorPresenter$reportBlueVDspPlcEvent$1(b p0,PhotoAdvertisement p1){
       this.this$0 = p0;
       this.$ad = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideUnAdDetailVMMonitorPresenter$reportBlueVDspPlcEvent$1.class, "1")) {
          return;
       }
       a.p(p0, "jsonObject");
       p0.a0("ad_type", Integer.valueOf(this.$ad.mAdGroup.ordinal()));
       p0.a0("conversion_type", Integer.valueOf(this.$ad.mConversionType));
       p0.a0("ad_source_type", Integer.valueOf(this.$ad.mSourceType));
       p0.a0("biz_type", Integer.valueOf(63));
       b p = this.this$0.p;
       if (p == null) {
          a.S("mPhoto");
       }
       boolean b = (p.getPlcEntryStyleInfo() != null)? true: false;
       p0.H("is_exist_plc_meta", Boolean.valueOf(b));
       return;
    }
}
