package k21.g;
import tq5.a;
import k21.k;
import java.lang.Object;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import lnc.b5;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import oq5.b;

public final class g implements a	// class@002c6b
{
    public final k a;

    public void g(k p0){
       this.a = p0;
    }
    public final int onBackPressed(){
       g ta = this.a;
       boolean b = false;
       if (y.d(ta.getActivity()) && !b5.a(ta.getActivity())) {
          k r = ta.r;
          if (r.p1 != null) {
             LivePlayLogger.onFloatOrientationClick(b, r.Z2.a());
             ta.r.p1.d();
             b = 1;
          }
       }
       return b;
    }
}
