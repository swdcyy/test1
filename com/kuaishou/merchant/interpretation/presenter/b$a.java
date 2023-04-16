package com.kuaishou.merchant.interpretation.presenter.b$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.interpretation.presenter.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.interpretation.model.SliceCommodityBubbleModel$SellerInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import tkd.b;
import tkd.d;
import vu5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;

public class b$a extends m	// class@001853
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b u = this.c.U;
       if (u != null && !TextUtils.isEmpty(u.mSellerId)) {
          d.a(-1718536792).Kp(this.c.getActivity(), ProfileStartParam.m(this.c.U.mSellerId));
       }
       return;
    }
}
