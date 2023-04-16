package a58.c;
import java.lang.Runnable;
import com.mini.app.installer.b;
import a58.g;
import java.lang.Object;

public final class c implements Runnable	// class@00002e
{
    public final b b;
    public final g c;

    public void c(b p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       c tb = this.b;
       this.c.a(tb.e, tb.d, tb.f);
    }
}
