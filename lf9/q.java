package lf9.q;
import lf9.m;
import com.kwai.framework.mvs.BaseViewModel;
import kf9.f;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import nsd.u;
import sa6.b;
import lf9.a;
import kf9.g;
import lf9.d;
import lf9.b;
import lf9.n;
import lf9.l;
import lf9.e;
import lf9.p;
import lf9.k;
import lf9.j;
import lf9.r;
import lf9.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import sa6.a;
import androidx.lifecycle.ViewModel;
import java.util.Objects;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import lf9.c;
import java.lang.Runnable;

public final class q extends BaseViewModel implements m	// class@002ddd
{
    public final a i;
    public final g j;
    public Runnable k;
    public int l;

    public void q(){
       f uof = new f(new HashMap(), -1, -1, new ArrayList(), false, false, 48, null);
       super(v9);
       a uoa = new a();
       this.i = uoa;
       this.j = new g();
       uoa.c(5, new d(this));
       uoa.c(0, new n(this, this));
       uoa.c(4, new l(this, this));
       uoa.c(7, new e(this));
       uoa.c(1, new p(this, this));
       uoa.c(8, new k(this, this));
       uoa.c(9, new j(this, this));
       uoa.c(2, new r(this, this));
       uoa.c(3, new o(this, this));
    }
    public void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "3")) {
       }else {
          a.p(p0, "newState");
          this.s0(p0);
       }
       return;
    }
    public b j(){
       f uof = PatchProxy.apply(null, this, q.class, "2");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = this.r0().getValue();
          if (uof == null) {
             f uof1 = new f(new HashMap(), -1, -1, new ArrayList(), false, false, 32, null);
          }
       }
       return uof;
    }
    public b o0(a p0,b p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          p1 = obj;
       }else {
          a.p(p0, "action");
          a.p(p1, "oldState");
       }
       return p1;
    }
    public void onCleared(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, q.class, "5")) {
          return;
       }
       super.onCleared();
       q ti = this.i;
       Objects.requireNonNull(ti);
       if (!PatchProxy.applyVoid(objArray, ti, a.class, "2")) {
          Iterator iterator = ti.a.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().b();
          }
       }
       return;
    }
    public final a t0(){
       return this.i;
    }
    public final g u0(){
       return this.j;
    }
    public void v0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "4")) {
          return;
       }
       a.p(p0, "action");
       this.i.a(p0);
       return;
    }
    public final void w0(){
       if (PatchProxy.applyVoid(null, this, q.class, "6")) {
          return;
       }
       q tk = this.k;
       if (tk != null) {
          tk.run();
       }
       return;
    }
}
