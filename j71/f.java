package j71.f;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import j71.f$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o63.m;
import o63.m$a;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteItem;
import com.kuaishou.live.common.core.component.line.model.LiveLineInviteResponse$LiveLineInviteUserInfo$LiveLineInvitee;
import java.lang.Number;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteExtraInfo;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import no1.c;
import lp3.c;
import xp5.g;
import md2.q;
import java.lang.Boolean;
import dsd.a;
import kotlin.jvm.internal.a;
import hd2.k0;

public final class f extends AbstractLiveJsCommand	// class@002a5a
{

    public void f(){
       super();
    }
    public Class a(){
       return f$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "1");
       if (p1 != patchProxyRe) {
          return p1;
       }
       if (!p0 instanceof f$a) {
          return m.g.c("invalid params");
       }
       f uof = f.class;
       LiveLineInviteItem liveLineInvi = PatchProxy.applyOneRefs(p0, this, uof, "2");
       if (liveLineInvi != patchProxyRe) {
       }else {
          liveLineInvi = new LiveLineInviteItem();
          liveLineInvi.mUserInfo = p0.b().mUserInfo;
          liveLineInvi.mLiveStreamId = p0.b().mLiveStreamId;
          liveLineInvi.mDisplayLocation = p0.b().mDisplayLocation;
          liveLineInvi.mDisplayAge = p0.b().mDisplayAge;
          liveLineInvi.mFlowDiversionCpcInfo = p0.b().mLiveFlowDiversionCpcInfoV2;
          liveLineInvi.mSourceType = p0.sourceType;
          f$a chatType = p0.chatType;
          if (chatType != null) {
             liveLineInvi.mChatType = chatType.intValue();
          }
          liveLineInvi.mMatchSource = "MERCHANT_MATCHING_INVITE";
          liveLineInvi.mSupportMultiLineChat = p0.b().mSupportMultiLineChat;
          liveLineInvi.setExtraInfo(p0.a());
          String str = p0.a();
          LiveLineInviteExtraInfo liveLineInvi1 = PatchProxy.applyOneRefs(str, this, uof, "3");
          if (liveLineInvi1 != patchProxyRe) {
          }else {
             liveLineInvi1 = a.a.h(str, LiveLineInviteExtraInfo.class);
          }
          liveLineInvi1 = (liveLineInvi1 != null)? liveLineInvi1.mSellingChatInfo: null;
          liveLineInvi.mSellingChatInfo = liveLineInvi1;
       }
       this.g(c.class).u1(this.g(g.class).getLiveStreamId(), liveLineInvi);
       boolean b = true;
       q.c(3, b);
       if (a.g(p0.shouldKeepPKPanelShow, a.a(b)) ^ b) {
          this.g(k0.class).gh();
       }
       return m$a.g(m.g, null, false, 3, null);
    }
}
