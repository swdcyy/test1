package cb2.o;
import java.lang.Runnable;
import cb2.q;
import java.lang.Object;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import fb2.i;
import java.lang.String;
import cb2.w;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import cb2.j;
import pm8.a;

public final class o implements Runnable	// class@000512
{
    public final q b;

    public void o(q p0){
       this.b = p0;
    }
    public final void run(){
       o tb = this.b;
       if (tb.P8()) {
          tb.v.mHasShownLiveSlideGuide = true;
          String a = i.a;
          tb.q.d(5000, a);
          j.a(tb.x.a(), "BOTTOM_GUIDE", a);
          long l = tb.x.s();
          a.w1(l);
          a.y1(l);
       }
       return;
    }
}
