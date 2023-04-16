package fj2.p;
import xq5.c;
import fj2.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class p implements c	// class@00297d
{
    public final o b;

    public void p(o p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.b.V8();
       this.b.R8();
       return;
    }
    public void W4(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_SCREENCAST;
       lIVE_AUDIENC.appendTag("LiveAudienceScreencastPresenter");
       LiveLogTag liveLogTag = lIVE_AUDIENC;
       b.T(liveLogTag, "onSelectedIdle", "getUserName", this.b.q.getUserName(), "isEnableScreencast", Boolean.valueOf(this.b.X8()));
       this.b.j9();
       return;
    }
    public void r(){
       b.b(this);
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
