package qrd.s;
import java.lang.Object;
import msd.a;
import qrd.p;
import java.lang.String;
import kotlin.jvm.internal.a;
import kotlin.SynchronizedLazyImpl;
import kotlin.LazyThreadSafetyMode;
import qrd.q;
import java.lang.Enum;
import kotlin.UnsafeLazyImpl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SafePublicationLazyImpl;
import nsd.u;

public class s	// class@0022d6
{

    public void s(){
       super();
    }
    public static final p a(Object p0,a p1){
       a.p(p1, "initializer");
       return new SynchronizedLazyImpl(p1, p0);
    }
    public static final p b(LazyThreadSafetyMode p0,a p1){
       UnsafeLazyImpl unsafeLazyIm;
       a.p(p0, "mode");
       a.p(p1, "initializer");
       int i = q.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
                unsafeLazyIm = new UnsafeLazyImpl(p1);
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             unsafeLazyIm = new SafePublicationLazyImpl(p1);
          }
       }else {
          unsafeLazyIm = new SynchronizedLazyImpl(p1, null, 2, null);
       }
       return unsafeLazyIm;
    }
    public static final p c(a p0){
       a.p(p0, "initializer");
       return new SynchronizedLazyImpl(p0, null, 2, null);
    }
}
