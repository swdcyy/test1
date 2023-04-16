package a12.a;
import a51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ck2.e;
import ie2.i;
import tq5.c;
import com.kuaishou.live.core.show.floatingwindow.c$b;
import lb2.i;
import t02.a0;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import android.app.Activity;
import lnc.a1;
import a12.c;
import ck2.i;
import ie2.j;
import a12.d;
import ie2.a;

public class a extends c	// class@00000e
{
    public a0 A;
    public LiveBizParam B;
    public i v;
    public e w;
    public c x;
    public c$b y;
    public i z;
    public static String sLivePresenterClassName = "LiveAudienceLazyLoadPresenter";

    public void a(){
       super();
    }
    public void j8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       this.w = this.r8("LIVE_LOG_REPORTER_SERVICE");
       this.v = this.t8("LIVE_AUDIENCE_PLAYER_REUSE_SERVICE");
       this.x = this.r8("LIVE_QUIT_LIVE_SERVICE");
       this.y = this.t8("LIVE_FLOATING_WINDOW_SERVICE");
       this.z = this.q8(i.class);
       this.A = this.q8(a0.class);
       this.B = this.q8(LiveBizParam.class);
       if (!PatchProxy.applyVoid(objArray, this, uoa, "2") && a1.i(this.getActivity())) {
          this.w.a(new c(this.x, this.y));
          if (j.b(this.B)) {
             this.v.d(new d(this.z, this.x, this.A, this.getActivity()));
          }
       }
       return;
    }
}
