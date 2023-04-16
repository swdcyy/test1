package d92.a;
import im8.g;
import k51.c;
import java.util.ArrayList;
import d92.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d92.b;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;
import t02.a0;
import lo1.c;
import java.util.Objects;
import d92.q;
import java.lang.ref.WeakReference;
import ekd.k1;
import java.util.List;
import ekd.m1;
import com.kuaishou.live.gzone.barrage.BarrageView;
import com.kwai.robust.PatchProxyResult;
import d92.e;
import java.util.Map;
import java.util.HashMap;

public class a extends c implements g	// class@0024a3
{
    public View p;
    public View q;
    public BarrageView r;
    public a0 s;
    public q t;
    public final List u;
    public a$b v;
    public static String sLivePresenterClassName = "LiveAudienceGesturePresenter";

    public void a(){
       super();
       this.u = new ArrayList();
       this.v = new a$a(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "5")) {
          this.t = new b(this, this.m8());
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "6")) {
          this.q.setOnTouchListener(this.t);
          this.p.setOnTouchListener(this.t);
          this.r.setOnTouchListener(this.t);
          this.s.T1.a(this.t);
       }
       return;
    }
    public void J8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "4")) {
          return;
       }
       a tt = this.t;
       Objects.requireNonNull(tt);
       if (!PatchProxy.applyVoid(null, tt, q.class, "15")) {
          q h = tt.h;
          if (h != null) {
             h.clear();
          }
          k1.n(tt);
       }
       this.t = null;
       this.u.clear();
       if (!PatchProxy.applyVoid(null, this, uoa, "7")) {
          this.p.setOnTouchListener(null);
          this.q.setOnTouchListener(null);
          this.r.setOnTouchListener(null);
          this.s.T1.a(null);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a30e6);
       this.r = m1.f(p0, 0x7f0a03e8);
       this.q = m1.f(p0, 0x7f0a22df);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new e());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.s = this.q8(a0.class);
       return;
    }
}
