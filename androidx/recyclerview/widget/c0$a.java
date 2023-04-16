package androidx.recyclerview.widget.c0$a;
import androidx.recyclerview.widget.c0;
import java.lang.Object;
import android.util.SparseArray;
import androidx.recyclerview.widget.q;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import androidx.recyclerview.widget.c0$c;
import androidx.recyclerview.widget.c0$a$a;

public class c0$a implements c0	// class@0008ee
{
    public SparseArray a;
    public int b;

    public void c0$a(){
       super();
       this.a = new SparseArray();
       this.b = 0;
    }
    public q a(int p0){
       q oq = this.a.get(p0);
       if (oq != null) {
          return oq;
       }
       throw new IllegalArgumentException("Cannot find the wrapper for global view type "+p0);
    }
    public c0$c b(q p0){
       return new c0$a$a(this, p0);
    }
    public int c(q p0){
       c0$a tb = this.b;
       this.b = tb + 1;
       this.a.put(tb, p0);
       return tb;
    }
    public void d(q p0){
       int i = this.a.size() - 1;
       while (i >= 0) {
          if (this.a.valueAt(i) == p0) {
             this.a.removeAt(i);
          }
          i = i - 1;
       }
       return;
    }
}
