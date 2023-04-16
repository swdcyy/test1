package ac8.g;
import h88.c;
import ja8.c;
import ja8.e;
import java.lang.Object;
import ma8.g;
import java.lang.String;
import com.mini.js.helper.a;

public final class g implements c	// class@000065
{
    public final c a;
    public final e b;

    public void g(c p0,e p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       g ta = this.a;
       g tb = this.b;
       if (p0 != null) {
          p0.x();
          p0.f();
       }
       ta.a(a.g(tb, true));
       return;
    }
}
