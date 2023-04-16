package com.kwai.edge.reco.ctr.CTRPredictor$initDataProvider$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.edge.reco.ctr.CTRPredictor;
import java.lang.Long;

public final class CTRPredictor$initDataProvider$3 extends Lambda implements a	// class@000d3e
{
    public static final CTRPredictor$initDataProvider$3 INSTANCE;

    static {
       CTRPredictor$initDataProvider$3.INSTANCE = new CTRPredictor$initDataProvider$3();
    }
    public void CTRPredictor$initDataProvider$3(){
       super(0);
    }
    public final Object invoke(){
       Object obj = PatchProxy.apply(null, this, CTRPredictor$initDataProvider$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Long.valueOf(CTRPredictor.v.n());
    }
}
