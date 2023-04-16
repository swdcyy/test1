package com.yxcorp.gifshow.album.repo.VideoLoaderImpl$e;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k79.m;
import java.util.List;
import brd.g;

public final class VideoLoaderImpl$e implements g	// class@001a87
{
    public final VideoLoaderImpl b;

    public void VideoLoaderImpl$e(VideoLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoLoaderImpl$e.class, "1")) {
          return;
       }
       a.q(p0, "emmiter");
       m i = m.i;
       List list = i.d(0);
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
