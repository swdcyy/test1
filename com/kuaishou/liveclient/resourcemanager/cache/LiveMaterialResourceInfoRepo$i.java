package com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$i;
import erd.g;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$NetworkInfoFetchState;
import com.yxcorp.retrofit.model.KwaiException;
import gr3.a;
import gr3.a$a;

public final class LiveMaterialResourceInfoRepo$i implements g	// class@00106b
{
    public final LiveMaterialResourceInfoRepo b;

    public void LiveMaterialResourceInfoRepo$i(LiveMaterialResourceInfoRepo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceInfoRepo$i.class, "1")) {
       }else {
          LiveMaterialResourceInfoRepo$i tb = this.b;
          a.o(p0, "it");
          _monitor_enter(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, LiveMaterialResourceInfoRepo.class, "10")) {
             _monitor_exit(tb);
          }else {
             tb.d = LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Failed;
             tb.f();
             if (p0 instanceof KwaiException) {
                a.a.a(false, p0.getErrorCode());
             }
             _monitor_exit(tb);
          }
       }
       return;
    }
}
