package com.yxcorp.gifshow.hot.stagger.pagelist.HomeHotCacheManager$mCancelAutoRefresh$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.homepage_interface.homedata.FindReFreshGuideConfigModel;
import wa5.e;

public final class HomeHotCacheManager$mCancelAutoRefresh$2 extends Lambda implements a	// class@0018a8
{
    public static final HomeHotCacheManager$mCancelAutoRefresh$2 INSTANCE;

    static {
       HomeHotCacheManager$mCancelAutoRefresh$2.INSTANCE = new HomeHotCacheManager$mCancelAutoRefresh$2();
    }
    public void HomeHotCacheManager$mCancelAutoRefresh$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeHotCacheManager$mCancelAutoRefresh$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.c().getMCancelAutoRefresh() == 2)? true: false;
       return b;
    }
}
