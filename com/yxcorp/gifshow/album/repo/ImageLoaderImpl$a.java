package com.yxcorp.gifshow.album.repo.ImageLoaderImpl$a;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import brd.g;

public final class ImageLoaderImpl$a implements g	// class@001a76
{
    public final ImageLoaderImpl b;
    public final int c;
    public final int d;

    public void ImageLoaderImpl$a(ImageLoaderImpl p0,int p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderImpl$a.class, "1")) {
          return;
       }
       a.q(p0, "emmiter");
       this.b.n();
       p0.onNext(this.b.o(this.c, this.d));
       p0.onComplete();
       return;
    }
}
