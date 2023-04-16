package com.yxcorp.gifshow.featured.feedprefetcher.PhotoPrefetchUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import com.yxcorp.gifshow.featured.feedprefetcher.PhotoPrefetchUtils$mDisableUseCacheCount$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class PhotoPrefetchUtils	// class@000f9a
{
    public static AtomicBoolean a;
    public static AtomicInteger b;
    public static final AtomicReference c;
    public static final p d;
    public static final PhotoPrefetchUtils e;

    static {
       PhotoPrefetchUtils.e = new PhotoPrefetchUtils();
       PhotoPrefetchUtils.a = new AtomicBoolean(false);
       PhotoPrefetchUtils.b = new AtomicInteger(false);
       PhotoPrefetchUtils.c = new AtomicReference();
       PhotoPrefetchUtils.d = s.c(PhotoPrefetchUtils$mDisableUseCacheCount$2.INSTANCE);
    }
    public void PhotoPrefetchUtils(){
       super();
    }
    public static final boolean a(){
       Object obj = PatchProxy.apply(null, null, PhotoPrefetchUtils.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (PhotoPrefetchUtils.b.get() != b) {
          b = false;
       }
       return b;
    }
}
