package cx0.d;
import cx0.b$b;
import cx0.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class d implements b$b	// class@001e91
{
    public final b a;

    public void d(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       d ta = this.a;
       ta.e = ta.e + 1;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       b a = this.a.a;
       if (a != null) {
          a.setVisibility(8);
       }
       b.P(LiveLogTag.LIVE_AUTHOR_AUTHENTICATION.appendTag("AudienceAuthorAuthenticationPendantItem"), "load normal image view failure , change pendant view to gone");
       return;
    }
}
