package com.kwai.yoda.cache.YodaXCache$bindMatchers$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YodaXCache$bindMatchers$2 extends Lambda implements a	// class@00119d
{
    public static final YodaXCache$bindMatchers$2 INSTANCE;

    static {
       YodaXCache$bindMatchers$2.INSTANCE = new YodaXCache$bindMatchers$2();
    }
    public void YodaXCache$bindMatchers$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashMap invoke(){
       Object obj = PatchProxy.apply(null, this, YodaXCache$bindMatchers$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HashMap();
    }
}
