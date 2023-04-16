package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner;
import ftd.k0;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner$tryCleanOfflineResource$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kwai.robust.PatchProxyResult;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceCleaner$b;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class LiveMaterialResourceCleaner implements k0	// class@001047
{
    public AtomicBoolean b;
    public static final p c;
    public static final LiveMaterialResourceCleaner$a d;

    static {
       LiveMaterialResourceCleaner.d = new LiveMaterialResourceCleaner$a(null);
       LiveMaterialResourceCleaner.c = s.b(LazyThreadSafetyMode.SYNCHRONIZED, LiveMaterialResourceCleaner$Companion$instance$2.INSTANCE);
    }
    public void LiveMaterialResourceCleaner(){
       super();
       this.b = new AtomicBoolean(false);
    }
    public void LiveMaterialResourceCleaner(u p0){
       super();
       this.b = new AtomicBoolean(false);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveMaterialResourceCleaner.class, "4")) {
          return;
       }
       a.f(this, null, null, new LiveMaterialResourceCleaner$tryCleanOfflineResource$1(this, null), 3, null);
       return;
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, LiveMaterialResourceCleaner.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.f().plus(new LiveMaterialResourceCleaner$b(CoroutineExceptionHandler.u0));
    }
}
