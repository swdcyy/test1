package dk3.a;
import wk3.b;
import wk3.f;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Object;
import crd.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wk3.a;
import crd.b;
import java.util.Objects;
import androidx.lifecycle.Lifecycle;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class a implements b, f, LifecycleOwner	// class@00251f
{
    public LifecycleOwner b;
    public f c;
    public final a d;

    public void a(){
       super();
       this.d = new a();
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(this.c).E();
    }
    public final void I1(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       this.b(this.c).I1(p0);
       return;
    }
    public final boolean Q4(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(this.c).Q4();
    }
    public void W4(){
       a.e(this);
    }
    public void X4(boolean p0){
       a.a(this, p0);
    }
    public void Y4(){
       a.d(this);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       if (!p0.isDisposed()) {
          this.d.c(p0);
       }
       return;
    }
    public final Object b(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "controller is not bind!");
       return p0;
    }
    public void c(){
    }
    public void d(){
    }
    public final void f3(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       this.b(this.c).f3(p0);
       return;
    }
    public Lifecycle getLifecycle(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(this.b).getLifecycle();
    }
    public final boolean isSelected(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(this.c).isSelected();
    }
    public final LiveWillShowType m5(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(this.c).m5();
    }
    public void onPause(){
       a.b(this);
    }
    public void onResume(){
       a.c(this);
    }
    public void t4(LiveWillShowType p0){
       a.h(this, p0);
    }
    public void t7(){
       a.f(this);
    }
    public final boolean w7(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(this.c).w7();
    }
    public void x4(){
       a.g(this);
    }
    public void y1(){
       a.i(this);
    }
}
