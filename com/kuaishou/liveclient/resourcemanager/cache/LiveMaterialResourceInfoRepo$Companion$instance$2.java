package com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$initRepo$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;

public final class LiveMaterialResourceInfoRepo$Companion$instance$2 extends Lambda implements a	// class@001060
{
    public static final LiveMaterialResourceInfoRepo$Companion$instance$2 INSTANCE;

    static {
       LiveMaterialResourceInfoRepo$Companion$instance$2.INSTANCE = new LiveMaterialResourceInfoRepo$Companion$instance$2();
    }
    public void LiveMaterialResourceInfoRepo$Companion$instance$2(){
       super(0);
    }
    public final LiveMaterialResourceInfoRepo invoke(){
       Object[] objArray = null;
       LiveMaterialResourceInfoRepo obj = PatchProxy.apply(objArray, this, LiveMaterialResourceInfoRepo$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveMaterialResourceInfoRepo(objArray);
       if (!PatchProxy.applyVoid(objArray, obj, LiveMaterialResourceInfoRepo.class, "2")) {
          a.f(obj, null, null, new LiveMaterialResourceInfoRepo$initRepo$1(obj, objArray), 3, null);
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
