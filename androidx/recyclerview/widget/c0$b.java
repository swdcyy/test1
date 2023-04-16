package androidx.recyclerview.widget.c0$b;
import androidx.recyclerview.widget.c0;
import java.lang.Object;
import android.util.SparseArray;
import androidx.recyclerview.widget.q;
import java.util.List;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import androidx.recyclerview.widget.c0$c;
import androidx.recyclerview.widget.c0$b$a;

public class c0$b implements c0	// class@0008f0
{
    public SparseArray a;

    public void c0$b(){
       super();
       this.a = new SparseArray();
    }
    public q a(int p0){
       List list = this.a.get(p0);
       if (list != null && !list.isEmpty()) {
          return list.get(0);
       }
       throw new IllegalArgumentException("Cannot find the wrapper for global view type "+p0);
    }
    public c0$c b(q p0){
       return new c0$b$a(this, p0);
    }
    public void c(q p0){
       int i = this.a.size() - 1;
       while (i >= 0) {
          List list = this.a.valueAt(i);
          if (list.remove(p0) && list.isEmpty()) {
             this.a.removeAt(i);
          }
          i = i - 1;
       }
       return;
    }
}
