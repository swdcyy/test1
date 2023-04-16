package com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$e;
import lh3.i0;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl;
import java.lang.Object;
import nh3.a;
import lh3.h0;
import java.lang.Throwable;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatClosed;
import com.kuaishou.live.multiinteract.rtc.RtcCloseReason;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import sz1.m;
import com.kuaishou.live.livestage.g;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatSwitchBiz;
import java.util.Objects;
import lp3.e;
import lp3.a;
import n91.f;
import lp3.c;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatBizIdentity;
import com.kuaishou.live.common.core.component.livestage.LiveStageInit;
import d02.d;
import lh3.b;
import hh3.d;
import brd.t;
import xo1.i;
import com.kuaishou.live.lite.adapter.component.multiinteract.LiveLiteMultiInteractManagerImpl$initStageManagerIfNeed$1;
import ee1.a;
import xo1.a;
import msd.a;
import xo1.f;
import d02.a;
import d02.b;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.live.common.core.component.livestage.a;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory;
import msd.l;
import com.kuaishou.live.common.core.component.livestage.LiveStageRenderViewFactory$a;
import g83.a;
import g83.b;
import oe3.f;
import nsd.u;
import com.kuaishou.live.livestage.g$a;
import je3.i;
import je3.k;
import je3.g;
import je3.c;
import je3.n;
import ee3.f;
import ee3.z;
import ee3.g;
import nh3.c;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;

public final class LiveLiteMultiInteractManagerImpl$e implements i0	// class@001dfc
{
    public final LiveLiteMultiInteractManagerImpl a;

    public void LiveLiteMultiInteractManagerImpl$e(LiveLiteMultiInteractManagerImpl p0){
       this.a = p0;
       super();
    }
    public void o(a p0){
       h0.e(this, p0);
    }
    public void p(int p0,int p1){
       h0.b(this, p0, p1);
    }
    public void q(int p0,boolean p1,Throwable p2){
       h0.i(this, p0, p1, p2);
    }
    public void r(int p0){
       h0.a(this, p0);
    }
    public void s(SCInteractiveChatClosed p0,RtcCloseReason p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteMultiInteractManagerImpl$e.class, "1")) {
          return;
       }
       a.p(p1, "reason");
       m n = this.a.n;
       if (n != null) {
          n.release();
       }
       n.n = null;
       return;
    }
    public void t(int p0){
       h0.j(this, p0);
    }
    public void u(SCInteractiveChatSwitchBiz p0){
       Object obj = this;
       SCInteractiveChatSwitchBiz obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveLiteMultiInteractManagerImpl$e.class, "2")) {
          return;
       }
       LiveLiteMultiInteractManagerImpl$e a = obj.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(obj1, a, LiveLiteMultiInteractManagerImpl.class, "3") && a.n == null) {
          c uoc = a.Po().a(f.class);
          a.o(uoc, "serviceManager.getServic¡­TimeProvider::class.java\)");
          boolean b = true;
          if (obj1 != null) {
             obj1 = obj1.roomInfo;
             if (obj1 != null) {
                InteractiveChatRoomInfo bizIdentity = obj1.bizIdentity;
                if (bizIdentity != null && bizIdentity.bizType == b) {
                label_0049 :
                   b uob = a.gc();
                   a.o(uob, "liveInteractRtcManager");
                   d uod = a.Sj();
                   a.o(uod, "liveInteractMediaProcessor");
                   m s = a.s;
                   a.o(s, "mBizSwitchObservable");
                   d uod1 = new d(uob, uod, s);
                   a.o = uod1;
                   a.m(uod1);
                   a uoa = a.y.c();
                   a.m(uoa);
                   a uoa1 = a.y.c();
                   a.m(uoa1);
                   a uoa2 = a.y.c();
                   a.m(uoa2);
                   a.n = g$a.d(g.a, uod1, new i(a.m, null, new LiveLiteMultiInteractManagerImpl$initStageManagerIfNeed$1(a)), new f(uoa.a()), a.y.b(), LiveStageRenderViewFactory.e.d(uoa1.b(), uoa2.c()), new a(uoc), b.a, null, new f(b, false, 2, null), 128, null);
                }
             }
          }
          b = LiveStageInit.c;
          goto label_0049 ;
       }
       return;
    }
    public void v(boolean p0,Throwable p1){
       h0.d(this, p0, p1);
    }
    public void w(c p0){
       h0.c(this, p0);
    }
    public void x(SCInteractiveChatRoomInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiInteractManagerImpl$e.class, "3")) {
          return;
       }
       a.p(p0, "scInteractiveChatRoomInfo");
       this.a.Vo();
       return;
    }
}
