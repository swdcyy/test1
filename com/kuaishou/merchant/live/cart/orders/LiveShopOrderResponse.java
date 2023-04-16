package com.kuaishou.merchant.live.cart.orders.LiveShopOrderResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LiveShopOrderResponse implements CursorResponse, Serializable	// class@0019c7
{
    public String cursor;
    public List liveCommodityOrderItems;
    public int result;
    public static final long serialVersionUID = 0x4d3c2962ba33b3b3;

    public void LiveShopOrderResponse(){
       super();
    }
    public String getCursor(){
       return this.cursor;
    }
    public List getItems(){
       return this.liveCommodityOrderItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveShopOrderResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.getCursor());
    }
}
