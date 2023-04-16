package gl8.b;
import gl8.a;
import java.lang.Object;
import java.util.ArrayList;
import kl8.b;
import java.util.List;
import el8.d;
import java.util.Iterator;

public final class b implements a	// class@002491
{
    public final List a;

    public void b(){
       super();
       this.a = new ArrayList();
    }
    public void b(b p0){
       this.a.remove(p0);
    }
    public void c(d p0,boolean p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0, p1);
       }
       return;
    }
    public void d(d p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       return;
    }
    public void f(b p0){
       this.a.add(p0);
    }
    public void j(){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().j();
       }
       return;
    }
    public void n(boolean p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().n(p0);
       }
       return;
    }
}
