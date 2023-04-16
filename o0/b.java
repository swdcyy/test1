package o0.b;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import o0.a;
import java.util.Iterator;

public abstract class b	// class@002730
{
    public boolean a;
    public CopyOnWriteArrayList b;

    public void b(boolean p0){
       super();
       this.b = new CopyOnWriteArrayList();
       this.a = p0;
    }
    public void a(a p0){
       this.b.add(p0);
    }
    public abstract void b();
    public final boolean c(){
       return this.a;
    }
    public final void d(){
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().cancel();
       }
       return;
    }
    public void e(a p0){
       this.b.remove(p0);
    }
    public final void f(boolean p0){
       this.a = p0;
    }
}
