package fj2.k;
import erd.g;
import fj2.o;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import java.lang.Object;
import gj2.d;
import java.util.Objects;
import wkd.b;
import com.kuaishou.screencast.c;
import java.lang.String;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;

public final class k implements g	// class@002973
{
    public final o b;
    public final ScreencastDeviceInfo c;

    public void k(o p0,ScreencastDeviceInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       b.a(-1851168653).e(p0.a, this.c);
       b.a(-1851168653).d(tb.q.getPhotoId());
    }
}
