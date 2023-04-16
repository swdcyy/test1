package com.yxcorp.gifshow.log.timemachine.TMLogManager$ratioMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.log.timemachine.TMLogManager$ratioMap$2$a;
import java.lang.reflect.Type;
import el.a;
import h8c.a;
import java.lang.Throwable;
import q87.c;

public final class TMLogManager$ratioMap$2 extends Lambda implements a	// class@001b4a
{
    public static final TMLogManager$ratioMap$2 INSTANCE;

    static {
       TMLogManager$ratioMap$2.INSTANCE = new TMLogManager$ratioMap$2();
    }
    public void TMLogManager$ratioMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       HashMap obj = PatchProxy.apply(null, this, TMLogManager$ratioMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().getValue("TMLogRatioConfig", new TMLogManager$ratioMap$2$a().getType(), new HashMap());
       return obj;
    }
}
