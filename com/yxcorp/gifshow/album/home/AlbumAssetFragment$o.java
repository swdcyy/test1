package com.yxcorp.gifshow.album.home.AlbumAssetFragment$o;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.album.home.AlbumAssetFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.moved.components.util.KsAlbumPermissionUtils;

public final class AlbumAssetFragment$o implements View$OnClickListener	// class@0019ea
{
    public final AlbumAssetFragment b;

    public void AlbumAssetFragment$o(AlbumAssetFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumAssetFragment$o.class, "1")) {
          return;
       }
       FragmentActivity activity = this.b.getActivity();
       if (activity != null) {
          KsAlbumPermissionUtils.i(activity);
       }
       return;
    }
}
