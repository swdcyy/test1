package com.kuaishou.live.audience.component.chat.bridge.LiveJsChannelChatApplyState;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import com.kuaishou.live.audience.component.chat.bridge.LiveJsChannelChatApplyState$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import lp3.c;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$b;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import com.kuaishou.live.audience.component.chat.bridge.LiveJsChannelChatApplyState$ChatApplyState;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.audience.component.chat.bridge.LiveJsChannelChatApplyState$a;
import fg6.a;
import com.google.gson.Gson;
import lp3.e;
import com.kwai.robust.PatchProxyResult;
import qx0.a;
import java.lang.Enum;

public class LiveJsChannelChatApplyState extends AbstractLiveJsChannel	// class@000a78
{
    public final LiveAudienceApplyChatService$b h;
    public boolean i;
    public LiveAudienceApplyChatService j;

    public void LiveJsChannelChatApplyState(){
       super();
       this.h = new LiveJsChannelChatApplyState$b(this);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, LiveJsChannelChatApplyState.class, "3")) {
          return;
       }
       this.j = this.i(LiveAudienceApplyChatService.class);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveJsChannelChatApplyState.class, "4")) {
          return;
       }
       this.p();
       return;
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveJsChannelChatApplyState.class, "1")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.m(p0, p1);
       if (!PatchProxy.applyVoid(null, this, LiveJsChannelChatApplyState.class, "5") && this.i == null) {
          this.i = true;
          LiveJsChannelChatApplyState tj = this.j;
          if (tj != null) {
             tj.Od(this.h);
          }
       }
       this.o(this.q(this.i(LiveAudienceApplyChatService.class).jh()));
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsChannelChatApplyState.class, "2")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.n(p0);
       this.p();
       return;
    }
    public final void o(LiveJsChannelChatApplyState$ChatApplyState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveJsChannelChatApplyState.class, "7")) {
          return;
       }
       b.Z(LiveCommonLogTag.BLIND_DATE, "self guest state change:"+p0);
       this.a(a.a.q(new LiveJsChannelChatApplyState$a(p0.getValue())));
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, LiveJsChannelChatApplyState.class, "6")) {
          return;
       }
       if (this.i != null && !this.j().b()) {
          this.i = false;
          LiveJsChannelChatApplyState tj = this.j;
          if (tj != null) {
             tj.eb(this.h);
          }
       }
       return;
    }
    public final LiveJsChannelChatApplyState$ChatApplyState q(LiveAudienceApplyChatService$State p0){
       LiveJsChannelChatApplyState$ChatApplyState cHAT_USER_ST;
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveJsChannelChatApplyState.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
       label_0023 :
          cHAT_USER_ST = LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_IDLE;
       }else {
          int i = a.a[p0.ordinal()];
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   goto label_0023 ;
                }else {
                   cHAT_USER_ST = LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_CHATTING;
                }
             }else {
                cHAT_USER_ST = LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_APPLYING;
             }
          }else {
             cHAT_USER_ST = LiveJsChannelChatApplyState$ChatApplyState.CHAT_USER_STATE_IDLE;
          }
       }
       return cHAT_USER_ST;
    }
}
