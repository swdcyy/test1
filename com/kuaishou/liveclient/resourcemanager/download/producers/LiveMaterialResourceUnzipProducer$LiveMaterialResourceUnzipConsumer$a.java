package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$a;
import kotlinx.coroutines.CoroutineExceptionHandler;
import asd.a;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;

public final class LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$a extends a implements CoroutineExceptionHandler	// class@00107f
{

    public void LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$a(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceUnzipProducer$LiveMaterialResourceUnzipConsumer$a.class, "1")) {
          return;
       }
       "error when unzip File e = "+p1;
       return;
    }
}
