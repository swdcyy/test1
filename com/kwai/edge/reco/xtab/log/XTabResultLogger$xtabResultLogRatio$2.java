package com.kwai.edge.reco.xtab.log.XTabResultLogger$xtabResultLogRatio$2;
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

public final class XTabResultLogger$xtabResultLogRatio$2 extends Lambda implements a	// class@000d63
{
    public static final XTabResultLogger$xtabResultLogRatio$2 INSTANCE;

    static {
       XTabResultLogger$xtabResultLogRatio$2.INSTANCE = new XTabResultLogger$xtabResultLogRatio$2();
    }
    public void XTabResultLogger$xtabResultLogRatio$2(){
       super(0);
    }
    public final Float invoke(){
       Object obj = PatchProxy.apply(null, this, XTabResultLogger$xtabResultLogRatio$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("xtabEveResultLogRatio", Float.TYPE, Float.valueOf(0x3f800000));
    }
    public Object invoke(){
       return this.invoke();
    }
}
