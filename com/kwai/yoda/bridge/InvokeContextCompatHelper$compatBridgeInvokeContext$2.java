package com.kwai.yoda.bridge.InvokeContextCompatHelper$compatBridgeInvokeContext$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class InvokeContextCompatHelper$compatBridgeInvokeContext$2 extends Lambda implements a	// class@001173
{
    public static final InvokeContextCompatHelper$compatBridgeInvokeContext$2 INSTANCE;

    static {
       InvokeContextCompatHelper$compatBridgeInvokeContext$2.INSTANCE = new InvokeContextCompatHelper$compatBridgeInvokeContext$2();
    }
    public void InvokeContextCompatHelper$compatBridgeInvokeContext$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       Object obj = PatchProxy.apply(null, this, InvokeContextCompatHelper$compatBridgeInvokeContext$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HashMap();
    }
}
