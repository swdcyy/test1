package com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$c;
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

public final class LiveMaterialResourceInfoRepo$c extends a implements CoroutineExceptionHandler	// class@001064
{

    public void LiveMaterialResourceInfoRepo$c(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceInfoRepo$c.class, "1")) {
          return;
       }
       "error when fetch resource info e = "+p1;
       return;
    }
}
