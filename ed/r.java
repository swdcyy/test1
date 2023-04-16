package ed.r;
import ed.x;
import java.lang.Object;
import com.facebook.imagepipeline.memory.BasePool;

public class r implements x	// class@001539
{
    public static r a;

    public void r(){
       super();
    }
    public static synchronized r h(){
       _monitor_enter(r.class);
       if (r.a == null) {
          r.a = new r();
       }
       _monitor_exit(r.class);
       return r.a;
    }
    public void a(int p0){
    }
    public void b(int p0){
    }
    public void c(){
    }
    public void d(int p0){
    }
    public void e(int p0){
    }
    public void f(){
    }
    public void g(BasePool p0){
    }
}
