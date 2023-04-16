package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.e$a;
import qk4.b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.e;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.CrossBorderInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderCreatePromptInfo;
import java.lang.StringBuilder;
import kzc.d;
import u07.t$a;
import u07.f;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderCreatePromptInfo$Button;
import nk4.n;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import e17.i$b;
import e17.i;

public class e$a implements b	// class@00081c
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       MerchantLivePurchasePanelResponse mCrossBorder = this.a.q.mCrossBorderInfo;
       boolean b = (mCrossBorder != null && mCrossBorder.mNotCertificateInfo != null)? true: false;
       return b;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       Activity activity = this.a.getActivity();
       String str = "LiveAudienceOrderConfirmCrossBorderInterceptOrderPresenter";
       if (activity != null && (activity.isFinishing() || activity.isDestroyed())) {
          a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str, "activity is invalid");
          return;
       }else {
          CrossBorderInfo mNotCertific = this.a.q.mCrossBorderInfo.mNotCertificateInfo;
          if (mNotCertific == null) {
             a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str, "notCertificateInfo is null");
             return;
          }else {
             OrderCreatePromptInfo mType = mNotCertific.mType;
             String str1 = 1;
             if (mType != str1) {
                if (mType != 2) {
                   a.s(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, str, "can\'t recognize type: "+mNotCertific.mType);
                }else {
                   d uod = f.e(new d(activity));
                   uod.b1(KwaiDialogOption.d);
                   if (!TextUtils.x(mNotCertific.mTitle)) {
                      uod.X0(mNotCertific.mTitle);
                   }
                   if (!TextUtils.x(mNotCertific.mContent)) {
                      uod.z0(mNotCertific.mContent);
                   }
                   OrderCreatePromptInfo mConfirmButt = mNotCertific.mConfirmButton;
                   if (mConfirmButt != null) {
                      uod.T0(mConfirmButt.mButtonText);
                      uod.u0(new n(this, mNotCertific));
                   }
                   uod.v(str1);
                   uod.p();
                   uod.Y(PopupInterface.a);
                }
             }else {
                i$b uob = i.m();
                uob.y(mNotCertific.mContent);
                uob.o(str1);
                uob.l(str1);
                i.c(R.style.arg_RES_7f11066a, uob);
             }
             return;
          }
       }
    }
}
