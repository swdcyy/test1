package com.kwai.yoda.cache.codecache.service.YodaKwService$a;
import erd.r;
import java.lang.Object;
import com.kwai.yoda.cache.codecache.model.CodeCacheInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.io.File;

public final class YodaKwService$a implements r	// class@0011ab
{
    public static final YodaKwService$a b;

    static {
       YodaKwService$a.b = new YodaKwService$a();
    }
    public void YodaKwService$a(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaKwService$a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.q(p0, "it");
          if (new File(p0.getSavePath()).exists()) {
             p0.getJsSourcePath();
             b = false;
          }else {
             boolean b1 = new File(p0.getJsSourcePath()).exists();
             if (!b1) {
                p0.getJsSourcePath();
             }
             b = b1;
          }
       }
       return b;
    }
}
