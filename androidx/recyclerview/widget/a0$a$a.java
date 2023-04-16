package androidx.recyclerview.widget.a0$a$a;
import androidx.recyclerview.widget.a0$d;
import androidx.recyclerview.widget.a0$a;
import java.lang.Object;
import androidx.collection.LongSparseArray;
import java.lang.Long;

public class a0$a$a implements a0$d	// class@0008df
{
    public final LongSparseArray a;
    public final a0$a b;

    public void a0$a$a(a0$a p0){
       this.b = p0;
       super();
       this.a = new LongSparseArray();
    }
    public long a(long p0){
       Long longx = this.a.get(p0);
       if (longx == null) {
          longx = Long.valueOf(this.b.b());
          this.a.put(p0, longx);
       }
       return longx.longValue();
    }
}
