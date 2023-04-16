package bm0.f$a;
import lm9.a$c;
import bm0.f;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import lm9.c;

public class f$a implements a$c	// class@0003be
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(Fragment p0,LiveStreamFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "2")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_TVC_AD, "onPlayEnd");
       this.a.P8();
       return;
    }
    public void b(GifshowActivity p0,LiveStreamFeed p1){
       c.c(this, p0, p1);
    }
    public void c(Fragment p0,LiveStreamFeed p1){
       c.d(this, p0, p1);
    }
    public void d(Fragment p0,LiveStreamFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_TVC_AD, "onShowError");
       this.a.P8();
       return;
    }
}
