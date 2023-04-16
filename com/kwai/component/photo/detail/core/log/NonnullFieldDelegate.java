package com.kwai.component.photo.detail.core.log.NonnullFieldDelegate;
import wd5.b;
import java.lang.Object;
import msd.q;
import nsd.u;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.core.log.NonnullFieldDelegate$lock$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import vsd.n;
import com.kwai.component.photo.detail.core.log.NonnullFieldDelegate$getValue$exec$1;
import java.util.concurrent.locks.Lock;
import com.kwai.component.photo.detail.core.log.NonnullFieldDelegate$setValue$exec$1;
import qrd.l1;

public final class NonnullFieldDelegate	// class@000a24
{
    public final p a;
    public final b b;
    public final Object c;
    public final boolean d;
    public final q e;

    public void NonnullFieldDelegate(b p0,Object p1,boolean p2,q p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = false;
       }
       if (p4 & 0x08) {
          p3 = null;
       }
       a.p(p0, "dataSaver");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.a = s.c(NonnullFieldDelegate$lock$2.INSTANCE);
       return;
    }
    public final ReentrantLock a(){
       Object obj = PatchProxy.apply(null, this, NonnullFieldDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final Object b(Object p0,n p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, NonnullFieldDelegate.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "property");
       p0 = new NonnullFieldDelegate$getValue$exec$1(this, p1);
       if (this.d != null) {
          ReentrantLock reentrantLoc = this.a();
          reentrantLoc.lock();
          p0 = p0.invoke();
          reentrantLoc.unlock();
       }else {
          p0 = p0.invoke();
       }
       return p0;
    }
    public final void c(Object p0,n p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, NonnullFieldDelegate.class, "3")) {
          return;
       }
       a.p(p1, "property");
       p0 = new NonnullFieldDelegate$setValue$exec$1(this, p1, p2);
       if (this.d != null) {
          ReentrantLock reentrantLoc = this.a();
          reentrantLoc.lock();
          p0.invoke();
          reentrantLoc.unlock();
       }else {
          p0.invoke();
       }
       return;
    }
}
