package com.kuaishou.merchant.transaction.purchase.dynamic.opt.PurchaseV2PreLoader$mParamsBuilder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.transaction.purchase.dynamic.util.PageInfoParamBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;

public final class PurchaseV2PreLoader$mParamsBuilder$2 extends Lambda implements a	// class@000915
{
    public static final PurchaseV2PreLoader$mParamsBuilder$2 INSTANCE;

    static {
       PurchaseV2PreLoader$mParamsBuilder$2.INSTANCE = new PurchaseV2PreLoader$mParamsBuilder$2();
    }
    public void PurchaseV2PreLoader$mParamsBuilder$2(){
       super(0);
    }
    public final PageInfoParamBuilder invoke(){
       Object obj = PatchProxy.apply(null, this, PurchaseV2PreLoader$mParamsBuilder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PageInfoParamBuilder(a.b());
    }
    public Object invoke(){
       return this.invoke();
    }
}
