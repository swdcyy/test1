package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer;
import ftd.k0;
import cr3.d;
import cr3.a;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$onResultReady$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kwai.robust.PatchProxyResult;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer extends d implements k0	// class@00107d
{

    public void LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer(a p0){
       super(p0);
    }
    public void c(LiveMaterialResourceDownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer.class, "1")) {
          return;
       }
       a.p(p0, "task");
       super.c(p0);
       a.f(this, null, null, new LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$onResultReady$1(this, p0, null), 3, null);
       return;
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.f().plus(new LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$a(CoroutineExceptionHandler.u0));
    }
}
