package com.kuaishou.live.materialresource.LiveMaterialResourceManager$resRepo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import jb7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager;
import jb7.a;
import kb7.a;

public final class LiveMaterialResourceManager$resRepo$2 extends Lambda implements a	// class@000c90
{
    public static final LiveMaterialResourceManager$resRepo$2 INSTANCE;

    static {
       LiveMaterialResourceManager$resRepo$2.INSTANCE = new LiveMaterialResourceManager$resRepo$2();
    }
    public void LiveMaterialResourceManager$resRepo$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, LiveMaterialResourceManager$resRepo$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ResourceSdk.d(ResourceSdk.f, LiveMaterialResourceManager.c, null, 2, null);
    }
}
