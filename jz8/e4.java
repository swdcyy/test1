package jz8.e4;
import com.google.common.collect.ImmutableTable$a;
import java.lang.Object;
import com.google.common.collect.ImmutableTable;
import jz8.e4$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import jz8.d4;
import java.lang.Runnable;
import t45.c;
import java.util.Iterator;

public class e4	// class@0029f9
{
    public final ImmutableTable a;

    public void e4(ImmutableTable$a p0){
       super();
       this.a = p0.a();
    }
    public void a(Object p0,Object p1,e4$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, e4.class, "1")) {
          return;
       }
       if (p0 == p1) {
          return;
       }
       List list = this.a.get(p0, p1);
       if (list == null) {
          c.a(new d4(p0, p1));
          return;
       }else {
          p0 = list.iterator();
          while (p0.hasNext()) {
             p2.a(p0.next());
          }
          return;
       }
    }
}
