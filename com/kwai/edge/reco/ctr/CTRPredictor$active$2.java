package com.kwai.edge.reco.ctr.CTRPredictor$active$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import brd.t;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import t45.d;
import brd.z;
import com.kwai.edge.reco.ctr.CTRPredictor$active$2$a;
import com.kwai.edge.reco.ctr.CTRPredictor$active$2$b;
import erd.g;
import crd.b;

public final class CTRPredictor$active$2 extends Lambda implements l	// class@000d33
{
    public static final CTRPredictor$active$2 INSTANCE;

    static {
       CTRPredictor$active$2.INSTANCE = new CTRPredictor$active$2();
    }
    public void CTRPredictor$active$2(){
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CTRPredictor$active$2.class, "1")) {
          return;
       }
       a.p(p0, "o");
       p0.subscribeOn(d.c).subscribe(CTRPredictor$active$2$a.b, CTRPredictor$active$2$b.b);
       return;
    }
}
