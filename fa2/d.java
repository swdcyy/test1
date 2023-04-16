package fa2.d;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeExpandView$b;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.b;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import com.kwai.feature.api.live.service.show.hourlytrank.ranklist.LiveHourlyRankType;
import ba2.v;
import jt5.b;
import iy1.l;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ly1.a;

public final class d implements LiveHourlyRankStrengthNoticeExpandView$b	// class@002902
{
    public final b a;

    public void d(b p0){
       this.a = p0;
    }
    public final void a(String p0){
       d ta = this.a;
       b a = ta.a;
       a$f d = a.d;
       if (d.m == 2) {
       }else {
          d.e.a(v.c(a.b), "STRENGTHEN_NOTICE_BANNER");
          l d1 = l.d;
          ClientContent$LiveStreamPackage liveStreamPa = ta.a.d.b.a();
          if (TextUtils.x(p0)) {
             p0 = "";
          }
          a.a(d1, liveStreamPa, "1", "2", p0);
       }
       return;
    }
}
