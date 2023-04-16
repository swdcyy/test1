package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$l;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AlbumSelectedContainer$l implements Runnable	// class@001aa3
{
    public final AlbumSelectedContainer b;

    public void AlbumSelectedContainer$l(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer$l.class, "1")) {
          return;
       }
       AlbumSelectedContainer.n(this.b, true, false, false, 4, null);
       return;
    }
}
