package bolts.Task$b;
import bolts.a;
import bolts.Task;
import y3.g;
import java.util.concurrent.Executor;
import y3.c;
import java.lang.Object;

public class Task$b implements a	// class@000b59
{
    public final g a;
    public final a b;
    public final Executor c;
    public final c d;
    public final Task e;

    public void Task$b(Task p0,g p1,a p2,Executor p3,c p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public Object a(Task p0){
       Task.completeAfterTask(this.a, this.b, p0, this.c, this.d);
       return null;
    }
}
