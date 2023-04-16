package com.kuaishou.merchant.transaction.purchase.presenter.m;
import u07.u;
import com.kuaishou.merchant.transaction.purchase.presenter.r;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.basic.model.AddressInfo;
import kc4.x;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.purchase.presenter.q0$b;
import em4.a;
import kc4.c$b;
import kc4.c$a;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import um4.u;
import n3d.a;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressEditActivity;
import em4.m;

public final class m implements u	// class@00098e
{
    public final r b;

    public void m(r p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, r.class, "9")) {
       }else {
          Activity activity = tb.getActivity();
          String str = "CreateOrderPresenter";
          if (!activity instanceof GifshowActivity) {
             a.s(MerchantTransactionLogBiz.PURCHASE, str, "activity invalid while starting NewAddressActivity");
          }else if(x.h(tb.G)){
             if (!TextUtils.x(tb.G.mAddUri)) {
                r g = tb.G;
                tb.A.a(activity, g.mAddUri, new q0$b(tb.J, g));
             }else {
                a.A(MerchantTransactionLogBiz.PURCHASE, str, "use lev4, but no add uri");
             }
          }
          MerchantAddressEditActivity.F3(activity, tb.K.mItemId+"", tb.K.mSellerId+"", new u(tb));
       }
       m.h(true);
       return;
    }
}
