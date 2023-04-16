package com.yxcorp.plugin.setting.stencil.item.storage.CleanCacheItem$a;
import java.lang.Runnable;
import com.yxcorp.plugin.setting.stencil.item.storage.CleanCacheItem;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class CleanCacheItem$a implements Runnable	// class@000927
{
    public final CleanCacheItem b;

    public void CleanCacheItem$a(CleanCacheItem p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, CleanCacheItem$a.class, "1")) {
          return;
       }
       this.b.p();
       return;
    }
}
