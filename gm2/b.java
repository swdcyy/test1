package gm2.b;
import c12.f;
import gm2.b$a;
import gm2.a;
import gm2.b$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.watchtimer.b;
import com.kwai.robust.PatchProxyResult;
import rp5.a;
import lp3.c;
import lp3.i;
import android.app.Activity;
import xp5.g;
import java.lang.Number;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.live.model.QLivePlayConfig;
import ds5.e;
import aq5.d;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import xp5.a;
import yy1.b;
import aq5.b;
import ds5.c;
import ds5.a;
import com.kwai.framework.activitycontext.ActivityContext$b;
import com.kwai.framework.activitycontext.ActivityContext;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b extends f	// class@002b4b
{
    public i K;
    public a0 L;
    public String M;
    public final c N;
    public final b O;
    public final ActivityContext$b P;
    public static String sLivePresenterClassName = "LiveAudienceWatchTimerPresenter";

    public void b(){
       super();
       this.N = new b$a(this);
       this.O = new a(this);
       this.P = new b$b(this);
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b.class, "3")) {
          return;
       }
       this.c9();
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b.e().a(this.b9(), this.a9());
       return;
    }
    public String a9(){
       Activity obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K.a(a.class).c();
       this.M = (obj != null)? String.valueOf(obj.hashCode()): this.K.a(g.class).getLiveStreamId();
       return this.M;
    }
    public int b9(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.a(this.L.c.isGRPRCustomizedLive(), this.L.J.C0().mIsShopLive, this.K.a(d.class).r2(AudienceBizRelation.VOICE_PARTY), this.L.y4().b(), this.K.a(g.class).V0());
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b.e().b(this.M);
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.K.a(d.class).G5(this.O, uoaArray);
       this.L.J.fo(this.N);
       ActivityContext.k(this.P);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.r8("LIVE_SERVICE_MANAGER");
       this.L = this.q8(a0.class);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.c9();
       return;
    }
    public void x(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, uob, "6")) {
          b.e().a(this.b9(), this.a9());
          a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
          this.K.a(d.class).u5(this.O, uoaArray);
          this.L.J.gd(this.N);
          ActivityContext.i(this.P);
       }
       return;
    }
}
