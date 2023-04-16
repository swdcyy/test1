package com.yxcorp.gifshow.album.repo.VideoLoaderImpl$d;
import erd.a;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public final class VideoLoaderImpl$d implements a	// class@001a86
{
    public final VideoLoaderImpl b;

    public void VideoLoaderImpl$d(VideoLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VideoLoaderImpl$d.class, "1")) {
          return;
       }
       Log.g(this.b.a, "refresh disposed");
       return;
    }
}
