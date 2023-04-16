package kotlinx.coroutines.channels.BroadcastKt$broadcast$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import htd.y;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import kotlinx.coroutines.channels.ChannelIterator;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import htd.c0;

public final class BroadcastKt$broadcast$1 extends SuspendLambda implements p	// class@001937
{
    public final y $this_broadcast;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public w p$;

    public void BroadcastKt$broadcast$1(y p0,c p1){
       this.$this_broadcast = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       BroadcastKt$broadcast$1 uobroadcast$ = new BroadcastKt$broadcast$1(this.$this_broadcast, p1);
       uobroadcast$.p$ = p0;
       return uobroadcast$;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       c uoc;
       Object obj = b.h();
       BroadcastKt$broadcast$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel != 1) {
             if (tlabel == 2) {
                tlabel = this.L$2;
                j0.n(p0);
                p0 = this.L$0;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tlabel = this.L$1;
             BroadcastKt$broadcast$1 uobroadcast$ = this.L$0;
             j0.n(p0);
             c obj1 = this;
          label_004d :
             if (p0.booleanValue()) {
                p0 = tlabel.next();
                obj1.L$0 = uobroadcast$;
                obj1.L$1 = p0;
                obj1.L$2 = tlabel;
                obj1.label = 2;
                if (uobroadcast$.l(p0, obj1) == obj) {
                   return obj;
                }else {
                   p0 = uobroadcast$;
                   uoc = obj1;
                label_003c :
                   uoc.L$0 = p0;
                   uoc.L$1 = tlabel;
                   uoc.label = 1;
                   obj1 = tlabel.a(uoc);
                   if (obj1 == obj) {
                      return obj;
                   }else {
                      uobroadcast$ = p0;
                      p0 = obj1;
                      obj1 = uoc;
                      goto label_004d ;
                   }
                }
             }else {
                return l1.a;
             }
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          ChannelIterator uChannelIter = this.$this_broadcast.iterator();
       }
       uoc = this;
       goto label_003c ;
    }
}
