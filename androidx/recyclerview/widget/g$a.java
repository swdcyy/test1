package androidx.recyclerview.widget.g$a;
import java.lang.Runnable;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Iterator;
import androidx.recyclerview.widget.g$j;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class g$a implements Runnable	// class@0008fe
{
    public final ArrayList b;
    public final g c;

    public void g$a(g p0,ArrayList p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          g$j oj = iterator.next();
          this.c.N(oj.a, oj.b, oj.c, oj.d, oj.e);
       }
       this.b.clear();
       this.c.m.remove(this.b);
       return;
    }
}
