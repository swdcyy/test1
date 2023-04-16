package com.yxcorp.gifshow.follow.stagger.cache.FollowCacheUtil$mFollowCacheManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kia.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.stagger.cache.FollowCacheUtil;
import java.util.Objects;

public final class FollowCacheUtil$mFollowCacheManager$2 extends Lambda implements a	// class@00114b
{
    public static final FollowCacheUtil$mFollowCacheManager$2 INSTANCE;

    static {
       FollowCacheUtil$mFollowCacheManager$2.INSTANCE = new FollowCacheUtil$mFollowCacheManager$2();
    }
    public void FollowCacheUtil$mFollowCacheManager$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, FollowCacheUtil$mFollowCacheManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(FollowCacheUtil.c);
       return new a("home_feed_list_6");
    }
}
