package m6.a$a;
import java.lang.Runnable;
import m6.a;
import s6.a;
import android.content.Context;
import java.lang.Object;
import q6.b;
import p6.b;
import p6.e;
import java.lang.String;
import java.util.Objects;
import org.json.JSONObject;
import s6.b;
import u6.g;
import java.lang.Throwable;
import u6.c;

public class a$a implements Runnable	// class@0025b2
{
    public final a b;
    public final Context c;
    public final a d;

    public void a$a(a p0,a p1,Context p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       b uob = new b().g(this.b, this.c);
       if (uob != null) {
          a.b(this.d, this.b, uob.a());
          a$a td = this.d;
          try{
             Objects.requireNonNull(td);
             g.c(null, b.d().b(), "alipay_cashier_dynamic_config", td.B().toString());
          }catch(java.lang.Exception e0){
             c.c(e0);
          }
       }
    }
}
