package gl2.i$a;
import erd.g;
import gl2.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import o02.f;
import o02.e;
import com.kwai.framework.model.user.QCurrentUser;
import fq5.b;
import brd.t;
import gl2.g;
import gl2.h;
import crd.b;
import kotlin.jvm.internal.a;
import gl2.f;

public final class i$a implements g	// class@002b45
{
    public final i b;
    public final String c;

    public void i$a(i p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "1")) {
       }else {
          p0 = this.b;
          i$a tc = this.c;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(tc, p0, i.class, "2")) {
             b uob = e.a().R(QCurrentUser.ME.getId(), p0.b.getLiveStreamId(), tc).subscribe(new g(p0), h.b);
             a.o(uob, "LiveApi.getApiService\(\).¡­ch error\", it\)\n        }\)");
             p0.b(uob);
          }
       }
       return;
    }
}
