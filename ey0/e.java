package ey0.e;
import u07.u;
import ey0.k;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ey0.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class e implements u	// class@00221d
{
    public final k b;

    public void e(k p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       e tb = this.b;
       tb.e = false;
       b.b(tb.b, false);
       b.c0(LiveLogTag.LIVE_AUDIENCE_LOCATION, "requestOpenGps", "status", "user refuse");
    }
}
