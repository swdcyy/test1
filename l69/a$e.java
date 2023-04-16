package l69.a$e;
import erd.o;
import pr3.e;
import java.lang.Object;
import o69.d2$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import pr3.d;

public final class a$e implements o	// class@002c92
{
    public final e b;

    public void a$e(e p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       a$e uoe = PatchProxy.applyOneRefs(p0, this, a$e.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else {
          a.p(p0, "exportTask");
          this.b.d(p0.a());
          uoe = this.b;
       }
       return uoe;
    }
}
