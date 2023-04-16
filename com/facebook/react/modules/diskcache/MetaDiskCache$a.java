package com.facebook.react.modules.diskcache.MetaDiskCache$a;
import com.facebook.cache.common.d;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import ne.a;
import java.lang.Object;
import java.io.OutputStream;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import ne.b;
import cb.a;
import java.io.InputStream;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ab.e;
import com.facebook.common.memory.c;
import eb.e;
import java.lang.Math;

public class MetaDiskCache$a implements d	// class@0012af
{
    public final a a;
    public final MetaDiskCache b;

    public void MetaDiskCache$a(MetaDiskCache p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(OutputStream p0){
       boolean b;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MetaDiskCache$a.class, str)) {
          return;
       }
       a.c(MetaDiskCache.k, "start writeToDiskCache "+this.a+":"+this.a.g().c());
       MetaDiskCache c = this.b.c;
       InputStream inputStream = this.a.j();
       b uob = this.a.g();
       Objects.requireNonNull(uob);
       Object obj = PatchProxy.apply(null, uob, b.class, str);
       int i = (obj != PatchProxyResult.class)? obj.intValue(): uob.b() + 32;
       long l = (long)i;
       Objects.requireNonNull(c);
       long l1 = 0;
       i = 0;
       b = (l - l1 > 0)? true: false;
       e.f(b);
       byte[] uobyteArray = c.b.get(c.a);
       while (l1 - l < 0) {
          long l2 = l - l1;
          int i1 = inputStream.read(uobyteArray, i, (int)Math.min((long)c.a, l2));
          if (i1 == -1) {
             break ;
          }
          p0.write(uobyteArray, i, i1);
          l1 = l1 + (long)i1;
       }
       c.b.a(uobyteArray);
       a.c(MetaDiskCache.k, "finish writeToDiskCache "+this.a);
       return;
    }
}
