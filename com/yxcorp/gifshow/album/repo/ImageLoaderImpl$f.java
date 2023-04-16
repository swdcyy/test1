package com.yxcorp.gifshow.album.repo.ImageLoaderImpl$f;
import erd.a;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.utility.Log;
import k79.m;
import brd.g;

public final class ImageLoaderImpl$f implements a	// class@001a7b
{
    public final ImageLoaderImpl b;

    public void ImageLoaderImpl$f(ImageLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ImageLoaderImpl$f.class, "1")) {
          return;
       }
       Log.g(this.b.a, "loadAllMediaListInterval load complete, imageList.size="+this.b.d.size());
       m i = m.i;
       i.b(1);
       ImageLoaderImpl f = this.b.f;
       if (f != null) {
          f.onNext(i.d(1));
       }
       ImageLoaderImpl f1 = this.b.f;
       if (f1 != null) {
          f1.onComplete();
       }
       this.b.f = null;
       return;
    }
}
