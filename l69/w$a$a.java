package l69.w$a$a;
import java.lang.Runnable;
import l69.w$a;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.aicut.util.a;
import l69.w$a$a$a;
import ekd.k1;
import h69.g;
import l69.w;
import java.lang.Throwable;
import w46.b;
import l69.w$a$a$b;
import java.io.IOException;

public final class w$a$a implements Runnable	// class@002cb1
{
    public final w$a b;
    public final File c;
    public final String d;

    public void w$a$a(w$a p0,File p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, w$a$a.class, "1")) {
          return;
       }
       try{
          a.f(this.c, this.d);
          k1.o(new w$a$a$a(this));
       }catch(java.io.IOException e0){
          g.D().e(w.d(w.e), "failed to unzip resource", e0);
          k1.o(new w$a$a$b(this, e0));
       }
       this.c.delete();
       return;
    }
}
