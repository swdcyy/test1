package bn2.b;
import im8.g;
import c12.f;
import bn2.b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import bn2.e;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$b;
import bn2.b$b;
import brd.t;
import ry1.b;
import pa1.i;
import brd.w;
import erd.c;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kuaishou.live.core.show.wish.a;
import erd.o;
import bn2.a;
import erd.g;
import crd.b;

public class b extends f implements g	// class@00041b
{
    public a0 K;
    public LiveBizParam L;
    public LiveAudienceWishRoomKrnDialogPresenter$b M;
    public b$b N;
    public static String sLivePresenterClassName = "LiveAudienceWishRoomTaskPresenter";

    public void b(){
       super();
       this.N = new b$a(this);
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(b.class)) {
          PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b.class, "3");
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new e());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.L = this.q8(LiveBizParam.class);
       this.K = this.q8(a0.class);
       this.M = this.q8(LiveAudienceWishRoomKrnDialogPresenter$b.class);
       return;
    }
    public void x(boolean p0){
       t ot;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uob, "4") && this.N.a()) {
          b tK = this.K;
          a0 b3 = tK.b3;
          if (b3 != null && tK.L != null) {
             ot = t.zip(b3.T3(), this.K.L, i.a);
          }else {
             z c = d.c;
             ot = t.timer(1000, TimeUnit.MILLISECONDS, c).subscribeOn(c).map(a.b);
          }
          this.X7(ot.observeOn(d.a).subscribe(new a(this)));
       }
       return;
    }
}
