package com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.d;
import oj0.a;
import com.kuaishou.merchant.transaction.order.orderlist.basic.viewbinder.BaseRefreshOrderViewBinder;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import java.lang.String;
import p74.a;
import o74.a;
import fg6.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.c;
import com.google.gson.JsonObject;
import java.lang.Long;
import tk4.a;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import yk4.u;
import java.lang.Runnable;
import ekd.k1;

public final class d implements a	// class@000869
{
    public final BaseRefreshOrderViewBinder b;

    public void d(BaseRefreshOrderViewBinder p0){
       this.b = p0;
    }
    public final void W(Map p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       a.s(MerchantTransactionLogBiz.ORDER, "OrderListCommonViewBinder", "receive EVENT_ORDER_LIST_REFRESH_ORDER, value "+p0);
       if (p0 == null) {
       }else {
          long l = 0;
          try{
             JsonElement jsonElement = c.d(a.a.q(p0)).r().m0("params").e0("resumeInterval");
             if (jsonElement != null) {
                l = Long.parseLong(jsonElement.w());
             }
          }catch(java.lang.Exception e0){
             a.s(MerchantTransactionLogBiz.ORDER, "OrderListCommonViewBinder", "KRN bridge EVENT_ORDER_LIST_REFRESH_ORDER value invalid");
          }
          a.b.b("");
          FragmentActivity uFragmentAct = e0.P8();
          if (uFragmentAct != null && !uFragmentAct.isFinishing()) {
             k1.o(new u(e0, l));
          }
       }
       return;
    }
}
