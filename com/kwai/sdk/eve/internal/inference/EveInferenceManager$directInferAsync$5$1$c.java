package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$c;
import erd.o;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$unused$3$1;
import msd.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5;
import sm7.l;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$3;

public final class EveInferenceManager$directInferAsync$5$1$c implements o	// class@001550
{
    public final EveInferenceManager$directInferAsync$5$1 b;

    public void EveInferenceManager$directInferAsync$5$1$c(EveInferenceManager$directInferAsync$5$1 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, EveInferenceManager$directInferAsync$5$1$c.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          EveLog.INSTANCE.i(new EveInferenceManager$directInferAsync$5$1$unused$3$1(this));
          pair = new Pair(this.b.b.f.invoke(p0), null);
       }
       return pair;
    }
}
