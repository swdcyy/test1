package a58.n;
import java.lang.Runnable;
import com.mini.app.installer.f;
import java.lang.String;
import java.lang.Object;
import com.mini.app.installer.f$d;

public final class n implements Runnable	// class@00003a
{
    public final f b;
    public final String c;

    public void n(f p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       n tc = this.c;
       f j = this.b.j;
       if (j != null) {
          j.a(tc);
       }
       return;
    }
}
