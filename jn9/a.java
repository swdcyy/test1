package jn9.a;
import java.lang.Runnable;
import jn9.b$a;
import nn9.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import jn9.b;
import nn9.a;
import com.yxcorp.gifshow.component.postlistcomponent.state.LoadingStatus;
import java.util.Iterator;
import java.lang.Iterable;
import jn9.b$b;
import java.util.List;
import java.util.ArrayList;
import trd.u;
import nn9.b;
import mn9.a;

public final class a implements Runnable	// class@002b14
{
    public final b$a b;
    public final d c;
    public final d d;

    public void a(b$a p0,d p1,d p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "1")) {
          return;
       }
       b$a b = this.b.b;
       a tc = this.c;
       a.o(tc, "state");
       a td = this.d;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidTwoRefs(tc, td, b, b.class, "3")) {
          if (td != null) {
             a uoa = td.g();
             if (uoa != null) {
                objArray = uoa.a();
             }
          }
          objArray = (objArray != tc.g().a())? 1: 0;
          Iterator iterator = b.d.iterator();
          while (iterator.hasNext()) {
             b$b uob = iterator.next();
             uob.c(tc, td);
             if (objArray) {
                a uoa1 = tc.g();
                List list = tc.j();
                ArrayList uArrayList = new ArrayList(u.Y(list, 10));
                Iterator iterator1 = list.iterator();
                while (iterator1.hasNext()) {
                   uArrayList.add(iterator1.next().g());
                }
                uob.a(uoa1, uArrayList);
             }
          }
       }
       return;
    }
}
