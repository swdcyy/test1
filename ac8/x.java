package ac8.x;
import z98.b;
import ma8.i;
import java.lang.Object;
import java.util.BitSet;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import cc8.c;
import android.view.View;
import ma8.g;
import cc8.j;
import java.lang.Number;
import cc8.o;
import java.lang.Integer;

public class x implements b	// class@000076
{
    public final BitSet b;
    public o c;
    public c d;
    public final i e;

    public void x(i p0){
       super();
       this.b = new BitSet();
       this.e = p0;
    }
    public boolean b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x obj = PatchProxy.apply(null, this, x.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = false;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(null, obj, c.class, "2");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             c d = obj.d;
             if (d != null && obj.a.q1(d)) {
                obj.d = null;
                d = obj.e;
                if (d != null) {
                   d.D();
                }
                b = true;
             }
          }
          this.d = null;
       }
       return b;
    }
    public final void d(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       if (PatchProxy.applyVoid(null, this, ox, "7")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, ox, "11");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(!this.b.cardinality()){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          Object obj1 = PatchProxy.apply(null, this, ox, "10");
          int i = (obj1 != patchProxyRe)? obj1.intValue(): this.b.nextSetBit(0);
          if (i != 1) {
             if (i == 2) {
                this.b();
             }
          }else {
             this.e();
          }
       }
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, x.class, "12")) {
          return;
       }
       this.d();
       return;
    }
    public boolean e(){
       x obj = PatchProxy.apply(null, this, x.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       if (obj == null) {
          return false;
       }
       obj.a();
       this.c = null;
       return true;
    }
    public void f(int p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ox, "8")) {
          return;
       }
       this.b.set(p0);
       return;
    }
    public void h(int p0){
       x ox = x.class;
       if (PatchProxy.isSupport(ox) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ox, "9")) {
          return;
       }
       this.b.set(p0, false);
       return;
    }
}
