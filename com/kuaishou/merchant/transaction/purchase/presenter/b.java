package com.kuaishou.merchant.transaction.purchase.presenter.b;
import u07.u;
import com.kuaishou.merchant.transaction.purchase.presenter.AddressUIPresenter;
import com.kuaishou.merchant.basic.model.AddressInfo;
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
import kc4.x;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.purchase.presenter.q0$b;
import em4.a;
import kc4.c$b;
import kc4.c$a;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import um4.d;
import n3d.a;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressEditActivity;

public final class b implements u	// class@000967
{
    public final AddressUIPresenter b;
    public final AddressInfo c;

    public void b(AddressUIPresenter p0,AddressInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, AddressUIPresenter.class, "18")) {
       }else {
          Activity activity = tb.getActivity();
          if (activity instanceof GifshowActivity) {
             if (x.h(tb.u)) {
                if (!TextUtils.x(tb.u.mEditUri) || tb.s != null) {
                   AddressUIPresenter u = tb.u;
                   tb.q.a(activity, u.mEditUri, new q0$b(tb.s, u));
                }else {
                   a.A(MerchantTransactionLogBiz.PURCHASE, "AddressPanelPresenter", "use lev4, but no edit uri");
                }
             }
             MerchantAddressEditActivity.D3(activity, tc, tb.v.mItemId+"", tb.v.mSellerId+"", true, new d(tb));
          }
       }
       return;
    }
}
