package com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController$a;
import up1.d;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multichat.core.statemachine.MultiChatState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import hp1.a;
import java.lang.Enum;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import ip1.a;
import android.view.ViewGroup;
import java.util.Objects;
import lp1.b;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.viewcontroller.ViewController;
import nh3.a;
import up1.c;

public final class LiveAudienceMultiChatController$a implements d	// class@0014b6
{
    public final LiveAudienceMultiChatController b;

    public void LiveAudienceMultiChatController$a(LiveAudienceMultiChatController p0){
       this.b = p0;
       super();
    }
    public void H0(MultiChatState p0,MultiChatState p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveAudienceMultiChatController$a.class, "1")) {
          return;
       }
       a.p(p0, "oldState");
       a.p(p1, "newState");
       int i = a.a[p1.ordinal()];
       if (i != 1) {
          if (i == 2 || i == 3) {
             this.b.v.c().setVisibility(0);
          }
       }else {
          this.b.v.c().setVisibility(8);
       }
       return;
    }
    public void h0(MultiChatState p0,MultiChatState p1,Object p2){
       LiveAudienceMultiChatController$a tb;
       LiveAudienceMultiChatController liveAudience = LiveAudienceMultiChatController.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveAudienceMultiChatController$a.class, "2")) {
          return;
       }
       a.p(p0, "oldState");
       a.p(p1, "newState");
       int i = a.b[p1.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i != 2) {
             if (i == 3) {
                tb = this.b;
                Objects.requireNonNull(tb);
                if (!PatchProxy.applyVoidOneRefs(p0, tb, liveAudience, "7")) {
                   tb.Z2();
                   if (MultiChatState.IDLE == p0) {
                      tb.w.D();
                   }
                   tb.w.J1();
                   tb.W2(false);
                   b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "onEnterChattingState", "oldState", p0);
                }
             }
          }else {
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p0, tb, liveAudience, "6")) {
                tb.Z2();
                if (MultiChatState.CHATTING == p0) {
                   tb.w.A5();
                }else if(MultiChatState.IDLE == p0){
                   tb.w.D();
                }
                tb.w.b2();
                tb.W2(b);
                b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "onEnterWatchingState", "oldState", p0);
             }
          }
       }else {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, liveAudience, "5")) {
             if (!PatchProxy.applyVoid(null, tb, liveAudience, "18")) {
                liveAudience = tb.n;
                if (liveAudience != null) {
                   tb.O2(liveAudience);
                   tb.n = null;
                }
             }
             tb.Z2();
             if (MultiChatState.CHATTING == p0) {
                tb.w.A5();
             }else if(MultiChatState.WATCHING == p0){
                tb.w.Y2();
             }
             tb.w.I();
             b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "onExitMultiChat", "oldState", p0);
          }
       }
       return;
    }
    public void o(a p0){
       c.a(this, p0);
    }
}
