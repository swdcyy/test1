package bmd.f$a;
import umd.b;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import t8c.c;
import java.util.Collection;

public final class f$a implements b	// class@000283
{
    public final List a;

    public void f$a(List p0){
       this.a = p0;
       super();
    }
    public void a(String p0,List p1,String p2,int p3){
       String str;
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, f$a.class, "1")) {
          return;
       }
       a.p(p1, "voteOptionList");
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          c uoc = iterator.next();
          if (p0 != null) {
             uoc.N0(p0);
          }
          int i = p1.isEmpty() ^ 1;
          if (i) {
             str = p1.get(0);
             if (str != null) {
                uoc.r1(str);
             }
          }
          if (p1.size() > 1) {
             str = p1.get(1);
             if (str != null) {
                uoc.A1(str);
             }
          }
       }
       return;
    }
}
