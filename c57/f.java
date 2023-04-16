package c57.f;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c57.f$b;
import c57.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c57.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import fq5.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import c57.c;
import erd.g;
import crd.b;
import h47.b;
import j47.d;
import mq5.h;
import mq5.b;
import wkd.b;
import z47.c;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Map;
import java.lang.Integer;
import z47.a;
import ft5.b;
import c57.i;
import java.util.HashMap;
import lp3.i;

public class f extends PresenterV2 implements g	// class@0004ed
{
    public h A;
    public k p;
    public i q;
    public b r;
    public d s;
    public b t;
    public LiveStreamFeedWrapper u;
    public b v;
    public List w;
    public String x;
    public b y;
    public f z;

    public void f(){
       super();
       this.p = new f$b(this);
       this.A = new a(this);
    }
    public void E8(){
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
          return;
       }
       this.y = new b(this);
       if (!PatchProxy.applyVoid(objArray, this, uof, "3") && this.r.b() instanceof RxFragment) {
          this.X7(this.r.b().m().subscribe(new c(this)));
       }
       uof = this.s;
       if (uof != null) {
          uof.Q1(this.y);
       }
       this.t.Km(this.A);
       return;
    }
    public void J8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "9")) {
          return;
       }
       f ts = this.s;
       if (ts != null) {
          ts.H8(this.y);
       }
       if (this.w != null) {
          c uoc = b.a(-1181769043);
          String userId = this.u.getUserId();
          Objects.requireNonNull(uoc);
          c uoc1 = c.class;
          if (!PatchProxy.applyVoidOneRefs(userId, uoc, uoc1, "5")) {
             Integer obj = PatchProxy.applyOneRefs(userId, uoc, uoc1, "8");
             b = true;
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                obj = uoc.c.get(userId);
                if (obj == null || obj.intValue() <= b) {
                   uoc.c.remove(userId);
                }else {
                   uoc.c.put(userId, Integer.valueOf((obj.intValue() - b)));
                   b = false;
                }
             }
             if (b && uoc.b.containsKey(userId)) {
                uoc.b.get(userId).a.clear();
                uoc.b.remove(userId);
             }
          }
       label_008a :
          this.w = objArray;
       }
       this.x = objArray;
       this.z = objArray;
       this.t.le(this.A);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       this.v.J0();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
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
          obj.put(f.class, new i());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_SERVICE_MANAGER");
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.v = this.r8("LIVE_AUDIENCE_SEND_COMMENTS_SERVICE");
       this.s = this.s8(d.class);
       this.t = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.u = this.r8("LIVE_PHOTO");
       return;
    }
}
