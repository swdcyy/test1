package com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager;
import ftd.k0;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$downloadMaterialResource$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kwai.robust.PatchProxyResult;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$b;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class LiveMaterialResourceDownloadManager implements k0	// class@001074
{
    public ConcurrentHashMap b;
    public static final p c;
    public static final LiveMaterialResourceDownloadManager$a d;

    static {
       LiveMaterialResourceDownloadManager.d = new LiveMaterialResourceDownloadManager$a(null);
       LiveMaterialResourceDownloadManager.c = s.b(LazyThreadSafetyMode.SYNCHRONIZED, LiveMaterialResourceDownloadManager$Companion$instance$2.INSTANCE);
    }
    public void LiveMaterialResourceDownloadManager(){
       super();
       this.b = new ConcurrentHashMap();
    }
    public void LiveMaterialResourceDownloadManager(u p0){
       super();
       this.b = new ConcurrentHashMap();
    }
    public final void a(LiveMaterialResourceDownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceDownloadManager.class, "3")) {
          return;
       }
       a.p(p0, "task");
       a.f(this, null, null, new LiveMaterialResourceDownloadManager$downloadMaterialResource$1(this, p0, null), 3, null);
       return;
    }
    public final ConcurrentHashMap b(){
       return this.b;
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, LiveMaterialResourceDownloadManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.f().plus(new LiveMaterialResourceDownloadManager$b(CoroutineExceptionHandler.u0));
    }
}
