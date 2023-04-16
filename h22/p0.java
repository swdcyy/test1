package h22.p0;
import v22.c$b;
import com.kuaishou.live.core.show.activityredpacket.a0;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.model.LiveActivityRedPacketTopLuckyInfo;
import h22.a;
import t02.a0;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams;
import com.kuaishou.live.core.show.follow.LiveFollowExtParams$a;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import java.util.Map;
import wj2.r0;
import t02.r1;
import tx1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import h22.h;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import k2b.u1;

public final class p0 implements c$b	// class@002c07
{
    public final a0 a;

    public void p0(a0 p0){
       this.a = p0;
    }
    public final void a(LiveActivityRedPacketTopLuckyInfo p0,int p1){
       Object[] objArray1;
       String str;
       p0 ta = this.a;
       a0 s = ta.s;
       a b = s.b;
       Object[] objArray = null;
       if (b != null) {
          a0 u = b.U;
          UserProfile userProfile = new UserProfile(p0.mUserInfo);
          LiveStreamClickType uNKNOWN = LiveStreamClickType.UNKNOWN;
          int i = 0;
          boolean b1 = false;
          int i1 = 139;
          LiveFollowExtParams liveFollowEx = PatchProxy.apply(objArray, ta, a0.class, "13");
          if (liveFollowEx != PatchProxyResult.class) {
          }else {
             a0 t = ta.t;
             if (t != null) {
                LiveFollowExtParams$a uoa = new LiveFollowExtParams$a();
                uoa.e(t.treasureBoxId);
                uoa.f(ta.t.boxType);
                LiveTreasureBoxMessage$LiveTreasureBoxShow extraMessage = ta.t.extraMessage;
                str = "";
                String str1 = (extraMessage == null)? str: extraMessage.get("liveActivityName");
                uoa.c(str1);
                extraMessage = ta.t.extraMessage;
                if (extraMessage != null) {
                   str = extraMessage.get("position");
                }
                uoa.d(str);
                liveFollowEx = uoa.a();
             }else {
                objArray1 = objArray;
             label_006b :
                u.e(userProfile, uNKNOWN, i, b1, i1, objArray1);
             }
          }
          objArray1 = liveFollowEx;
          goto label_006b ;
       }else {
          a a = s.a;
          if (a != null) {
             a.Z.w0(new UserProfile(p0.mUserInfo), LiveStreamClickType.UNKNOWN, 0, false, 139);
          }
       }
       ClientContent$LiveStreamPackage liveStreamPa = ta.r.a();
       int i2 = ta.q.a();
       str = ta.q.d();
       int i3 = ta.q.b();
       p1 = p1 + 1;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray2 = new Object[]{liveStreamPa,Integer.valueOf(i2),str,Integer.valueOf(i3),Integer.valueOf(p1)};
          if (PatchProxy.applyVoid(objArray2, objArray, oh, "2")) {
          label_010d :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "WIN_AUDIENCE_HEAD_CLICK";
       i3 oi3 = i3.f();
       oi3.c("biz_type", Integer.valueOf(i2));
       oi3.c("box_type", Integer.valueOf(i3));
       oi3.c("index", Integer.valueOf(p1));
       uElementPack.params = oi3.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = liveStreamPa;
       ClientContent$RedPackPackage redPackPacka = h.a(str);
       uContentPack.redPackage = redPackPacka;
       redPackPacka.drawPrizePage = 2;
       u1.u(1, uElementPack, uContentPack);
       goto label_010d ;
    }
}
