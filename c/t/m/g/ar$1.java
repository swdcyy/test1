package c.t.m.g.ar$1;
import c.t.m.g.bq$d;
import c.t.m.g.ar;
import android.os.Bundle;
import c.t.m.g.ap;
import java.lang.Object;
import java.lang.String;

public class ar$1 implements bq$d	// class@000bd1
{
    public final Bundle a;
    public final ap b;
    public final ar c;

    public void ar$1(ar p0,Bundle p1,ap p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(String p0){
       this.a.putString("msg_suc", p0);
       ar$1 tb = this.b;
       if (tb != null) {
          tb.a(p0);
       }
       return;
    }
    public void b(String p0){
       this.a.putString("msg_fail", p0);
       ar$1 tb = this.b;
       if (tb != null) {
          tb.b(p0);
       }
       return;
    }
}
