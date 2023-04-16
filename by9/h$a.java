package by9.h$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.CoCreateInfo;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.util.List;
import com.kuaishou.android.model.mix.CoCreateInfo$CoCreateMember;
import java.lang.Long;
import qrd.l1;
import by9.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class h$a	// class@00051a
{

    public void h$a(){
       super();
    }
    public void h$a(u p0){
       super();
    }
    public static void c(h$a p0,QPhoto p1,String p2,e0 p3,int p4,int p5,Object p6){
       if (p5 & 0x08) {
          p4 = -1;
       }
       p0.b(p1, p2, p3, p4);
       return;
    }
    public final ClientContent$ContentPackage a(QPhoto p0,int p1){
       ClientContent$ContentPackage obj;
       ClientContent$UserPackage[] userPackageA;
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "photo");
       obj = new ClientContent$ContentPackage();
       CoCreateInfo coCreateInfo = p0.getCoCreateInfo();
       if (coCreateInfo != null) {
          p0 = p0.mEntity;
          if (p0 != null) {
             obj.photoPackage = w1.f(p0);
             ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
             Long longx = null;
             int i = 0;
             if (p1 != -1) {
                userPackageA = new ClientContent$UserPackage[1];
                ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                CoCreateInfo$CoCreateMember uCoCreateMem = coCreateInfo.mMembers.get(p1);
                if (uCoCreateMem != null) {
                   longx = Long.valueOf(uCoCreateMem.mUserId);
                }
                userPackage.identity = String.valueOf(longx);
                userPackage.index = p1 + 1;
                userPackageA[i] = userPackage;
             }else {
                userPackageA = new ClientContent$UserPackage[coCreateInfo.mMembers.size()];
                p1 = coCreateInfo.mMembers.size();
                for (; i < p1; i = i1) {
                   ClientContent$UserPackage userPackage1 = new ClientContent$UserPackage();
                   CoCreateInfo$CoCreateMember uCoCreateMem1 = coCreateInfo.mMembers.get(i);
                   Long longx1 = (uCoCreateMem1 != null)? Long.valueOf(uCoCreateMem1.mUserId): longx;
                   userPackage1.identity = String.valueOf(longx1);
                   int i1 = i + 1;
                   userPackage1.index = i1;
                   userPackageA[i] = userPackage1;
                }
             }
             uBatchUserPa.userPackage = userPackageA;
             obj.batchUserPackage = uBatchUserPa;
          }
       }
       return obj;
    }
    public final void b(QPhoto p0,String p1,e0 p2,int p3){
       if (PatchProxy.isSupport(h$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, h$a.class, "1")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "area");
       if (p0.getCoCreateInfo() != null) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "DESCRIPT_AREA_AUTHORS_CREAT";
          i3 oi3 = i3.f();
          oi3.d("click_area", p1);
          uElementPack.params = oi3.e();
          u1.M(null, p2, 3, uElementPack, h.x.a(p0, p3), null);
       }
       return;
    }
}
