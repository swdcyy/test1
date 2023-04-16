package nx0.h;
import nx0.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveBroadcastPacakge;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import q2b.h$b;
import k2b.e0;
import k2b.u1;

public final class h	// class@0033ed
{

    public static final String a(i p0,String p1,String p2){
       i3 obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.c("biz_type", Integer.valueOf(p0.d()));
       obj.d("broadcast_style", "IMG_WITH_LIVE");
       obj.c("channel", Integer.valueOf(3));
       obj.d("click_area", p1);
       obj.d("filter", p2);
       String str = obj.e();
       a.o(str, "jsonStringBuilder.build\(\)");
       return str;
    }
    public static final ClientContent$ContentPackage b(i p0,String p1){
       ClientContent$LiveBroadcastPacakge obj = PatchProxy.applyTwoRefs(p0, p1, null, h.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$LiveBroadcastPacakge();
       obj.broadcastInfo = TextUtils.k(p0.j);
       obj.expTag = TextUtils.k(p0.f);
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       obj.receiveBroadcastAudienceId = qCurrentUser.getId();
       obj.toLiveStreamId = p0.f();
       obj.toAnchorUserId = p1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveBroadcastPackage = obj;
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.params = TextUtils.k(p0.l);
       uContentPack.moreInfoPackage = moreInfoPack;
       return uContentPack;
    }
    public static final void c(int p0,String p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, oh, "5")) {
          return;
       }
       a.p(p1, "filterType");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_BROADCAST_FILTER_MESSAGE";
       i3 oi3 = i3.f();
       oi3.c("biz_type", Integer.valueOf(p0));
       oi3.c("channel", Integer.valueOf(3));
       oi3.d("filter", p1);
       uElementPack.params = oi3.e();
       h$b uob = h$b.e(1, "LIVE_BROADCAST_FILTER_MESSAGE");
       uob.k(uElementPack);
       a.o(uob, "builder.setElementPackage\(elementPackage\)");
       uob.h(new ClientContent$ContentPackage());
       u1.p0("", null, uob);
       return;
    }
    public static final void d(i p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, h.class, "4")) {
          return;
       }
       a.p(p0, "overRoomMessage");
       a.p(p1, "currentAnchorId");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_BROADCAST_FILTER_MESSAGE";
       uElementPack.params = h.a(p0, null, p2);
       h$b uob = h$b.e(1, "LIVE_BROADCAST_FILTER_MESSAGE");
       uob.k(uElementPack);
       a.o(uob, "builder.setElementPackage\(elementPackage\)");
       uob.h(h.b(p0, p1));
       u1.p0("", null, uob);
       return;
    }
}
