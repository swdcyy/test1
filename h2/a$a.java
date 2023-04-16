package h2.a$a;
import h2.a;
import java.lang.Object;
import android.os.SystemClock;
import java.util.ArrayList;
import h2.a$c;

public class a$a	// class@0020ca
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(){
       this.a.e = SystemClock.uptimeMillis();
       a$a ta = this.a;
       ta.c(ta.e);
       if (this.a.b.size() > 0) {
          this.a.e().a();
       }
       return;
    }
}
