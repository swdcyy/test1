package com.yxcorp.gifshow.album.home.ScrollableHeaderStub$mTopCustomArea$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHomeFragmentViewBinder;
import kotlin.jvm.internal.a;

public final class ScrollableHeaderStub$mTopCustomArea$2 extends Lambda implements a	// class@001a19
{
    public final AlbumHomeFragment $host;

    public void ScrollableHeaderStub$mTopCustomArea$2(AlbumHomeFragment p0){
       this.$host = p0;
       super(0);
    }
    public final View invoke(){
       View obj = PatchProxy.apply(null, this, ScrollableHeaderStub$mTopCustomArea$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$host.uh().l();
       if (obj == null) {
          a.L();
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
