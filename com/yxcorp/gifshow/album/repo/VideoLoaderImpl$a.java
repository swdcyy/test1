package com.yxcorp.gifshow.album.repo.VideoLoaderImpl$a;
import io.reactivex.g;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import brd.g;

public final class VideoLoaderImpl$a implements g	// class@001a83
{
    public final VideoLoaderImpl b;
    public final int c;
    public final int d;

    public void VideoLoaderImpl$a(VideoLoaderImpl p0,int p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoLoaderImpl$a.class, "1")) {
          return;
       }
       a.q(p0, "emmiter");
       p0.onNext(this.b.o(this.c, this.d));
       p0.onComplete();
       return;
    }
}
