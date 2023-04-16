package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.f$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.f;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.purchasepanel.insurance.FreightInsuranceModel;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import java.util.HashMap;
import com.kuaishou.merchant.router.RouterConfig;
import nk4.t;
import z1.a;
import nk4.u;
import us3.f;
import com.kuaishou.merchant.router.b;

public class f$b extends m	// class@00081f
{
    public final f c;

    public void f$b(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       f$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, f.class, "5") && !TextUtils.x(tc.u.mServicePageLink)) {
          b.a(tc.getActivity()).l(tc.P8(), tc.s, tc.u.mLoggerInfo);
          b.m(tc.getActivity(), tc.u.mServicePageLink, new RouterConfig().i(new t(tc)), new u(tc));
       }
       return;
    }
}
