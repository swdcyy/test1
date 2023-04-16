package com.yxcorp.gifshow.follow.stagger.cache.FollowCacheUtil;
import com.yxcorp.gifshow.follow.stagger.cache.FollowCacheUtil$mFollowCacheManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import kia.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class FollowCacheUtil	// class@00114c
{
    public static final p a;
    public static HomeFeedResponse b;
    public static final FollowCacheUtil c;

    static {
       FollowCacheUtil.c = new FollowCacheUtil();
       FollowCacheUtil.a = s.c(FollowCacheUtil$mFollowCacheManager$2.INSTANCE);
    }
    public void FollowCacheUtil(){
       super();
    }
    public static final a b(){
       Object obj = PatchProxy.apply(null, null, FollowCacheUtil.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowCacheUtil.c.a();
    }
    public final a a(){
       Object obj = PatchProxy.apply(null, this, FollowCacheUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FollowCacheUtil.a.getValue();
    }
}
