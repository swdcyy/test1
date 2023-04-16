package com.kuaishou.merchant.transaction.purchase.presenter.y$a;
import com.kuaishou.merchant.transaction.purchase.presenter.y$c;
import com.kuaishou.merchant.transaction.purchase.presenter.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import com.kuaishou.merchant.transaction.base.model.CrossBorderInfo;
import ue4.o;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import vm4.a;

public class y$a implements y$c	// class@0009ba
{
    public final y a;

    public void y$a(y p0){
       this.a = p0;
       super();
    }
    public long a(){
       CrossBorderInfo mUserAuthent;
       y obj = PatchProxy.apply(null, this, y$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.a.w;
       if (obj != null && !obj.getVisibility()) {
          obj = this.a.r;
          if (obj != null && o.t(obj.mUserAuthenticationId)) {
             mUserAuthent = this.a.r.mUserAuthenticationId;
          label_0037 :
             return mUserAuthent;
          }
       }
       mUserAuthent = -1;
       goto label_0037 ;
    }
    public String b(){
       y r = this.a.r;
       if (r == null) {
          return "";
       }
       return r.mNotCertifiedTip;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, y$a.class, "3")) {
          return;
       }
       this.a.S8(true);
       return;
    }
    public boolean d(){
       y obj = PatchProxy.apply(null, this, y$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.w;
       boolean b = (obj != null && (!obj.getVisibility() && !o.t(this.a())))? true: false;
       if (b) {
          if (this.a.getActivity() == null) {
             a.g(MerchantTransactionLogBiz.PURCHASE, "CrossBorderService", "interceptSubmitOrder: getActivity\(\) is null");
          }else {
             y$a ta = this.a;
             if (ta.t == null) {
                ta.t = new a();
             }
             ta.t.b(ta.getActivity(), this, this.a.r);
          }
       }
       return b;
    }
}
