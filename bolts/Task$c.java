package bolts.Task$c;
import bolts.a;
import bolts.Task;
import y3.c;
import java.lang.Object;
import java.lang.Exception;

public class Task$c implements a	// class@000b5a
{
    public final c a;
    public final a b;
    public final Task c;

    public void Task$c(Task p0,c p1,a p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public Object a(Task p0){
       Task$c ta = this.a;
       if (ta != null && ta.a()) {
          p0 = Task.cancelled();
       }else if(p0.isFaulted()){
          p0 = Task.forError(p0.getError());
       }else if(p0.isCancelled()){
          p0 = Task.cancelled();
       }else {
          p0 = p0.continueWith(this.b);
       }
       return p0;
    }
}
