package com.yxcorp.gifshow.album.repo.VideoLoaderImpl$b;
import erd.g;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import k79.f$a;
import kotlin.jvm.internal.a;

public final class VideoLoaderImpl$b implements g	// class@001a84
{
    public final VideoLoaderImpl b;
    public final Ref$BooleanRef c;

    public void VideoLoaderImpl$b(VideoLoaderImpl p0,Ref$BooleanRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoLoaderImpl$b.class, "1")) {
       }else {
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
