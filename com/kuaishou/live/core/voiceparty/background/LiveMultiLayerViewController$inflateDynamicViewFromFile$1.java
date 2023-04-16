package com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController$inflateDynamicViewFromFile$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import ho2.m$b;

public final class LiveMultiLayerViewController$inflateDynamicViewFromFile$1 extends ContinuationImpl	// class@001344
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object result;
    public final LiveMultiLayerViewController this$0;

    public void LiveMultiLayerViewController$inflateDynamicViewFromFile$1(LiveMultiLayerViewController p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMultiLayerViewController$inflateDynamicViewFromFile$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.d(null, null, this);
    }
}
