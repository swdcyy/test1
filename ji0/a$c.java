package ji0.a$c;
import java.lang.Runnable;
import ji0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.Callable;
import ji0.a$b;
import ji0.a$b$b;
import kotlin.jvm.internal.a;
import android.os.Handler;

public final class a$c implements Runnable	// class@002bae
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       if (a.g(this.b.call(), a$b$b.a)) {
          this.b.e = true;
          return;
       }else if(this.b.e != null){
          return;
       }else {
          this.b.b().removeCallbacks(this);
          this.b.b().postDelayed(this, this.b.d);
          return;
       }
    }
}
