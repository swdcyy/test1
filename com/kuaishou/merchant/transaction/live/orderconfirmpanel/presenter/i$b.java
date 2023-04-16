package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderPaymentRequestInfo;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderPaymentRequestInfo$CreateOrderParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam$ReselectedParams;
import com.kuaishou.merchant.transaction.base.model.payment.CashierData;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.KwaiMiLogInfo;

public class i$b extends m	// class@000826
{
    public final i c;

    public void i$b(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       int i;
       OrderPaymentRequestInfo mCashierData;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, i$b.class, "1")) {
          return;
       }
       obj.c.D9();
       i$b c = obj.c;
       Objects.requireNonNull(c);
       i oi = i.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, c, oi, "36") && c.U != null) {
          a uoa = b.a(c.P8());
          ClientContent$LiveStreamPackage liveStreamPa = c.h9();
          i y = c.y;
          PageInfoReqParam obj1 = PatchProxy.apply(objArray, c, oi, "34");
          if (obj1 != PatchProxyResult.class) {
             i = obj1.intValue();
          }else {
             oi = c.V;
             if (oi != null) {
                mCashierData = oi.mCreateOrderParam;
                if (mCashierData != null && !TextUtils.x(mCashierData.mRemark)) {
                   i = 1;
                }
             }
             i = 0;
          }
          obj1 = c.U.mReselectedParamModel;
          mCashierData = c.V.mCashierData;
          uoa.o(liveStreamPa, y, i, obj1.mAddressId, obj1.mSkuId, obj1.mItemCount, mCashierData.mName, c.y.mKwaiMiLogInfo, mCashierData.mIsCashierConfigDefault, mCashierData.mInstallmentName, mCashierData.mIsCashierInstallmentDefault, mCashierData.mSubCashierConfigName, c.c9(), c.X0);
       }
       return;
    }
}
