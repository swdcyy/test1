package l1.b$a;
import java.lang.Runnable;
import l1.b$d;
import java.lang.Object;

public class b$a implements Runnable	// class@0024ec
{
    public final b$d b;
    public final Object c;

    public void b$a(b$d p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       this.b.b = this.c;
    }
}
