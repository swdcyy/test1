package ap3.f;
import n3d.a;
import android.app.Activity;
import com.kwai.component.misc.report.ReportInfo;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import o63.a;
import java.lang.Object;
import android.content.Intent;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.report.e;

public final class f implements a	// class@000295
{
    public final Activity b;
    public final ReportInfo c;
    public final LiveStreamFeed d;
    public final long e;
    public final a f;

    public void f(Activity p0,ReportInfo p1,LiveStreamFeed p2,long p3,a p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f te = this.e;
       f tf = this.f;
       if (QCurrentUser.ME.isLogined()) {
          e.c(tb, tc, td, te, tf);
       }
       return;
    }
}
