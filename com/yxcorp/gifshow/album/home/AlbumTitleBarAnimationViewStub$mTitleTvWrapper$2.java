package com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$mTitleTvWrapper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedContainerViewBinder;

public final class AlbumTitleBarAnimationViewStub$mTitleTvWrapper$2 extends Lambda implements a	// class@001a10
{
    public final AlbumFragment $host;

    public void AlbumTitleBarAnimationViewStub$mTitleTvWrapper$2(AlbumFragment p0){
       this.$host = p0;
       super(0);
    }
    public final View invoke(){
       Object[] objArray = null;
       AbsSelectedContainerViewBinder obj = PatchProxy.apply(objArray, this, AlbumTitleBarAnimationViewStub$mTitleTvWrapper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$host.Gh().q();
       if (obj != null) {
          objArray = obj.i;
       }
       return objArray;
    }
    public Object invoke(){
       return this.invoke();
    }
}
