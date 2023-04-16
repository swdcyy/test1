package cm3.a;
import dm3.a$b;
import cm3.b;
import fm3.a;
import java.lang.Object;
import am3.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a implements a$b	// class@00059e
{
    public final b a;
    public final a b;
    public final a$b c;

    public void a(b p0,a p1,a$b p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "result");
       this.a.a.remove(this.b);
       this.c.a(p0);
       return;
    }
}
