package com.yxcorp.gifshow.album.home.AlbumListFragment$g;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumListFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AlbumListFragment$g implements Observer	// class@001a07
{
    public final AlbumListFragment b;

    public void AlbumListFragment$g(AlbumListFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumListFragment$g.class, "1")) {
       }else {
          this.b.eh();
       }
       return;
    }
}
