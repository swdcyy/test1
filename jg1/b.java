package jg1.b;
import java.lang.Object;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Boolean;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.ShowMetaData;

public class b	// class@002b91
{

    public void b(){
       super();
    }
    public static void a(e0 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "15")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ADMIN_SET_ENTRANCE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.M("2447321", p0, 1, uElementPack, uContentPack, null);
       return;
    }
    public static void b(boolean p0,boolean p1,e0 p2,ClientContent$LiveStreamPackage p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, p3, null, b.class, "21")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = (p0)? "AUTHOR_GIFT_EFFECT_BUTTON": "AUDIENCE_GIFT_EFFECT_BUTTON";
       uElementPack.action2 = str;
       i3 oi3 = i3.f();
       String str1 = (p1)? "TRUE": "FALSE";
       oi3.d("status", str1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p3;
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setContentPackage(uContentPack);
       uClickMetaDa.setElementPackage(uElementPack);
       uClickMetaDa.setLogPage(p2);
       u1.B(uClickMetaDa);
       return;
    }
    public static void c(boolean p0,boolean p1,e0 p2,ClientContent$LiveStreamPackage p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, p3, null, b.class, "22")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = (p0)? "AUTHOR_GIFT_EFFECT_BUTTON": "AUDIENCE_GIFT_EFFECT_BUTTON";
       uElementPack.action2 = str;
       i3 oi3 = i3.f();
       String str1 = (p1)? "TRUE": "FALSE";
       oi3.d("status", str1);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p3;
       ShowMetaData showMetaData = new ShowMetaData();
       showMetaData.setContentPackage(uContentPack);
       showMetaData.setElementPackage(uElementPack);
       showMetaData.setLogPage(p2);
       u1.B0(showMetaData);
       return;
    }
    public static void d(e0 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_LUCKYSTAR_ENTRANCE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.M("2447282", p0, 1, uElementPack, uContentPack, null);
       return;
    }
    public static void e(e0 p0,ClientContent$LiveStreamPackage p1){
       ClientEvent$ElementPackage uElementPack1;
       ClientContent$ContentPackage uContentPack1;
       b uob = b.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uob, "18")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, uob, "8")) {
          uElementPack1 = new ClientEvent$ElementPackage();
          uElementPack1.action2 = "GIFT_EFFECT";
          uContentPack1 = new ClientContent$ContentPackage();
          uContentPack1.liveStreamPackage = p1;
          u1.D0("2447309", p0, 3, uElementPack1, uContentPack1, null);
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, uob, "10")) {
          uElementPack1 = new ClientEvent$ElementPackage();
          uElementPack1.action2 = "HANG_LIVE_OFFLINE";
          uContentPack1 = new ClientContent$ContentPackage();
          uContentPack1.liveStreamPackage = p1;
          u1.D0("2447313", p0, 3, uElementPack1, uContentPack1, null);
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, uob, "14")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ADMIN_SET_ENTRANCE";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = p1;
          u1.D0("2447320", p0, 3, uElementPack, uContentPack, null);
       }
       return;
    }
    public static void f(e0 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SEND_RED_PACK_ENTRANCE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.M("2447323", p0, 1, uElementPack, uContentPack, null);
       return;
    }
    public static void g(e0 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SEND_RED_PACK_ENTRANCE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.D0("2447322", p0, 3, uElementPack, uContentPack, null);
       return;
    }
    public static void h(e0 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "11")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "HANG_LIVE_OFFLINE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.M("2447314", p0, 1, uElementPack, uContentPack, null);
       return;
    }
    public static void i(e0 p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOTE_ENTRANCE";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       u1.D0("2447287", p0, 3, uElementPack, uContentPack, null);
       return;
    }
}
