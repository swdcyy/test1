package hg2.a;
import im8.g;
import c12.f;
import hg2.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Long;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;
import com.kwai.robust.PatchProxyResult;
import hg2.d;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends f implements g	// class@002d93
{
    public long K;
    public LiveStreamFeedWrapper L;
    public e M;
    public static String sLivePresenterClassName = "LiveAudienceSendGiftRealActionPresenter";

    public void a(){
       super();
       this.K = -1;
       this.M = new a$a(this);
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, a.class, "2")) {
          return;
       }
       this.a9();
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a tK = this.K;
       if (tK - -1) {
          this.b9(tK);
          this.K = -1;
       }
       return;
    }
    public void b9(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "4")) {
          return;
       }
       RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
       uExtParams.mTotalSendGiftPrice = p0;
       c.b(14, this.L.mEntity, uExtParams);
       return;
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
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.j8();
       this.L = this.r8("LIVE_PHOTO");
       return;
    }
}
