package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.b;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.e$a;
import java.lang.Object;
import jga.g;
import com.kwai.framework.model.user.User;
import yp.l0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.MerchantCardEntity$CouponDetail;
import java.util.ArrayList;
import java.util.List;
import brd.t;
import o6a.c;
import o6a.f;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.v2.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b implements FollowHelper$a	// class@00179a
{
    public final e$a a;

    public void b(e$a p0){
       this.a = p0;
    }
    public final void a(boolean p0,g p1){
       b ta = this.a;
       if (!l0.c(ta.p) || (p0 && !PatchProxy.applyVoidWithListener(null, ta, e$a.class, "19"))) {
          User mCouponDetai = ta.p.mCouponDetail;
          MerchantCardEntity$CouponDetail mCouponId = (mCouponDetai != null)? mCouponDetai.mCouponId: "";
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(ta.p);
          ta.X7(c.a(uArrayList).subscribe(new f(mCouponId), c.b));
          PatchProxy.onMethodExit(e$a.class, "19");
       }
    label_0042 :
       return;
    }
}
