package com.yxcorp.gifshow.featured.feedprefetcher.PhotoPrefetchDataUtil$stidWhiteList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;

public final class PhotoPrefetchDataUtil$stidWhiteList$2 extends Lambda implements a	// class@000f97
{
    public static final PhotoPrefetchDataUtil$stidWhiteList$2 INSTANCE;

    static {
       PhotoPrefetchDataUtil$stidWhiteList$2.INSTANCE = new PhotoPrefetchDataUtil$stidWhiteList$2();
    }
    public void PhotoPrefetchDataUtil$stidWhiteList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       ArrayList obj = PatchProxy.apply(null, this, PhotoPrefetchDataUtil$stidWhiteList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add("1_1_0_0_0");
       obj.add("1_13_0_0_0");
       obj.add("1_13_0_10_0");
       obj.add("1_13_0_11_0");
       return obj;
    }
}
