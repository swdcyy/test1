package jtd.a;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import htd.y;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import kotlin.coroutines.EmptyCoroutineContext;
import jtd.e;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import csd.b;
import qrd.l1;
import java.lang.StringBuilder;
import ftd.k0;
import kotlinx.coroutines.CoroutineStart;
import htd.i;
import htd.w;
import ktd.k;
import htd.c0;
import java.lang.IllegalStateException;

public final class a extends ChannelFlow	// class@001732
{
    public final y c;
    public int consumed;
    public final boolean d;
    public static final AtomicIntegerFieldUpdater e;

    static {
       a.e = AtomicIntegerFieldUpdater.newUpdater(a.class, "consumed");
    }
    public void a(y p0,boolean p1,CoroutineContext p2,int p3){
       super(p2, p3);
       this.c = p0;
       this.d = p1;
       this.consumed = 0;
    }
    public void a(y p0,boolean p1,CoroutineContext p2,int p3,int p4,u p5){
       EmptyCoroutineContext iNSTANCE;
       if (p4 & 0x04) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p4 & 0x08) {
          p3 = -3;
       }
       super(p0, p1, iNSTANCE, p3);
       return;
    }
    public Object b(e p0,c p1){
       if (this.b == -3) {
          this.k();
          p0 = FlowKt__ChannelsKt.f(p0, this.c, this.d, p1);
          if (p0 == b.h()) {
             return p0;
          }
       }else {
          p0 = super.b(p0, p1);
          if (p0 == b.h()) {
             return p0;
          }
       }
       return l1.a;
    }
    public String c(){
       return "channel="+this.c+", ";
    }
    public i d(k0 p0,CoroutineStart p1){
       this.k();
       return super.d(p0, p1);
    }
    public Object f(w p0,c p1){
       p0 = FlowKt__ChannelsKt.f(new k(p0), this.c, this.d, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public ChannelFlow g(CoroutineContext p0,int p1){
       return new a(this.c, this.d, p0, p1);
    }
    public y j(k0 p0){
       this.k();
       a tc = (this.b == -3)? this.c: super.j(p0);
       return tc;
    }
    public final void k(){
       if (this.d != null) {
          int i = 1;
          if (a.e.getAndSet(this, i)) {
             i = 0;
          }
          if (!i) {
             throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
          }
       }
       return;
    }
}
