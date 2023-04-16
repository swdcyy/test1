package com.kwai.component.uiconfig.burnin.BurnInOptUtils$BURN_IN_PHONE$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Float;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class BurnInOptUtils$BURN_IN_PHONE$2 extends Lambda implements a	// class@000bd5
{
    public static final BurnInOptUtils$BURN_IN_PHONE$2 INSTANCE;

    static {
       BurnInOptUtils$BURN_IN_PHONE$2.INSTANCE = new BurnInOptUtils$BURN_IN_PHONE$2();
    }
    public void BurnInOptUtils$BURN_IN_PHONE$2(){
       super(0);
    }
    public final Float invoke(){
       Object obj = PatchProxy.apply(null, this, BurnInOptUtils$BURN_IN_PHONE$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("optBurnInPhones", Float.TYPE, Float.valueOf(0));
    }
    public Object invoke(){
       return this.invoke();
    }
}
