package f52.a0;
import erd.g;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import l66.c;
import wca.r;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;

public final class a0 implements g	// class@00287e
{
    public final LiveStreamFeedWrapper b;

    public void a0(LiveStreamFeedWrapper p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a0 tb = this.b;
       User user = tb.getUser();
       c.a().b(new r(user, tb.mEntity));
    }
}
