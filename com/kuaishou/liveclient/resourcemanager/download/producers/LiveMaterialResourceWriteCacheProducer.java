package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceWriteCacheProducer;
import cr3.c;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceWriteCacheProducer$a;
import nsd.u;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import cr3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer;

public final class LiveMaterialResourceWriteCacheProducer extends c	// class@001088
{
    public static final LiveMaterialResourceWriteCacheProducer$a c;

    static {
       LiveMaterialResourceWriteCacheProducer.c = new LiveMaterialResourceWriteCacheProducer$a(null);
    }
    public void LiveMaterialResourceWriteCacheProducer(){
       super();
    }
    public void c(LiveMaterialResourceDownloadTask p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceWriteCacheProducer.class, "1")) {
          return;
       }
       a.p(p0, "task");
       c uoc = this.a();
       if (uoc != null) {
          uoc.c(p0, new LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer(p1));
       }
       return;
    }
}
