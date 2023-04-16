package kotlinx.coroutines.flow.internal.ChannelFlow;
import ktd.g;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.internal.ChannelFlow$collect$2;
import msd.p;
import ftd.l0;
import csd.b;
import qrd.l1;
import kotlin.jvm.internal.a;
import java.lang.String;
import ftd.k0;
import kotlinx.coroutines.CoroutineStart;
import htd.i;
import msd.l;
import kotlinx.coroutines.channels.BroadcastKt;
import htd.w;
import kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1;
import htd.y;
import kotlinx.coroutines.channels.ProduceKt;
import java.lang.StringBuilder;
import ftd.o0;

public abstract class ChannelFlow implements g	// class@001b07
{
    public final CoroutineContext a;
    public final int b;

    public void ChannelFlow(CoroutineContext p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static Object e(ChannelFlow p0,e p1,c p2){
       p0 = l0.g(new ChannelFlow$collect$2(p0, p1, null), p2);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public g a(CoroutineContext p0,int p1){
       ChannelFlow uChannelFlow;
       p0 = p0.plus(this.a);
       ChannelFlow tb = this.b;
       int i = -3;
       if (tb == i) {
       }else if(p1 == i){
          if (tb != -2) {
             if (p1 != -2) {
                if (tb == -1 || p1 == -1) {
                   uChannelFlow = -1;
                }else {
                   p1 = p1 + tb;
                   if (p1 < 0) {
                      p1 = Integer.MAX_VALUE;
                   }
                }
             }
          }
       }
       uChannelFlow = tb;
       if (a.g(p0, this.a) && p1 == this.b) {
          return this;
       }else {
          return this.g(p0, p1);
       }
    }
    public Object b(e p0,c p1){
       return ChannelFlow.e(this, p0, p1);
    }
    public String c(){
       return "";
    }
    public i d(k0 p0,CoroutineStart p1){
       return BroadcastKt.c(p0, this.a, this.i(), p1, null, this.h(), 8, null);
    }
    public abstract Object f(w p0,c p1);
    public abstract ChannelFlow g(CoroutineContext p0,int p1);
    public final p h(){
       return new ChannelFlow$collectToFun$1(this, null);
    }
    public final int i(){
       ChannelFlow tb = this.b;
       if (tb == -3) {
          tb = -2;
       }
       return tb;
    }
    public y j(k0 p0){
       return ProduceKt.e(p0, this.a, this.i(), CoroutineStart.ATOMIC, null, this.h(), 8, null);
    }
    public String toString(){
       return o0.a(this)+'['+this.c()+"context="+this.a+", capacity="+this.b+']';
    }
}
