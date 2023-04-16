package bolts.Task$f$a;
import bolts.a;
import bolts.Task$f;
import java.lang.Object;
import bolts.Task;
import y3.c;
import y3.g;
import java.lang.Exception;

public class Task$f$a implements a	// class@000b5d
{
    public final Task$f a;

    public void Task$f$a(Task$f p0){
       this.a = p0;
       super();
    }
    public Object a(Task p0){
       Task$f b = this.a.b;
       if (b != null && b.a()) {
          this.a.c.b();
       }else if(p0.isCancelled()){
          this.a.c.b();
       }else if(p0.isFaulted()){
          this.a.c.c(p0.getError());
       }else {
          this.a.c.d(p0.getResult());
       }
       return null;
    }
}
