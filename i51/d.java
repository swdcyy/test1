package i51.d;
import hf3.a;
import i51.f;
import java.lang.Object;
import i51.d$a;
import lf3.a;
import i51.o;
import i51.d$b;
import i51.g;
import lnc.u1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import crd.b;
import lnc.b9;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import i51.j;
import i51.i;
import brd.t;
import cjd.e;
import erd.o;
import i51.b;
import i51.a;
import erd.g;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$a;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$d;

public class d	// class@002825
{
    public final a a;
    public final f b;
    public final o c;
    public boolean d;
    public b e;
    public int f;
    public final b g;

    public void d(a p0,f p1){
       super();
       this.d = true;
       this.f = 0;
       d$a uoa = new d$a(this);
       this.g = uoa;
       this.a = p0;
       this.b = p1;
       p0.B0(uoa);
       this.c = new o(p0, new d$b(this), 0);
       u1.a(this);
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.c.a();
       this.a.F0(this.g);
       k1.n(this);
       b9.a(this.e);
       u1.b(this);
       this.d = true;
       this.f = 0;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_SOCKET, "getNewRaceImmediately");
       k1.n(this);
       this.e();
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.a();
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_SOCKET, "resumeLongConnectIfNeed", "hasExited", Boolean.valueOf(this.a.D0()), "isConnected", Boolean.valueOf(this.a.isConnected()));
       if (!this.a.D0() && !this.a.isConnected()) {
          this.a.resume();
       }
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_SOCKET, "start getNewRaceInfo, mNewRaceRetryCount: "+this.f);
       this.f = this.f + 1;
       b9.a(this.e);
       this.e = i.b().a(this.b.getLiveStreamId(), 1).map(new e()).subscribe(new b(this), new a(this));
       return;
    }
    public void onEventMainThread(NetworkTypeMonitor$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       this.d();
       return;
    }
    public void onEventMainThread(NetworkTypeMonitor$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       this.d();
       return;
    }
}
