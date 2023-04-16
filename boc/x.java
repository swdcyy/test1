package boc.x;
import java.lang.Runnable;
import boc.b;
import com.yxcorp.gifshow.util.resource.n$c;
import java.lang.Object;
import com.yxcorp.gifshow.util.resource.n;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public final class x implements Runnable	// class@000453
{
    public final b b;
    public final n$c c;

    public void x(b p0,n$c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       x tb = this.b;
       x tc = this.c;
       Map g = n.g;
       if (g.get(tb) == null) {
          g.put(tb, new HashSet());
       }
       if (tc != null) {
          g.get(tb).add(tc);
       }
       return;
    }
}
