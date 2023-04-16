package com.yxcorp.gifshow.camera.record.album.potential.PotentialAlbumAssetFragmentViewBinder$a;
import android.view.View$OnClickListener;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import e3a.a;
import com.kwai.moved.components.util.KsAlbumPermissionUtils;

public final class PotentialAlbumAssetFragmentViewBinder$a implements View$OnClickListener	// class@001cc1
{
    public static final PotentialAlbumAssetFragmentViewBinder$a b;

    static {
       PotentialAlbumAssetFragmentViewBinder$a.b = new PotentialAlbumAssetFragmentViewBinder$a();
    }
    public void PotentialAlbumAssetFragmentViewBinder$a(){
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PotentialAlbumAssetFragmentViewBinder$a.class, "1")) {
          return;
       }
       Activity uActivity = a.a(p0);
       if (uActivity != null) {
          KsAlbumPermissionUtils.i(uActivity);
       }
       return;
    }
}
