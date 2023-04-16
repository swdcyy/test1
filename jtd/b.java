package jtd.b;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import msd.p;
import kotlin.coroutines.CoroutineContext;
import nsd.u;
import kotlin.coroutines.EmptyCoroutineContext;
import htd.w;
import asd.c;
import java.lang.Object;
import csd.b;
import qrd.l1;
import java.lang.String;
import java.lang.StringBuilder;

public class b extends ChannelFlow	// class@001733
{
    public final p c;

    public void b(p p0,CoroutineContext p1,int p2){
       super(p1, p2);
       this.c = p0;
    }
    public void b(p p0,CoroutineContext p1,int p2,int p3,u p4){
       EmptyCoroutineContext iNSTANCE;
       if (p3 & 0x02) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       if (p3 & 0x04) {
          p2 = -2;
       }
       super(p0, iNSTANCE, p2);
       return;
    }
    public static Object k(b p0,w p1,c p2){
       p0 = p0.c.invoke(p1, p2);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public Object f(w p0,c p1){
       return b.k(this, p0, p1);
    }
    public ChannelFlow g(CoroutineContext p0,int p1){
       return new b(this.c, p0, p1);
    }
    public String toString(){
       return "block["+this.c+"] -> "+super.toString();
    }
}
