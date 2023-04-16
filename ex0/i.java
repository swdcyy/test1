package ex0.i;
import c12.f;
import tb1.c;
import ex0.e;
import ok.o;
import ex0.c;
import java.lang.Object;
import java.util.Objects;
import ex0.d;
import z1.a;
import ex0.g;
import ex0.f;
import ex0.i$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import lnc.u1;
import t02.a0;
import com.kwai.video.waynelive.listeners.LivePlayerEventListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kwai.video.waynelive.listeners.LivePlayerBufferListener;
import tj3.o;
import tj3.e;
import e93.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$c;
import e17.i;

public class i extends f	// class@002214
{
    public a0 K;
    public e L;
    public boolean M;
    public LiveFlvStream$LiveAnchorQosInfoSyncMessage N;
    public final c O;
    public final c P;
    public final LivePlayerEventListener Q;
    public final o R;
    public final LivePlayerBufferListener S;
    public static String sLivePresenterClassName = "LiveAudienceBadNetworkStatusPresenter";

    public void i(){
       super();
       this.M = false;
       c uoc = new c(new e(this));
       this.O = uoc;
       Objects.requireNonNull(uoc);
       this.P = new c(new d(uoc));
       this.Q = new g(this);
       this.R = new f(this);
       this.S = new i$a(this);
    }
    public void Q(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "3")) {
          return;
       }
       u1.b(this);
       if (!PatchProxy.applyVoid(null, this, oi, "5")) {
          this.M = false;
          a0 e = this.K.E;
          e.removeLiveEventListener(this.Q);
          e.removeBufferListener(this.S);
          this.L.B(this.R);
          this.O.a();
          f.g(this);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       this.L = this.r8("LIVE_LOG_REPORTER");
       return;
    }
    public void onEventMainThread(NetworkTypeMonitor$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "6")) {
          return;
       }
       i.a(R.style.arg_RES_7f11066a, 0x7f1038e7);
       return;
    }
    public void x(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "2")) {
          return;
       }
       u1.a(this);
       if (!PatchProxy.applyVoid(null, this, oi, "4") && this.M == null) {
          this.M = true;
          a0 e = this.K.E;
          e.addLiveEventListener(this.Q);
          e.addBufferListener(this.S);
          this.L.c(this.R);
       }
       return;
    }
}
