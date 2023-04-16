package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter$initTkGroupBridge$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.tachikoma.ThanosAdMixBarTKPresenter;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import nz8.a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import fg6.a;
import com.google.gson.Gson;

public final class ThanosAdMixBarTKPresenter$initTkGroupBridge$1 extends Lambda implements l	// class@00157d
{
    public final ThanosAdMixBarTKPresenter this$0;

    public void ThanosAdMixBarTKPresenter$initTkGroupBridge$1(ThanosAdMixBarTKPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Object invoke(JSONObject p0){
       ThanosAdMixBarTKPresenter a;
       ThanosAdMixBarTKPresenter$initTkGroupBridge$1 obj = PatchProxy.applyOneRefs(p0, this, ThanosAdMixBarTKPresenter$initTkGroupBridge$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       obj = this.this$0;
       a = obj.A;
       PhotoAdvertisement$TkTemplateData mData = (a != null)? a.mData: null;
       ThanosAdMixBarTKPresenter q = obj.q;
       if (q == null) {
          a.S("mPhoto");
       }
       String str = a.a.q(new a(mData, k.B(q)));
       a.o(str, "Gsons.KWAI_GSON.toJson\(mixActionBarTkData\)");
       return str;
    }
}
