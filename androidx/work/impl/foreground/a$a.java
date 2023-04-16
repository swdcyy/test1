package androidx.work.impl.foreground.a$a;
import java.lang.Runnable;
import androidx.work.impl.foreground.a;
import androidx.work.impl.WorkDatabase;
import java.lang.String;
import java.lang.Object;
import u3.s;
import u3.r;
import java.util.Map;
import java.util.Set;
import java.lang.Iterable;
import q3.d;

public class a$a implements Runnable	// class@000a8f
{
    public final WorkDatabase b;
    public final String c;
    public final a d;

    public void a$a(a p0,WorkDatabase p1,String p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       r or = this.b.O().j(this.c);
       if (or != null && or.b()) {
          a e = this.d.e;
          _monitor_enter(e);
          this.d.i.put(this.c, or);
          this.d.j.add(or);
          a$a td = this.d;
          td.k.d(td.j);
          _monitor_exit(e);
       }
       return;
    }
}
