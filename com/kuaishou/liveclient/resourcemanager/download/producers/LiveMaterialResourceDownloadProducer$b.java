package com.kuaishou.liveclient.resourcemanager.download.producers.LiveMaterialResourceDownloadProducer$b;
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

public final class LiveMaterialResourceDownloadProducer$b extends a implements CoroutineExceptionHandler	// class@001076
{

    public void LiveMaterialResourceDownloadProducer$b(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceDownloadProducer$b.class, "1")) {
          return;
       }
       "error when unzip File e = "+p1;
       return;
    }
}
