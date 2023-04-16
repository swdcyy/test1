package com.yxcorp.gifshow.record.album.LocalAlbumUploadActivity;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import com.yxcorp.gifshow.record.album.LocalAlbumUploadActivity$mFragment$2;
import msd.a;
import qrd.p;
import qrd.s;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.record.album.LocalAlbumUploadFragment;

public final class LocalAlbumUploadActivity extends SingleFragmentActivity	// class@001703
{
    public final p y;
    public HashMap z;

    public void LocalAlbumUploadActivity(){
       super();
       this.y = s.c(LocalAlbumUploadActivity$mFragment$2.INSTANCE);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LocalAlbumUploadActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public Fragment u3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LocalAlbumUploadActivity localAlbumUp = LocalAlbumUploadActivity.class;
       Object obj = PatchProxy.apply(null, this, localAlbumUp, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(null, this, localAlbumUp, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = this.y.getValue();
       }
       return obj1;
    }
}
