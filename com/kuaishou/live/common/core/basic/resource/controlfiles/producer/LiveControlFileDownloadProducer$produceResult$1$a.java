package com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$produceResult$1$a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$a;
import com.kuaishou.live.common.core.basic.resource.controlfiles.producer.LiveControlFileDownloadProducer$produceResult$1;
import java.lang.Object;
import com.yxcorp.download.DownloadTask;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import la1.a;
import ja1.e;

public final class LiveControlFileDownloadProducer$produceResult$1$a implements LiveControlFileDownloadProducer$a	// class@000ecb
{
    public final LiveControlFileDownloadProducer$produceResult$1 a;

    public void LiveControlFileDownloadProducer$produceResult$1$a(LiveControlFileDownloadProducer$produceResult$1 p0){
       this.a = p0;
       super();
    }
    public void a(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(LiveControlFileDownloadProducer$produceResult$1$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, LiveControlFileDownloadProducer$produceResult$1$a.class, "1")) {
          return;
       }
       a uoa = this.a.$controlFileTask.a();
       if (uoa != null) {
          uoa.g(p0, p1, p2);
       }
       return;
    }
}
