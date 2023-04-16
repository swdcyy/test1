package com.yxcorp.image.network.CookieAppendInterceptor;
import okhttp3.Interceptor;
import java.util.Set;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Request;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.HttpUrl;
import q0d.c;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;
import q0d.b;
import ok.h;
import java.util.Collections;
import java.util.List;
import com.yxcorp.image.network.a;
import java.util.Collection;
import com.google.common.collect.e;
import okhttp3.Request$Builder;

public class CookieAppendInterceptor implements Interceptor	// class@001a18
{
    public final Set a;

    public void CookieAppendInterceptor(Set p0){
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CookieAppendInterceptor uCookieAppen = CookieAppendInterceptor.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, uCookieAppen, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.request();
       String str = PatchProxy.applyOneRefs(obj, this, uCookieAppen, "2");
       if (str != patchProxyRe) {
       }else {
          str = obj.header("Host");
          if (TextUtils.isEmpty(str)) {
             str = obj.url().host();
          }
       }
       CookieAppendInterceptor ta = this.a;
       String str1 = PatchProxy.applyTwoRefs(ta, str, this, uCookieAppen, "3");
       if (str1 != patchProxyRe) {
       }else {
          List list = y.y(ta, new c(str)).transform(new b(str)).or(Collections.EMPTY_LIST);
          str1 = (!list.isEmpty())? TextUtils.join(";", e.f(list, a.b)): null;
       }
       if (TextUtils.isEmpty(str1)) {
          return p0.proceed(obj);
       }else {
          return p0.proceed(obj.newBuilder().addHeader("Cookie", str1).build());
       }
    }
}
