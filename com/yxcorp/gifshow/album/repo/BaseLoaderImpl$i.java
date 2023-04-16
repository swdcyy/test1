package com.yxcorp.gifshow.album.repo.BaseLoaderImpl$i;
import erd.g;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Collection;

public final class BaseLoaderImpl$i implements g	// class@001a70
{
    public final BaseLoaderImpl b;

    public void BaseLoaderImpl$i(BaseLoaderImpl p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLoaderImpl$i.class, "1")) {
       }else {
          Log.g("BaseLoaderImpl", "loadAllMediaListInterval doOnNext, add size="+p0.size()+" assetList.size="+this.b.o().size());
          this.b.o().addAll(p0);
       }
       return;
    }
}
