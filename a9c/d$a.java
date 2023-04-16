package a9c.d$a;
import java.lang.Runnable;
import a9c.d;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a9c.d$a$a;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import a9c.b;
import a9c.d$a$b;
import java.util.concurrent.Executor;

public class d$a implements Runnable	// class@0000b3
{
    public final List b;
    public final List c;
    public final int d;
    public final d e;

    public void d$a(d p0,List p1,List p2,int p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       this.e.b.a.execute(new d$a$b(this, h.b(new d$a$a(this))));
       return;
    }
}
