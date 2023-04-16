package com.kuaishou.merchant.transaction.purchase.presenter.d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.purchase.presenter.AddressUIPresenter;
import com.kuaishou.merchant.basic.model.AddressInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Long;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
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
import um4.e;
import n3d.a;
import com.kuaishou.merchant.transaction.base.address.MerchantAddressListActivity;
import em4.m;

public class d extends m	// class@00096e
{
    public final AddressInfo c;
    public final AddressUIPresenter d;

    public void d(AddressUIPresenter p0,AddressInfo p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d td = this.d;
       AddressInfo mAddressId = this.c.mAddressId;
       Objects.requireNonNull(td);
       AddressUIPresenter uAddressUIPr = AddressUIPresenter.class;
       if (!PatchProxy.isSupport(uAddressUIPr) || !PatchProxy.applyVoidOneRefs(Long.valueOf(mAddressId), td, uAddressUIPr, "17")) {
          Activity activity = td.getActivity();
          if (activity instanceof GifshowActivity) {
             if (x.h(td.u)) {
                if (!TextUtils.x(td.u.mListUri)) {
                   AddressUIPresenter u = td.u;
                   td.q.a(activity, u.mListUri, new q0$b(td.s, u));
                }else {
                   a.A(MerchantTransactionLogBiz.PURCHASE, "AddressPanelPresenter", "use lev4, but no list uri");
                }
             }
             MerchantAddressListActivity.B3(activity, 2, mAddressId, 1, td.v.mItemId+"", td.v.mSellerId+"", new e(td));
          }
       }
       m.g(true);
       return;
    }
}
