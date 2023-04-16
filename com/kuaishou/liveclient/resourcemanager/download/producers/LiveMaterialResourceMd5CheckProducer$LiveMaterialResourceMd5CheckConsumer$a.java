package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$a;
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

public final class LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$a extends a implements CoroutineExceptionHandler	// class@00107b
{

    public void LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$a(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceMd5CheckProducer$LiveMaterialResourceMd5CheckConsumer$a.class, "1")) {
          return;
       }
       "error when check md5 e = "+p1;
       return;
    }
}
