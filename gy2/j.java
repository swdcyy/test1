package gy2.j;
import gy2.b;
import java.lang.Object;
import java.util.ArrayList;
import gy2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import gy2.b$b;
import java.util.Objects;
import java.util.Collection;
import nsd.s0;
import java.util.List;
import trd.y;
import gy2.b$a;
import gy2.e;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.robust.PatchProxyResult;
import trd.u;
import java.lang.Boolean;

public final class j implements b	// class@002bcf
{
    public final List a;
    public final List b;
    public final List c;

    public void j(){
       super();
       this.a = new ArrayList();
       this.b = new ArrayList();
       this.c = new ArrayList();
    }
    public void a(a p0){
       List obj;
       Object obj1;
       b$b b;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       a.p(p0, "dialog");
       Iterator iterator = this.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             obj = iterator.next();
             if (!a.g(obj.a(), p0)) {
                continue ;
             }
          }else {
             obj = null;
          }
          j ta = this.a;
          Objects.requireNonNull(ta, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
          s0.a(ta).remove(obj);
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             Iterator iterator1 = obj.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   obj1 = iterator1.next();
                   if (!a.g(obj1.a(), p0)) {
                      continue ;
                   }
                }else {
                   obj1 = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                s0.a(obj).remove(obj1);
                if (obj.isEmpty()) {
                   iterator.remove();
                }else {
                   continue ;
                }
             }
          }
          if (this.a.isEmpty()) {
             if (this.c.isEmpty() ^ 0x01) {
                b$b uob = y.L0(this.c);
                b = uob.b;
                if (b != null) {
                   b.show();
                }
                this.a.add(uob);
             }else if(this.b.isEmpty() ^ 0x01){
                Iterator iterator2 = y.N0(this.b).iterator();
                while (iterator2.hasNext()) {
                   b = iterator2.next();
                   b.a().zc();
                   this.a.add(b);
                }
             }
          }
          return;
       }
    }
    public void b(a p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       if (this.a.isEmpty()) {
          if (p1 != null) {
             p1.show();
          }
          this.a.add(new b$b(p0, p1));
          return;
       }else {
          e uoe = p0.D6();
          if (CollectionsKt___CollectionsKt.Y2(this.a).a().D6().b() == 1 && uoe.b() == 1) {
             if (p1 != null) {
                p1.show();
             }
             this.a.add(new b$b(p0, p1));
          }else if(uoe.c() == 1){
             this.c.add(new b$b(p0, p1));
          }else if(uoe.c() == 3){
             Iterator iterator = this.a.iterator();
             while (iterator.hasNext()) {
                iterator.next().a().jc();
             }
             this.b.add(CollectionsKt___CollectionsKt.J5(this.a));
             this.a.clear();
             if (p1 != null) {
                p1.show();
             }
             this.a.add(new b$b(p0, p1));
          }
          return;
       }
    }
    public List c(){
       j obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       ArrayList uArrayList = new ArrayList(u.Y(obj, 10));
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().a());
       }
       return CollectionsKt___CollectionsKt.G5(uArrayList);
    }
    public boolean d(a p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "dialog");
       obj = this.c.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return false;
          }
          if (a.g(obj.next().a(), p0)) {
             break ;
          }
       }
       obj.remove();
       return true;
    }
    public int e(){
       return 1;
    }
}
