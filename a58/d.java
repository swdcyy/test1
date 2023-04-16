package a58.d;
import java.lang.Runnable;
import h88.g;
import java.util.List;
import java.lang.Object;
import zi8.g1;
import java.lang.String;
import k68.a;
import com.mini.app.runtime.f;
import k68.o;
import p68.b;

public final class d implements Runnable	// class@00002f
{
    public final g b;
    public final List c;

    public void d(g p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       d tb = this.b;
       d tc = this.c;
       long l = g1.a();
       tb.c("kswebview_so_group", l, 0);
       tc.add("kswebview_so_group");
       tb.e(tc, l, 0);
       a.d.b().R.d(false);
    }
}
