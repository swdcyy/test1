package fa2.c0;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeNarrowItemView$a;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.j;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import iy1.l;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ly1.a;

public final class c0 implements LiveHourlyRankStrengthNoticeNarrowItemView$a	// class@0028ff
{
    public final j a;

    public void c0(j p0){
       this.a = p0;
    }
    public final void a(String p0){
       c0 ta = this.a;
       if (ta.a.e.n == 2) {
       }else {
          ta.f();
          l e = l.e;
          ClientContent$LiveStreamPackage liveStreamPa = ta.a.e.b.a();
          if (TextUtils.x(p0)) {
             p0 = "";
          }
          a.a(e, liveStreamPa, "2", "2", p0);
       }
       return;
    }
}
