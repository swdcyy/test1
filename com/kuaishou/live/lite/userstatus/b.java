package com.kuaishou.live.lite.userstatus.b;
import qa3.b;
import e93.a;
import rd3.b;
import java.lang.Object;
import wa1.i;
import crd.b;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse;
import qa3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Long;
import pp.c;
import com.kuaishou.android.live.log.b;
import td3.c;
import td3.b;
import xp5.g;
import com.kwai.framework.model.user.QCurrentUser;
import d61.v;
import com.kuaishou.live.lite.LiveLiteParam;
import brd.t;
import cjd.e;
import erd.o;
import java.util.concurrent.TimeUnit;
import td3.a;
import com.kuaishou.live.lite.userstatus.a;
import erd.g;

public class b implements b	// class@000b92
{
    public final i a;
    public LiveLiteDelayInfoResponse b;
    public final a c;
    public final b d;
    public final b e;

    public void b(a p0,b p1){
       super();
       this.a = new i();
       this.c = p0;
       this.d = p1;
       this.e = this.d();
    }
    public LiveLiteDelayInfoResponse a(){
       return this.b;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       this.a.remove(p0);
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       this.a.add(p0);
       return;
    }
    public final b d(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uob, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, uob, "3");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig liveAudience = a.g(LiveConfigStartupResponse$LiveAudienceDelayInfosRequestDelayConfig.class);
          l = (liveAudience == null)? 5000: liveAudience.mLiteDelayInfosApiDelayMs;
       }
       b.c0(LiveLiteLogTag.USER_STATUS, "LiteDelayInfoController.fetchDelayInfo start", "delayMs", Long.valueOf(l));
       return b.b().b(this.d.a(), this.c.getLiveStreamId(), v.f(QCurrentUser.me().getId(), 0), this.c.ok().getStartPlaySourceType()).map(new e()).delaySubscription(l, TimeUnit.MILLISECONDS).subscribe(new a(this), a.b);
    }
}
