package lh2.e;
import im8.g;
import k51.c;
import lh2.e$a;
import io.reactivex.subjects.PublishSubject;
import java.util.HashSet;
import com.kuaishou.live.core.show.redpacket.redpackrain2.forbidden.LiveRedPackRainForbiddenBiz;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ph2.a;
import ih2.x;
import brd.y;
import com.kwai.robust.PatchProxyResult;
import lh2.h;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class e extends c implements g	// class@003635
{
    public x p;
    public final i q;
    public c r;
    public c s;
    public HashSet t;
    public static String sLivePresenterClassName = "LiveRedPackRainForbiddenPresenter";

    public void e(){
       super();
       this.q = new e$a(this);
       this.r = PublishSubject.g();
       this.s = PublishSubject.g();
       this.t = new HashSet();
    }
    public LiveRedPackRainForbiddenBiz P8(){
       return LiveRedPackRainForbiddenBiz.NOT_FORBIDDEN;
    }
    public void R8(LiveRedPackRainForbiddenBiz p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "2")) {
          return;
       }
       b.d0(LiveLogTag.LIVE_RED_PACK_RAIN, "onRedPackRainForbiddenChanged", "forbiddenBiz", p0, "enabled", Boolean.valueOf(p1));
       if (p1) {
          this.t.add(p0);
          if (this.p.b() != null) {
             this.r.onNext(p0);
          }
       }else {
          this.t.remove(p0);
          this.s.onNext(p0);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new h());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_RED_PACK_RAIN_SERVICE");
       return;
    }
}
