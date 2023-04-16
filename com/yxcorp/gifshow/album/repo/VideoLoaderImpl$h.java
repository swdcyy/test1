package com.yxcorp.gifshow.album.repo.VideoLoaderImpl$h;
import erd.g;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Collection;

public final class VideoLoaderImpl$h implements g	// class@001a8a
{
    public final VideoLoaderImpl b;

    public void VideoLoaderImpl$h(VideoLoaderImpl p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoLoaderImpl$h.class, "1")) {
       }else {
          Log.g(this.b.a, "loadAllMediaListInterval doOnNext, add size="+p0.size()+" videoList.size="+this.b.d.size());
          this.b.d.addAll(p0);
       }
       return;
    }
}
