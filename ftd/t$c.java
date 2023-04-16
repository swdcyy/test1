package ftd.t$c;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.Runnable;
import java.util.concurrent.RejectedExecutionException;
import java.lang.String;

public final class t$c implements Executor	// class@000eca
{
    public static final t$c b;

    static {
       t$c.b = new t$c();
    }
    public void t$c(){
       super();
    }
    public final void execute(Runnable p0){
       throw new RejectedExecutionException("CommonPool was shutdown");
    }
}
