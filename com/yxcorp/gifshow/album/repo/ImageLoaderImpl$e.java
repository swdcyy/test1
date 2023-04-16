package com.yxcorp.gifshow.album.repo.ImageLoaderImpl$e;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k79.m;
import java.util.List;
import brd.g;

public final class ImageLoaderImpl$e implements g	// class@001a7a
{
    public final ImageLoaderImpl b;

    public void ImageLoaderImpl$e(ImageLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderImpl$e.class, "1")) {
          return;
       }
       a.q(p0, "emmiter");
       m i = m.i;
       List list = i.d(1);
       if (i.e()) {
          p0.onNext(list);
          p0.onComplete();
       }else {
          p0.onNext(list);
          this.b.f = p0;
       }
       return;
    }
}
