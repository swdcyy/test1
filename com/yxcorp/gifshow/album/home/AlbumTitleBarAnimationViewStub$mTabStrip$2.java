package com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$mTabStrip$2;
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

public final class AlbumTitleBarAnimationViewStub$mTabStrip$2 extends Lambda implements a	// class@001a0f
{
    public final AlbumFragment $host;

    public void AlbumTitleBarAnimationViewStub$mTabStrip$2(AlbumFragment p0){
       this.$host = p0;
       super(0);
    }
    public final View invoke(){
       Object obj = PatchProxy.apply(null, this, AlbumTitleBarAnimationViewStub$mTabStrip$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$host.Gh().h;
    }
    public Object invoke(){
       return this.invoke();
    }
}
