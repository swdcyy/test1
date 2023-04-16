package fd1.l;
import k51.c;
import crd.a;
import fd1.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.i;
import xp5.g;
import lp3.c;
import xp5.i;
import v51.a;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCLiveQuestionnaire;
import fd1.h;
import lf3.g;
import ga1.e;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import ekd.k1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public class l extends c	// class@0022fa
{
    public i p;
    public g q;
    public i r;
    public d s;
    public final a t;
    public long u;
    public LivePlayerController v;
    public LivePlayerRenderListener w;
    public static String sLivePresenterClassName = "LiveQuestionnaireCommentNoticePresenter";

    public void l(){
       super();
       this.t = new a();
       this.w = new l$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       this.q = this.P8().a(g.class);
       this.r = this.P8().a(i.class);
       this.P8().a(a.class).u().u0(720, SCLiveQuestionnaire.class, new h(this));
       LivePlayerController livePlayerCo = this.P8().a(e.class).Vc();
       this.v = livePlayerCo;
       livePlayerCo.addRenderListener(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.v.removeRenderListener(this.w);
       this.t.dispose();
       k1.n(this);
       return;
    }
    public i P8(){
       return this.p;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_SERVICE_MANAGER");
       this.s = this.r8("LIVE_ROUTER_SERVICE");
       return;
    }
}
