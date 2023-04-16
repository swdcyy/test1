package hy0.v;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.CommonParams;
import q2b.h$b;

public class v	// class@0027b8
{

    public void v(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,int p1,int p2,boolean p3,boolean p4){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, ov, "5")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       new ClientEvent$ShowEvent().elementPackage = uElementPack;
       uElementPack.action2 = "BARRAGE_PRICE_PROMPT_POPUP";
       i3 oi3 = i3.f();
       oi3.d("barrage_price", String.valueOf(p1));
       oi3.d("acu_type", v.d(p2));
       String str = (p3)? "CONFIRM": "CANCEL";
       oi3.d("btn_type", str);
       oi3.a("if_no_remind", Boolean.valueOf(p4));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void b(ClientContent$LiveStreamPackage p0,int p1,int p2,int p3,boolean p4,JsonElement p5,FeedLogCtx p6){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4),p5,p6};
          if (PatchProxy.applyVoid(objArray, null, ov, "3")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FLOATING_SCREEN_COMMENT_SEND";
       i3 oi3 = i3.f();
       oi3.d("pay_amount", String.valueOf(p2));
       oi3.a("is_normal_live", Boolean.TRUE);
       oi3.a("is_slide", Boolean.valueOf(p4));
       if (p1 == 8) {
          oi3.c("fail_reason", Integer.valueOf(p3));
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       CommonParams uCommonParam = new CommonParams();
       uCommonParam.mCsLogCorrelateInfo = p5;
       h$b uob = h$b.e(p1, "FLOATING_SCREEN_COMMENT_SEND");
       uob.h(uContentPack);
       uob.g(uCommonParam);
       uob.k(uElementPack);
       uob.l(p6);
       u1.r0(uob);
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,int p1,int p2,boolean p3){
       if (PatchProxy.isSupport(v.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), null, v.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SEND_BARRAGE_PROMPT_POPUP";
       i3 oi3 = i3.f();
       oi3.d("popup_type", v.e(p1));
       String str = (p3)? "CONFIRM": "CANCEL";
       oi3.d("btn_type", str);
       if (p1 == -4) {
          oi3.d("barrage_price", String.valueOf(p2));
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(9, uElementPack, uContentPack);
       return;
    }
    public static String d(int p0){
       if (p0 == 1) {
          return "NORMAL";
       }
       if (p0 == 2) {
          return "POPULARITY";
       }
       if (p0 != 3) {
          return "UNKNOWN";
       }
       return "FEVER";
    }
    public static String e(int p0){
       if (p0 == -4) {
          return "PRICE_CHANGE";
       }
       if (p0 == -3) {
          return "HIGH_DEVOTE";
       }
       if (p0 == -2) {
          return "FUN_GROUP";
       }
       if (p0 != -1) {
          return "UNKNOWN";
       }
       return "INSUFFICIENT_BALANCE";
    }
    public static String f(int p0){
       if (p0 == 1) {
          return "COMMON";
       }
       if (p0 == 2) {
          return "FLOATING_SCREEN";
       }
       if (p0 == 4) {
          return "NEW_YEAR";
       }
       return "UNKNOWN";
    }
}
