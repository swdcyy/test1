package com.kuaishou.merchant.transaction.purchase.presenter.v$a;
import com.kuaishou.merchant.transaction.purchase.presenter.v$b;
import com.kuaishou.merchant.transaction.purchase.presenter.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import com.kuaishou.merchant.transaction.base.model.CrossBorderInfo;
import ue4.o;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.router.b;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import vm4.a;
import com.kuaishou.merchant.transaction.purchase.presenter.y$c;

public class v$a implements v$b	// class@0009af
{
    public final v a;

    public void v$a(v p0){
       this.a = p0;
       super();
    }
    public long a(){
       CrossBorderInfo mUserAuthent;
       v obj = PatchProxy.apply(null, this, v$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.a.t;
       if (obj != null && !obj.getVisibility()) {
          obj = this.a.p;
          if (obj != null && o.t(obj.mUserAuthenticationId)) {
             mUserAuthent = this.a.p.mUserAuthenticationId;
          label_0037 :
             return mUserAuthent;
          }
       }
       mUserAuthent = -1;
       goto label_0037 ;
    }
    public String b(){
       v p = this.a.p;
       if (p == null) {
          return "";
       }
       return p.mNotCertifiedTip;
    }
    public void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v$a.class, "3")) {
          return;
       }
       v$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, v.class, "14")) {
          HashMap hashMap = new HashMap();
          hashMap.put("authenticateReason", String.valueOf(2));
          b.k(ta.getActivity(), TextUtils.e(ta.p.mClickRedirectLink, hashMap));
       }
       return;
    }
    public boolean d(){
       v obj = PatchProxy.apply(null, this, v$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.t;
       boolean b = (obj != null && (!obj.getVisibility() && (!o.t(this.a()) && this.a.B != null)))? true: false;
       if (b) {
          if (this.a.getActivity() == null) {
             a.g(MerchantTransactionLogBiz.PURCHASE, "CrossBorderCCService", "interceptSubmitOrder: getActivity\(\) is null");
          }else {
             v$a ta = this.a;
             if (ta.C == null) {
                ta.C = new a();
             }
             ta.C.b(ta.getActivity(), this, this.a.p);
          }
       }
       return b;
    }
}
