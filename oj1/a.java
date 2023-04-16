package oj1.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public class a	// class@003503
{

    public void a(){
       super();
    }
    public static ClientContent$ContentPackage a(ClientContent$LiveStreamPackage p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p0;
       return obj;
    }
    public static ClientContent$GiftPackage b(int p0){
       ClientContent$GiftPackage obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$GiftPackage();
       obj.identity = String.valueOf(p0);
       return obj;
    }
    public static void c(ClientContent$LiveStreamPackage p0,int p1,boolean p2,boolean p3,int p4){
       Object[] objArray;
       a uoa = a.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 0;
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[i];
          objArray[i4] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[i3] = Boolean.valueOf(p2);
          objArray[i2] = Boolean.valueOf(p3);
          objArray[i1] = Integer.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, null, uoa, "2")) {
             return;
          }
       }
       if (PatchProxy.isSupport(uoa)) {
          objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(1),Boolean.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uoa, "3")) {
          label_00b9 :
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = a.a(p0);
       ClientContent$GiftPackage giftPackage = a.b(p1);
       uContentPack.giftPackage = giftPackage;
       giftPackage.totalCount = 1;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SEND_GIFT_CONFIRM_POPUP";
       i3 oi3 = i3.f();
       String str = (p2)? "CONFIRM": "CANCEL";
       oi3.d("btn_name", str);
       oi3.c("if_not_notice", Integer.valueOf(p3));
       if (p4) {
          oi3.c("panel_source", Integer.valueOf(p4));
       }
       uElementPack.params = oi3.toString();
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack));
       goto label_00b9 ;
    }
    public static void d(ClientContent$LiveStreamPackage p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), null, a.class, "1")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = a.a(p0);
       ClientContent$GiftPackage giftPackage = a.b(p1);
       uContentPack.giftPackage = giftPackage;
       giftPackage.totalCount = p2;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SEND_GIFT_CONFIRM_POPUP";
       i3 oi3 = i3.f();
       if (p3) {
          oi3.c("panel_source", Integer.valueOf(p3));
       }
       uElementPack.params = oi3.toString();
       u1.B0(new ShowMetaData().setType(4).setElementPackage(uElementPack).setContentPackage(uContentPack));
       return;
    }
}
