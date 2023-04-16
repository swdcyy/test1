package androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.d$c;
import u2.f;
import androidx.recyclerview.widget.c;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
import java.util.Collections;
import java.util.concurrent.Executor;
import androidx.recyclerview.widget.h$e;
import java.lang.Runnable;
import java.util.Iterator;
import androidx.recyclerview.widget.d$b;
import androidx.recyclerview.widget.d$a;

public class d	// class@0008f9
{
    public final f a;
    public final c b;
    public Executor c;
    public final List d;
    public List e;
    public List f;
    public int g;
    public static final Executor h;

    static {
       d.h = new d$c();
    }
    public void d(f p0,c p1){
       super();
       this.d = new CopyOnWriteArrayList();
       this.f = Collections.emptyList();
       this.a = p0;
       this.b = p1;
       this.c = (p1.c() != null)? p1.c(): d.h;
       return;
    }
    public List a(){
       return this.f;
    }
    public void b(List p0,h$e p1,Runnable p2){
       d tf = this.f;
       this.e = p0;
       this.f = Collections.unmodifiableList(p0);
       p1.e(this.a);
       this.c(tf, p2);
    }
    public final void c(List p0,Runnable p1){
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, this.f);
       }
       if (p1 != null) {
          p1.run();
       }
       return;
    }
    public void d(List p0){
       this.e(p0, null);
    }
    public void e(List p0,Runnable p1){
       int i = this.g + 1;
       this.g = i;
       d te = this.e;
       if (p0 == te) {
          return;
       }
       d tf = this.f;
       int i1 = 0;
       List list = null;
       if (p0 == null) {
          this.e = list;
          this.f = Collections.emptyList();
          this.a.a(i1, te.size());
          this.c(tf, list);
          return;
       }else if(te == null){
          this.e = p0;
          this.f = Collections.unmodifiableList(p0);
          this.a.c(i1, p0.size());
          this.c(tf, list);
          return;
       }else {
          d$a uoa = new d$a(this, te, p0, i, null);
          this.b.a().execute(v6);
          return;
       }
    }
}
