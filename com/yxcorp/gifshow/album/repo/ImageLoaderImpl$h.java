package com.yxcorp.gifshow.album.repo.ImageLoaderImpl$h;
import erd.g;
import com.yxcorp.gifshow.album.repo.ImageLoaderImpl;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Collection;

public final class ImageLoaderImpl$h implements g	// class@001a7d
{
    public final ImageLoaderImpl b;

    public void ImageLoaderImpl$h(ImageLoaderImpl p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageLoaderImpl$h.class, "1")) {
       }else {
          Log.g(this.b.a, "loadAllMediaListInterval doOnNext, add size="+p0.size()+", imageList.size="+this.b.d.size());
          this.b.d.addAll(p0);
       }
       return;
    }
}
