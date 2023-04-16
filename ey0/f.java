package ey0.f;
import u07.u;
import ey0.k;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ey0.b;

public final class f implements u	// class@00221e
{
    public final k b;
    public final Activity c;

    public void f(k p0,Activity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       f tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.LIVE_AUDIENCE_LOCATION, "requestOpenGps", "status", "user agree");
       b.b(tb.b, true);
       tb.a(this.c);
    }
}
