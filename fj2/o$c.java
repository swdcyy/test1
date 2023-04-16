package fj2.o$c;
import hj2.e$a;
import fj2.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import t02.a0;
import fj2.c;
import wkd.b;
import com.kuaishou.screencast.c;
import com.kuaishou.screencast.ScreencastDeviceInfo;

public class o$c implements e$a	// class@002979
{
    public final o a;

    public void o$c(o p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, o$c.class, "3")) {
          return;
       }
       b.P(LiveLogTag.LIVE_AUDIENCE_SCREENCAST.appendTag("LiveAudienceScreencastPresenter"), "onClickSwitchDevice");
       this.a.V8();
       this.a.e9();
       c.c("CHANGE", y.d(this.a.getActivity()), this.a.r);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, o$c.class, "1")) {
          return;
       }
       b.P(LiveLogTag.LIVE_AUDIENCE_SCREENCAST.appendTag("LiveAudienceScreencastPresenter"), "onClickCloseScreenCast stopPlay");
       b.a(-1851168653).g();
       this.a.V8();
       c.c("EXIT", y.d(this.a.getActivity()), this.a.r);
       return;
    }
    public void c(ScreencastDeviceInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$c.class, "2")) {
          return;
       }
       b.P(LiveLogTag.LIVE_AUDIENCE_SCREENCAST.appendTag("LiveAudienceScreencastPresenter"), "onClickRetryButton");
       this.a.h9(p0);
       c.c("RETRY", y.d(this.a.getActivity()), this.a.r);
       return;
    }
}
