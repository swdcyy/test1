package com.kwai.yoda.kernel.cookie.YodaWebCookie$a;
import erd.g;
import com.kwai.yoda.kernel.cookie.YodaWebCookie;
import java.lang.Object;
import ry7.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.CopyOnWriteArrayList;
import ry7.e;

public final class YodaWebCookie$a implements g	// class@00129c
{
    public final YodaWebCookie b;

    public void YodaWebCookie$a(YodaWebCookie p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebCookie$a.class, "1")) {
       }else {
          this.b.b.clear();
          this.b.b();
       }
       return;
    }
}
