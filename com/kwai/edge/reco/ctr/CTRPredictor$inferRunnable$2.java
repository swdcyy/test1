package com.kwai.edge.reco.ctr.CTRPredictor$inferRunnable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.edge.reco.ctr.CTRPredictor$inferRunnable$2$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CTRPredictor$inferRunnable$2 extends Lambda implements a	// class@000d3b
{
    public static final CTRPredictor$inferRunnable$2 INSTANCE;

    static {
       CTRPredictor$inferRunnable$2.INSTANCE = new CTRPredictor$inferRunnable$2();
    }
    public void CTRPredictor$inferRunnable$2(){
       super(0);
    }
    public final CTRPredictor$inferRunnable$2$a invoke(){
       Object obj = PatchProxy.apply(null, this, CTRPredictor$inferRunnable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CTRPredictor$inferRunnable$2$a();
    }
    public Object invoke(){
       return this.invoke();
    }
}
