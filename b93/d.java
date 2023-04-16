package b93.d;
import androidx.lifecycle.LifecycleOwner;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gq3.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Lifecycle$State;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.viewcontroller.ViewControllerManagerImpl;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewHost;
import com.kuaishou.live.viewcontroller.ViewHost$Companion;
import android.content.Context;
import eq3.d;
import java.lang.IllegalStateException;
import c93.b;
import b93.e;
import b93.f;
import b93.a;
import java.util.List;
import z1.i;
import d93.a;
import b93.g;
import b93.b;
import d93.b;
import b93.d$a;
import com.kuaishou.live.viewcontroller.lifecycle.LifecyclesExt;
import androidx.lifecycle.Lifecycle;
import b93.c;
import androidx.lifecycle.LifecycleObserver;
import android.view.View;
import ok.n;

public class d extends PresenterV2 implements LifecycleOwner	// class@000375
{
    public ViewControllerManagerImpl p;
    public final a q;
    public Lifecycle r;
    public final List s;
    public final List t;
    public final List u;

    public void d(){
       super();
       this.q = new a();
       this.s = new ArrayList();
       this.t = new ArrayList();
       this.u = new ArrayList();
    }
    public void E8(){
       PatchProxy.applyVoid(null, this, d.class, "7");
    }
    public void F8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "1")) {
          return;
       }
       this.q.getLifecycle().setCurrentState(Lifecycle$State.RESUMED);
       ViewControllerManagerImpl viewControll = PatchProxy.apply(objArray, this, uod, "3");
       if (viewControll != PatchProxyResult.class) {
       }else {
          viewControll = new ViewControllerManagerImpl(this, this.getActivity(), this.getActivity(), ViewHost.a.a());
       }
       this.p = viewControll;
       return;
    }
    public void H8(){
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       this.q.getLifecycle().setCurrentState(Lifecycle$State.DESTROYED);
       return;
    }
    public final d P8(){
       d obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj != null) {
          return obj;
       }
       throw new IllegalStateException("在onCreate之后才能调用");
    }
    public final void R8(b p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "11")) {
          return;
       }
       f uof = new f(this.getClass(), p0, this.t, new a(this, p1));
       this.X8(uof);
       uof.a = false;
       return;
    }
    public final void S8(a p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "12")) {
          return;
       }
       g og = new g(this.getClass(), p0, this.u, new b(this, p1));
       this.Y8(og);
       og.a = false;
       return;
    }
    public final void V8(b p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "10")) {
          return;
       }
       d$a uoa = new d$a(this, this.getClass(), p1, p0);
       this.Z8(uoa);
       uoa.a = false;
       return;
    }
    public final void W8(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "13")) {
          return;
       }
       Lifecycle lifecycle = LifecyclesExt.a(this.q, p0).getLifecycle();
       this.r = lifecycle;
       lifecycle.addObserver(new c(this));
       return;
    }
    public void X8(b p0){
    }
    public void Y8(a p0){
    }
    public void Z8(b p0){
    }
    public void a9(){
    }
    public void b9(){
    }
    public final void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, d.class, "4");
    }
    public Activity getActivity(){
       Activity obj = PatchProxy.apply(null, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getActivity();
       n.j(obj);
       return obj;
    }
    public Lifecycle getLifecycle(){
       return this.r;
    }
    public final void j8(){
       PatchProxy.applyVoid(null, this, d.class, "5");
    }
    public View m8(){
       Object obj = PatchProxy.apply(null, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.m8();
    }
    public void onPause(){
    }
    public void onResume(){
    }
}
