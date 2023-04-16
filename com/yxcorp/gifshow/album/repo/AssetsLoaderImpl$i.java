package com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$i;
import erd.g;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.yxcorp.utility.Log;
import java.util.Collection;

public final class AssetsLoaderImpl$i implements g	// class@001a62
{
    public final AssetsLoaderImpl b;

    public void AssetsLoaderImpl$i(AssetsLoaderImpl p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssetsLoaderImpl$i.class, "1")) {
       }else {
          Log.g("AssetsLoaderImpl", "loadAllMediaListInterval doOnNext 2, add size="+p0.size()+" list size "+'='+this.b.o().size()+", thread="+Thread.currentThread());
          this.b.o().addAll(p0);
       }
       return;
    }
}
