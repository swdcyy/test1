package com.kwai.yoda.kernel.cookie.YodaCookie$mCookieManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.kernel.cookie.CookieManagerWrapper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YodaCookie$mCookieManager$2 extends Lambda implements a	// class@00129a
{
    public static final YodaCookie$mCookieManager$2 INSTANCE;

    static {
       YodaCookie$mCookieManager$2.INSTANCE = new YodaCookie$mCookieManager$2();
    }
    public void YodaCookie$mCookieManager$2(){
       super(0);
    }
    public final CookieManagerWrapper invoke(){
       Object obj = PatchProxy.apply(null, this, YodaCookie$mCookieManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CookieManagerWrapper();
    }
    public Object invoke(){
       return this.invoke();
    }
}
