package eq9.b;
import java.lang.Object;
import java.util.LinkedHashMap;
import eq9.a;
import erd.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class b	// class@002229
{
    public final Map a;
    public final Map b;

    public void b(){
       super();
       this.a = new LinkedHashMap();
       this.b = new LinkedHashMap();
    }
    public final void a(a p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "pair");
       a.p(p1, "consumer");
       if (this.b.get(p0.a()) == null) {
          this.b.put(p0.a(), new CopyOnWriteArrayList());
       }
       CopyOnWriteArrayList uCopyOnWrite = this.b.get(p0.a());
       if (uCopyOnWrite != null) {
          uCopyOnWrite.add(p1);
       }
       p0 = p0.b();
       if (p0 != null) {
          p1.accept(p0);
       }
       return;
    }
    public final void b(a p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       a.p(p0, "pair");
       if (this.b.get(p0.a()) == null) {
          return;
       }
       if (p0.b() != null) {
          p0.b = p1;
       }
       p0 = this.b.get(p0.a());
       a.m(p0);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          g og = iterator.next();
          Objects.requireNonNull(og, "null cannot be cast to non-null type io.reactivex.functions.Consumer<T>");
          og.accept(p1);
       }
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.a.clear();
       this.b.clear();
       return;
    }
}
