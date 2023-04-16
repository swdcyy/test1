package a77.f;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a77.c;
import java.util.concurrent.ConcurrentHashMap;
import a77.f$a;
import xp5.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.c;
import lp3.i;
import rp5.a;
import h47.b;
import j47.d;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import a77.b;
import lf3.g;
import hf3.a;
import java.util.Map;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import a77.j;
import java.util.HashMap;
import fq5.b;
import pp.d;

public class f extends PresenterV2 implements g	// class@000071
{
    public long A;
    public long B;
    public b C;
    public i D;
    public a E;
    public d F;
    public int G;
    public c H;
    public k I;
    public b p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public Map u;
    public b v;
    public SCActionSignal w;
    public d x;
    public long y;
    public int z;

    public void f(){
       super();
       this.p = new c(this);
       this.q = true;
       this.u = new ConcurrentHashMap();
       this.G = Integer.MAX_VALUE;
       this.I = new f$a(this);
    }
    public void E8(){
       e uoe = e.class;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       if (!this.D.a(uoe).Qd()) {
          return;
       }
       if (this.D.a(uoe).l()) {
          return;
       }
       this.y = this.D.a(a.class).s0();
       f tx = this.x;
       if (tx != null) {
          tx.Q1(this.p);
       }
       if (!PatchProxy.applyVoid(objArray, this, uof, "3")) {
          tx = this.E;
          if (tx != null) {
             tx.u0(510, SCActionSignal.class, new b(this));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       f tx = this.x;
       if (tx != null) {
          tx.H8(this.p);
       }
       this.u.clear();
       b9.a(this.v);
       this.z = 0;
       this.A = 0;
       this.y = 0;
       this.B = 0;
       this.H = null;
       this.G = Integer.MAX_VALUE;
       return;
    }
    public boolean P8(){
       boolean b = ((this.t - this.s) - this.r > 0)? true: false;
       return b;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new j());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.C = this.r8("LIVE_BASIC_CONTEXT");
       this.D = this.r8("LIVE_SERVICE_MANAGER");
       this.E = this.r8("LIVE_LONG_CONNECTION");
       this.F = this.r8("LIVE_CONTEXT_DEBUG_LOGGER");
       this.x = this.s8(d.class);
       return;
    }
}
