package gl2.a;
import erd.g;
import gl2.c;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fl2.a;

public final class a implements g	// class@002b3d
{
    public final c b;

    public void a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.b <= null) {
             p0 = p0.g;
             a.m(p0);
             p0.c.a(p0, "SYS_COMMENT");
          }
       }
       return;
    }
}
