package gl2.b;
import erd.g;
import gl2.c;
import com.google.gson.JsonArray;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fl2.a;
import com.google.gson.JsonElement;
import pm8.a;

public final class b implements g	// class@002b3e
{
    public final c b;
    public final JsonArray c;

    public void b(c p0,JsonArray p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.b <= null) {
             p0 = p0.g;
             a.m(p0);
             p0.c.a(p0, "SYS_COMMENT");
             this.c.a0(this.b.f);
             a.X1(this.c.toString());
          }
       }
       return;
    }
}
