package com.yxcorp.gifshow.album.home.AlbumTitleBarAnimationViewStub$mLeftBtn$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import android.widget.ImageView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumFragmentViewBinder;

public final class AlbumTitleBarAnimationViewStub$mLeftBtn$2 extends Lambda implements a	// class@001a0d
{
    public final AlbumFragment $host;

    public void AlbumTitleBarAnimationViewStub$mLeftBtn$2(AlbumFragment p0){
       this.$host = p0;
       super(0);
    }
    public final ImageView invoke(){
       Object obj = PatchProxy.apply(null, this, AlbumTitleBarAnimationViewStub$mLeftBtn$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.$host.Gh().m();
    }
    public Object invoke(){
       return this.invoke();
    }
}
