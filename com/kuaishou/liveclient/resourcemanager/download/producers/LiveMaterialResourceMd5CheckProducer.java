package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceMd5CheckProducer;
import cr3.c;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import cr3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer;

public final class LiveMaterialResourceMd5CheckProducer extends c	// class@00107e
{

    public void LiveMaterialResourceMd5CheckProducer(){
       super();
    }
    public void c(LiveMaterialResourceDownloadTask p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceMd5CheckProducer.class, "1")) {
          return;
       }
       a.p(p0, "task");
       c uoc = this.a();
       if (uoc != null) {
          uoc.c(p0, new LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer(p1));
       }
       return;
    }
}
