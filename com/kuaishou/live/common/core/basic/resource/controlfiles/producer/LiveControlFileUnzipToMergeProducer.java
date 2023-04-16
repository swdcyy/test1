package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer;
import na1.a;
import ja1.e;
import ka1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer;

public final class LiveControlFileUnzipToMergeProducer extends a	// class@000edc
{

    public void LiveControlFileUnzipToMergeProducer(){
       super();
    }
    public void c(e p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileUnzipToMergeProducer.class, "1")) {
          return;
       }
       a.p(p0, "controlFileTask");
       a.p(p1, "consumer");
       a uoa = this.a();
       if (uoa != null) {
          uoa.c(p0, new LiveControlFileUnzipToMergeProducer$LiveControlFileUnzipToMergeConsumer(p1));
       }
       return;
    }
}
