package com.kwai.yoda.kernel.loading.YodaLoading$a;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.kwai.yoda.kernel.loading.YodaLoading;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.io.File;
import tb7.c;
import java.util.concurrent.ConcurrentHashMap;
import yy7.a;
import qrd.l1;

public final class YodaLoading$a implements Callable	// class@0012a6
{
    public static final YodaLoading$a b;

    static {
       YodaLoading$a.b = new YodaLoading$a();
    }
    public void YodaLoading$a(){
       super();
    }
    public Object call(){
       YodaLoading yodaLoading = YodaLoading.class;
       if (PatchProxy.applyVoid(null, this, YodaLoading$a.class, "1")) {
       }else {
          YodaLoading g = YodaLoading.g;
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoid(null, g, yodaLoading, "25")) {
             c.a(YodaLoading.l());
          }
          g.m();
          if (!PatchProxy.applyVoid(null, g, yodaLoading, "23")) {
             YodaLoading.d.clear();
             a uoa = g.k();
             if (uoa != null) {
                uoa.d();
             }
          }
       }
       return l1.a;
    }
}
