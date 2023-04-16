package com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpGlobalCommonDataProcViewBinder$onBind$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.merchant.transaction.purchase.dynamic.viewbinder.MtpGlobalCommonDataProcViewBinder;
import java.lang.Object;
import com.google.gson.JsonElement;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import gd4.d;
import androidx.fragment.app.Fragment;
import rk0.b;
import gd4.d$a;
import java.util.Map;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import java.lang.Exception;
import p74.a;
import o74.a;

public final class MtpGlobalCommonDataProcViewBinder$onBind$1 extends Lambda implements l	// class@00091d
{
    public final MtpGlobalCommonDataProcViewBinder this$0;

    public void MtpGlobalCommonDataProcViewBinder$onBind$1(MtpGlobalCommonDataProcViewBinder p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(JsonElement p0){
       Map map;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, MtpGlobalCommonDataProcViewBinder$onBind$1.class, "1")) {
          return;
       }
       MtpGlobalCommonDataProcViewBinder$onBind$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, MtpGlobalCommonDataProcViewBinder.class, "4")) {
          try{
             map = d.n.a(tthis$0.R8()).w0();
             if (p0 != null) {
                str = p0.w();
                if (str == null) {
                label_0032 :
                   str = "";
                }
             }else {
                goto label_0032 ;
             }
          }catch(java.lang.Exception e5){
             a.g(MerchantTransactionLogBiz.PURCHASE_V2, "MtpGlobalCommonDataProcViewBinder", "updateRetentionFailed:"+e5.getMessage());
             str = l1.a;
          }
          map.put("retentionMsg", str);
       }
       return;
    }
}
