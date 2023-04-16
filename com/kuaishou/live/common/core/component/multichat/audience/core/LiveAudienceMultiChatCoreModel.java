package com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel;
import jp1.b;
import up1.b;
import hf3.a;
import lp1.d;
import sz1.e;
import ee1.a;
import com.kwai.video.waynelive.LivePlayerController;
import op1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wp1.c;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$a;
import kp1.a;
import vp1.b;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$stateMachine$1;
import msd.a;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$b;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import ip1.a;
import jp1.e;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$setLayoutInterceptor$1$1;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$setLayoutInterceptor$1$2;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$setLayoutInterceptor$1$3;
import com.kuaishou.live.common.core.component.multichat.audience.core.LiveAudienceMultiChatCoreModel$setLayoutInterceptor$1$4;
import re3.d;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import w12.a;
import com.kuaishou.live.livestage.g;
import com.kuaishou.live.livestage.f;
import re3.e;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import xp1.b;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import uz1.a;
import lh3.i0;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import qrd.r0;
import com.kwai.framework.model.user.QCurrentUser;
import lh3.b;
import java.util.Map;
import trd.t0;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Boolean;
import java.lang.Integer;

public final class LiveAudienceMultiChatCoreModel extends b implements b	// class@0014c7
{
    public f n;
    public final d0 o;
    public final a p;
    public final a q;
    public final i0 r;
    public final d s;
    public final a t;
    public final LivePlayerController u;
    public final b v;

    public void LiveAudienceMultiChatCoreModel(a p0,d p1,e p2,a p3,LivePlayerController p4,b p5){
       a.p(p0, "liveLongConnection");
       a.p(p1, "multiChatDelegate");
       a.p(p2, "multiInteractManager");
       a.p(p3, "rtcService");
       a.p(p4, "playerController");
       super(p0, p2, p1);
       this.s = p1;
       this.t = p3;
       this.u = p4;
       this.v = p5;
       this.o = new LiveAudienceMultiChatCoreModel$a(this);
       this.p = new a(this.o(), new LiveAudienceMultiChatCoreModel$stateMachine$1(this));
       this.q = new LiveAudienceMultiChatCoreModel$b(this);
       this.r = new LiveAudienceMultiChatCoreModel$c(this);
    }
    public a D(){
       return this.p;
    }
    public final void E(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatCoreModel.class, "7")) {
          return;
       }
       LiveAudienceMultiChatCoreModel ts = this.s;
       e uoe = new e(new LiveAudienceMultiChatCoreModel$setLayoutInterceptor$1$1(ts), new LiveAudienceMultiChatCoreModel$setLayoutInterceptor$1$2(ts), new LiveAudienceMultiChatCoreModel$setLayoutInterceptor$1$3(ts), new LiveAudienceMultiChatCoreModel$setLayoutInterceptor$1$4(ts), this.p());
       ts.c().setLayoutInterceptor(v8);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatCoreModel.class, "10")) {
          return;
       }
       b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "CoreModel onDestroy");
       this.v0(9);
       this.D().n(0);
       super.b();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatCoreModel.class, "4")) {
          return;
       }
       g og = this.p().vi();
       b.e0(LiveCommonLogTag.NEW_MULTI_CHAT, "LiveStage destroyLiveStage", "liveStage", this.n, "stageManager", og, "commonLogParam", this.l());
       LiveAudienceMultiChatCoreModel tv = this.v;
       if (tv != null) {
          tv.release();
       }
       tv = this.n;
       if (tv != null && og != null) {
          a.m(tv);
          og.a(tv);
          this.s.c().setPositionCalculator(null);
          this.s.c().setLayoutInterceptor(null);
       }
       this.n = null;
       return;
    }
    public void d(MultiChatState p0,MultiChatState p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveAudienceMultiChatCoreModel.class, "8")) {
          return;
       }
       a.p(p0, "oldState");
       a.p(p1, "newState");
       super.d(p0, p1, p2);
       if (p1 != MultiChatState.IDLE) {
          b uob = this.m();
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoid(null, uob, b.class, "2")) {
             uob = uob.c;
             uob.setValue(uob.getValue());
          }
       }
       return;
    }
    public a h(){
       return this.q;
    }
    public i0 i(){
       return this.r;
    }
    public String l(){
       QCurrentUser mE;
       Pair[] obj = PatchProxy.apply(null, this, LiveAudienceMultiChatCoreModel.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Pair[]{r0.a("anchorId", this.s.h()),r0.a("currentUserId", mE.getId()),r0.a("liveStreamId", this.s.getLiveStreamId()),r0.a("chatId", this.q().f())};
       mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       return t0.W(obj).toString();
    }
    public a r(){
       return this.D();
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceMultiChatCoreModel.class, "6")) {
          return;
       }
       if (MultiChatState.CHATTING == this.D().u()) {
          LayoutConfig value = this.m().c().getValue();
          if (value != null && value.c() == 1) {
             b.Z(LiveCommonLogTag.NEW_MULTI_CHAT, "CoreModel reloadChatLayoutConfig");
             this.E();
          }
       }
       return;
    }
    public boolean t(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceMultiChatCoreModel.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.D().u() == MultiChatState.CHATTING)? true: false;
       return b;
    }
    public void v0(int p0){
       LiveAudienceMultiChatCoreModel liveAudience = LiveAudienceMultiChatCoreModel.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveAudience, "5")) {
          return;
       }
       if (MultiChatState.CHATTING == this.D().u()) {
          b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "CoreModel leaveLiveChat", "leaveReason", Integer.valueOf(p0));
          this.q().q();
       }
       return;
    }
}
