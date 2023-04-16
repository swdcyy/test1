package j79.x$b;
import erd.g;
import j79.x;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j79.y;
import java.lang.Enum;
import u79.a;

public final class x$b implements g	// class@002799
{
    public final x b;

    public void x$b(x p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x$b.class, "1")) {
       }else if(p0 == null){
          int i = y.b[p0.ordinal()];
          if (i != 1) {
             if (i == 2) {
                this.b.e.E();
             }
          }else {
             this.b.e.F();
          }
       }
       return;
    }
}
