package h92.f;
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
import android.view.View;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import lp3.i;
import com.google.gson.JsonObject;
import w91.a;
import lp3.c;
import java.util.Map;
import ug1.v0;
import x61.c;
import h92.e;
import va1.b0;
import com.google.gson.JsonElement;
import w61.c;
import w61.a;

public class f	// class@002d08
{

    public void f(){
       super();
    }
    public static ClientContent$ContentPackage a(ClientContent$LiveStreamPackage p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.liveStreamPackage = p0;
       return obj;
    }
    public static ClientContent$GiftPackage b(int p0){
       ClientContent$GiftPackage obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uof, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ClientContent$GiftPackage();
       obj.identity = String.valueOf(p0);
       return obj;
    }
    public static void c(ClientContent$LiveStreamPackage p0,int p1,int p2,boolean p3,boolean p4,boolean p5,int p6,String p7){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4),Boolean.valueOf(p5),Integer.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, null, uof, "7")) {
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = f.a(p0);
       ClientContent$GiftPackage giftPackage = f.b(p1);
       uContentPack.giftPackage = giftPackage;
       giftPackage.totalCount = p2;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SEND_GIFT_CONFIRM_POPUP";
       i3 oi3 = i3.f();
       oi3.c("if_lucky_moment", Integer.valueOf(p3));
       String str = (p4)? "CONFIRM": "CANCEL";
       oi3.d("btn_name", str);
       oi3.c("if_not_notice", Integer.valueOf(p5));
       oi3.d("gift_llsid", p7);
       if (p6) {
          oi3.c("panel_source", Integer.valueOf(p6));
       }
       uElementPack.params = oi3.toString();
       u1.v(1, uElementPack, uContentPack, null);
       return;
    }
    public static void d(ClientContent$LiveStreamPackage p0,int p1,int p2,boolean p3,int p4,String p5){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uof, "5")) {
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = f.a(p0);
       ClientContent$GiftPackage giftPackage = f.b(p1);
       uContentPack.giftPackage = giftPackage;
       giftPackage.totalCount = p2;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SEND_GIFT_CONFIRM_POPUP";
       i3 oi3 = i3.f();
       oi3.c("if_lucky_moment", Integer.valueOf(p3));
       oi3.d("gift_llsid", p5);
       if (p4) {
          oi3.c("panel_source", Integer.valueOf(p4));
       }
       uElementPack.params = oi3.toString();
       u1.v0(4, uElementPack, uContentPack, null);
       return;
    }
    public static void e(i p0,int p1){
       Boolean fALSE;
       e uoe;
       f uof = f.class;
       Object obj = null;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), obj, uof, "1")) {
          return;
       }
       int i = 1019;
       int i1 = 1;
       int i2 = 2;
       int i3 = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(i),Integer.valueOf(p1),fALSE,Boolean.TRUE,fALSE,fALSE,fALSE};
          fALSE = Boolean.FALSE;
          if (PatchProxy.applyVoid(objArray, obj, uof, "2")) {
          label_00bc :
             return;
          }
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.a0("gift_id", Integer.valueOf(p1));
       jsonObject.a0("if_lucky_moment", Integer.valueOf(i3));
       jsonObject.a0("if_lucky_moment_notice", Integer.valueOf(i3));
       jsonObject.a0("if_low_machine", Integer.valueOf(i2));
       jsonObject.a0("if_demotion", Integer.valueOf(i2));
       if (p0 != null) {
          jsonObject.a(jsonObject, p0.a(a.class).d6());
          i2 = p0.a(c.class).M2();
          uoe = new e(p0);
       }else {
          uoe = obj;
          i2 = 0;
       }
       a.a(0, 1019, i2, uoe, true, false, Boolean.valueOf(b0.a()), jsonObject.toString());
       goto label_00bc ;
    }
}
