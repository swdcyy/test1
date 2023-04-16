package com.kwai.framework.kxb.plugins.KwaiUpdateApiService$mApiService$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.kxb.plugins.KwaiUpdateApiService;
import java.lang.Object;
import lu6.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import retrofit2.q;
import g96.b;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import kotlin.jvm.internal.a;

public final class KwaiUpdateApiService$mApiService$2 extends Lambda implements a	// class@001625
{
    public final KwaiUpdateApiService this$0;

    public void KwaiUpdateApiService$mApiService$2(KwaiUpdateApiService p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiUpdateApiService$mApiService$2 obj = PatchProxy.apply(null, this, KwaiUpdateApiService$mApiService$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       q oq = PatchProxy.apply(null, obj, KwaiUpdateApiService.class, "3");
       if (oq != patchProxyRe) {
       }else {
          oq = e.a(new b());
          a.o(oq, "RetrofitManager.buildRetrofit\(KxbRetrofitConfig\(\)\)");
       }
       return oq.a(a.class);
    }
}
