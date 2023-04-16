package com.kwai.yoda.cache.codecache.service.YodaKwService$b;
import erd.o;
import java.lang.Object;
import com.kwai.yoda.cache.codecache.model.CodeCacheInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import java.io.File;
import kotlin.io.FilesKt__FileReadWriteKt;

public final class YodaKwService$b implements o	// class@0011ac
{
    public static final YodaKwService$b b;

    static {
       YodaKwService$b.b = new YodaKwService$b();
    }
    public void YodaKwService$b(){
       super();
    }
    public Object apply(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, YodaKwService$b.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.q(p0, "it");
          byte[] uobyteArray = FilesKt__FileReadWriteKt.v(new File(p0.getJsSourcePath()));
          File parentFile = new File(p0.getSavePath()).getParentFile();
          if (parentFile != null && !parentFile.exists()) {
             parentFile.mkdirs();
          }
          pair = new Pair(p0, uobyteArray);
       }
       return pair;
    }
}
