package fa2.f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.LiveHourlyRankStrengthNoticeView$d;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.b;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a$f;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.a;
import p91.m;
import iy1.l;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ba2.v;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ly1.a;

public final class f implements LiveHourlyRankStrengthNoticeView$d	// class@002904
{
    public final b a;

    public void f(b p0){
       this.a = p0;
    }
    public final void a(int p0,String p1){
       f ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 == 1) {
          a$f d = ta.a.d;
          d.p = d.b.s();
       }
       l d1 = l.d;
       ClientContent$LiveStreamPackage liveStreamPa = ta.a.d.b.a();
       String str = v.b(p0);
       if (TextUtils.x(p1)) {
          p1 = "";
       }
       a.a(d1, liveStreamPa, str, "1", p1);
       return;
    }
}
