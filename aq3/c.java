package aq3.c;
import mq5.h;
import com.kuaishou.live.tuna.presenter.b;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.util.Queue;
import java.lang.Integer;
import com.yxcorp.gifshow.util.rx.RxBus;
import by5.a;

public final class c implements h	// class@00029e
{
    public final b b;

    public void c(b p0){
       this.b = p0;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       c tb = this.b;
       while (!tb.V0.isEmpty()) {
          Integer integer = tb.V0.poll();
          if (integer != null) {
             RxBus.f.b(new a(integer.intValue(), 1));
          }
       }
       return;
    }
}
