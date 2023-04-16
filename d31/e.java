package d31.e;
import c12.f;
import d31.b;
import d31.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import v51.a;
import lp3.c;
import lp3.e;
import hf3.a;
import lf3.g;
import crd.b;
import lnc.b9;
import java.util.Objects;
import e31.h;
import d61.c0;
import android.content.Context;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import x61.c;
import e93.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import f31.b;
import d31.a;
import ok.x;
import com.kuaishou.protobuf.livestream.nano.LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange;
import com.kuaishou.livestream.message.nano.LiveUserTaskProto$LiveUserTaskCommonRoute;
import ry1.b;
import brd.t;
import d31.d;
import bp6.a;
import erd.g;

public class e extends f	// class@001f00
{
    public e K;
    public b L;
    public h M;
    public b N;
    public final g O;
    public final g P;
    public static String sLivePresenterClassName = "LiveAudienceTaskCenterPresenter";

    public void e(){
       super();
       this.O = new b(this);
       this.P = new c(this);
    }
    public void Q(boolean p0){
       c0 a;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "3")) {
          return;
       }
       a uoa = a.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          this.K.a(uoa).u().o(958, this.O);
          this.K.a(uoa).u().o(959, this.P);
       }
       b9.a(this.L);
       e tM = this.M;
       if (tM != null) {
          Objects.requireNonNull(tM);
          h oh = h.class;
          if (!PatchProxy.applyVoid(objArray, tM, oh, "1")) {
             tM.c = -1;
             tM.b();
             if (!PatchProxy.applyVoid(objArray, tM, oh, "15")) {
                a = c0.a;
                a.i(tM.i, a.b("/udata/pkg/kwai-client-image/live_task_center/live_task_center_normal.json")).removeAllListeners();
                a.i(tM.i, a.b("/udata/pkg/kwai-client-image/live_task_center/live_task_center_finish.json")).removeAllListeners();
             }
             tM.d.O0(4007);
             f.g(tM);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
    public void x(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "2")) {
          return;
       }
       this.N = new b(new a(this));
       a uoa = a.class;
       if (!PatchProxy.applyVoid(null, this, uoe, "4")) {
          this.K.a(uoa).u().u0(958, LiveUserTaskStatusChangeProto$LiveUserTaskStatusChange.class, this.O);
          this.K.a(uoa).u().u0(959, LiveUserTaskProto$LiveUserTaskCommonRoute.class, this.P);
       }
       b9.a(this.L);
       this.L = this.K.a(b.class).W().subscribe(new d(this), new a());
       return;
    }
}
