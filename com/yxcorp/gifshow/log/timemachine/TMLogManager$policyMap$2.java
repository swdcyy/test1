package com.yxcorp.gifshow.log.timemachine.TMLogManager$policyMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.log.timemachine.TMLogManager$policyMap$2$a;
import java.lang.reflect.Type;
import el.a;
import h8c.a;
import java.lang.Throwable;
import q87.c;

public final class TMLogManager$policyMap$2 extends Lambda implements a	// class@001b48
{
    public static final TMLogManager$policyMap$2 INSTANCE;

    static {
       TMLogManager$policyMap$2.INSTANCE = new TMLogManager$policyMap$2();
    }
    public void TMLogManager$policyMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       HashMap obj = PatchProxy.apply(null, this, TMLogManager$policyMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().getValue("TMLogPolicyConfig", new TMLogManager$policyMap$2$a().getType(), new HashMap());
       return obj;
    }
}
