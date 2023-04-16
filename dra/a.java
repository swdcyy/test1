package dra.a;
import dra.a$a;
import nsd.u;
import fra.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dra.a$c;
import java.lang.Runnable;
import i0d.g;

public final class a	// class@002500
{
    public c a;
    public final b b;
    public static final a$a c;

    static {
       a.c = new a$a(null);
    }
    public void a(b p0){
       a.p(p0, "callContext");
       super();
       this.b = p0;
    }
    public final b a(){
       return this.b;
    }
    public final void b(c p0){
       this.a = p0;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       g.b(new a$c(this));
       return;
    }
}
