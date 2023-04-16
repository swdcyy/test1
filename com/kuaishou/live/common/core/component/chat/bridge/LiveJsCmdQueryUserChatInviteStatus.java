package com.kuaishou.live.common.core.component.chat.bridge.LiveJsCmdQueryUserChatInviteStatus;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.common.core.component.chat.bridge.LiveJsCmdQueryUserChatInviteStatus$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import rd1.f;
import lp3.c;
import xd1.c;
import com.kuaishou.live.common.core.component.chat.bridge.LiveJsCmdQueryUserChatInviteStatus$ChatInviteState;
import fq1.b;
import eq1.a;
import kotlin.jvm.internal.a;
import o63.m;
import com.kuaishou.live.common.core.component.chat.bridge.LiveJsCmdQueryUserChatInviteStatus$b;
import o63.m$a;

public class LiveJsCmdQueryUserChatInviteStatus extends AbstractLiveJsCommand	// class@00103e
{

    public void LiveJsCmdQueryUserChatInviteStatus(){
       super();
    }
    public Class a(){
       return LiveJsCmdQueryUserChatInviteStatus$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdQueryUserChatInviteStatus.class, "1");
       if (p1 != patchProxyRe) {
          return p1;
       }
       if (!p0 instanceof LiveJsCmdQueryUserChatInviteStatus$a || p0.a() == null) {
          p0 = m.g.c("invalid params");
       }else {
          p0 = p0.a();
          p1 = PatchProxy.applyOneRefs(p0, this, LiveJsCmdQueryUserChatInviteStatus.class, "2");
          if (p1 != patchProxyRe) {
             i = p1.intValue();
          }else {
             c uoc = this.g(f.class).p();
             if (uoc != null && uoc.v(p0)) {
                i = LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.CHAT_INVITE_STATE_CHATTING.getValue();
             }else if(b.d()){
                i = (this.g(a.class).i3(p0))? LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.CHAT_INVITE_STATE_INVITING.getValue(): LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.CHAT_INVITE_STATE_NONE.getValue();
             }else if(uoc != null && a.g(uoc.y(), p0)){
                i = LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.CHAT_INVITE_STATE_INVITING.getValue();
             }else {
                i = LiveJsCmdQueryUserChatInviteStatus$ChatInviteState.CHAT_INVITE_STATE_NONE.getValue();
             }
          }
          i = m$a.g(m.g, new LiveJsCmdQueryUserChatInviteStatus$b(i), false, 2, null);
       }
       return p0;
    }
}
