package bo3.g;
import on3.k;
import eo3.w;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import java.util.Collections;
import java.lang.Object;
import on3.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import on3.c;
import bo3.g$b;
import com.kuaishou.live.redpacket.core.ui.vm.RedPacketBaseViewModel;
import eo3.f;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackInfo;
import eo3.a;
import om3.d;
import om3.a;
import bo3.b;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import u52.u;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import uw1.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.utility.TextUtils;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import bo3.g$a;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse;
import t45.d;
import bo3.f;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse$LiveConditionRedPacketCurrentInfo;
import java.lang.Runnable;
import crd.b;
import brd.z;

public class g extends k	// class@000406
{
    public final MutableLiveData p;
    public final MutableLiveData q;

    public void g(w p0){
       super(p0);
       this.p = new MutableLiveData(Collections.emptyList());
       this.q = new MutableLiveData("");
    }
    public void C0(c$b p0){
       ClientContent$ContentPackage uContentPack;
       ClientContent$RedPackPackage redPackPacka;
       ClientContent$UserPackage userPackage;
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "1")) {
          return;
       }
       super.C0(p0);
       if (p0 instanceof g$b && this.d.c() != null) {
          b.a(this.d.c().k(), this.d.f().e().a());
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, og, "3")) {
             RedPacketConditionRedPackInfoWrapper redPacketCon = this.d.c();
             if (redPacketCon != null) {
                SCLiveConditionRedPackInfo sCLiveCondit = redPacketCon.k();
                a uoa = this.d.f().e().a();
                e0 uoe0 = uoa.i();
                ClientContent$LiveStreamPackage liveStreamPa = uoa.a();
                ClientContent$LiveVoicePartyPackageV2 liveVoicePar = uoa.B();
                SCLiveConditionRedPackInfo redPackId = sCLiveCondit.redPackId;
                sCLiveCondit = sCLiveCondit.redPackType;
                String str = redPacketCon.l();
                u ou = u.class;
                if (PatchProxy.isSupport(ou)) {
                   Object[] objArray1 = new Object[]{uoe0,liveStreamPa,liveVoicePar,redPackId,Integer.valueOf(sCLiveCondit),str,objArray};
                   if (!PatchProxy.applyVoid(objArray1, objArray, ou, "6")) {
                   }
                }else {
                }
             }
          }
       }
       if (p0 instanceof g$a) {
          this.d.f().e().a().F0(p0.a, 135);
       }
       return;
    }
    public void H0(LiveConditionRedPacketCurrentInfoResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0 = p0.mCurrentInfo;
       if (p0 == null) {
          return;
       }
       d.c.d(new f(this, p0));
       return;
    }
}
