package htd.d;
import htd.f;
import htd.m;
import kotlin.coroutines.CoroutineContext;
import htd.l;
import java.lang.Throwable;
import java.util.concurrent.CancellationException;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;
import ftd.o0;
import ftd.l1;
import htd.y;
import ftd.a;
import ftd.h0;

public class d extends m implements f	// class@000fc2
{

    public void d(CoroutineContext p0,l p1,boolean p2){
       super(p0, p1, p2);
    }
    public void R0(Throwable p0){
       l ol = this.s1();
       CancellationException uCancellatio = null;
       if (p0 != null) {
          if (p0 instanceof CancellationException) {
             uCancellatio = p0;
          }
          if (!uCancellatio) {
             uCancellatio = l1.a(o0.a(this)+" was cancelled", p0);
          }
       }
       ol.b(uCancellatio);
       return;
    }
    public boolean z0(Throwable p0){
       h0.b(this.getContext(), p0);
       return true;
    }
}
