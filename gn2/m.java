package gn2.m;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.q;
import lnc.i3;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import lp3.e;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Integer;
import java.lang.Boolean;
import xp5.i;
import lp3.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.google.common.collect.ImmutableMap;
import k2b.u1;
import x61.c;
import gn2.m$a;
import java.lang.Number;
import va1.b0;
import w61.c;
import w61.a;

public class m	// class@002b5c
{

    public void m(){
       super();
    }
    public static ClientEvent$ElementPackage a(String p0,Map p1){
       ClientEvent$ElementPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, m.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p0;
       if (!q.h(p1)) {
          i3 oi3 = i3.f();
          Iterator iterator = p1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             oi3.d(key, uEntry.getValue());
          }
          obj.params = oi3.e();
       }
       return obj;
    }
    public static void b(e p0,Gift p1,int p2,boolean p3){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), null, m.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p1 == null) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = p0.a(i.class).a();
       ClientContent$ContentPackage uContentPack = PatchProxy.applyOneRefs(liveStreamPa, null, om, "3");
       if (uContentPack != PatchProxyResult.class) {
       }else {
          uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
       }
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.identity = String.valueOf(p1.mId);
       giftPackage.totalCount = p2;
       uContentPack.giftPackage = giftPackage;
       String str = "21";
       if (p3) {
          u1.u(9, m.a("CONTINUE_SEND_BUTTON", ImmutableMap.of("trigger_source", str)), uContentPack);
       }else {
          u1.u0(9, m.a("CONTINUE_SEND_BUTTON", ImmutableMap.of("trigger_source", str)), uContentPack);
       }
       return;
    }
    public static void c(Gift p0,e p1,boolean p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, m.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p1 == null) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("gift_id", Integer.valueOf(p0.mId));
       a.a(0, 1038, p1.a(c.class).M2(), new m$a(p1), p2, false, Boolean.valueOf(b0.a()), oi3.e());
       return;
    }
}
