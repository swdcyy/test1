package com.yxcorp.gifshow.album.home.AlbumAssetFragment$l$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment$l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import o79.q;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import androidx.recyclerview.widget.RecyclerView;

public final class AlbumAssetFragment$l$a implements Runnable	// class@0019df
{
    public final AlbumFragment b;
    public final AlbumAssetFragment$l c;

    public void AlbumAssetFragment$l$a(AlbumFragment p0,AlbumAssetFragment$l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, AlbumAssetFragment$l$a.class, "1")) {
          return;
       }
       AlbumAssetFragment$l$a tc = this.c;
       if ((System.currentTimeMillis() - tc.a) - tc.b < 0) {
          PatchProxy.onMethodExit(AlbumAssetFragment$l$a.class, "1");
          return;
       }else {
          Log.b("AlbumAssetFragment", "onScrollStateChanged show container");
          AlbumSelectedContainer uAlbumSelect = this.b.wh();
          if (uAlbumSelect != null) {
             AlbumSelectedContainer.b0(uAlbumSelect, true, false, false, q.a.k(this.c.e.qh().q()), 450, 4, null);
          }
          PatchProxy.onMethodExit(AlbumAssetFragment$l$a.class, "1");
          return;
       }
    }
}
