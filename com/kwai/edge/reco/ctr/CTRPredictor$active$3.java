package com.kwai.edge.reco.ctr.CTRPredictor$active$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.edge.reco.ctr.CTRPredictor;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import com.kwai.edge.reco.ctr.CTRPredictor$handler$2$a;
import com.kwai.edge.reco.ctr.CTRPredictor$active$3$a;
import java.lang.Runnable;
import android.os.Handler;
import tha.i;
import fg6.a;
import com.yxcorp.gifshow.follow.common.eve.FollowEveAccData;
import com.google.gson.Gson;
import v40.b;
import java.util.Objects;

public final class CTRPredictor$active$3 extends Lambda implements a	// class@000d35
{
    public static final CTRPredictor$active$3 INSTANCE;

    static {
       CTRPredictor$active$3.INSTANCE = new CTRPredictor$active$3();
    }
    public void CTRPredictor$active$3(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CTRPredictor$active$3.class, "1")) {
          return;
       }
       CTRPredictor v = CTRPredictor.v;
       if (!v.l().d().a() - null) {
          v.r(1);
       }else {
          v.o().postDelayed(CTRPredictor$active$3$a.b, v.l().d().a());
       }
       if (!PatchProxy.applyVoid(objArray, objArray, CTRPredictor.class, "9") && !PatchProxy.applyVoid(objArray, objArray, i.class, "5")) {
          if (i.C) {
             b.b("PctrFollowReddotShow", a.a.q(new FollowEveAccData("follow_reddot_show")));
          }
          i.D = true;
       }
       Objects.requireNonNull(v);
       CTRPredictor.n = true;
       return;
    }
}
