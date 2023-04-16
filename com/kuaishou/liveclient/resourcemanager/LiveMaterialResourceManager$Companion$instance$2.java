package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class LiveMaterialResourceManager$Companion$instance$2 extends Lambda implements a	// class@00104c
{
    public static final LiveMaterialResourceManager$Companion$instance$2 INSTANCE;

    static {
       LiveMaterialResourceManager$Companion$instance$2.INSTANCE = new LiveMaterialResourceManager$Companion$instance$2();
    }
    public void LiveMaterialResourceManager$Companion$instance$2(){
       super(0);
    }
    public final LiveMaterialResourceManager invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMaterialResourceManager$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveMaterialResourceManager(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
