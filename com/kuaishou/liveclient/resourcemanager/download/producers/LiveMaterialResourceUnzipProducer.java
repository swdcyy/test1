package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceUnzipProducer;
import cr3.c;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceUnzipProducer$a;
import nsd.u;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import cr3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer;

public final class LiveMaterialResourceUnzipProducer extends c	// class@001083
{
    public static final LiveMaterialResourceUnzipProducer$a c;

    static {
       LiveMaterialResourceUnzipProducer.c = new LiveMaterialResourceUnzipProducer$a(null);
    }
    public void LiveMaterialResourceUnzipProducer(){
       super();
    }
    public void c(LiveMaterialResourceDownloadTask p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceUnzipProducer.class, "1")) {
          return;
       }
       a.p(p0, "task");
       c uoc = this.a();
       if (uoc != null) {
          uoc.c(p0, new LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer(p1));
       }
       return;
    }
}
