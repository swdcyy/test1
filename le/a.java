package le.a;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import cf.a;
import java.lang.Object;
import vd.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.System;

public class a implements NotThreadSafeBridgeIdleDebugListener, a	// class@00254a
{
    public final c a;
    public final c b;
    public final c c;
    public final c d;
    public boolean e;

    public void a(){
       super();
       this.a = c.b(20);
       this.b = c.b(20);
       this.c = c.b(20);
       this.d = c.b(20);
       this.e = true;
    }
    public static void c(c p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), null, uoa, "9")) {
          return;
       }
       int i = p0.d();
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i2 < i) {
          if (p0.c(i2) - p1 < 0) {
             i3 = i3 + 1;
          }
          i2 = i2 + 1;
       }
       if (i3 > 0) {
          while (true) {
             int i4 = i - i3;
             if (i1 < i4) {
                i4 = i1 + i3;
                i4 = p0.c(i4);
                if (i1 < p0.b) {
                   p0.a[i1] = i4;
                   i1 = i1 + 1;
                }else {
                   throw new IndexOutOfBoundsException(i1+" >= "+p0.b);
                }
             }else {
                c b = p0.b;
                if (i3 <= b) {
                   p0.b = b - i3;
                   break ;
                }else {
                   throw new IndexOutOfBoundsException("Trying to drop "+i3+" items from array of length "+p0.b);
                }
             }
          }
       }
       return;
    }
    public static long d(c p0,long p1,long p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), null, a.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = -1;
       int i = 0;
       while (i < p0.d()) {
          long l1 = p0.c(i);
          if (l1 - p1 >= 0 && l1 - p2 < 0) {
             l = l1;
          }else if(l1 - p2 >= 0){
             break ;
          }
          i = i + 1;
       }
       return l;
    }
    public static boolean e(c p0,long p1,long p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), null, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       while (true) {
          if (i >= p0.d()) {
             return false;
          }
          long l = p0.c(i);
          if (l - p1 >= 0 && l - p2 < 0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public synchronized void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.d.a(System.nanoTime());
       return;
    }
    public synchronized void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.c.a(System.nanoTime());
       return;
    }
    public synchronized void onBridgeDestroyed(){
    }
    public synchronized void onTransitionToBridgeBusy(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.b.a(System.nanoTime());
       return;
    }
    public synchronized void onTransitionToBridgeIdle(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.a.a(System.nanoTime());
       return;
    }
}
