package com.kwai.edge.reco.ctr.log.CTRResultLogger$ctrResultLogRatio$2;
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

public final class CTRResultLogger$ctrResultLogRatio$2 extends Lambda implements a	// class@000d53
{
    public static final CTRResultLogger$ctrResultLogRatio$2 INSTANCE;

    static {
       CTRResultLogger$ctrResultLogRatio$2.INSTANCE = new CTRResultLogger$ctrResultLogRatio$2();
    }
    public void CTRResultLogger$ctrResultLogRatio$2(){
       super(0);
    }
    public final Float invoke(){
       Object obj = PatchProxy.apply(null, this, CTRResultLogger$ctrResultLogRatio$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("ctrResultLogRatio", Float.TYPE, Float.valueOf(0x3f800000));
    }
    public Object invoke(){
       return this.invoke();
    }
}