package f52.z;
import n3d.a;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class z implements a	// class@00289f
{
    public final n b;
    public final LiveStreamFeedWrapper c;
    public final boolean d;

    public void z(n p0,LiveStreamFeedWrapper p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       z tb = this.b;
       z tc = this.c;
       z td = this.d;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.P8(tc, td);
       }
       return;
    }
}
