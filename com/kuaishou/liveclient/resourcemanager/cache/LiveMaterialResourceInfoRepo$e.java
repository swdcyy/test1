package com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$e;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$b;
import asd.c;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.Result;

public final class LiveMaterialResourceInfoRepo$e implements LiveMaterialResourceInfoRepo$b	// class@001066
{
    public final c a;

    public void LiveMaterialResourceInfoRepo$e(c p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceInfoRepo$e.class, "1")) {
          return;
       }
       a.p(p0, "resInfoMap");
       this.a.resumeWith(Result.constructor-impl(p0));
       return;
    }
}
