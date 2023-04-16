package i8a.a$b;
import java.lang.Runnable;
import i8a.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import hn5.i0;

public final class a$b implements Runnable	// class@0027bf
{
    public final a$a b;

    public void a$b(a$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("CaptionLogger", "[uploadLog]["+this.b+']', objArray);
       i0.b("CaptionLogger", a.a.q(this.b));
       return;
    }
}
