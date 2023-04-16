package androidx.recyclerview.widget.c0$b$a;
import androidx.recyclerview.widget.c0$c;
import androidx.recyclerview.widget.c0$b;
import androidx.recyclerview.widget.q;
import java.lang.Object;
import android.util.SparseArray;
import java.util.List;
import java.util.ArrayList;

public class c0$b$a implements c0$c	// class@0008ef
{
    public final q a;
    public final c0$b b;

    public void c0$b$a(c0$b p0,q p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public int a(int p0){
       List list = this.b.a.get(p0);
       if (list == null) {
          list = new ArrayList();
          this.b.a.put(p0, list);
       }
       if (!list.contains(this.a)) {
          list.add(this.a);
       }
       return p0;
    }
    public int b(int p0){
       return p0;
    }
    public void dispose(){
       this.b.c(this.a);
    }
}
