package kv8.c;
import kv8.a;
import android.app.Activity;
import java.lang.String;
import fv8.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kv8.c$a;
import kv8.b;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public final class c extends a	// class@002c22
{
    public b b;
    public Handler c;

    public void c(Activity p0){
       super(p0);
    }
    public void a(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       this.b = p1;
       this.c = new c$a(this.b);
       c.k(new b(this, p0));
       return;
    }
    public boolean a(){
       return true;
    }
}
