package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.f$a;
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
import com.kuaishou.merchant.router.b;

public class f$a extends m	// class@00081e
{
    public final f c;

    public void f$a(f p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       if (p0.getId() == 0x7f0a02ed) {
          f$a tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(null, tc, f.class, "6")) {
             f u = tc.u;
             if (u != null && !TextUtils.x(u.mDetailLink)) {
                b.k(tc.getActivity(), tc.u.mDetailLink);
             }
          }
       }
       return;
    }
}
