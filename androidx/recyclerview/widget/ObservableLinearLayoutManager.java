package androidx.recyclerview.widget.ObservableLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import android.util.AttributeSet;
import androidx.recyclerview.widget.ObservableLinearLayoutManager$a;
import java.lang.Object;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$y;
import java.util.Iterator;

public class ObservableLinearLayoutManager extends LinearLayoutManager	// class@00087b
{
    public final List r;

    public void ObservableLinearLayoutManager(Context p0){
       super(p0);
       this.r = new CopyOnWriteArrayList();
    }
    public void ObservableLinearLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       this.r = new CopyOnWriteArrayList();
    }
    public void ObservableLinearLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.r = new CopyOnWriteArrayList();
    }
    public void W0(ObservableLinearLayoutManager$a p0){
       this.r.add(p0);
    }
    public void X0(ObservableLinearLayoutManager$a p0){
       this.r.remove(p0);
    }
    public void onLayoutChildren(RecyclerView$t p0,RecyclerView$y p1){
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(this);
       }
       super.onLayoutChildren(p0, p1);
       Iterator iterator1 = this.r.iterator();
       while (iterator1.hasNext()) {
          iterator1.next().a(this);
       }
       return;
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       LinearLayoutManager tj = this.j;
       LinearLayoutManager tk = this.k;
       super.onLayoutCompleted(p0);
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this, tj, tk);
       }
       return;
    }
}
