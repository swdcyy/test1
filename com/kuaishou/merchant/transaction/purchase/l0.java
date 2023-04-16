package com.kuaishou.merchant.transaction.purchase.l0;
import com.kuaishou.merchant.transaction.base.net.error.c;
import android.app.Activity;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.retrofit.model.KwaiException;
import vm4.c;
import ue4.p;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import em4.m;

public class l0 extends c	// class@000939
{

    public void l0(Activity p0){
       super(p0);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       boolean b1;
       l0 ol0 = l0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol0, "1")) {
          return;
       }
       String obj = PatchProxy.applyOneRefs(p0, this, ol0, "2");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(p0 instanceof KwaiException && p0.getErrorCode() == 532){
          b1 = true;
       }else {
          b1 = false;
       }
       this.e = b1;
       super.b(p0);
       this.e = b;
       obj = p.a(p0, c.a());
       if (!TextUtils.isEmpty(obj)) {
          a.s(MerchantTransactionLogBiz.PURCHASE, "PurchaseNetworkErrConsumer", obj);
       }
       m.l(p0);
       return;
    }
}
