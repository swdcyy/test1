package androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.RecyclerView$s;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.RecyclerView$s$a;
import java.lang.Object;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import androidx.recyclerview.widget.f$a;
import java.lang.Math;

public class f extends RecyclerView$s	// class@0008fd
{
    public Set c;
    public static int d;
    public static boolean e;

    public void f(){
       super();
       this.c = new ArraySet();
    }
    private RecyclerView$s$a g(int p0){
       RecyclerView$s$a os$a = this.a.get(p0);
       if (os$a == null) {
          os$a = new RecyclerView$s$a();
          this.a.put(p0, os$a);
       }
       return os$a;
    }
    public void i(RecyclerView$ViewHolder p0){
       int itemViewType = p0.getItemViewType();
       RecyclerView$s$a a = this.g(itemViewType).a;
       if (!f.e) {
          if (f.d > 0) {
             this.p(itemViewType);
          }
          if (this.a.get(itemViewType).b <= a.size()) {
             Iterator iterator = this.c.iterator();
             while (iterator.hasNext()) {
                iterator.next().i(p0);
             }
             return;
          }
       }
       p0.resetInternal();
       a.add(p0);
       return;
    }
    public final void n(f$a p0){
       this.c.add(p0);
    }
    public final void o(){
       this.c.clear();
    }
    public final void p(int p0){
       RecyclerView$s$a b = this.g(p0).b;
       int d = f.d;
       if (b < d) {
          this.k(p0, Math.max(b, d));
       }
       return;
    }
}
