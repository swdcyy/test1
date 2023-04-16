package com.kuaishou.merchant.live.cart.onsale.audience.ultron.communication.event.CartCardShowEvent;
import java.io.Serializable;
import com.kuaishou.merchant.live.cart.onsale.audience.ultron.communication.event.CartCardShowEvent$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class CartCardShowEvent implements Serializable	// class@001985
{
    public int bizType;
    public String instanceId;
    public static final CartCardShowEvent$a Companion;

    static {
       CartCardShowEvent.Companion = new CartCardShowEvent$a(null);
    }
    public void CartCardShowEvent(){
       super();
    }
    public static void getBizType$annotations(){
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CartCardShowEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CartCardShowEvent\(bizType="+this.bizType+", instanceId="+this.instanceId+')';
    }
}
