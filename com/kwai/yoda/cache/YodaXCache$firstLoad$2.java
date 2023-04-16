package com.kwai.yoda.cache.YodaXCache$firstLoad$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YodaXCache$firstLoad$2 extends Lambda implements a	// class@0011a0
{
    public static final YodaXCache$firstLoad$2 INSTANCE;

    static {
       YodaXCache$firstLoad$2.INSTANCE = new YodaXCache$firstLoad$2();
    }
    public void YodaXCache$firstLoad$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final HashSet invoke(){
       Object obj = PatchProxy.apply(null, this, YodaXCache$firstLoad$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new HashSet();
    }
}
