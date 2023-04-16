package n66.d;
import java.lang.Runnable;
import com.kwai.framework.exceptionhandler.a;
import java.lang.Object;

public final class d implements Runnable	// class@001f0d
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void run(){
       a.a(this.b);
       throw null;
    }
}
