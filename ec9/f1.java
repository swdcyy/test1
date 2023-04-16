package ec9.f1;
import ec9.b1;
import com.kwai.framework.mvs.BaseViewModel;
import cc9.q;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import nsd.u;
import sa6.b;
import ec9.a;
import ec9.o;
import ec9.k;
import ec9.g1;
import ec9.a1;
import ec9.z;
import ec9.i1;
import ec9.q;
import ec9.e0;
import ec9.n1;
import ec9.h1;
import ec9.n;
import ec9.l0;
import ec9.m0;
import ec9.h0;
import ec9.w;
import ec9.l;
import ec9.k0;
import ec9.e1;
import ec9.v0;
import ec9.q0;
import ec9.r;
import ec9.o1;
import ec9.p;
import ec9.m;
import ec9.i0;
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

public final class f1 extends BaseViewModel implements b1	// class@002173
{
    public final a i;
    public j j;

    public void f1(){
       q oq = new q(new HashMap(), -1, -1, new ArrayList(), false, false, false, false, 240, null);
       super(v11);
       a uoa = new a();
       this.i = uoa;
       uoa.d(10, new o(this));
       uoa.d(0, new g1(this, this));
       uoa.d(4, new a1(this, this));
       uoa.d(13, new z(this, this));
       uoa.d(1, new i1(this, this));
       uoa.d(20, new q(this));
       uoa.d(22, new e0(this, this));
       uoa.d(2, new n1(this, this));
       uoa.d(3, new h1(this, this));
       uoa.d(30, new n(this));
       uoa.d(14, new l0(this, this));
       uoa.d(24, new m0(this, this));
       uoa.d(40, new h0(this, this));
       uoa.d(31, new w(this, this));
       uoa.d(41, new l(this));
       uoa.d(32, new k0(this, this));
       uoa.d(5, new e1(this, this));
       uoa.d(50, new v0(this, this));
       uoa.d(51, new q0(this, this));
       uoa.d(52, new r(this));
       uoa.d(53, new o1(this));
       uoa.d(54, new p(this));
       uoa.d(55, new m(this));
       uoa.d(56, new i0(this, this));
    }
    public void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1.class, "5")) {
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
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f1.class, "3");
       if (obj != PatchProxyResult.class) {
          p1 = obj;
       }else {
          a.p(p0, "action");
          a.p(p1, "oldState");
       }
       return p1;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, f1.class, "7")) {
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
       f1 obj = PatchProxy.apply(null, this, f1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null) {
          a.S("assistDataHelper");
       }
       return obj;
    }
    public q v0(){
       q obj = PatchProxy.apply(null, this, f1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r0().getValue();
       if (obj == null) {
          q oq = new q(new HashMap(), -1, -1, new ArrayList(), false, false, false, false, 224, null);
       }
       return obj;
    }
    public void w0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1.class, "6")) {
          return;
       }
       a.p(p0, "action");
       this.i.a(p0);
       return;
    }
}
