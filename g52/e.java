package g52.e;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import g52.e$a;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import f42.f;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import o02.f;
import o02.e;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import g52.a;
import erd.g;
import g52.b;
import g52.c;
import crd.b;
import g52.h;
import java.util.Map;
import java.util.HashMap;

public class e extends PresenterV2 implements g	// class@002a70
{
    public a0 p;
    public final List q;
    public Throwable r;
    public QLivePushEndInfo s;
    public final i t;
    public static String sLivePresenterClassName = "LivePlayClosedEndInfoObtainPresenter";

    public void e(){
       super();
       this.t = new e$a(this);
       this.q = new LinkedList();
    }
    public void E8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoe, "3")) {
          long l = f.d(f.e(this.p));
          t ot = PatchProxy.apply(objArray, this, uoe, "4");
          if (ot != PatchProxyResult.class) {
          }else {
             ot = e.a().w(this.p.c.getLiveStreamId());
          }
          this.X7(ot.delaySubscription(l, TimeUnit.MILLISECONDS).map(new e()).doOnNext(new a(this)).subscribe(new b(this), new c(this)));
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
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
       this.p = this.q8(a0.class);
       return;
    }
}
