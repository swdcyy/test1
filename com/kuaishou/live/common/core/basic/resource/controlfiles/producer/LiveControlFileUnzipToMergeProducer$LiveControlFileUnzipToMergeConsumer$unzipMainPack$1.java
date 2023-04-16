package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ja1.e;

public final class LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1 extends ContinuationImpl	// class@000eda
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public Object result;
    public final LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer this$0;

    public void LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1(LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer$unzipMainPack$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.d(null, this);
    }
}
