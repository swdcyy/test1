package ac8.t;
import java.lang.Runnable;
import com.mini.js.jsapi.ui.x;
import ja8.c;
import ja8.e;
import java.lang.Object;
import na8.a;
import ma8.g;
import ma8.i;
import java.lang.String;
import com.mini.js.helper.a;

public final class t implements Runnable	// class@000072
{
    public final x b;
    public final c c;
    public final e d;

    public void t(x p0,c p1,e p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       t tc = this.c;
       t td = this.d;
       g og = this.b.b.h();
       if (og == null) {
          tc.a(a.g(td, false));
       }else {
          og.k1();
          tc.a(a.c(td, true));
       }
       return;
    }
}
