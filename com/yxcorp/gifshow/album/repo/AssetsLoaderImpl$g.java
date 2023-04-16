package com.yxcorp.gifshow.album.repo.AssetsLoaderImpl$g;
import erd.a;
import com.yxcorp.gifshow.album.repo.AssetsLoaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.utility.Log;
import java.util.Objects;
import k79.m;
import brd.g;

public final class AssetsLoaderImpl$g implements a	// class@001a60
{
    public final AssetsLoaderImpl b;

    public void AssetsLoaderImpl$g(AssetsLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AssetsLoaderImpl$g.class, "1")) {
          return;
       }
       Log.g("AssetsLoaderImpl", "loadAllMediaListInterval load complete, assetsList size="+this.b.o().size());
       AssetsLoaderImpl$g tb = this.b;
       Objects.requireNonNull(tb);
       int i = 2;
       if (!PatchProxy.applyVoid(null, tb, AssetsLoaderImpl.class, "19")) {
          m.i.b(i);
       }
       AssetsLoaderImpl e = this.b.e;
       if (e != null) {
          e.onNext(m.i.d(i));
       }
       e = this.b.e;
       if (e != null) {
          e.onComplete();
       }
       this.b.e = null;
       return;
    }
}
