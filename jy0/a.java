package jy0.a;
import c12.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.core.show.comments.config.LiveCommentConfigUpdateController;
import lf3.g;
import hf3.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ne1.h;
import t02.a0;
import com.kuaishou.livestream.message.nano.SCLiveCustomizationConfigWorkTimelySignal;

public final class a extends f	// class@002c2f
{
    public LiveCommentConfigUpdateController K;
    public static String sLivePresenterClassName = "LiveAudienceActivityConfigUpdatePresenter";

    public void a(){
       super();
    }
    public void Q(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       a tK = this.K;
       if (tK == null) {
          a.S("commentConfigUpdateController");
       }
       Objects.requireNonNull(tK);
       if (!PatchProxy.applyVoid(null, tK, LiveCommentConfigUpdateController.class, "4")) {
          tK.b.o(1019, tK.b());
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       h oh = this.r8("LIVE_COMMENT_FEED_SERVICE");
       a0 c = this.q8(a0.class).C;
       a.o(c, "livePlayCallerContext.mLiveLongConnection");
       a.o(oh, "liveCommentsFeedService");
       this.K = new LiveCommentConfigUpdateController(c, oh);
       return;
    }
    public void x(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       a tK = this.K;
       if (tK == null) {
          a.S("commentConfigUpdateController");
       }
       Objects.requireNonNull(tK);
       if (!PatchProxy.applyVoid(null, tK, LiveCommentConfigUpdateController.class, "3")) {
          tK.b.u0(1019, SCLiveCustomizationConfigWorkTimelySignal.class, tK.b());
       }
       return;
    }
}
