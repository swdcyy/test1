package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer;
import na1.a;
import ja1.e;
import ka1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer;

public final class LiveControlFileMd5CheckProducer extends a	// class@000ed2
{

    public void LiveControlFileMd5CheckProducer(){
       super();
    }
    public void c(e p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveControlFileMd5CheckProducer.class, "1")) {
          return;
       }
       a.p(p0, "controlFileTask");
       a.p(p1, "consumer");
       a uoa = this.a();
       if (uoa != null) {
          uoa.c(p0, new LiveControlFileMd5CheckProducer$LiveControlFileMd5CheckConsumer(p1));
       }
       return;
    }
}