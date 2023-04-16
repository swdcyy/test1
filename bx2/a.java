package bx2.a;
import mw2.a;
import qu2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.waynelive.LivePlayerController;
import mw2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mw2.b$a$a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import mw2.b$a;

public final class a implements a	// class@000471
{
    public final a a;

    public void a(a p0){
       a.p(p0, "liveContext");
       super();
       this.a = p0;
    }
    public b a(LivePlayerController p0,String p1){
       b$a$a obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "livePlayerController");
       a.p(p1, "photoId");
       obj = new b$a$a();
       obj.d = false;
       obj = obj.b(this.a);
       obj.c(0);
       obj.c = this.a.j0();
       return new b(p0, obj.a(), p1);
    }
}
