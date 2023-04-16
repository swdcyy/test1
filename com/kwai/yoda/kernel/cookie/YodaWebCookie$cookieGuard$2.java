package com.kwai.yoda.kernel.cookie.YodaWebCookie$cookieGuard$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.kernel.cookie.YodaWebCookie;
import java.lang.Object;
import ry7.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public final class YodaWebCookie$cookieGuard$2 extends Lambda implements a	// class@00129e
{
    public final YodaWebCookie this$0;

    public void YodaWebCookie$cookieGuard$2(YodaWebCookie p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final g invoke(){
       YodaWebCookie$cookieGuard$2 obj = PatchProxy.apply(null, this, YodaWebCookie$cookieGuard$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       Objects.requireNonNull(obj);
       g og = PatchProxy.apply(null, obj, YodaWebCookie.class, "2");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g();
       }
       return og;
    }
}
