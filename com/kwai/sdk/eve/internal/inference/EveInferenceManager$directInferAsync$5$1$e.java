package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$e;
import erd.g;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$unused$5$1;
import msd.a;
import sm7.l;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5;
import msd.l;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$unused$5$2;

public final class EveInferenceManager$directInferAsync$5$1$e implements g	// class@001552
{
    public final EveInferenceManager$directInferAsync$5$1 b;

    public void EveInferenceManager$directInferAsync$5$1$e(EveInferenceManager$directInferAsync$5$1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveInferenceManager$directInferAsync$5$1$e.class, "1")) {
       }else {
          EveLog iNSTANCE = EveLog.INSTANCE;
          iNSTANCE.i(new EveInferenceManager$directInferAsync$5$1$unused$5$1(this));
          p0 = p0.getFirst();
          this.b.b.e.invoke(p0);
          iNSTANCE.i(new EveInferenceManager$directInferAsync$5$1$unused$5$2(this, p0));
       }
       return;
    }
}
