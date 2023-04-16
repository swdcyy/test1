package androidx.recyclerview.widget.g$c;
import java.lang.Runnable;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class g$c implements Runnable	// class@000900
{
    public final ArrayList b;
    public final g c;

    public void g$c(g p0,ArrayList p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          this.c.L(iterator.next());
       }
       this.b.clear();
       this.c.l.remove(this.b);
       return;
    }
}
