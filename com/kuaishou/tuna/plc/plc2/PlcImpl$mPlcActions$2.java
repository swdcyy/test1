package com.kuaishou.tuna.plc.plc2.PlcImpl$mPlcActions$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PlcImpl$mPlcActions$2 extends Lambda implements a	// class@001042
{
    public static final PlcImpl$mPlcActions$2 INSTANCE;

    static {
       PlcImpl$mPlcActions$2.INSTANCE = new PlcImpl$mPlcActions$2();
    }
    public void PlcImpl$mPlcActions$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ConcurrentHashMap invoke(){
       Object obj = PatchProxy.apply(null, this, PlcImpl$mPlcActions$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ConcurrentHashMap();
    }
}
