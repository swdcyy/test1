package com.kuaishou.merchant.transaction.order.orderlist.list.viewbinder.OrderListRnPreloadViewBinder$a;
import android.os.MessageQueue$IdleHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bm4.d;
import gj0.e;
import java.util.ArrayList;
import gj0.d;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.Enum;
import java.util.List;
import com.kuaishou.krn.bundle.preload.PreloadType;
import js6.a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;

public final class OrderListRnPreloadViewBinder$a implements MessageQueue$IdleHandler	// class@00089d
{
    public static final OrderListRnPreloadViewBinder$a a;

    static {
       OrderListRnPreloadViewBinder$a.a = new OrderListRnPreloadViewBinder$a();
    }
    public void OrderListRnPreloadViewBinder$a(){
       super();
    }
    public final boolean queueIdle(){
       Object[] objArray = null;
       String str = "1";
       d obj = PatchProxy.apply(objArray, this, OrderListRnPreloadViewBinder$a.class, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!PatchProxy.applyVoid(objArray, objArray, d.class, str)) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new e("merchant_client_order_detail", ""));
          obj = new d("KwaiShopCOrderDetail", JsFramework.REACT.name(), uArrayList);
          obj.preloadType = PreloadType.RUN_APPLICATION.ordinal();
          a.b.o4(obj);
          a.s(MerchantTransactionLogBiz.ORDER, "preloadRnBundle", "KwaiShopCOrderDetail");
       }
       return false;
    }
}
