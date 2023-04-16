package b62.h0$a;
import com.yxcorp.gifshow.widget.m;
import b62.h0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u52.t;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser;
import j62.a;
import com.kwai.framework.model.user.UserInfo;
import z52.c;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import i62.t$c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import u52.u;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import d61.h0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import k2b.u1;

public class h0$a extends m	// class@00033e
{
    public final h0 c;

    public void h0$a(h0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       int i2;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, h0$a.class, "1")) {
          return;
       }
       h0$a c = obj.c;
       t b = c.q.b;
       LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser mUserInfo = c.p.mUserInfo;
       h0 r = c.r;
       a a = r.a;
       int i = 6;
       int i1 = 0;
       if (a != 39) {
          switch (a){
              case 14:
                i2 = 128;
                break;
              case 15:
                i2 = 134;
                break;
              case 16:
                i2 = 132;
                break;
              default:
                i2 = 0;
          }
       }else {
          i2 = 6;
       }
       b.b(mUserInfo, r, i2);
       c = obj.c;
       r = c.r;
       LiveConditionRedPacketInfo liveConditio = c.q.c.l(r.a, r.b);
       BaseFragment uBaseFragmen = obj.c.q.a.b();
       ClientContent$LiveStreamPackage liveStreamPa = obj.c.q.a.a();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = obj.c.q.a.y();
       h0$a c1 = obj.c;
       UserInfo mId = c1.p.mUserInfo.mId;
       h0 r1 = c1.r;
       a b1 = r1.b;
       a a1 = r1.a;
       long l = (liveConditio == null)? 0: liveConditio.j / 0xea60;
       int i3 = (liveConditio == null)? 0: liveConditio.v.getValue().intValue();
       u ou = u.class;
       int i4 = 1;
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[]{uBaseFragmen,liveStreamPa,liveVoicePar,mId,b1,Integer.valueOf(a1),Long.valueOf(l),Integer.valueOf(i3)};
          if (PatchProxy.applyVoid(objArray, null, ou, "13")) {
          label_00ea :
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = u.a(liveVoicePar, liveStreamPa);
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = h0.a(mId);
       uContentPack.userPackage = userPackage;
       uContentPack.redPackage = u.d(b1, a1, l, i3, 2);
       u1.L("", uBaseFragmen, 1, u.b("WIN_AUDIENCE_HEAD_CLICK", null), uContentPack);
       goto label_00ea ;
    }
}
