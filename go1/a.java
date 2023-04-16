package go1.a;
import im8.g;
import a51.c;
import go1.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import lo1.l;
import p91.m;
import lp3.e;
import ry1.b;
import wo1.a;
import android.view.View$OnTouchListener;
import com.kwai.robust.PatchProxyResult;
import go1.d;
import java.util.Map;
import java.util.HashMap;

public class a extends c implements g	// class@00252f
{
    public e A;
    public BaseFragment B;
    public m C;
    public c D;
    public c v;
    public View$OnTouchListener w;
    public l x;
    public b y;
    public a z;
    public static String sLivePresenterClassName = "LiveHeartParticlePresenter";

    public void a(){
       super();
       this.D = new a$a(this);
    }
    public void E8(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(null, this, uoa, "4")) {
          LiveHeartParticleServiceImpl liveHeartPar = new LiveHeartParticleServiceImpl(this.getActivity(), this.B, this.m8(), this.x, this.C, this.A, this.y, this.z);
          this.v = uoa;
          a tw = this.w;
          if (tw != null) {
             uoa.a(tw);
             this.w = null;
          }
       }
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, a.class, "1");
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.x = this.s8(l.class);
       this.B = this.r8("LIVE_FRAGMENT");
       this.C = this.t8("LIVE_BASIC_CONTEXT");
       this.A = this.r8("LIVE_SERVICE_MANAGER");
       this.y = this.t8("LIVE_AUDIENCE_STATUS_OBTAIN_SERVICE");
       this.z = this.s8(a.class);
       return;
    }
}
