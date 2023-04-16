package com.yxcorp.gifshow.album.repo.ImageLoaderImpl$g;
import erd.g;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.models.QMedia;
import k79.m;
import kotlin.TypeCastException;

public final class ImageLoaderImpl$g implements g	// class@001a7c
{
    public static final ImageLoaderImpl$g b;

    static {
       ImageLoaderImpl$g.b = new ImageLoaderImpl$g();
    }
    public void ImageLoaderImpl$g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderImpl$g.class, "1")) {
       }else if(p0 != null){
          p0 = p0.iterator();
          while (p0.hasNext()) {
             m.i.c(1, p0.next());
          }
       }else {
          throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<com.yxcorp.gifshow.models.QMedia>");
       }
       return;
    }
}
