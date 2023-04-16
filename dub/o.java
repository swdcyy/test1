package dub.o;
import java.lang.Runnable;
import dub.y;
import xr4.a$a;
import j9c.d;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;
import java.lang.String;
import k2b.f2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import j9c.a;
import java.util.List;
import java.util.Collections;

public final class o implements Runnable	// class@002579
{
    public final y b;
    public final a$a c;
    public final d d;

    public void o(y p0,a$a p1,d p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       Object[] objArray;
       o tb = this.b;
       o tc = this.c;
       o td = this.d;
       y b = tb.b;
       if (b == null) {
       }else if(!b.d()){
          objArray = new Object[]{Integer.valueOf(tc.g)};
          f2.b("NotifyDispatcher", "init: no observers, destroy notify dispatcher", objArray);
          if (!PatchProxy.applyVoid(null, tb, y.class, "8")) {
             tb.b = null;
             if (tb.a != null) {
                b.a(0x2c71dec4).a(tb.a);
                tb.a = null;
             }
          }
       }else if(!td.e(tc.g)){
          Object[] objArray1 = new Object[]{Integer.valueOf(tc.g)};
          f2.b("NotifyDispatcher", "init: Dot[%1$s] is not enabled", objArray1);
       }else {
          objArray = new Object[]{Integer.valueOf(tc.g)};
          f2.b("NotifyDispatcher", "init: Dot[%1$s] is try to update", objArray);
          tb.b.onNext(Collections.singletonList(Integer.valueOf(tc.g)));
       }
       return;
    }
}
