package aq3.a;
import qh7.b;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter;
import java.lang.String;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.presenter.BaseLiveTunaExplainPresenter$handleRouterFailed$1;
import msd.a;
import c15.b;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import tkd.b;
import tkd.d;
import xx5.a;
import java.util.Map;
import java.lang.Integer;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class a implements b	// class@00029c
{
    public final BaseLiveTunaExplainPresenter a;
    public final String b;

    public void a(BaseLiveTunaExplainPresenter p0,String p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(a p0){
       a tb;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "result");
       if (p0.a != 200) {
          p0 = this.a;
          tb = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(tb, p0, BaseLiveTunaExplainPresenter.class, "8")) {
             b.d(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("BaseLiveTunaExplainPresenter"), new BaseLiveTunaExplainPresenter$handleRouterFailed$1(tb));
             i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f103ce2), 0);
          }
       }else {
          tb = d.a(0x17b84847);
          i = (int)tb.t20(p0.b);
          if (tb.IU(i)) {
             this.a.C.offer(Integer.valueOf(i));
          }
       }
       return;
    }
}
