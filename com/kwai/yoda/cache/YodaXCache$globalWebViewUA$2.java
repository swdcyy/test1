package com.kwai.yoda.cache.YodaXCache$globalWebViewUA$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.cache.YodaXCache;
import java.util.Objects;
import com.kwai.yoda.Yoda;
import kotlin.jvm.internal.a;
import uz7.a;
import com.kwai.yoda.store.sp.YodaSharedPreferences;
import xb7.a;

public final class YodaXCache$globalWebViewUA$2 extends Lambda implements a	// class@0011a1
{
    public static final YodaXCache$globalWebViewUA$2 INSTANCE;

    static {
       YodaXCache$globalWebViewUA$2.INSTANCE = new YodaXCache$globalWebViewUA$2();
    }
    public void YodaXCache$globalWebViewUA$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       YodaXCache obj = PatchProxy.apply(objArray, this, YodaXCache$globalWebViewUA$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = YodaXCache.n;
       Objects.requireNonNull(obj);
       String str = PatchProxy.apply(objArray, obj, YodaXCache.class, "21");
       if (str != patchProxyRe) {
       }else {
          Yoda yoda = Yoda.get();
          a.h(yoda, "Yoda.get\(\)");
          a yodaStorage = yoda.getYodaStorage();
          Objects.requireNonNull(yodaStorage);
          Object obj1 = PatchProxy.apply(objArray, yodaStorage, a.class, "4");
          if (obj1 != patchProxyRe) {
          }else {
             yodaStorage = yodaStorage.a;
             Objects.requireNonNull(yodaStorage);
             Object obj2 = PatchProxy.apply(objArray, yodaStorage, YodaSharedPreferences.class, "6");
             obj1 = (obj2 != patchProxyRe)? obj2: yodaStorage.a().b("user_agent");
          }
          String str1 = (!obj1.length())? 1: null;
          if (str1) {
             str = obj.p();
          }else {
             str = obj1;
          }
       }
       return str;
    }
}
