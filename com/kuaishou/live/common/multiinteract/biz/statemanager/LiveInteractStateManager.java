package com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager;
import xz1.a;
import oh3.a;
import lh3.b;
import bh3.f;
import fh3.f;
import ah3.e;
import ch3.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$stateMachineLazy$1;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$b;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$d;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$a;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$c;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$e;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractStateManager$f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bh3.l;
import bh3.d;
import fh3.o;
import fh3.d;
import ah3.v;
import ah3.d;
import ch3.t;
import ch3.c;
import com.kuaishou.live.multiinteract.rtc.b;
import lh3.i0;
import com.kuaishou.live.common.multiinteract.biz.statemanager.LiveInteractState;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import xz1.b;
import java.lang.Integer;
import xz1.d;
import java.lang.Enum;
import w12.a;

public final class LiveInteractStateManager extends a implements a	// class@0017ee
{
    public final p b;
    public final p c;
    public final LiveInteractStateManager$b d;
    public final LiveInteractStateManager$d e;
    public final LiveInteractStateManager$a f;
    public final LiveInteractStateManager$c g;
    public final LiveInteractStateManager$e h;
    public final LiveInteractStateManager$f i;
    public final b j;
    public final f k;
    public final f l;
    public final e m;
    public final d n;

    public void LiveInteractStateManager(b p0,f p1,f p2,e p3,d p4){
       a.p(p0, "rtcManager");
       a.p(p1, "inviteProcessor");
       a.p(p2, "onInviteProcessor");
       a.p(p3, "applyProcessor");
       a.p(p4, "matchProcessor");
       super();
       this.j = p0;
       this.k = p1;
       this.l = p2;
       this.m = p3;
       this.n = p4;
       p op = s.c(new LiveInteractStateManager$stateMachineLazy$1(this));
       this.b = op;
       this.c = op;
       LiveInteractStateManager$b uob = new LiveInteractStateManager$b(this);
       this.d = uob;
       LiveInteractStateManager$d uod = new LiveInteractStateManager$d(this);
       this.e = uod;
       LiveInteractStateManager$a uoa = new LiveInteractStateManager$a(this);
       this.f = uoa;
       LiveInteractStateManager$c uoc = new LiveInteractStateManager$c(this);
       this.g = uoc;
       LiveInteractStateManager$e uoe = new LiveInteractStateManager$e(this);
       this.h = uoe;
       this.i = new LiveInteractStateManager$f(this);
       if (PatchProxy.applyVoid(null, this, LiveInteractStateManager.class, "3")) {
       }else {
          p1.x(uob);
          p2.w(uod);
          p3.m(uoa);
          p4.e1(uoc);
          p0.m(uoe);
       }
       return;
    }
    public final LiveInteractState S(){
       LiveInteractState cONNECTED;
       Object[] objArray = null;
       SCInteractiveChatRoomInfo obj = PatchProxy.apply(objArray, this, LiveInteractStateManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j.b();
       if (obj != null) {
          objArray = obj.roomInfo;
       }
       String str = "LiveInteractState";
       String str1 = "LiveInteractStateManager";
       if (objArray != null) {
          b.S(LiveLogTag.LIVE_MULTI_INTERACT.appendTag(str1), "getInteractState", str, "CONNECTED");
          cONNECTED = LiveInteractState.CONNECTED;
       }else if(!this.k.f().size() && (!this.l.e().size() && (this.n.b1() || this.m.c()))){
          b.S(LiveLogTag.LIVE_MULTI_INTERACT.appendTag(str1), "getInteractState", str, "ESTABLISHING");
          cONNECTED = LiveInteractState.ESTABLISHING;
       }else {
          b.S(LiveLogTag.LIVE_MULTI_INTERACT.appendTag(str1), "getInteractState", str, "IDLE");
          cONNECTED = LiveInteractState.IDLE;
       }
       return cONNECTED;
    }
    public final b T(){
       Object obj = PatchProxy.apply(null, this, LiveInteractStateManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final void U(String p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveInteractStateManager.class, "5")) {
          return;
       }
       LiveLogTag lIVE_MULTI_I = LiveLogTag.LIVE_MULTI_INTERACT;
       lIVE_MULTI_I.appendTag("LiveInteractStateManager");
       b.T(lIVE_MULTI_I, "updateState", "moduleName", p0, "bizType", p1);
       int i = d.a[this.S().ordinal()];
       int i1 = 1;
       if (i != i1) {
          if (i != 2) {
             if (i == 3) {
                this.T().n(2);
             }
          }else {
             this.T().n(i1);
          }
       }else {
          this.T().n(0);
       }
       return;
    }
    public LiveInteractState j(){
       Object obj = PatchProxy.apply(null, this, LiveInteractStateManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.isInitialized()) {
          return this.T().i;
       }
       return this.S();
    }
}
