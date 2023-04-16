package dk3.b;
import wk3.b;
import wk3.f;
import a51.c;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.List;
import dk3.a;
import java.util.Objects;
import crd.b;
import lnc.b9;
import java.lang.IllegalStateException;
import wk3.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class b extends c implements b, f	// class@002520
{
    public f v;
    public boolean w;
    public final List x;

    public void b(){
       super();
       this.x = new LinkedList();
    }
    public boolean E(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.v.E();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       super.E8();
       this.v.f3(this);
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          this.w = true;
          this.V8();
          this.w = false;
          Iterator iterator = this.x.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             b tv = this.v;
             Objects.requireNonNull(uoa);
             if (PatchProxy.applyVoidTwoRefs(this, tv, uoa, a.class, "1")) {
                continue ;
             }
             uoa.b = this;
             uoa.c = tv;
             tv.f3(uoa);
             uoa.c();
          }
       }
       return;
    }
    public final void I1(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       this.v.I1(p0);
       return;
    }
    public void J8(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "3")) {
          return;
       }
       super.J8();
       if (!PatchProxy.applyVoid(null, this, uob, "5")) {
          Iterator iterator = this.x.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             Objects.requireNonNull(uoa);
             if (PatchProxy.applyVoid(null, uoa, a.class, "2")) {
                continue ;
             }else {
                uoa.d();
                b9.a(uoa.d);
                a c = uoa.c;
                if (c != null) {
                   c.I1(uoa);
                   uoa.c = null;
                }
                uoa.b = null;
             }
          }
       }
       this.v.I1(this);
       this.x.clear();
       return;
    }
    public final boolean Q4(){
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.v.Q4();
    }
    public void S8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       if (this.w == null) {
          throw new IllegalStateException("add controller only in onCreateController!");
       }
       this.x.add(p0);
       return;
    }
    public void V8(){
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
    public final void f3(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       this.v.f3(p0);
       return;
    }
    public final boolean isSelected(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.v.isSelected();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.v = this.r8("LIVE_PREVIEW_LIFECYCLE_SERVICE");
       return;
    }
    public final LiveWillShowType m5(){
       Object obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.m5();
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
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.v.w7();
    }
    public void x4(){
       a.g(this);
    }
    public void y1(){
       a.i(this);
    }
}
