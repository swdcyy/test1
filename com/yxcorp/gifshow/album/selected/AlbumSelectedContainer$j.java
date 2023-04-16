package com.yxcorp.gifshow.album.selected.AlbumSelectedContainer$j;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AlbumSelectedContainer$j implements Runnable	// class@001aa1
{
    public final AlbumSelectedContainer b;

    public void AlbumSelectedContainer$j(AlbumSelectedContainer p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AlbumSelectedContainer$j.class, "1")) {
          return;
       }
       AlbumSelectedContainer.n(this.b, true, false, false, 4, null);
       return;
    }
}
