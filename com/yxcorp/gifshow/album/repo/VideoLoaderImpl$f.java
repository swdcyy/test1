package com.yxcorp.gifshow.album.repo.VideoLoaderImpl$f;
import erd.a;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.utility.Log;
import k79.m;
import brd.g;

public final class VideoLoaderImpl$f implements a	// class@001a88
{
    public final VideoLoaderImpl b;

    public void VideoLoaderImpl$f(VideoLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VideoLoaderImpl$f.class, "1")) {
          return;
       }
       Log.g(this.b.a, "loadAllMediaListInterval load complete, assetsList size="+this.b.d.size());
       m i = m.i;
       i.b(0);
       VideoLoaderImpl f = this.b.f;
       if (f != null) {
          f.onNext(i.d(0));
       }
       VideoLoaderImpl f1 = this.b.f;
       if (f1 != null) {
          f1.onComplete();
       }
       this.b.f = null;
       return;
    }
}
