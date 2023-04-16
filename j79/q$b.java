package j79.q$b;
import erd.g;
import j79.q;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j79.r;
import java.lang.Enum;
import u79.a;

public final class q$b implements g	// class@00278b
{
    public final q b;

    public void q$b(q p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$b.class, "1")) {
       }else if(p0 == null){
          int i = r.b[p0.ordinal()];
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
