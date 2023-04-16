package cl9.y2$b;
import java.lang.Runnable;
import ek9.t0;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pk9.h;
import cl9.y2;

public class y2$b implements Runnable	// class@000686
{
    public t0 b;
    public QComment c;

    public void y2$b(t0 p0,QComment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, y2$b.class, "1")) {
          return;
       }
       this.b.a(y2.P8(this.c));
       return;
    }
}
