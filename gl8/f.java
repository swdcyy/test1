package gl8.f;
import gl8.e;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import gl8.d;

public final class f implements e	// class@002495
{
    public final List a;

    public void f(){
       super();
       this.a = new ArrayList();
    }
    public void a(Object p0,Object p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void b(d p0){
       this.a.remove(p0);
    }
    public void c(Object p0,Object p1){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0, p1);
       }
       return;
    }
    public void d(d p0){
       this.a.add(p0);
    }
}
