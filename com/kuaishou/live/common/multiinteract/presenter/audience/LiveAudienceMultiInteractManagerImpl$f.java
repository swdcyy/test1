package com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl$f;
import xq5.c;
import com.kuaishou.live.common.multiinteract.presenter.audience.LiveAudienceMultiInteractManagerImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sz1.m;
import kotlin.jvm.internal.a;
import lh3.b;
import xg3.a;
import com.kuaishou.live.multiinteract.rtc.b;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import nh3.b;
import f02.a;
import sz1.a;
import java.util.List;
import java.util.Iterator;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Integer;
import java.lang.System;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import com.kuaishou.live.common.multiinteract.biz.adapter.a;
import lh3.c;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public final class LiveAudienceMultiInteractManagerImpl$f implements c	// class@0017f4
{
    public final LiveAudienceMultiInteractManagerImpl b;

    public void LiveAudienceMultiInteractManagerImpl$f(LiveAudienceMultiInteractManagerImpl p0){
       this.b = p0;
       super();
    }
    public void P(){
       String str;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, LiveAudienceMultiInteractManagerImpl$f.class, "1")) {
          return;
       }
       m k = obj.b.k;
       a.o(k, "liveInteractController");
       b uob = k.d();
       a.o(uob, "liveInteractController.liveInteractRtcManager");
       SCInteractiveChatRoomInfo sCInteractiv = uob.b();
       if (sCInteractiv != null) {
          a.o(sCInteractiv, "liveInteractController.l\x20\x02iveChatRoomInfo ?: return\x00");
          LiveAudienceMultiInteractManagerImpl k1 = obj.b.K;
          if (k1 != null) {
             uob = a.j(sCInteractiv);
             a.o(uob, "LiveMultiLineConvertUtil¡­InfoPb2RoomInfo\(roomInfo\)");
             if (!PatchProxy.applyVoidOneRefs(uob, k1, a.class, "4")) {
                a.p(uob, "roomInfo");
                if (k1.a != null) {
                   Iterator iterator = uob.f().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         c uoc = iterator.next();
                         a.o(uoc, "userInfo");
                         if (a.g(uoc.c().mId, k1.i)) {
                            str = uoc.b();
                         }
                      }else {
                         str = null;
                      }
                      k1.d.clear();
                      k1.e.clear();
                      k1.a(10, str, uob.a(), "USER_EXIT", Integer.valueOf(uob.b()), uob.c(), System.currentTimeMillis(), k1.b, k1.d, k1.e, k1.f);
                      k1.g();
                   }
                }
             }
          }
          k = obj.b.h;
          if (k != null) {
             BizEndReason pageOut = BizEndReason.PageOut;
             if (!PatchProxy.applyVoidOneRefs(pageOut, k, a.class, "10")) {
                k.T(null, pageOut);
                k.c.i();
             }
          }
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
