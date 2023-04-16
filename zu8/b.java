package zu8.b;
import zu8.a;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Throwable;
import java.util.Iterator;
import java.util.List;
import java.lang.String;
import java.util.Map;
import java.lang.reflect.Type;

public class b implements a	// class@002979
{
    public final List a;

    public void b(){
       super();
       this.a = new CopyOnWriteArrayList();
    }
    public void a(Throwable p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void b(long p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void c(Throwable p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public void d(String p0){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       return;
    }
    public void e(){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().e();
       }
       return;
    }
    public void f(){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       return;
    }
    public void g(Map p0,String p1,Map p2){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().g(p0, p1, p2);
       }
       return;
    }
    public void h(String p0,Type p1,Throwable p2){
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().h(p0, p1, p2);
       }
       return;
    }
    public void i(a p0){
       if (p0 == null) {
          return;
       }
       this.a.add(p0);
       return;
    }
}
