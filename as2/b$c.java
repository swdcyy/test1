package as2.b$c;
import co2.r;
import as2.b;
import java.lang.Object;
import co2.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import android.os.SystemClock;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.follow.cache.c;
import t02.a0;
import kotlin.jvm.internal.a;
import p91.m;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zr2.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.voiceparty.guide.card.guestleavemic.FollowGuideVoicePartyGuestFollowAnchorConfig;
import v91.b;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFollowGuideConfig;
import java.lang.reflect.Type;
import wg3.a;
import p92.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$VoicePartyGuestLeaveMicFollowGuide;
import hy1.e;
import r92.b;
import hy1.d;
import p92.j;
import java.lang.Long;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import crd.b;
import lnc.b9;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import ht2.a;
import brd.t;
import as2.b$c$a;
import erd.g;

public final class b$c implements r	// class@0002ba
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void a(){
       q.d(this);
    }
    public void b0(int p0,boolean p1){
       q.a(this, p0, p1);
    }
    public void c(int p0){
       boolean b;
       b$c b1;
       a uoa2;
       Object obj = this;
       b uob = b.class;
       b$c uoc = b$c.class;
       String str = "2";
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, uoc, str)) {
          return;
       }
       if (p0 != 2) {
          obj.b.i = 0;
          return;
       }else {
          b.Z(obj.b.f, "LeaveTime: "+SystemClock.elapsedRealtime());
          uoc = obj.b;
          String str1 = "livePlayCallerContext.mLiveBasicContext";
          if (uoc.j != null && (uoc.g != null && (SystemClock.elapsedRealtime() - obj.b.i) - 0x3a98 > 0)) {
             a0 z2 = obj.b.d().Z2;
             a.o(z2, str1);
             if (!c.b().c(z2.d())) {
                uoc = obj.b;
                if (uoc.l == null) {
                   Objects.requireNonNull(uoc);
                   PatchProxyResult patchProxyRe = PatchProxyResult.class;
                   Object[] objArray = null;
                   b obj1 = PatchProxy.apply(objArray, uoc, uob, "3");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else {
                      obj1 = uoc.g;
                      if (obj1 != null) {
                         String name = uoc.f.getName();
                         a.o(name, "TAG.name");
                         QCurrentUser mE = QCurrentUser.ME;
                         a.o(mE, "QCurrentUser.ME");
                         String id = mE.getId();
                         a.o(id, "QCurrentUser.ME.id");
                         a0 z22 = uoc.q.Z2;
                         a.o(z22, str1);
                         String str2 = z22.d();
                         a.o(str2, "livePlayCallerContext.mL¡­BasicContext.anchorUserId");
                         a uoa1 = new a(name, id, str2, 0x5265c00, 0x5265c00, obj1.getGuestShowTimesPerday(), obj1.getAnchorShowTimesPerday());
                         uoa2 = v19;
                      }else {
                         uoa2 = objArray;
                      }
                      uoc.h = uoa2;
                      if (uoa2 != null) {
                         Object obj2 = PatchProxy.apply(objArray, uoa2, a.class, str);
                         if (obj2 != patchProxyRe) {
                            b = obj2.booleanValue();
                         }else {
                            b = uoa2.c.b();
                         }
                      }else {
                         b = false;
                      }
                   }
                   if (b) {
                      b.Z(obj.b.f, "can show leave mic dialog");
                      uoc = obj.b;
                      Objects.requireNonNull(uoc);
                      if (!PatchProxy.applyVoid(objArray, uoc, uob, "4")) {
                         LiveConfigStartupResponse$LiveFollowGuideConfig liveFollowGu = a.q(LiveConfigStartupResponse$LiveFollowGuideConfig.class);
                         if (liveFollowGu != null) {
                            objArray = liveFollowGu.mVoicePartyGuestLeaveMicFollowGuide;
                         }
                         if (objArray == null) {
                            b.Z(uoc.f, "return ! followGuideConfig "+liveFollowGu);
                         }else {
                            b h = uoc.h;
                            if (h != null) {
                               a uoa = new a();
                               a.m(h);
                               uoa.a = h.b();
                               liveFollowGu = liveFollowGu.mVoicePartyGuestLeaveMicFollowGuide;
                               uoa.e = liveFollowGu.mBizId;
                               uoa.d = liveFollowGu.mBizType;
                               uoa.g = liveFollowGu.mSource;
                               a0 z21 = uoc.q.Z2;
                               a.o(z21, str1);
                               uoa.f = z21.d();
                               uoa.h = 214;
                               e uoe = new e(3, 0x2710, uoa);
                               uoe.c(uoc.b);
                               uoc.c.e(uoe);
                               b.Z(uoc.f, "put message into message pool");
                            }
                         }
                      }
                   }else {
                      b.Z(obj.b.f, "can\'t show leave mic dialog because of frequency");
                   }
                }else {
                label_0189 :
                   b1 = obj.b;
                   z2 = obj.b.d().Z2;
                   a.o(z2, str1);
                   b.a0(b1.f, "can\'t show dialog !", c.m("frequencyConfig", b1.g, "duration", Long.valueOf((SystemClock.elapsedRealtime() - obj.b.i)), "is not Following Anchor", Boolean.valueOf((c.b().c(z2.d()) ^ 0x01)), "!isUnFollowDuringOnMicSeat", Boolean.valueOf((obj.b.l ^ 0x01))));
                }
             }else {
                goto label_0189 ;
             }
          }else {
             goto label_0189 ;
          }
          b1 = obj.b;
          b1.j = false;
          b9.a(b1.m);
          return;
       }
    }
    public void n(int p0,LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState p1,a p2){
       if (PatchProxy.isSupport(b$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b$c.class, "1")) {
          return;
       }
       a.p(p2, "micSeatInfo");
       a0 z2 = this.b.d().Z2;
       String str = "livePlayCallerContext.mLiveBasicContext";
       a.o(z2, str);
       if (c.b().c(z2.d())) {
          return;
       }
       b.Z(this.b.f, "EnterTime: "+SystemClock.elapsedRealtime());
       p0.i = SystemClock.elapsedRealtime();
       b$c tb = this.b;
       tb.j = true;
       a0 z21 = this.b.d().Z2;
       a.o(z21, str);
       tb.k = c.b().d(z21.d());
       tb = this.b;
       b k = tb.k;
       k = (k != null)? k.subscribe(new b$c$a(this)): null;
       tb.m = k;
       tb.l = false;
       return;
    }
}
