package com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.a;
import lc1.b;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$b;
import lp3.e;
import android.content.Context;
import java.lang.Object;
import xp5.i;
import lp3.i;
import java.lang.Class;
import lp3.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import java.lang.Throwable;
import sd1.f;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.LiveCommonChatNoticeInfo;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.b;
import ic1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.b$a;
import ic1.b;
import nc1.j$a;
import bq5.f$a;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.LiveCommonChatNoticeInfo$ExtraInfo;
import com.kuaishou.live.core.show.chat.model.LiveChatCommonNoticeConfig;
import nc1.k;
import java.util.List;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;
import lnc.i3;
import bq5.f;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import java.lang.Integer;
import java.lang.Long;
import java.util.Objects;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.LiveCommonChatNoticeView;
import mc1.a;

public class a implements b, LiveAudienceApplyChatService$b	// class@000f8b
{
    public final ClientContent$LiveStreamPackage b;
    public final e c;
    public final Context d;
    public int e;
    public b f;
    public j g;
    public LiveCommonChatNoticeInfo h;
    public LiveAudienceApplyChatService i;
    public boolean j;
    public boolean k;

    public void a(e p0,Context p1){
       super();
       this.e = 1;
       this.j = false;
       this.k = false;
       this.c = p0;
       this.b = p0.a(i.class).a();
       this.d = p1;
       LiveAudienceApplyChatService liveAudience = p0.a(LiveAudienceApplyChatService.class);
       this.i = liveAudience;
       liveAudience.Od(this);
    }
    public void M4(Throwable p0){
       f.a(this, p0);
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "2")) {
       }else {
          this.h = p1;
          j oj = PatchProxy.applyOneRefs(p1, this, uoa, "3");
          if (oj != PatchProxyResult.class) {
          }else {
             this.f = new b(p1, this.e, new a(this));
             j$a uoa1 = new j$a();
             uoa1.e(this.f);
             uoa1.d(new b(this));
             uoa1.c(p1.mExtraInfo.mChatGuideConfig.mDisplayDurationMs);
             uoa1.j(p1.mDelayDisplayTimeMs);
             uoa1.h(p1.mBizId);
             uoa1.f(p1.mPriority);
             uoa1.i(p1.mNoticeType);
             oj = uoa1.g();
             this.g = oj;
          }
          this.c.a(k.class).Y9(oj);
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public void b6(boolean p0){
       f.b(this, p0);
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.API_DELAY_INFO};
       return f.b(54, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveCommonChatNoticeInfo.class));
    }
    public String d(){
       i3 obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       i3 oi3 = i3.f();
       String str = (this.e == 1)? "APPLY": "CANCEL";
       oi3.d("button_type", str);
       obj.d("extra_info", oi3.e());
       return obj.e();
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       a tg = this.g;
       if (tg != null) {
          tg.e(0);
       }
       tg = this.i;
       if (tg != null) {
          tg.eb(this);
       }
       this.e = 1;
       this.h = null;
       this.f = null;
       return;
    }
    public void v7(LiveAudienceApplyChatService$State p0,int p1){
       a tg;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "5")) {
          return;
       }
       long l = 0;
       if (p0 == LiveAudienceApplyChatService$State.IDLE) {
          if (this.k != null) {
             tg = this.g;
             if (tg != null) {
                tg.e(l);
             }
             this.e = 1;
          }
       }else if(p0 == LiveAudienceApplyChatService$State.APPLYING){
          this.e = 2;
          if (this.g != null && this.f != null) {
             LiveChatCommonNoticeConfig mDisplayDura = this.h.mExtraInfo.mApplyingChatConfig.mDisplayDurationMs;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Long.valueOf(mDisplayDura), this, uoa, "6")) {
                this.g.e(mDisplayDura);
                if (this.j != null) {
                   tg = this.f;
                   a te = this.e;
                   Objects.requireNonNull(tg);
                   b uob = b.class;
                   if (PatchProxy.isSupport(uob) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(te), tg, uob, "2") && tg.d != te)) {
                      tg.d = te;
                      LiveCommonChatNoticeInfo$ExtraInfo mChatGuideCo = (te == 1)? tg.b.mExtraInfo.mChatGuideConfig: tg.b.mExtraInfo.mApplyingChatConfig;
                      tg.e.c(mChatGuideCo);
                   }
                   a.f(this.b, String.valueOf(54), this.h.mBizId, this.d());
                }else {
                   mDisplayDura.d = this.e;
                }
             }
          }
          this.k = true;
       }else if(p0 == LiveAudienceApplyChatService$State.CHATTING){
          tg = this.g;
          if (tg != null) {
             tg.e(l);
          }
          this.e = 1;
       }
       return;
    }
}
