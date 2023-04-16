package com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$b;
import erd.o;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1;
import com.kwai.sdk.eve.internal.inference.a;
import java.lang.Object;
import com.kwai.sdk.eve.internal.inference.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5$1$unused$2$1;
import msd.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5;
import wn7.g;
import com.kwai.sdk.eve.internal.statistics.inference.InferencePerfRecorderKt;
import java.util.Map;
import sm7.l;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$4;

public final class EveInferenceManager$directInferAsync$5$1$b implements o	// class@00154f
{
    public final EveInferenceManager$directInferAsync$5$1 b;
    public final a c;

    public void EveInferenceManager$directInferAsync$5$1$b(EveInferenceManager$directInferAsync$5$1 p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, EveInferenceManager$directInferAsync$5$1$b.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          EveLog.INSTANCE.i(new EveInferenceManager$directInferAsync$5$1$unused$2$1(this));
          pair = new Pair(this.b.b.k.invoke(p0, InferencePerfRecorderKt.b(this.c).b), p0.b);
       }
       return pair;
    }
}
