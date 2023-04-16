package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$a;
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

public final class LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$a extends a implements CoroutineExceptionHandler	// class@001084
{

    public void LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$a(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceWriteCacheProducer$LiveMaterialResourceWriteCacheConsumer$a.class, "1")) {
          return;
       }
       "error when write cache e = "+p1;
       return;
    }
}
