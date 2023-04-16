package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.g$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.merchant.transaction.base.purchasepanel.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nk4.v;
import kk4.e;
import com.kuaishou.merchant.transaction.base.purchasepanel.b$a;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$MoreInfo;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;

public class g$b extends m	// class@000822
{
    public final g c;

    public void g$b(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
          return;
       }
       g$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, g.class, "4")) {
          g x = tc.x;
          if (x == null || !x.K()) {
             b uob = new b(tc.getActivity(), tc.w, new v(tc), tc.t.c);
             tc.x = uob;
             uob.Z();
             Iterator iterator = tc.t.c.iterator();
             while (iterator.hasNext()) {
                b.a(tc.getActivity()).y(tc.r.getLiveStreamPackage(), tc.s, iterator.next().mTitle);
             }
          }
       }
       b.a(this.c.getActivity()).A(this.c.r.getLiveStreamPackage(), this.c.s);
       return;
    }
}
