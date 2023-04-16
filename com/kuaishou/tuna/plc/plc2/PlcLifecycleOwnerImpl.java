package com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl;
import u06.c;
import u06.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$mLifecycleSubject$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$mErrorLnrs$2;
import mrd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import x06.a;
import java.lang.Integer;
import y06.a;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$b;
import erd.r;
import brd.t;
import erd.g;
import sy4.n;
import crd.b;
import java.lang.Throwable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import brd.y;
import x06.b;
import x06.c;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$c;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$d;
import com.kuaishou.tuna.plc.plc2.PlcLifecycleOwnerImpl$a;

public final class PlcLifecycleOwnerImpl implements c	// class@00104b
{
    public final p a;
    public final p b;
    public final a c;

    public void PlcLifecycleOwnerImpl(a p0){
       a.p(p0, "plc");
       super();
       this.c = p0;
       this.a = s.c(PlcLifecycleOwnerImpl$mLifecycleSubject$2.INSTANCE);
       this.b = s.c(PlcLifecycleOwnerImpl$mErrorLnrs$2.INSTANCE);
    }
    public final c A(){
       Object obj = PatchProxy.apply(null, this, PlcLifecycleOwnerImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final a B(){
       return this.c;
    }
    public final void C(int p0,a p1){
       PlcLifecycleOwnerImpl plcLifecycle = PlcLifecycleOwnerImpl.class;
       if (PatchProxy.isSupport(plcLifecycle) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, plcLifecycle, "5")) {
          return;
       }
       a uoa = this.c.g();
       if (uoa != null) {
          t ot = this.A().filter(new PlcLifecycleOwnerImpl$b(p0));
          n on = PatchProxy.applyOneRefs(p1, this, plcLifecycle, "4");
          if (on != PatchProxyResult.class) {
          }else {
             on = new n(this, p1);
          }
          b uob = ot.subscribe(on, this.y(p1));
          a.o(uob, "mLifecycleSubject\n      ¡­izConsumer\)\n            \)");
          uoa.a(uob);
       }
       return;
    }
    public final void D(Throwable p0){
       PlcLifecycleOwnerImpl plcLifecycle = PlcLifecycleOwnerImpl.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, plcLifecycle, "54")) {
          return;
       }
       a.p(p0, "throwable");
       if (!PatchProxy.applyVoidOneRefs(p0, this, plcLifecycle, "55")) {
          Iterator iterator = this.z().entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().a().accept(p0);
          }
       }
       return;
    }
    public final void E(){
       if (PatchProxy.applyVoid(null, this, PlcLifecycleOwnerImpl.class, "6")) {
          return;
       }
       this.A().onNext(Integer.valueOf(0));
       return;
    }
    public final void F(int p0){
       PlcLifecycleOwnerImpl plcLifecycle = PlcLifecycleOwnerImpl.class;
       if (PatchProxy.isSupport(plcLifecycle) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, plcLifecycle, "8")) {
          return;
       }
       this.A().onNext(Integer.valueOf(p0));
       return;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "25")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(8, p0);
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "29")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(10, p0);
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "27")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(9, p0);
       return;
    }
    public void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "15")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(2, p0);
       return;
    }
    public void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "19")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(5, p0);
       return;
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "33")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(12, p0);
       return;
    }
    public void g(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "39")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(15, p0);
       return;
    }
    public void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "43")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(17, p0);
       return;
    }
    public void i(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "51")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(21, p0);
       return;
    }
    public void j(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "52")) {
          return;
       }
       a.p(p0, "errorConsumer");
       this.z().put(Integer.valueOf(p0.hashCode()), p0);
       return;
    }
    public void k(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "37")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(14, p0);
       return;
    }
    public void l(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "11")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(1, p0);
       return;
    }
    public void m(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "17")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(3, p0);
       return;
    }
    public void n(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "7")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(0, p0);
       return;
    }
    public void o(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "31")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(11, p0);
       return;
    }
    public void p(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "23")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(7, p0);
       return;
    }
    public void q(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "49")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(20, p0);
       return;
    }
    public void r(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "47")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(19, p0);
       return;
    }
    public void s(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "21")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(6, p0);
       return;
    }
    public void t(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "13")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(4, p0);
       return;
    }
    public void u(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "35")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(13, p0);
       return;
    }
    public void v(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "9")) {
          return;
       }
       a.p(p0, "consumer");
       g og = this.y(p0);
       a uoa = this.c.g();
       if (uoa != null) {
          b uob = this.A().filter(PlcLifecycleOwnerImpl$c.b).subscribe(new PlcLifecycleOwnerImpl$d(this, p0, og), og);
          a.o(uob, "mLifecycleSubject\n      ¡­errConsumer\n            \)");
          uoa.a(uob);
       }
       return;
    }
    public void w(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "41")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(16, p0);
       return;
    }
    public void x(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "45")) {
          return;
       }
       a.p(p0, "consumerBase");
       this.C(18, p0);
       return;
    }
    public final g y(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlcLifecycleOwnerImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PlcLifecycleOwnerImpl$a(this, p0);
    }
    public final ConcurrentHashMap z(){
       Object obj = PatchProxy.apply(null, this, PlcLifecycleOwnerImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
}
