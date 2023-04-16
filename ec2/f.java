package ec2.f;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.luckystar.openresult.c$c;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.core.show.luckystar.openresult.c;
import yb2.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import zb2.f0;

public final class f implements View$OnClickListener	// class@0026e3
{
    public final c$c b;

    public void f(c$c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       LiveLuckyStarLogger.m(tb.s.w.a.a(), tb.s.w.c, tb.r.mId);
       tb.s.w.k.a(tb.r);
    }
}
