package com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$downloadDynamicResAndBindView$2;
import kotlin.jvm.internal.Ref$ObjectRef;
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
import java.lang.IllegalStateException;
import java.io.File;
import ho2.m$b;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController;
import com.yxcorp.download.DownloadManager;

public final class LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2 extends SuspendLambda implements p	// class@001341
{
    public final Ref$ObjectRef $cacheFile;
    public Object L$0;
    public int label;
    public k0 p$;
    public final LiveMultiLayerViewController$downloadDynamicResAndBindView$2 this$0;

    public void LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2(LiveMultiLayerViewController$downloadDynamicResAndBindView$2 p0,Ref$ObjectRef p1,c p2){
       this.this$0 = p0;
       this.$cacheFile = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "completion");
       obj = new LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2(this.this$0, this.$cacheFile, p1);
       obj.p$ = p0;
       return obj;
    }
    public final Object invoke(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.h();
       LiveMultiLayerViewController$downloadDynamicResAndBindView$2$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          tlabel = this.this$0;
          this.L$0 = this.p$;
          this.label = 1;
          if (tlabel.this$0.d(this.$cacheFile.element, tlabel.$dynamicConfig, this) == obj) {
             return obj;
          }
       }
       DownloadManager.C("live_voice_party_background", "");
       return l1.a;
    }
}
