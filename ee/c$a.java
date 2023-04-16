package ee.c$a;
import java.lang.Runnable;
import ee.c;
import java.lang.Object;
import java.util.Iterator;
import java.util.Set;
import ee.e;

public class c$a implements Runnable	// class@001f3f
{
    public final int b;
    public final c c;

    public void c$a(c p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       Iterator iterator = this.c.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().onHeadlessJsTaskFinish(this.b);
       }
       return;
    }
}
