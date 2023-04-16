package cb2.m;
import tq5.a;
import cb2.q;
import java.lang.Object;
import fb2.i;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import java.lang.String;
import java.util.Objects;
import cb2.w;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import p91.m;
import pm8.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import cb2.j;

public final class m implements a	// class@000510
{
    public final q a;

    public void m(q p0){
       this.a = p0;
    }
    public final int onBackPressed(){
       m ta = this.a;
       if (ta.P8() && ta.p.d()) {
          ta.v.mHasShownLiveSlideGuide = true;
          q q = ta.q;
          String str = ta.p.h();
          Objects.requireNonNull(q);
          if (!PatchProxy.applyVoidOneRefs(str, q, w.class, "1")) {
             q.e(str, 0);
          }
          ta.p.c();
          a.w1(ta.x.s());
          j.a(ta.x.a(), "FULLSCREEN_GUIDE", ta.p.h());
       }else {
          int i = 0;
       }
       return true;
    }
}
