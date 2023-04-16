package fa2.d0;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$d;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.j;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i$f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import p91.m;
import iy1.l;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ba2.v;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ly1.a;

public final class d0 implements LiveHourlyRankStrengthNoticeView$d	// class@002901
{
    public final j a;

    public void d0(j p0){
       this.a = p0;
    }
    public final void a(int p0,String p1){
       d0 ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 == 1) {
          i$f e = ta.a.e;
          e.q = e.b.s();
       }
       l e1 = l.e;
       ClientContent$LiveStreamPackage liveStreamPa = ta.a.e.b.a();
       String str = v.b(p0);
       if (TextUtils.x(p1)) {
          p1 = "";
       }
       a.a(e1, liveStreamPa, str, "1", p1);
       return;
    }
}
