package ya.c;
import ya.g;
import ya.b;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.lang.String;
import java.util.concurrent.BlockingQueue;
import java.lang.Runnable;

public class c extends b implements g	// class@00286a
{

    public void c(Executor p0){
       super("SerialExecutor", 1, p0, new LinkedBlockingQueue());
    }
    public synchronized void execute(Runnable p0){
       super.execute(p0);
    }
}
