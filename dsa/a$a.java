package dsa.a$a;
import java.lang.Runnable;
import dsa.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a$a implements Runnable	// class@00250e
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       if (this.b.a.y8()) {
          return;
       }
       a$a tb = this.b;
       tb.a.i(tb.d);
       this.b.c = true;
       return;
    }
}
