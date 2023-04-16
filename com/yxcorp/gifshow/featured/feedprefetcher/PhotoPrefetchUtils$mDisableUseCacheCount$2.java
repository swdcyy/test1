package com.yxcorp.gifshow.featured.feedprefetcher.PhotoPrefetchUtils$mDisableUseCacheCount$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class PhotoPrefetchUtils$mDisableUseCacheCount$2 extends Lambda implements a	// class@000f99
{
    public static final PhotoPrefetchUtils$mDisableUseCacheCount$2 INSTANCE;

    static {
       PhotoPrefetchUtils$mDisableUseCacheCount$2.INSTANCE = new PhotoPrefetchUtils$mDisableUseCacheCount$2();
    }
    public void PhotoPrefetchUtils$mDisableUseCacheCount$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, PhotoPrefetchUtils$mDisableUseCacheCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("launchOpt2023disableCacheCount", false);
    }
}
