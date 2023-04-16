package com.kuaishou.live.audience.component.chat.apply.b;
import a71.a;
import com.kuaishou.live.audience.component.chat.apply.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import com.kuaishou.live.audience.component.chat.apply.d$c;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import lp3.c;
import lp3.e;
import px0.b;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import px0.f;
import java.lang.Runnable;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;
import k2b.e0;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import rd1.c0;
import lnc.i3;

public final class b implements a	// class@000a64
{
    public final d a;
    public final boolean b;

    public void b(d p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(int p0){
       b ta = this.a;
       b tb = this.b;
       Objects.requireNonNull(ta);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tb), ta, uod, "4")) {
          LiveAudienceApplyChatService$State state = ta.l.jh();
          int i = d$c.a[state.ordinal()];
          boolean b = true;
          if (i != b) {
             if (i != 2) {
                if (i == 3 && !PatchProxy.applyVoid(null, ta, uod, "21")) {
                   ta.c.a(LiveAudienceChatService.class).G0();
                }
             }else {
                ta.f("CHAT_BUTTON");
             }
          }else {
             b uob = new b(ta, tb);
             if (!PatchProxy.applyVoidOneRefs(uob, ta, uod, "11")) {
                if (!QCurrentUser.me().isLogined()) {
                   d.a(-1712118428).x00(ta.d, 112, null, new f(uob));
                }else {
                   uob.run();
                }
             }
          }
          e0 page = ta.f.getPage();
          ClientContent$LiveStreamPackage liveStreamPa = ta.f.a();
          if (state == LiveAudienceApplyChatService$State.IDLE) {
             b = false;
          }
          if (!PatchProxy.isSupport(c0.class) || !PatchProxy.applyVoidThreeRefs(page, liveStreamPa, Boolean.valueOf(b), null, c0.class, "15")) {
             i3 oi3 = i3.f();
             String str = (b)? "TRUE": "FALSE";
             oi3.d("status", str);
             c0.O("CLICK_LIVE_AUDIENCE_CHAT_APPLY", oi3.e(), page, liveStreamPa);
          }
       }
       return false;
    }
}
