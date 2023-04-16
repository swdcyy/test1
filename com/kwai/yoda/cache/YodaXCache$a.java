package com.kwai.yoda.cache.YodaXCache$a;
import erd.g;
import java.lang.Object;
import rx7.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.cache.YodaXCache;
import java.util.HashMap;
import java.lang.Integer;

public final class YodaXCache$a implements g	// class@00119b
{
    public static final YodaXCache$a b;

    static {
       YodaXCache$a.b = new YodaXCache$a();
    }
    public void YodaXCache$a(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaXCache$a.class, "1")) {
       }else {
          YodaXCache.n.f().remove(Integer.valueOf(p0.a()));
       }
       return;
    }
}
