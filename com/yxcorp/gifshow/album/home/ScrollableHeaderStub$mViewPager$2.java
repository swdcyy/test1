package com.yxcorp.gifshow.album.home.ScrollableHeaderStub$mViewPager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.album.home.AlbumHomeFragment;
import androidx.viewpager.widget.ViewPager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumHomeFragmentViewBinder;
import kotlin.jvm.internal.a;

public final class ScrollableHeaderStub$mViewPager$2 extends Lambda implements a	// class@001a1a
{
    public final AlbumHomeFragment $host;

    public void ScrollableHeaderStub$mViewPager$2(AlbumHomeFragment p0){
       this.$host = p0;
       super(0);
    }
    public final ViewPager invoke(){
       ViewPager obj = PatchProxy.apply(null, this, ScrollableHeaderStub$mViewPager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$host.uh().k();
       if (obj == null) {
          a.L();
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
