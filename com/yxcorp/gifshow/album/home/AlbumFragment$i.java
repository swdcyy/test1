package com.yxcorp.gifshow.album.home.AlbumFragment$i;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;

public final class AlbumFragment$i implements Observer	// class@0019f4
{
    public final AlbumFragment b;

    public void AlbumFragment$i(AlbumFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AlbumFragment$i.class, "1")) {
       }else {
          a.h(p0, "it");
          this.b.Z0 = p0.intValue();
          p0 = this.b.wh();
          if (p0 != null) {
             p0.Y(this.b.Z0);
          }
          PatchProxy.onMethodExit(AlbumFragment$i.class, "1");
       }
       return;
    }
}
