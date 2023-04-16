package com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ho2.m;
import asd.c;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import ho2.m$b;
import java.util.Objects;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$downloadDynamicResAndBindView$2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

public final class LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1 extends SuspendLambda implements p	// class@001345
{
    public final m $backgroundDataInfo;
    public Object L$0;
    public int label;
    public k0 p$;
    public final LiveMultiLayerViewController this$0;

    public void LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1(m p0,c p1,LiveMultiLayerViewController p2){
       this.$backgroundDataInfo = p0;
       this.this$0 = p2;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1 obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1(this.$backgroundDataInfo, p1, this.this$0);
       obj.p$ = p0;
       PatchProxy.onMethodExit(LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1.class, "2");
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1.class, "3");
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1 tlabel = this.label;
       int i = 1;
       if (tlabel != null) {
          if (tlabel == i) {
             j0.n(p0);
          }else {
             PatchProxy.onMethodExit(LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1.class, "1");
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          tlabel = this.this$0;
          this.L$0 = this.p$;
          this.label = i;
          Objects.requireNonNull(tlabel);
          p0 = a.i(z0.f(), new LiveMultiLayerViewController$downloadDynamicResAndBindView$2(tlabel, this.$backgroundDataInfo, null), this);
          if (p0 != b.h()) {
             p0 = l1.a;
          }
          if (p0 == obj) {
             PatchProxy.onMethodExit(LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1.class, "1");
             return obj;
          }
       }
       p0.f = false;
       PatchProxy.onMethodExit(LiveMultiLayerViewController$updateBackgroundInternal$$inlined$let$lambda$1.class, "1");
       return l1.a;
    }
}
