package com.kwai.edge.reco.ctr.CTRPredictor$initDataProvider$5;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor;
import java.util.Objects;
import java.lang.Float;

public final class CTRPredictor$initDataProvider$5 extends Lambda implements a	// class@000d40
{
    public static final CTRPredictor$initDataProvider$5 INSTANCE;

    static {
       CTRPredictor$initDataProvider$5.INSTANCE = new CTRPredictor$initDataProvider$5();
    }
    public void CTRPredictor$initDataProvider$5(){
       super(0);
    }
    public final Object invoke(){
       Object obj = PatchProxy.apply(null, this, CTRPredictor$initDataProvider$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(CtrEnvLightMonitor.h);
       return Float.valueOf(CtrEnvLightMonitor.f);
    }
}
