package com.yxcorp.gifshow.camera.record.widget.SlideUpAlbumAssetFragmentViewBinder$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.widget.SlideUpAlbumAssetFragmentViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetFragmentViewBinder;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kwai.moved.components.util.KsAlbumPermissionUtils;

public final class SlideUpAlbumAssetFragmentViewBinder$a implements View$OnClickListener	// class@000fe0
{
    public final SlideUpAlbumAssetFragmentViewBinder b;

    public void SlideUpAlbumAssetFragmentViewBinder$a(SlideUpAlbumAssetFragmentViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideUpAlbumAssetFragmentViewBinder$a.class, "1")) {
          return;
       }
       KsAlbumPermissionUtils.g(this.b.j().getActivity());
       return;
    }
}
