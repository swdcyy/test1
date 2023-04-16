package j71.b;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import j71.b$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import x82.a;
import com.kuaishou.live.core.show.pk.pkinvite.g;
import hd2.f;
import com.kuaishou.live.core.show.flowdiversion.pay.model.LiveFlowDiversionPaySellingChatInfo;
import com.kuaishou.live.core.show.flowdiversion.pay.model.LiveFlowDiversionCpcInfoV2;
import hd2.k0;
import lp3.c;
import rt1.h;
import ps1.a;
import rt1.f;
import com.kuaishou.live.common.core.component.pk.model.LiveLineInviteItem;
import xp5.g;
import no1.c;
import com.kuaishou.live.core.show.flowdiversion.pay.model.LiveFlowDiversionPaySellingChatInfo$LiveFlowDiversionInviteParam;

public final class b extends AbstractLiveJsCommand	// class@002a54
{
    public a e;

    public void b(){
       super();
    }
    public Class a(){
       return b$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       a b;
       LiveFlowDiversionPaySellingChatInfo liveFlowDive;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof b$a) {
          return m.g.c("invalid params");
       }
       b te = this.e;
       if (te == null) {
          return m.g.c("inviteParams is not set");
       }
       a a = te.a;
       String str = 1;
       String str1 = (a == str)? 1: null;
       if (str1) {
          b = te.b;
          if (b == null) {
             return m.g.c("mPkInviteParams is null");
          }else {
             f.c("bridge", "flowDiversionPayDescriptionConfirmInvite", String.valueOf(b.d()));
             this.n(b.g());
             b.o(p0.a());
             liveFlowDive = b.g();
             if (liveFlowDive != null) {
                liveFlowDive = liveFlowDive.mCpcInfo;
                if (liveFlowDive != null) {
                   liveFlowDive.mExtraInfo = p0.a();
                }
             }
             this.g(k0.class).J5(b);
          }
       }else if(a == 3){
          str1 = 1;
       }else {
          str1 = 0;
       }
       if (str1) {
          b = te.c;
          if (b == null) {
             return m.g.c("mMultiPkInviteParams is null");
          }else {
             this.n(b.f());
             liveFlowDive = b.f();
             if (liveFlowDive != null) {
                liveFlowDive = liveFlowDive.mCpcInfo;
                if (liveFlowDive != null) {
                   liveFlowDive.mExtraInfo = p0.a();
                }
             }
             this.g(a.class).l9().a(b);
          }
       }else if(a == 2){
          str = null;
       }
       if (str != null) {
          b = te.d;
          if (b == null) {
             return m.g.c("mLineInviteParams is null");
          }else {
             this.n(b.mSellingChatInfo);
             b.setExtraInfo(p0.a());
             LiveLineInviteItem mSellingChat = b.mSellingChatInfo;
             if (mSellingChat != null) {
                liveFlowDive = mSellingChat.mCpcInfo;
                if (liveFlowDive != null) {
                   liveFlowDive.mExtraInfo = p0.a();
                }
             }
             this.g(c.class).u1(this.g(g.class).getLiveStreamId(), b);
          }
       }
       return m$a.g(m.g, null, false, 3, null);
    }
    public final void m(a p0){
       this.e = p0;
    }
    public final void n(LiveFlowDiversionPaySellingChatInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       LiveFlowDiversionPaySellingChatInfo mInviteParam = (p0 != null)? p0.mInviteParam: null;
       if (mInviteParam == null && p0 != null) {
          p0.mInviteParam = new LiveFlowDiversionPaySellingChatInfo$LiveFlowDiversionInviteParam();
       }
       if (p0 != null) {
          p0 = p0.mInviteParam;
          if (p0 != null) {
             p0.mIsPayInfoConfirmed = true;
          }
       }
       return;
    }
}
