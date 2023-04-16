package com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$mPhotoPickerTitleBar$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;

public final class AlbumTitleBarAnimationViewStub$mPhotoPickerTitleBar$2 extends Lambda implements a	// class@001a0e
{
    public final AlbumFragment $host;

    public void AlbumTitleBarAnimationViewStub$mPhotoPickerTitleBar$2(AlbumFragment p0){
       this.$host = p0;
       super(0);
    }
    public final ViewGroup invoke(){
       Object obj = PatchProxy.apply(null, this, AlbumTitleBarAnimationViewStub$mPhotoPickerTitleBar$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$host.Gh().n();
    }
    public Object invoke(){
       return this.invoke();
    }
}
