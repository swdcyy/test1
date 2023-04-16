package com.kuaishou.merchant.live.cart.onsale.audience.ultron.communication.method.UltronPoint$Request;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class UltronPoint$Request implements Serializable	// class@001988
{
    public int mType;
    public static final long serialVersionUID = 0x86f84dfa4ad06f51;

    public void UltronPoint$Request(){
       super();
    }
    public static UltronPoint$Request valueOf(int p0){
       UltronPoint$Request obj;
       if (PatchProxy.isSupport(UltronPoint$Request.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, UltronPoint$Request.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new UltronPoint$Request();
       obj.mType = p0;
       return obj;
    }
}
