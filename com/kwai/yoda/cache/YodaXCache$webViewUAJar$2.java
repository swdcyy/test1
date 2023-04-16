package com.kwai.yoda.cache.YodaXCache$webViewUAJar$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import px7.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.cache.YodaXCache;
import ub7.f;

public final class YodaXCache$webViewUAJar$2 extends Lambda implements a	// class@0011a5
{
    public static final YodaXCache$webViewUAJar$2 INSTANCE;

    static {
       YodaXCache$webViewUAJar$2.INSTANCE = new YodaXCache$webViewUAJar$2();
    }
    public void YodaXCache$webViewUAJar$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final e invoke(){
       e uoe;
       f obj = PatchProxy.apply(null, this, YodaXCache$webViewUAJar$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = YodaXCache.n.l();
       if (obj != null) {
          uoe = obj.get();
          if (uoe != null) {
          label_0026 :
             return uoe;
          }
       }
       uoe = new e();
       goto label_0026 ;
    }
}
