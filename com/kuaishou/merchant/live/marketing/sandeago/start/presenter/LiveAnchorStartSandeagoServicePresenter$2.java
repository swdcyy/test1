package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.LiveAnchorStartSandeagoServicePresenter$2;
import us3.f;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.t;
import java.lang.Object;
import us3.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import ot3.l0;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.LiveAnchorStartSandeagoServicePresenter$2$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.util.List;

public class LiveAnchorStartSandeagoServicePresenter$2 implements f	// class@001a6f
{
    public final t a;

    public void LiveAnchorStartSandeagoServicePresenter$2(t p0){
       this.a = p0;
       super();
    }
    public void a(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorStartSandeagoServicePresenter$2.class, "1")) {
          return;
       }
       String str = l0.i("servicePromise", p0.b);
       a.t(MerchantLiveLogBiz.LIVE_SANDEAGO, "LiveAnchorStartSandeagoServicePresenter", "sandeago service callback", "serviceData", str);
       if (!TextUtils.x(str)) {
          this.a.s = a.a.i(str, new LiveAnchorStartSandeagoServicePresenter$2$1(this).getType());
          this.a.P8();
       }
       return;
    }
}
