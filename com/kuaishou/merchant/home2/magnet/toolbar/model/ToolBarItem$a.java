package com.kuaishou.merchant.home2.magnet.toolbar.model.ToolBarItem$a;
import java.lang.Object;
import nsd.u;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.merchant.home2.magnet.toolbar.model.ToolBarItem;
import android.graphics.drawable.Drawable;
import ot3.x0;

public final class ToolBarItem$a	// class@001802
{

    public void ToolBarItem$a(){
       super();
    }
    public void ToolBarItem$a(u p0){
       super();
    }
    public final List a(){
       ArrayList obj = PatchProxy.apply(null, this, ToolBarItem$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       ToolBarItem toolBarItem = new ToolBarItem(0, false, 0, 0, null, null, null, null, null, null, 1023, null);
       v1.setMText("我的订单");
       v1.setMType(1);
       v1.setMTabId((long)101);
       v1.setMJumpUrl(x0.a("https://app.kwaixiaodian.com/merchant/shop/order?layoutType=3&type=0&hyId=kwaishop"));
       obj.add(v1);
       toolBarItem = new ToolBarItem(0, false, 0, 0, null, null, null, null, null, null, 1023, null);
       v1.setMText("浏览记录");
       v1.setMType(2);
       v1.setMTabId((long)102);
       v1.setMJumpUrl(x0.a("https://app.kwaixiaodian.com/merchant/shop/history"));
       obj.add(v1);
       toolBarItem = new ToolBarItem(0, false, 0, 0, null, null, null, null, null, null, 1023, null);
       v1.setMText("商家信息");
       v1.setMType(3);
       v1.setMTabId((long)103);
       v1.setMJumpUrl("kwai://chat/aggregates?subbiz=MERCHANT&logParams=");
       obj.add(v1);
       toolBarItem = new ToolBarItem(0, false, 0, 0, null, null, null, null, null, null, 1023, null);
       v1.setMText("退款售后");
       v1.setMType(4);
       v1.setMTabId((long)104);
       v1.setMJumpUrl(x0.a("https://app.kwaixiaodian.com/merchant/shop/refund?layoutType=3"));
       obj.add(v1);
       toolBarItem = new ToolBarItem(0, false, 0, 0, null, null, null, null, null, null, 1023, null);
       v1.setMText("收货地址");
       v1.setMType(5);
       v1.setMTabId((long)105);
       v1.setMJumpUrl(x0.a("https://app.kwaixiaodian.com/merchant/address?mode=normal"));
       obj.add(v1);
       return obj;
    }
}
