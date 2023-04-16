package com.yxcorp.gifshow.album.home.AlbumListFragment$f;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumListFragment;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AlbumListFragment$f implements Observer	// class@001a06
{
    public final AlbumListFragment b;

    public void AlbumListFragment$f(AlbumListFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumListFragment$f.class, "1")) {
       }else {
          this.b.eh();
       }
       return;
    }
}
