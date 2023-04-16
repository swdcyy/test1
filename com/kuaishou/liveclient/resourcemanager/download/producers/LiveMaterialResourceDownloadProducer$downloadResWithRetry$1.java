package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer$downloadResWithRetry$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;

public final class LiveMaterialResourceDownloadProducer$downloadResWithRetry$1 extends ContinuationImpl	// class@001078
{
    public Object L$0;
    public Object L$1;
    public int label;
    public Object result;
    public final LiveMaterialResourceDownloadProducer this$0;

    public void LiveMaterialResourceDownloadProducer$downloadResWithRetry$1(LiveMaterialResourceDownloadProducer p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceDownloadProducer$downloadResWithRetry$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.d(null, this);
    }
}
