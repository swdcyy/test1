package n02.c;
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

public final class c implements a	// class@00326c
{
    public final a$b b;
    public final c c;
    public final Fragment d;

    public void c(a$b p0,c p1,Fragment p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object invoke(){
       c tc = this.c;
       c td = this.d;
       Iterator iterator = this.b.b.p.iterator();
       while (iterator.hasNext()) {
          c$b uob = iterator.next();
          if (uob != null) {
             uob.i(tc, td);
          }
       }
       return l1.a;
    }
}
