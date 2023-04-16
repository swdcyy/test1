package ly0.b;
import vf1.a;
import lp3.a;
import java.util.ArrayList;
import ly0.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import lp3.c;
import xq5.c;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import xp5.g;
import com.kuaishou.live.audience.basic.debuglog.LiveShowLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import my0.b;
import my0.a;
import ly0.e;
import ok.x;
import com.kwai.framework.model.user.QCurrentUser;
import d61.v;
import ss5.a;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import lnc.i3;
import com.kwai.feature.api.live.base.model.LiveActivityTaskInfo;
import java.lang.Long;
import java.lang.Number;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.util.concurrent.TimeUnit;
import ly0.a;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import vf1.b;
import java.util.List;
import java.util.Collection;
import ekd.q;

public class b extends a implements a	// class@003079
{
    public List d;
    public b e;
    public LiveSlidePlayService f;
    public final c g;

    public void b(){
       super();
       this.d = new ArrayList();
       this.g = new b$a(this);
    }
    public void Qo(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       LiveSlidePlayService liveSlidePla = this.Po().a(LiveSlidePlayService.class);
       this.f = liveSlidePla;
       if (liveSlidePla.v()) {
          this.f.P4(this.g);
       }else {
          this.So();
       }
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       if (this.f.v()) {
          this.f.d5(this.g);
       }
       b9.a(this.e);
       return;
    }
    public void So(){
       Object[] objArray;
       long l1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "5")) {
          return;
       }
       if (this.Po().a(og).U()) {
          b.Z(LiveShowLogTag.DELAY_INFO, "need downgrade, ignore");
          return;
       }else {
          Object obj = e.a.get();
          String liveStreamId = this.Po().a(og).getLiveStreamId();
          long l = v.f(QCurrentUser.me().getId(), 0);
          int i = this.Po().a(b.class).Zc().a();
          String str = PatchProxy.apply(null, this, uob, "6");
          if (str != patchProxyRe) {
          }else {
             LiveBizParam liveBizParam = this.Po().a(a.class).e1();
             if (liveBizParam.mLiveSquareReplaceModel == null) {
                liveBizParam = liveBizParam.mLiveActivityTaskInfo;
                if (liveBizParam != null) {
                   i3 oi3 = i3.f();
                   oi3.c("ztTaskSubBizId", Long.valueOf(liveBizParam.mSubBizId));
                   oi3.c("ztTaskId", Long.valueOf(liveBizParam.mTaskId));
                   str = oi3.e();
                }
             }
             objArray = null;
          label_00a7 :
             t ot = obj.a(liveStreamId, l, i, objArray).map(new e());
             Object obj1 = PatchProxy.apply(null, this, uob, "7");
             if (obj1 != patchProxyRe) {
                l1 = obj1.longValue();
             }else {
                LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig liveAudience = a.g(LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig.class);
                l1 = (liveAudience == null)? 5000: liveAudience.mLiveDelayInfosRequestDelayMs;
             }
             this.e = ot.delaySubscription(l1, TimeUnit.MILLISECONDS).subscribe(new a(this), e.b);
             return;
          }
          objArray = str;
          goto label_00a7 ;
       }
    }
    public void Z9(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (!this.d.contains(p0)) {
          this.d.add(p0);
       }
       return;
    }
    public void uh(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       if (!q.f(this.d)) {
          this.d.remove(p0);
       }
       return;
    }
}
