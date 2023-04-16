package b6a.a;
import java.lang.Object;
import com.yxcorp.gifshow.detail.relation.select.model.FeedSelectUsersResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.StringBuilder;
import java.lang.reflect.Type;
import kotlin.jvm.internal.a;
import java.lang.System;

public final class a	// class@00037f
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final FeedSelectUsersResponse a(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(0x5f2ddeb4).g("select_users_cache_key"+p0, FeedSelectUsersResponse.class);
    }
    public final void b(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       b.a(0x5f2ddeb4).remove("select_users_cache_key"+p0);
       return;
    }
    public final void c(int p0,FeedSelectUsersResponse p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1")) {
          return;
       }
       a.p(p1, "response");
       b.a(0x5f2ddeb4).c("select_users_cache_key"+p0, p1, FeedSelectUsersResponse.class, (System.currentTimeMillis() + 0x2932e00));
       return;
    }
}
