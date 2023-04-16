package com.kwai.edge.reco.ctr.CTRPredictor$initDataProvider$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import pj5.f;
import java.util.Objects;
import java.lang.Integer;

public final class CTRPredictor$initDataProvider$4 extends Lambda implements a	// class@000d3f
{
    public static final CTRPredictor$initDataProvider$4 INSTANCE;

    static {
       CTRPredictor$initDataProvider$4.INSTANCE = new CTRPredictor$initDataProvider$4();
    }
    public void CTRPredictor$initDataProvider$4(){
       super(0);
    }
    public final Object invoke(){
       Object obj = PatchProxy.apply(null, this, CTRPredictor$initDataProvider$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(f.c);
       return Integer.valueOf(f.b);
    }
}
