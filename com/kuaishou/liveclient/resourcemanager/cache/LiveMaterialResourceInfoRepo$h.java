package com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$h;
import erd.g;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ar3.b;
import brd.t;
import ar3.b$a;
import java.lang.System;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$NetworkInfoFetchState;

public final class LiveMaterialResourceInfoRepo$h implements g	// class@00106a
{
    public final LiveMaterialResourceInfoRepo b;

    public void LiveMaterialResourceInfoRepo$h(LiveMaterialResourceInfoRepo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceInfoRepo$h.class, "1")) {
       }else {
          LiveMaterialResourceInfoRepo$h tb = this.b;
          _monitor_enter(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, LiveMaterialResourceInfoRepo.class, "9")) {
             _monitor_exit(tb);
          }else {
             b.a.a("LIVE_PRELOAD_RESOURCE_FILE");
             tb.g = System.currentTimeMillis();
             tb.d = LiveMaterialResourceInfoRepo$NetworkInfoFetchState.Complete;
             if (p0 != null) {
                tb.h(p0);
             }
             tb.f();
             _monitor_exit(tb);
          }
       }
       return;
    }
}
