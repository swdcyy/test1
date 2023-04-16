package il9.a;
import java.lang.Object;
import java.util.LinkedList;
import il9.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import il9.e;
import android.graphics.Canvas;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Long;

public abstract class a	// class@002863
{
    public final LinkedList a;
    public final LinkedList b;
    public int c;
    public int d;

    public void a(){
       super();
       this.a = new LinkedList();
       this.b = new LinkedList();
    }
    public void a(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public abstract void b(int p0,e p1);
    public abstract f c();
    public void d(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().draw(p0);
       }
       return;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.size() > 0)? true: false;
       return b;
    }
    public final f f(){
       f obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.poll();
       if (obj == null) {
          obj = this.c();
       }
       return obj;
    }
    public void g(){
       this.c = 0;
       this.d = 0;
    }
    public void h(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       p0.a();
       this.b.add(p0);
       return;
    }
    public void i(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "1")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          f uof = iterator.next();
          if (!uof.isValid()) {
             iterator.remove();
             this.h(uof);
          }else {
             uof.b(p0);
          }
       }
       return;
    }
    public void j(int p0,int p1){
       this.c = p0;
       this.d = p1;
    }
}
