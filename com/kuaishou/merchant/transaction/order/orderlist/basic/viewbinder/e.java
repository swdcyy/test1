package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.e;
import oj0.a;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseRefreshOrderViewBinder;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.String;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import fg6.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import tk4.a;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import yk4.t;
import java.lang.Runnable;
import ekd.k1;

public final class e implements a	// class@00086a
{
    public final BaseRefreshOrderViewBinder b;

    public void e(BaseRefreshOrderViewBinder p0){
       this.b = p0;
    }
    public final void W(Map p0){
       int i1;
       e tb = this.b;
       Objects.requireNonNull(tb);
       a.s(MerchantTransactionLogBiz.ORDER, tb.getTag(), "receive EVENT_ORDER_LIST_REFRESH_ORDER, value "+p0);
       if (p0 == null) {
       }else {
          int i = 1;
          p0 = p0.get("MerchantTransactionDataParams");
          if (p0 instanceof Map) {
             long l = 0;
             try{
                JsonObject jsonObject = c.d(a.a.q(p0)).r();
                JsonElement jsonElement = jsonObject.e0("reloadType");
                if (jsonElement != null) {
                   i = jsonElement.p();
                label_004b :
                   jsonElement = jsonObject.e0("oid");
                   i1 = (jsonElement != null)? jsonElement.t(): l;
                   try{
                      JsonElement jsonElement1 = jsonObject.e0("resumeInterval");
                      if (jsonElement1 != null) {
                         l = jsonElement1.t();
                      }
                   }catch(java.lang.Exception e0){
                      a.s(MerchantTransactionLogBiz.ORDER, tb.getTag(), "KRN bridge EVENT_ORDER_LIST_REFRESH_ORDER value invalid");
                   }
                }else {
                   goto label_004b ;
                }
             }catch(java.lang.Exception e0){
                i1 = l;
                goto label_0067 ;
             }
             long l1 = i1;
             long l2 = l;
             int i2 = e0;
             a.b.b("");
             FragmentActivity uFragmentAct = tb.P8();
             if (uFragmentAct != null && !uFragmentAct.isFinishing()) {
                t ot = new t(tb, i2, l2, l1);
                k1.o(uFragmentAct.isFinishing());
             }
          }
       }
       return;
    }
}
