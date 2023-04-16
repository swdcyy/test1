package com.yxcorp.gifshow.album.repo.ImageLoaderImpl$c;
import erd.a;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import k79.f$a;
import java.util.List;
import android.database.Cursor;
import k79.j;
import k79.i;
import k79.i$a;

public final class ImageLoaderImpl$c implements a	// class@001a78
{
    public final ImageLoaderImpl b;

    public void ImageLoaderImpl$c(ImageLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ImageLoaderImpl$c.class, "1")) {
          return;
       }
       Iterator iterator = this.b.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this.b.d);
       }
       j.a(this.b.j);
       this.b.j = i.e.c();
       this.b.m();
       return;
    }
}
