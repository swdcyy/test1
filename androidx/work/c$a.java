package androidx.work.c$a;
import androidx.work.e$a;
import java.lang.Class;
import java.util.concurrent.TimeUnit;
import u3.r;
import androidx.work.e;
import androidx.work.c;
import android.os.Build$VERSION;
import k3.b;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class c$a extends e$a	// class@000a5c
{

    public void c$a(Class p0,long p1,TimeUnit p2){
       super(p0);
       this.c.e(p2.toMillis(p1));
    }
    public e c(){
       return this.h();
    }
    public e$a d(){
       return this;
    }
    public c h(){
       String str = 23;
       if (this.a == null || (Build$VERSION.SDK_INT >= str && this.c.j.h())) {
          throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
       }
       e$a tc = this.c;
       if (tc.q != null && (Build$VERSION.SDK_INT < str || !tc.j.h())) {
          return new c(this);
       }
       throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
    }
}
