package androidx.recyclerview.widget.c0$a$a;
import androidx.recyclerview.widget.c0$c;
import androidx.recyclerview.widget.c0$a;
import androidx.recyclerview.widget.q;
import java.lang.Object;
import android.util.SparseIntArray;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public class c0$a$a implements c0$c	// class@0008ed
{
    public SparseIntArray a;
    public SparseIntArray b;
    public final q c;
    public final c0$a d;

    public void c0$a$a(c0$a p0,q p1){
       this.d = p0;
       super();
       this.a = new SparseIntArray(1);
       this.b = new SparseIntArray(1);
       this.c = p1;
    }
    public int a(int p0){
       int i = this.a.indexOfKey(p0);
       if (i > -1) {
          return this.a.valueAt(i);
       }
       i = this.d.c(this.c);
       this.a.put(p0, i);
       this.b.put(i, p0);
       return i;
    }
    public int b(int p0){
       int i = this.b.indexOfKey(p0);
       if (i >= 0) {
          return this.b.valueAt(i);
       }
       throw new IllegalStateException("requested global type "+p0+" does not belong to the adapter:"+this.c.c);
    }
    public void dispose(){
       this.d.d(this.c);
    }
}
