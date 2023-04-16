package cb2.n;
import java.lang.Runnable;
import cb2.q;
import java.lang.Object;
import fb2.i;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.lang.String;
import cb2.w;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import cb2.j;
import pm8.a;

public final class n implements Runnable	// class@000511
{
    public final q b;

    public void n(q p0){
       this.b = p0;
    }
    public final void run(){
       n tb = this.b;
       if (tb.P8() && tb.p.f()) {
          tb.v.mHasShownLiveSlideGuide = true;
          tb.q.d(tb.p.i(), tb.p.e());
          tb.p.g();
          j.a(tb.x.a(), "BOTTOM_GUIDE", tb.p.e());
          a.w1(tb.x.s());
       }
       return;
    }
}
