package dc5.a;
import java.lang.Runnable;
import dc5.b;
import java.lang.Object;
import java.util.Iterator;
import java.util.Queue;
import q87.d;
import q87.e;

public final class a implements Runnable	// class@0014ad
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Iterator iterator = tb.c.iterator();
       while (iterator.hasNext()) {
          tb.a.d(iterator.next());
       }
       tb.c.clear();
       return;
    }
}
