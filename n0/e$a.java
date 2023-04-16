package n0.e$a;
import n0.e$c;
import n0.e;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n0.e$e;
import java.lang.Runnable;
import java.util.concurrent.Future;

public class e$a implements e$c	// class@0026aa
{
    public ExecutorService a;
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
       this.a = Executors.newSingleThreadExecutor();
    }
    public void a(e$e p0){
       this.a.submit(p0);
    }
}
