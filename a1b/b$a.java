package a1b.b$a;
import java.lang.Runnable;
import a1b.b;
import java.util.List;
import y0b.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a1b.b$a$a;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$e;
import androidx.recyclerview.widget.h;
import a1b.b$a$b;
import java.util.concurrent.Executor;

public class b$a implements Runnable	// class@000014
{
    public final List b;
    public final List c;
    public final int d;
    public final boolean e;
    public final e f;
    public final b g;

    public void b$a(b p0,List p1,List p2,int p3,boolean p4,e p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b.f.execute(new b$a$b(this, h.b(new b$a$a(this))));
       return;
    }
}
