package jtd.g;
import jtd.d;
import ktd.g;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import ktd.g$a;
import ktd.b;
import nsd.u;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalArgumentException;
import jtd.f;
import kotlinx.coroutines.flow.AbstractFlow;
import jtd.g$a;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.a;
import msd.l;
import jtd.g$b;

public final class g	// class@00173c
{

    public static final d a(d p0,int p1){
       g og;
       int i = 1;
       int i1 = (p1 < 0 && (p1 == -2 || p1 == -1))? 1: 0;
       if (i1) {
          if (p0 instanceof g) {
             og = g$a.a(p0, null, p1, i, null);
          }else {
             b uob = new b(p0, null, p1, 2, null);
             og = v6;
          }
          return og;
       }else {
          throw new IllegalArgumentException("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "+p1.toString());
       }
    }
    public static d b(d p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = -2;
       }
       return f.o(p0, p1);
    }
    public static final d c(d p0){
       if (p0 instanceof AbstractFlow) {
          return p0;
       }
       return new g$a(p0);
    }
    public static final void d(CoroutineContext p0){
       StringBuilder str = (p0.get(z1.p0) == null)? 1: null;
       if (str) {
          return;
       }else {
          throw new IllegalArgumentException("Flow context cannot contain job in it. Had "+p0.toString());
       }
    }
    public static final d e(d p0){
       return f.o(p0, -1);
    }
    public static final d f(d p0,CoroutineContext p1){
       g og;
       g.d(p1);
       if (a.g(p1, EmptyCoroutineContext.INSTANCE)) {
       }else if(p0 instanceof g){
          og = g$a.a(p0, p1, 0, 2, null);
       }else {
          b uob = new b(p0, p1, 0, 4, null);
          og = v6;
       }
       return p0;
    }
    public static final d g(d p0,CoroutineContext p1,int p2,l p3){
       g.d(p1);
       return new g$b(p0, p2, p3, p1);
    }
    public static d h(d p0,CoroutineContext p1,int p2,l p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = -2;
       }
       return f.N0(p0, p1, p2, p3);
    }
}
