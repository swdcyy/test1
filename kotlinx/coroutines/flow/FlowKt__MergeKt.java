package kotlinx.coroutines.flow.FlowKt__MergeKt;
import java.lang.String;
import ltd.g0;
import jtd.d;
import msd.p;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import jtd.f;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1;
import asd.c;
import msd.q;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import java.lang.Object;
import kotlinx.coroutines.flow.FlowKt__MergeKt$a;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1;
import java.lang.Iterable;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

public final class FlowKt__MergeKt	// class@001a46
{
    public static final int a;

    static {
       FlowKt__MergeKt.a = g0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);
    }
    public static void a(){
    }
    public static final d b(d p0,p p1){
       return f.C0(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(p0, p1));
    }
    public static final d c(d p0,p p1){
       return f.U1(p0, new FlowKt__MergeKt$flatMapLatest$1(p1, null));
    }
    public static final d d(d p0,int p1,p p2){
       return f.D0(new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(p0, p2), p1);
    }
    public static d e(d p0,int p1,p p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = FlowKt__MergeKt.a;
       }
       return f.z0(p0, p1, p2);
    }
    public static final d f(d p0){
       return new FlowKt__MergeKt$a(p0);
    }
    public static final d g(d p0,int p1){
       int i = 1;
       int i1 = (p1 > 0)? 1: 0;
       if (i1) {
          if (p1 == i) {
             p0 = f.C0(p0);
          }else {
             ChannelFlowMerge uChannelFlow = new ChannelFlowMerge(p0, p1, null, 0, 12, null);
             ChannelFlowMerge uChannelFlow1 = v7;
          }
          return p0;
       }else {
          throw new IllegalArgumentException("Expected positive concurrency level, but had "+p1.toString());
       }
    }
    public static d h(d p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = FlowKt__MergeKt.a;
       }
       return f.D0(p0, p1);
    }
    public static final int i(){
       return FlowKt__MergeKt.a;
    }
    public static final d j(d p0,p p1){
       return f.U1(p0, new FlowKt__MergeKt$mapLatest$1(p1, null));
    }
    public static final d k(Iterable p0){
       ChannelLimitedFlowMerge uChannelLimi = new ChannelLimitedFlowMerge(p0, null, 0, 6, null);
       return v6;
    }
    public static final d l(d[] p0){
       return f.X0(ArraysKt___ArraysKt.Y4(p0));
    }
    public static final d m(d p0,q p1){
       ChannelFlowTransformLatest uChannelFlow = new ChannelFlowTransformLatest(p1, p0, null, 0, 12, null);
       return v7;
    }
}
