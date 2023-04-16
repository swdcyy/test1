package a68.b;
import java.lang.Runnable;
import mh8.b$a;
import java.lang.Object;
import zi8.n1;
import java.lang.Boolean;
import java.lang.String;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import nh8.b;

public final class b implements Runnable	// class@00003e
{
    public final b$a b;

    public void b(b$a p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       if (!tb.c.a().booleanValue()) {
          tb.a.d(0x49f9f, "time out 3s", null);
       }
       return;
    }
}
