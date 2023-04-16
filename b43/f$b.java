package b43.f$b;
import e57.a;
import b43.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.live.gzone.floatbar.LivePlayerFloatItem;
import java.util.Map;
import e57.a$a;
import java.util.List;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import e57.b;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;

public class f$b implements a	// class@0002f9
{
    public final f a;

    public void f$b(f p0){
       this.a = p0;
       super();
    }
    public boolean a(long p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.a.W8(p0);
    }
    public void b(LivePlayerFloatItem p0,boolean p1){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       this.a.z.put(p0, Boolean.valueOf(p1));
       this.a.Y8();
       return;
    }
    public void c(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "12")) {
          return;
       }
       this.a.C.remove(p0);
       return;
    }
    public void d(boolean p0){
       f$b uob = f$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "5")) {
          return;
       }
       this.a.S8(p0);
       return;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "10")) {
          return;
       }
       if (p0.getParent() != this.a.u) {
          if (p0.getParent() != null) {
             p0.getParent().removeView(p0);
          }
          this.a.u.addView(p0);
       }
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, f$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.W8(5000);
    }
    public void g(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "11")) {
          return;
       }
       this.a.C.add(p0);
       return;
    }
    public boolean h(LivePlayerFloatItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Boolean.TRUE.equals(this.a.z.get(p0));
    }
    public void i(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "9")) {
          return;
       }
       this.a.B.remove(p0);
       return;
    }
    public void j(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "8")) {
          return;
       }
       this.a.B.add(p0);
       return;
    }
    public boolean k(){
       f$b obj = PatchProxy.apply(null, this, f$b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj.G == null && !obj.x.getVisibility())? true: false;
       return b;
    }
    public boolean l(){
       Iterator obj = PatchProxy.apply(null, this, f$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!q.f(this.a.B)) {
          obj = this.a.B.iterator();
          while (true) {
             if (obj.hasNext()) {
                if (obj.next().p()) {
                   return b;
                }
                continue ;
             }
          }
          return this.a.W8(5000);
       }
       if (!this.a.x.getVisibility()) {
          this.d(true);
          return b;
       }else {
          goto label_0049 ;
       }
    }
}
