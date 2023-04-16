package bolts.Task$o;
import bolts.a;
import bolts.Task;
import y3.c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import y3.f;
import java.lang.Object;
import java.lang.Boolean;

public class Task$o implements a	// class@000b67
{
    public final c a;
    public final Callable b;
    public final a c;
    public final Executor d;
    public final f e;
    public final Task f;

    public void Task$o(Task p0,c p1,Callable p2,a p3,Executor p4,f p5){
       this.f = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       super();
    }
    public Object a(Task p0){
       Task$o ta = this.a;
       if (ta != null && ta.a()) {
          ta = Task.cancelled();
       }else {
          Object obj = null;
          ta = (this.b.call().booleanValue())? Task.forResult(obj).onSuccessTask(this.c, this.d).onSuccessTask(this.e.a(), this.d): Task.forResult(obj);
       }
       return ta;
    }
}
