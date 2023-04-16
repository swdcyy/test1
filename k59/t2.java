package k59.t2;
import k59.e2;
import androidx.lifecycle.MutableLiveData;
import java.util.LinkedHashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import msd.a;
import k59.t2$a;

public final class t2 extends MutableLiveData implements e2	// class@002b1e
{
    public final Set b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;

    public void t2(){
       super();
       this.b = new LinkedHashSet();
       this.g = "";
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, t2.class, "3")) {
          return;
       }
       this.setValue(Boolean.TRUE);
       return;
    }
    public boolean b(){
       return this.d;
    }
    public void c(){
       this.c = true;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, t2.class, "2")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          this.removeObserver(iterator.next());
       }
       this.b.clear();
       return;
    }
    public boolean e(){
       return this.e;
    }
    public void f(){
       this.e = true;
    }
    public boolean h(){
       return this.c;
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, t2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g(this.getValue(), Boolean.TRUE);
    }
    public String k(){
       return this.g;
    }
    public void l(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t2.class, "4")) {
          return;
       }
       a.p(p0, "reload");
       a.p(p1, "nonReload");
       if (this.j()) {
          int i = (this.c == null || (this.f != null && (this.d != null || this.e != null)))? 1: 0;
          if (i) {
             this.d();
          }
          this.setValue(Boolean.FALSE);
          if (i) {
             p0.invoke();
          }else {
             p1.invoke();
          }
       }else {
          p0.invoke();
       }
       return;
    }
    public void m(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t2.class, "6")) {
          return;
       }
       a.p(p0, "callback");
       if (this.j()) {
          this.observeForever(new t2$a(this, p0));
       }else {
          p0.invoke();
       }
       return;
    }
    public void n(String p0){
       if (p0 != null) {
          this.g = p0;
       }
       return;
    }
    public void o(boolean p0){
       this.f = p0;
    }
    public void observeForever(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t2.class, "1")) {
          return;
       }
       a.p(p0, "observer");
       super.observeForever(p0);
       this.b.add(p0);
       return;
    }
    public void p(){
       this.d = true;
    }
}
