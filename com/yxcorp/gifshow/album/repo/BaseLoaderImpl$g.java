package com.yxcorp.gifshow.album.repo.BaseLoaderImpl$g;
import erd.a;
import com.yxcorp.gifshow.album.repo.BaseLoaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.utility.Log;
import k79.m;
import brd.g;

public final class BaseLoaderImpl$g implements a	// class@001a6e
{
    public final BaseLoaderImpl b;

    public void BaseLoaderImpl$g(BaseLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BaseLoaderImpl$g.class, "1")) {
          return;
       }
       Log.g("BaseLoaderImpl", "loadAllMediaListInterval load complete, assetsList size="+this.b.o().size());
       BaseLoaderImpl$g tb = this.b;
       tb.x(tb.r());
       tb = this.b;
       BaseLoaderImpl f = tb.f;
       if (f != null) {
          f.onNext(m.i.d(tb.r()));
       }
       BaseLoaderImpl f1 = this.b.f;
       if (f1 != null) {
          f1.onComplete();
       }
       this.b.f = null;
       return;
    }
}
