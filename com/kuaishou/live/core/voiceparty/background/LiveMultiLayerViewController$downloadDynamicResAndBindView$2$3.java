package com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$downloadDynamicResAndBindView$2$3;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$downloadDynamicResAndBindView$2;
import java.io.IOException;
import asd.c;
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
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController;
import java.lang.Throwable;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerView$a;
import java.lang.IllegalStateException;

public final class LiveMultiLayerViewController$downloadDynamicResAndBindView$2$3 extends SuspendLambda implements p	// class@001342
{
    public final IOException $e;
    public int label;
    public k0 p$;
    public final LiveMultiLayerViewController$downloadDynamicResAndBindView$2 this$0;

    public void LiveMultiLayerViewController$downloadDynamicResAndBindView$2$3(LiveMultiLayerViewController$downloadDynamicResAndBindView$2 p0,IOException p1,c p2){
       this.this$0 = p0;
       this.$e = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveMultiLayerViewController$downloadDynamicResAndBindView$2$3 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiLayerViewController$downloadDynamicResAndBindView$2$3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveMultiLayerViewController$downloadDynamicResAndBindView$2$3(this.this$0, this.$e, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiLayerViewController$downloadDynamicResAndBindView$2$3.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiLayerViewController$downloadDynamicResAndBindView$2$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.this$0.this$0.k;
       if (p0 != null) {
          p0.a(3, this.$e);
          p0 = l1.a;
       }else {
          p0 = null;
       }
       return p0;
    }
}
