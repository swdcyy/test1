package com.yxcorp.gifshow.album.repo.ImageLoaderImpl$b;
import erd.g;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Thread;
import com.yxcorp.utility.Log;
import java.util.Iterator;
import java.lang.Iterable;
import k79.f$a;
import kotlin.jvm.internal.a;

public final class ImageLoaderImpl$b implements g	// class@001a77
{
    public final ImageLoaderImpl b;
    public final Ref$BooleanRef c;

    public void ImageLoaderImpl$b(ImageLoaderImpl p0,Ref$BooleanRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderImpl$b.class, "1")) {
       }else {
          Log.g(this.b.a, "refresh doOnNext£¬size="+p0.size()+", currentThread="+Thread.currentThread());
          Iterator iterator = this.b.c.iterator();
          while (iterator.hasNext()) {
             a.h(p0, "list");
             iterator.next().a(this.c.element, p0);
          }
          p0.element = false;
       }
       return;
    }
}
