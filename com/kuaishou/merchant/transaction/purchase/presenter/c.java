package com.kuaishou.merchant.transaction.purchase.presenter.c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.purchase.presenter.AddressUIPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.merchant.basic.model.AddressInfo;
import kc4.x;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.purchase.presenter.q0$b;
import em4.a;
import kc4.c$b;
import kc4.c$a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import um4.c;
import n3d.a;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressEditActivity;
import em4.m;

public class c extends m	// class@00096a
{
    public final AddressUIPresenter c;

    public void c(AddressUIPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, AddressUIPresenter.class, "16")) {
          Activity activity = tc.getActivity();
          if (activity instanceof GifshowActivity) {
             if (x.h(tc.u)) {
                if (!TextUtils.x(tc.u.mAddUri)) {
                   AddressUIPresenter u = tc.u;
                   tc.q.a(activity, u.mAddUri, new q0$b(tc.s, u));
                }else {
                   a.A(MerchantTransactionLogBiz.PURCHASE, "AddressPanelPresenter", "use lev4, but no add uri");
                }
             }
             MerchantAddressEditActivity.F3(activity, tc.v.mItemId+"", tc.v.mSellerId+"", new c(tc));
          }
       }
       m.g(false);
       return;
    }
}
