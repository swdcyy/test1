package ec9.j;
import ec9.b1;
import com.kwai.framework.mvs.BaseViewModel;
import cc9.b;
import com.yxcorp.gifshow.camera.record.assistant.model.AssistantResponse;
import cc9.g;
import nsd.u;
import sa6.b;
import ec9.a;
import ec9.d1;
import ec9.k;
import ec9.n0;
import ec9.y0;
import ec9.o0;
import ec9.l1;
import ec9.p0;
import ec9.u;
import ec9.t;
import ec9.s;
import ec9.v;
import ec9.i;
import ec9.z0;
import ec9.c1;
import ec9.m1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import sa6.a;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModel;
import ac9.j;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import cc9.c;

public final class j extends BaseViewModel implements b1	// class@002180
{
    public final a i;
    public j j;

    public void j(){
       b uob = v15;
       b uob1 = v15;
       uob = new b(false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, 0x1ffff, null);
       super(uob1);
       a uoa = new a();
       this.i = uoa;
       uoa.d(1, new d1(this, this));
       uoa.d(3, new n0(this, this));
       uoa.d(2, new y0(this, this));
       uoa.d(8, new o0(this, this));
       uoa.d(4, new l1(this, this));
       uoa.d(5, new p0(this, this));
       uoa.d(7, new u(this));
       uoa.d(6, new t(this));
       uoa.d(9, new s(this));
       uoa.d(13, new v(this));
       uoa.d(10, new i(this, this));
       uoa.d(11, new z0(this, this));
       uoa.d(12, new c1(this, this));
       uoa.d(14, new m1(this, this));
    }
    public void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "5")) {
       }else {
          a.p(p0, "newState");
          this.s0(p0);
       }
       return;
    }
    public b j(){
       return this.v0();
    }
    public b o0(a p0,b p1){
       b uob = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "7");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "action");
          a.p(p1, "oldState");
          uob = this.v0();
       }
       return uob;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, j.class, "6")) {
          return;
       }
       super.onCleared();
       this.i.c();
       return;
    }
    public final a t0(){
       return this.i;
    }
    public final j u0(){
       j obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null) {
          a.S("assistDataHelper");
       }
       return obj;
    }
    public b v0(){
       b obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r0().getValue();
       if (obj == null) {
          b uob = new b(false, false, false, false, false, false, null, null, false, false, false, false, false, false, false, false, false, 0x1ffff, null);
       }
       return obj;
    }
    public void w0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "3")) {
          return;
       }
       a.p(p0, "action");
       this.i.a(p0);
       return;
    }
}
