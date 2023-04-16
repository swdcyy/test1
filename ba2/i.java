package ba2.i;
import java.lang.Object;
import lnc.i3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$DistrictRankPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.u1;

public class i	// class@000396
{

    public void i(){
       super();
    }
    public static i3 a(i3 p0,int p1,int[] p2){
       if (PatchProxy.isSupport(i.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, i.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 != 4 && (p1 != 6 || (p2 != null && p2.length >= 1))) {
          p0.c("business_id", Integer.valueOf(p2[0]));
       }
    label_0037 :
       return p0;
    }
    public static ClientContent$ContentPackage b(String p0,String p1,int p2,String p3,int p4){
       ClientContent$ContentPackage obj;
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, oi, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$DistrictRankPackage uDistrictRan = new ClientContent$DistrictRankPackage();
       uDistrictRan.anchorUserId = TextUtils.k(p0);
       uDistrictRan.liveStreamId = TextUtils.k(p1);
       uDistrictRan.rank = p2;
       uDistrictRan.text = TextUtils.k(p3);
       uDistrictRan.rankType = p4;
       obj.districtRankPackage = uDistrictRan;
       return obj;
    }
    public static ClientEvent$ElementPackage c(String p0){
       ClientEvent$ElementPackage obj = PatchProxy.applyOneRefs(p0, null, i.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "LIVE_DISTRICT_RANK_DRAINAGE_NOTICE";
       i3 oi3 = i3.f();
       oi3.d("type", p0);
       obj.params = oi3.e();
       return obj;
    }
    public static void d(ClientContent$LiveStreamPackage p0,int p1,String p2,int[] p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, i.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_DISTRICT_RANK_BUTTON_CLICK";
       uElementPack.params = i.a(i3.f(), p1, p3).e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContent$DistrictRankPackage uDistrictRan = new ClientContent$DistrictRankPackage();
       uContentPack.districtRankPackage = uDistrictRan;
       uDistrictRan.rankType = p1;
       uDistrictRan.text = p2;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void e(ClientContent$LiveStreamPackage p0,int p1,String p2,int[] p3){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, i.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_DISTRICT_RANK_BUTTON_SHOW";
       uElementPack.params = i.a(i3.f(), p1, p3).e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContent$DistrictRankPackage uDistrictRan = new ClientContent$DistrictRankPackage();
       uContentPack.districtRankPackage = uDistrictRan;
       uDistrictRan.rankType = p1;
       uDistrictRan.text = p2;
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void f(String p0,String p1,int p2,String p3,int p4,String p5){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, oi, "5")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_DISTRICT_RANK_NOTICE_SHOW";
       i3 oi3 = i3.f();
       oi3.d("type", p5);
       uElementPack.params = oi3.e();
       u1.u0(9, uElementPack, i.b(p0, p1, p2, p3, p4));
       return;
    }
}
