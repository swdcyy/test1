package dnc.b1;
import java.lang.Runnable;
import java.util.List;
import java.lang.Object;
import java.util.Iterator;
import java.lang.String;
import qkd.c;

public final class b1 implements Runnable	// class@00228b
{
    public final List b;

    public void b1(List p0){
       this.b = p0;
    }
    public final void run(){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          c.f(iterator.next());
       }
       return;
    }
}
