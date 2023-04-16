package kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import htd.i;
import jtd.d;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt$a;
import ftd.k0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import ktd.a;
import java.lang.Object;
import jtd.f;
import htd.y;
import jtd.a;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import jtd.e;
import asd.c;
import csd.b;
import qrd.l1;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1;
import java.lang.Throwable;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import htd.f0;
import htd.o;

public final class FlowKt__ChannelsKt	// class@0019cf
{

    public static final d a(i p0){
       return new FlowKt__ChannelsKt$a(p0);
    }
    public static final i b(d p0,k0 p1,CoroutineStart p2){
       return a.a(p0).d(p1, p2);
    }
    public static i c(d p0,k0 p1,CoroutineStart p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = CoroutineStart.LAZY;
       }
       return f.m(p0, p1, p2);
    }
    public static final d d(y p0){
       a uoa = new a(p0, true, null, 0, 12, null);
       return v7;
    }
    public static final Object e(e p0,y p1,c p2){
       p0 = FlowKt__ChannelsKt.f(p0, p1, true, p2);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public static final Object f(e p0,y p1,boolean p2,c p3){
       FlowKt__ChannelsKt$emitAllImpl$1 uoemitAllImp;
       FlowKt__ChannelsKt$emitAllImpl$1 l$2;
       FlowKt__ChannelsKt$emitAllImpl$1 z$0;
       FlowKt__ChannelsKt$emitAllImpl$1 l$1;
       if (p3 instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
          uoemitAllImp = p3;
          FlowKt__ChannelsKt$emitAllImpl$1 label = uoemitAllImp.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             uoemitAllImp.label = i2;
          label_0018 :
             FlowKt__ChannelsKt$emitAllImpl$1 result = uoemitAllImp.result;
             Object obj = b.h();
             FlowKt__ChannelsKt$emitAllImpl$1 label1 = uoemitAllImp.label;
             if (label1 != null) {
                if (label1 != 1) {
                   if (label1 == 2) {
                      l$2 = uoemitAllImp.L$2;
                      z$0 = uoemitAllImp.Z$0;
                      l$1 = uoemitAllImp.L$1;
                      label1 = uoemitAllImp.L$0;
                      j0.n(result);
                   label_0039 :
                      result = l$2;
                      l$2 = label1;
                      l$1 = z$0;
                      z$0 = l$1;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   l$2 = uoemitAllImp.L$2;
                   z$0 = uoemitAllImp.Z$0;
                   l$1 = uoemitAllImp.L$1;
                   label1 = uoemitAllImp.L$0;
                   j0.n(result);
                label_007d :
                   result = result.l();
                   if (f0.j(result)) {
                      Throwable throwable = f0.f(result);
                      if (throwable == null) {
                         if (z$0 != null) {
                            o.r(l$1, l$2);
                         }
                         return l1.a;
                      }else {
                         throw throwable;
                      }
                   }else {
                      uoemitAllImp.L$0 = label1;
                      uoemitAllImp.L$1 = l$1;
                      uoemitAllImp.Z$0 = z$0;
                      uoemitAllImp.L$2 = l$2;
                      uoemitAllImp.L$3 = result;
                      uoemitAllImp.label = 2;
                      if (label1.emit(f0.g(result), uoemitAllImp) == obj) {
                         return obj;
                      }else {
                         goto label_0039 ;
                      }
                   }
                }
             }else {
                j0.n(result);
                result = null;
             }
             uoemitAllImp.L$0 = l$2;
             uoemitAllImp.L$1 = z$0;
             uoemitAllImp.Z$0 = l$1;
             uoemitAllImp.L$2 = result;
             uoemitAllImp.L$3 = l$2;
             uoemitAllImp.label = 1;
             Object obj1 = z$0.y(uoemitAllImp);
             if (obj1 == obj) {
                return obj;
             }else {
                label1 = l$2;
                l$2 = result;
                result = obj1;
                l$1 = z$0;
                z$0 = l$1;
                goto label_007d ;
             }
          }
       }
       uoemitAllImp = new FlowKt__ChannelsKt$emitAllImpl$1(p3);
       goto label_0018 ;
    }
    public static final y g(d p0,k0 p1){
       return a.a(p0).j(p1);
    }
    public static final d h(y p0){
       a uoa = new a(p0, false, null, 0, 12, null);
       return v7;
    }
}
