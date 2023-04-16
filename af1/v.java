package af1.v;
import lf3.g;
import af1.x;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j;
import java.util.List;
import java.util.Arrays;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import qk.m;
import ok.o;
import com.google.common.base.Predicates;
import af1.r;
import ok.h;
import af1.o;
import af1.t;
import com.google.common.collect.ImmutableList;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import java.util.LinkedList;
import lf3.f;

public final class v implements g	// class@000080
{
    public final x b;

    public void v(x p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       v tb = this.b;
       Objects.requireNonNull(tb);
       SCActionSignal highFrequenc = p0.highFrequencyActionGuide;
       x ox = x.class;
       if (PatchProxy.applyVoidOneRefs(highFrequenc, tb, ox, "10")) {
       }else if(j.h(highFrequenc)){
          List list = Arrays.asList(highFrequenc);
          ImmutableList immutableLis = PatchProxy.applyOneRefs(list, tb, ox, "12");
          if (immutableLis != PatchProxyResult.class) {
          }else {
             immutableLis = m.s(list).p(Predicates.h()).F(r.b).F(new o(tb)).p(new t(tb)).B();
          }
          b.c0(LiveLogTag.LIVE_HIGH_FLUENCY_FEEDS, "LiveHighFluencyMessagePool.handleMessage", "message", immutableLis);
          tb.d.addAll(immutableLis);
          tb.l(tb.d);
          tb.h();
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
