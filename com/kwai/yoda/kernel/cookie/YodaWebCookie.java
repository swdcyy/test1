package com.kwai.yoda.kernel.cookie.YodaWebCookie;
import java.lang.Object;
import com.kwai.yoda.kernel.cookie.YodaWebCookie$cookieGuard$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collection;
import crd.a;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import rb7.c;
import ry7.f;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import com.kwai.yoda.kernel.cookie.YodaWebCookie$a;
import com.kwai.yoda.kernel.cookie.YodaWebCookie$b;
import erd.g;
import crd.b;
import ry7.g;
import ry7.e;
import java.lang.CharSequence;
import sy7.b;
import java.util.Map;
import trd.t0;

public class YodaWebCookie	// class@00129f
{
    public final p a;
    public final CopyOnWriteArrayList b;
    public String c;
    public a d;

    public void YodaWebCookie(){
       super();
       this.a = s.c(new YodaWebCookie$cookieGuard$2(this));
       this.b = new CopyOnWriteArrayList(new ArrayList());
       this.d = new a();
       YodaCookie f = YodaCookie.f;
       Objects.requireNonNull(f);
       t ot = PatchProxy.apply(null, f, YodaCookie.class, "14");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = c.c.b(f.class);
       }
       b uob = ot.observeOn(AzerothSchedulers.b.c()).subscribe(new YodaWebCookie$a(this), YodaWebCookie$b.b);
       if (!PatchProxy.applyVoidOneRefs(uob, this, YodaWebCookie.class, "9") && uob != null) {
          if (this.d.isDisposed()) {
             this.d = new a();
          }
          this.d.c(uob);
       }
       return;
    }
    public final g a(){
       Object obj = PatchProxy.apply(null, this, YodaWebCookie.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public e b(){
       g obj = PatchProxy.apply(null, this, YodaWebCookie.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a().b;
       String str = null;
       Map map = (obj == null || !obj.length())? 1: null;
       if (map) {
          b.b.k("The main root domain for cookie is null or empty");
          return new e(t0.z(), t0.z());
       }else {
          this.b.add(obj);
          return YodaCookie.f.c(obj, str);
       }
    }
}
