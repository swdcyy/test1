package k71.j;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import or5.d;
import hz1.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.bridge.model.LiveJSRoomInfoModel;
import lp3.e;
import xp5.g;
import lp3.c;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import dsd.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import bt5.b;
import java.lang.Boolean;
import o63.m;
import o63.m$a;

public final class j extends AbstractLiveJsCommand	// class@002cb7
{

    public void j(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       Integer integer2;
       a uoa = a.class;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, j.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = new LiveJSRoomInfoModel();
       c uoc = this.h().a(g.class);
       a.o(uoc, "serviceManager.getServic¡­eInfoManager::class.java\)");
       p0.setLiveStreamId(uoc.getLiveStreamId());
       p0.setAnchorUserId(uoc.d());
       p0.setExpTag(uoc.getExpTag());
       if (!uoc.e()) {
          a uoa1 = this.h().c(uoa);
          int i = 0;
          int i1 = (uoa1 != null && uoa1.e5() == true)? 1: 0;
          p0.setGameStyle(i1);
          uoa1 = this.h().c(uoa);
          i1 = (uoa1 != null && uoa1.l() == true)? 1: 0;
          p0.setMultiTab(i1);
          uoa1 = this.h().c(uoa);
          if (uoa1 != null) {
             Integer integer = a.f(uoa1.f6());
             if (integer != null) {
                i = integer.intValue();
             }
          }
          p0.setSubType(i);
          uoc = this.h().a(d.class);
          a.o(uoc, "serviceManager.getServic¡­eInfoManager::class.java\)");
          LiveStreamFeed liveStreamFe = uoc.j0();
          Integer integer1 = null;
          if (liveStreamFe != null) {
             p0.setFeedLogCtx(r1.O0(liveStreamFe));
             String str = "AD";
             PhotoAdvertisement photoAdverti = liveStreamFe.get(str);
             photoAdverti = (photoAdverti != null)? photoAdverti.mFansTopAttributeParams: integer1;
             p0.setFansTopAttributeParams(photoAdverti);
             PhotoAdvertisement photoAdverti1 = liveStreamFe.get(str);
             photoAdverti1 = (photoAdverti1 != null)? photoAdverti1.mCallbackParam: integer1;
             p0.setAdCallbackParam(photoAdverti1);
          }
          b uob = this.h().c(b.class);
          if (uob != null) {
             integer1 = a.f(uob.df());
          }
          p0.setEnterAction(integer1);
          uoc = this.h().a(d.class);
          a.o(uoc, "serviceManager.getServic¡­eInfoManager::class.java\)");
          p0.setNormalPlay(a.a(uoc.wa()));
       }else {
          p0.setEscrow(a.a(uoc.G1()));
       }
       return m.g.f(p0, true);
    }
}
