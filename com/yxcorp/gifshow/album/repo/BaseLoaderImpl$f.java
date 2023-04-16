package com.yxcorp.gifshow.album.repo.BaseLoaderImpl$f;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k79.m;
import java.util.List;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import brd.g;

public final class BaseLoaderImpl$f implements g	// class@001a6d
{
    public final BaseLoaderImpl b;

    public void BaseLoaderImpl$f(BaseLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLoaderImpl$f.class, "1")) {
          return;
       }
       a.q(p0, "emmiter");
       m i = m.i;
       List list = i.d(this.b.r());
       Log.g("BaseLoaderImpl", "loadAlbumFolderList size="+list.size()+", mediaType = "+this.b.r());
       if (i.e()) {
          p0.onNext(list);
          p0.onComplete();
          p0.f = null;
       }else {
          p0.onNext(list);
          this.b.f = p0;
       }
       return;
    }
}
