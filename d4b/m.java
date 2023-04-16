package d4b.m;
import erd.g;
import d4b.h;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import w46.b;
import kotlin.jvm.internal.a;
import d4b.a$a;

public final class m implements g	// class@002436
{
    public final h b;

    public void m(h p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          b.D().t("MagicRepository", p0.getMessage(), objArray);
          a.o(p0, "e");
          this.b.b.o0(p0);
          p0.f = false;
       }
       return;
    }
}
