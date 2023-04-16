package n02.b;
import msd.a;
import n02.a$b;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import n02.a;
import java.util.Iterator;
import java.util.Set;
import androidx.fragment.app.c$b;
import qrd.l1;

public final class b implements a	// class@00326b
{
    public final a$b b;
    public final c c;
    public final Fragment d;

    public void b(a$b p0,c p1,Fragment p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object invoke(){
       b tc = this.c;
       b td = this.d;
       Iterator iterator = this.b.b.p.iterator();
       while (iterator.hasNext()) {
          c$b uob = iterator.next();
          if (uob != null) {
             uob.k(tc, td);
          }
       }
       return l1.a;
    }
}
