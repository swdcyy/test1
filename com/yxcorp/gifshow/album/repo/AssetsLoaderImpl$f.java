package com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$f;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
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

public final class AssetsLoaderImpl$f implements g	// class@001a5f
{
    public final AssetsLoaderImpl b;

    public void AssetsLoaderImpl$f(AssetsLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AssetsLoaderImpl$f.class, "1")) {
          return;
       }
       a.q(p0, "emmiter");
       m i = m.i;
       List list = i.d(2);
       Log.g("AssetsLoaderImpl", "loadAlbumFolderList size="+list.size());
       if (i.e()) {
          p0.onNext(list);
          p0.onComplete();
          p0.e = null;
       }else {
          p0.onNext(list);
          this.b.e = p0;
       }
       return;
    }
}
