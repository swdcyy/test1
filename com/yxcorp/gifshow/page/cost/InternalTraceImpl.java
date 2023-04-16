package com.yxcorp.gifshow.page.cost.InternalTraceImpl;
import rvb.a;
import rvb.k$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import rvb.h;
import com.yxcorp.gifshow.page.cost.InternalTraceImpl$tracerGetter$1;
import rvb.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import rvb.a$a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import rvb.c$a;
import androidx.lifecycle.LifecycleOwner;
import rvb.n;
import java.util.Objects;
import java.util.Map;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.page.cost.InternalTraceImpl$attachTo$1;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.robust.PatchProxyResult;

public final class InternalTraceImpl implements a	// class@000e13
{
    public final String a;
    public LifecycleOwner b;
    public final h c;
    public final a d;
    public final k$a e;

    public void InternalTraceImpl(k$a p0){
       a.p(p0, "registry");
       super();
       this.e = p0;
       this.a = "ST_Intern["+p0.a();
       this.c = new h(p0);
       this.d = new InternalTraceImpl$tracerGetter$1(this);
    }
    public boolean V(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public void a(f p0,long p1){
       InternalTraceImpl internalTrac = InternalTraceImpl.class;
       if (PatchProxy.isSupport(internalTrac) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, internalTrac, "7")) {
          return;
       }
       a.p(p0, "stage");
       a$a.d(this, p0, p1);
       Iterator iterator = this.c.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0.f);
       }
       return;
    }
    public void abort(){
       if (PatchProxy.applyVoid(null, this, InternalTraceImpl.class, "8")) {
          return;
       }
       this.clean();
       return;
    }
    public void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InternalTraceImpl.class, "11")) {
          return;
       }
       a.p(p0, "stage");
       a$a.c(this, p0);
       return;
    }
    public LifecycleOwner c(){
       return this.b;
    }
    public void clean(){
       if (PatchProxy.applyVoid(null, this, InternalTraceImpl.class, "5")) {
          return;
       }
       n c = n.c;
       Objects.requireNonNull(c);
       Objects.requireNonNull(c);
       n.a.put(this.e.b(), n.b);
       return;
    }
    public void d(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InternalTraceImpl.class, "4")) {
          return;
       }
       a.p(p0, "owner");
       StringBuilder str = "attachTo: "+p0;
       this.b = p0;
       p0.getLifecycle().addObserver(new InternalTraceImpl$attachTo$1(this));
       Iterator iterator = this.c.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0);
       }
       return;
    }
    public void e(f p0,long p1){
       InternalTraceImpl internalTrac = InternalTraceImpl.class;
       if (PatchProxy.isSupport(internalTrac) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, internalTrac, "6")) {
          return;
       }
       a.p(p0, "stage");
       a$a.b(this, p0, p1);
       Iterator iterator = this.c.a().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0.e);
       }
       return;
    }
    public void f(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, InternalTraceImpl.class, "10")) {
          return;
       }
       a.p(p0, "stage");
       a$a.a(this, p0);
       return;
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, InternalTraceImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.a();
    }
    public void h(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, InternalTraceImpl.class, "9")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       return;
    }
}
