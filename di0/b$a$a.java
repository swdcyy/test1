package di0.b$a$a;
import androidx.lifecycle.Observer;
import di0.b;
import msd.p;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import di0.a;
import java.lang.Enum;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;

public final class b$a$a implements Observer	// class@001fa0
{
    public final b b;
    public final p c;

    public void b$a$a(b p0,p p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$a.class, "1")) {
       }else {
          ListHolder$UpdateType updateType = p0.e();
          if (updateType != null) {
             int i = a.a[updateType.ordinal()];
             Object obj = null;
             if (i != 1) {
                if (i != 2) {
                   if (i != 3) {
                      if (i == 4) {
                         b$a$a tb = this.b;
                         List list = p0.c();
                         ArrayList uArrayList = new ArrayList(u.Y(list, 10));
                         Iterator iterator = list.iterator();
                         while (iterator.hasNext()) {
                            uArrayList.add(this.c.invoke(iterator.next(), obj));
                         }
                         tb.s(uArrayList, p0.d());
                      }
                   }else {
                      this.b.w(p0.b(), p0.d());
                   }
                }else {
                   this.b.y(p0.b(), this.c.invoke(p0.c().get(p0.b()), this.b.u(p0.b())), p0.d());
                }
             }else {
                this.b.q(this.c.invoke(p0.c().get(p0.b()), obj), p0.b(), p0.d());
             }
          }
       }
       return;
    }
}
