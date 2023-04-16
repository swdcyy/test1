package fw1.e;
import k51.c;
import fw1.a;
import java.util.HashMap;
import fw1.b;
import com.kuaishou.livestream.message.nano.LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf3.g;
import hm3.a;
import hf3.a;
import v51.a;
import java.util.Map;
import wu1.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.i;
import lp3.c;

public class e extends c	// class@0023c4
{
    public a p;
    public g q;
    public a r;
    public final Map s;
    public final g t;
    public static String sLivePresenterClassName = "LiveTopRightTkPendantPresenter";
    public static final c u;

    static {
       e.u = a.b;
    }
    public void e(){
       super();
       this.s = new HashMap();
       this.t = new b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.p.u0(1057, LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget.class, this.t);
       this.r.u().u0(1057, LiveCommonTopRightTkWidgetProto$SCLiveCommonTopRightTkWidget.class, this.t);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.p.o(1057, this.t);
       this.r.u().o(1057, this.t);
       this.s.clear();
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "6")) {
          return;
       }
       this.q.a(p0);
       b uob = this.s.remove(p0);
       if (uob != null) {
          uob.dispose();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.s8(g.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.p = oi.a(a.class);
       this.r = oi.a(a.class);
       return;
    }
}
