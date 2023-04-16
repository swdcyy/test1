package cc5.a$a;
import erd.g;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import com.kwai.component.kwailink.http.ImServiceTokenResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cc5.a;
import kotlin.jvm.internal.a;
import java.lang.System;
import com.kwai.imsdk.m;
import java.util.Objects;
import l85.b;
import com.kwai.imsdk.internal.v;
import bp6.a1;
import java.lang.Runnable;
import java.util.concurrent.Future;
import f97.a;
import bc5.a;

public final class a$a implements g	// class@00068f
{
    public final Ref$BooleanRef b;
    public final long c;

    public void a$a(Ref$BooleanRef p0,long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a c = a.c;
          c.f(false);
          a.o(p0, "it");
          if (!PatchProxy.applyVoidOneRefs(p0, c, a.class, "10")) {
             c.h(p0.mMessageLoginServiceToken);
             c.g(p0.mSecurity);
             c.i(System.currentTimeMillis());
          }
          if (this.b.element != null) {
             m om = m.F();
             Objects.requireNonNull(om);
             b.a("KwaiIMManager#refreshToken");
             Objects.requireNonNull(v.m(om.c));
             a.f(new a1(p0.mMessageLoginServiceToken, p0.mSecurity));
          }
          a.b((System.currentTimeMillis() - this.c), false);
       }
       return;
    }
}
