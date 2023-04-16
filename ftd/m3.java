package ftd.m3;
import kotlinx.coroutines.CoroutineDispatcher;
import java.lang.String;
import kotlin.coroutines.CoroutineContext;
import java.lang.Runnable;
import ftd.o3;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.UnsupportedOperationException;

public final class m3 extends CoroutineDispatcher	// class@00165c
{
    public static final m3 c;

    static {
       m3.c = new m3();
    }
    public void m3(){
       super();
    }
    public String toString(){
       return "Unconfined";
    }
    public void u(CoroutineContext p0,Runnable p1){
       o3 oo3 = p0.get(o3.c);
       if (oo3 == null) {
          throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
       }
       oo3.b = true;
       return;
    }
    public boolean x(CoroutineContext p0){
       return false;
    }
}
