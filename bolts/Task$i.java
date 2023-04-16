package bolts.Task$i;
import bolts.a;
import bolts.Task;
import java.lang.Object;
import java.lang.Exception;

public class Task$i implements a	// class@000b61
{
    public final Task a;

    public void Task$i(Task p0){
       this.a = p0;
       super();
    }
    public Object a(Task p0){
       if (p0.isCancelled()) {
          p0 = Task.cancelled();
       }else if(p0.isFaulted()){
          p0 = Task.forError(p0.getError());
       }else {
          p0 = Task.forResult(null);
       }
       return p0;
    }
}
