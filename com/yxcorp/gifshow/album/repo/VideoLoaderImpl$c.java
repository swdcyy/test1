package com.yxcorp.gifshow.album.repo.VideoLoaderImpl$c;
import erd.a;
import com.yxcorp.gifshow.album.repo.VideoLoaderImpl;
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

public final class VideoLoaderImpl$c implements a	// class@001a85
{
    public final VideoLoaderImpl b;

    public void VideoLoaderImpl$c(VideoLoaderImpl p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, VideoLoaderImpl$c.class, "1")) {
          return;
       }
       Iterator iterator = this.b.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this.b.d);
       }
       j.a(this.b.j);
       this.b.j = i.e.d();
       this.b.m();
       return;
    }
}
