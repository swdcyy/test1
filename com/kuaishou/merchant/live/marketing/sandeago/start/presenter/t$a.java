package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.t$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.t;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.live.marketing.sandeago.model.StartSandeagoCategoryInfoResponse;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.LiveAnchorStartSandeagoServicePresenter$2;
import fg6.a;
import com.google.gson.Gson;
import android.net.Uri;
import ekd.x0;
import android.net.Uri$Builder;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.router.RouterConfig;
import us3.f;
import com.kuaishou.merchant.router.b;

public class t$a extends m	// class@001a8f
{
    public final t c;

    public void t$a(t p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$a.class, "1")) {
          return;
       }
       t$a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, t.class, "3")) {
          t v = tc.v;
          if (v != null && !TextUtils.x(v.mServicePromiseUrl)) {
             LiveAnchorStartSandeagoServicePresenter$2 u2 = new LiveAnchorStartSandeagoServicePresenter$2(tc);
             Uri$Builder uBuilder = x0.f(tc.v.mServicePromiseUrl).buildUpon();
             uBuilder.appendQueryParameter("servicePromise", a.a.q(tc.s));
             Uri uri = uBuilder.build();
             if (uri != null) {
                b.q(tc.q.getMerchantSessionId(), tc.getActivity(), uri.toString(), null, u2);
             }
          }
       }
       return;
    }
}
