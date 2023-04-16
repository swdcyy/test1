package bo.o;
import java.lang.Runnable;
import bo.m;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.aegon.AegonLoggerDispatcher;

public final class o implements Runnable	// class@0002a8
{
    public final m b;
    public final String c;

    public void o(m p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.b(this.c);
    }
}
