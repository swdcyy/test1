package com.kwai.edge.reco.ctr.CTRPredictor$active$2$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public final class CTRPredictor$active$2$b implements g	// class@000d32
{
    public static final CTRPredictor$active$2$b b;

    static {
       CTRPredictor$active$2$b.b = new CTRPredictor$active$2$b();
    }
    public void CTRPredictor$active$2$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CTRPredictor$active$2$b.class, "1")) {
       }else {
          Log.e("CTRPredictor", "ctr infer error ", p0);
       }
       return;
    }
}
