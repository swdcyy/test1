package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.g$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;

public class g$a extends m	// class@000821
{
    public final g c;

    public void g$a(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       b.a(this.c.getActivity()).s(this.c.r.getLiveStreamPackage(), this.c.s);
       Fragment parentFragme = this.c.q.getParentFragment();
       if (parentFragme instanceof KwaiDialogFragment) {
          parentFragme.dismissAllowingStateLoss();
       }
       return;
    }
}
