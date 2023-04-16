package com.yxcorp.gifshow.album.home.AlbumAssetFragment$n;
import erd.g;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;

public final class AlbumAssetFragment$n implements g	// class@0019e9
{
    public final AlbumAssetFragment b;

    public void AlbumAssetFragment$n(AlbumAssetFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, AlbumAssetFragment$n.class, "1")) {
       }else {
          this.b.y = null;
          Log.h("AlbumAssetFragment", "getExternalCameraIntent error", p0);
          PatchProxy.onMethodExit(AlbumAssetFragment$n.class, "1");
       }
       return;
    }
}
