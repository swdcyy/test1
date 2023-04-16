package e63.e;
import wj2.o0;
import com.kuaishou.live.gzone.v2.profile.LiveGzoneAnchorProfileTabFragment;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import wj2.e;
import com.kwai.framework.model.feed.BaseFeed;

public class e implements o0	// class@00264a
{
    public final User a;
    public final LiveGzoneAnchorProfileTabFragment b;

    public void e(LiveGzoneAnchorProfileTabFragment p0,User p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       a0 obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.o.f1;
       if (obj != null) {
          return obj.d(f.o(this.a));
       }
       return false;
    }
    public boolean b(BaseFeed p0){
       a0 obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.o.f1;
       if (obj != null) {
          return obj.b(p0);
       }
       return false;
    }
}
