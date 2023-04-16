package bd3.d;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.lite.redpacket.a;
import com.kuaishou.livestream.message.nano.SCLiveLiteLeeeShow;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import qd3.r;
import com.kuaishou.live.lite.tempplay.d;
import k2b.e0;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import va3.a;
import e93.b;

public class d extends m	// class@000382
{
    public final SCLiveLiteLeeeShow c;
    public final a d;

    public void d(a p0,SCLiveLiteLeeeShow p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d td = this.d;
       SCLiveLiteLeeeShow routerUrl = this.c.routerUrl;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoidOneRefs(routerUrl, td, a.class, "6")) {
          d.c(td.l.a(), "PROFIT_INFO", "RED_PACKAGE", d.a(td.n));
          a.a(td.l.getPage(), td.m.j0(), td.l.c0(), "RED_PACKAGE", td.l.a());
          td.o.qc(routerUrl, false);
       }
       return;
    }
}
