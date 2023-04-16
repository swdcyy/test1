package ac8.u;
import java.lang.Runnable;
import com.mini.js.jsapi.ui.x;
import ja8.e;
import ja8.c;
import java.lang.Object;
import java.util.Objects;
import org.json.JSONObject;
import java.lang.String;
import com.mini.js.jsapi.ui.x$a;
import na8.a;
import ma8.g;
import ma8.i;
import cc8.o$b;
import com.mini.js.helper.a;
import org.json.JSONException;

public final class u implements Runnable	// class@000073
{
    public final x b;
    public final e c;
    public final c d;

    public void u(x p0,e p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       u tb = this.b;
       u tc = this.c;
       u td = this.d;
       try{
          Objects.requireNonNull(tb);
          x$a uoa = new x$a();
          if (tb.K(tc, td, new JSONObject(tc.g()), uoa)) {
             g og = tb.b.h();
             if (og != null) {
                o$b uob = new o$b(og);
                uob.b(uoa.a);
                uob.c = uoa.b;
                uob.d = uoa.e;
                uob.e = uoa.c;
                uob.a(uoa.d);
                og.S1(uob);
                td.a(a.d(tc, true, null));
             }
          }
       }catch(org.json.JSONException e0){
          e0.printStackTrace();
          td.a(a.c(tc, false));
       }
       return;
    }
}
