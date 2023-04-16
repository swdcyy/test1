package com.yxcorp.gifshow.album.home.AlbumAssetFragment$i;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import kotlin.jvm.internal.a;

public final class AlbumAssetFragment$i implements Observer	// class@0019dc
{
    public final AlbumAssetFragment b;

    public void AlbumAssetFragment$i(AlbumAssetFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment$i.class, "1")) {
       }else {
          Log.g("AlbumAssetFragment", "permission granted="+p0);
          if (this.b.R == null) {
             a.h(p0, "granted");
             if (p0.booleanValue()) {
                this.b.R = p0.booleanValue();
                this.b.Dh();
             }
          }
       }
       return;
    }
}
