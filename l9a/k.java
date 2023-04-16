package l9a.k;
import erd.g;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Object;
import com.kwai.framework.player.helper.f$a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$b;
import java.util.Objects;
import com.yxcorp.gifshow.detail.trigger.ActionTrigger$a;

public final class k implements g	// class@002d75
{
    public final b b;

    public void k(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       long l1;
       k b = this.b;
       f$a uoa = p0;
       long l = 0;
       if (!b.H - l) {
          b.H = b.u.getPlayer().getCurrentPosition();
       }
       f$a b1 = uoa.b;
       b h = b.H;
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(b1), uoa, Long.valueOf(h), b, b.class, "21")) {
          Iterator iterator = b.I.iterator();
          while (iterator.hasNext()) {
             ActionTrigger$b uob = iterator.next().c();
             f$a a = uoa.a;
             Objects.requireNonNull(uob);
             if (PatchProxy.isSupport(ActionTrigger$b.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(a), Long.valueOf(b1), Long.valueOf(h), uob, ActionTrigger$b.class, "6")) {
                continue ;
             }else {
                uob = uob.a;
                ActionTrigger b2 = uob.b;
                l = ((v6 = b1 - l) > 0)? (long)b2.f * b1: 0;
                l = l + a;
                l = l - h;
                b2.a = l;
                b2.b = a;
                if (b2.d != null) {
                   if (v6 > 0) {
                      ActionTrigger$a f = b2.f;
                      if (f > 1) {
                         int i = f - 1;
                         l1 = (long)i * b1;
                      label_00a3 :
                         long l2 = a + l1;
                         b2.c = l2;
                      }
                   }
                   l1 = 0;
                   goto label_00a3 ;
                }
                b2.e = b1;
                uob.b();
                l = 0;
             }
          }
       }
       return;
    }
}
