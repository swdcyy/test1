package com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumAssetFragmentViewBinder$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumAssetFragmentViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PotentialAlbumAssetFragmentViewBinder$b implements Observer	// class@001cc2
{
    public final PotentialAlbumAssetFragmentViewBinder b;

    public void PotentialAlbumAssetFragmentViewBinder$b(PotentialAlbumAssetFragmentViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PotentialAlbumAssetFragmentViewBinder$b.class, "1")) {
       }else if(a.g(this.b.j, p0) && this.b.q != null){
          PotentialAlbumAssetFragmentViewBinder$b tb = this.b;
          tb.q = true;
          tb.j = p0;
          tb.y();
       }
       return;
    }
}
