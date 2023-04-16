package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ja1.f;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$a;

public final class LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1 extends ContinuationImpl	// class@000eca
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object result;
    public final LiveControlFileDownloadProducer this$0;

    public void LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1(LiveControlFileDownloadProducer p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveControlFileDownloadProducer$downloadSingleTaskWithRetry$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.g(null, null, this);
    }
}
