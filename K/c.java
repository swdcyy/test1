package k.c;
import java.lang.Object;
import k.c$b;
import java.lang.String;
import com.kuaishou.security.kste.logic.base.KSTEContext;
import k.c$a;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;

public class c	// class@00244f
{

    public void c(){
       super();
    }
    public static c a(){
       return c$b.a;
    }
    public void b(String p0){
       KSTEContext.ksteThreadPool.execute(new c$a(this, p0));
    }
}
