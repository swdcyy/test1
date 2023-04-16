package j7a.a$c;
import erd.g;
import j7a.a;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$c implements g	// class@002923
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          this.b.x = a.e(p0, 0x3f800000) ^ 0x01;
       }
       return;
    }
}
