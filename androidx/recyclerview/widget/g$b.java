package androidx.recyclerview.widget.g$b;
import java.lang.Runnable;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Iterator;
import androidx.recyclerview.widget.g$i;

public class g$b implements Runnable	// class@0008ff
{
    public final ArrayList b;
    public final g c;

    public void g$b(g p0,ArrayList p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          this.c.M(iterator.next());
       }
       this.b.clear();
       this.c.n.remove(this.b);
       return;
    }
}
