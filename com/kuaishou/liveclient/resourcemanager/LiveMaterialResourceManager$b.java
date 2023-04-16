package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$b;
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

public final class LiveMaterialResourceManager$b extends a implements CoroutineExceptionHandler	// class@00104e
{

    public void LiveMaterialResourceManager$b(CoroutineContext$b p0){
       super(p0);
    }
    public void handleException(CoroutineContext p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceManager$b.class, "1")) {
          return;
       }
       "unexpected error e = "+p1;
       return;
    }
}
