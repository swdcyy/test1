package com.kwai.yoda.bridge.YodaBridgeHandler$mBridgeHolder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ny7.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.kernel.YodaV2;

public final class YodaBridgeHandler$mBridgeHolder$2 extends Lambda implements a	// class@001184
{
    public static final YodaBridgeHandler$mBridgeHolder$2 INSTANCE;

    static {
       YodaBridgeHandler$mBridgeHolder$2.INSTANCE = new YodaBridgeHandler$mBridgeHolder$2();
    }
    public void YodaBridgeHandler$mBridgeHolder$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final h invoke(){
       Object obj = PatchProxy.apply(null, this, YodaBridgeHandler$mBridgeHolder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaV2.f.a();
    }
}
