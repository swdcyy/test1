package am2.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import k2b.u1;
import java.lang.Integer;
import java.lang.Boolean;

public class a	// class@0000fb
{

    public void a(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "19")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "HISTORY_VOTE_ITEM";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       uContentWrap.moreInfoPackage = moreInfoPack;
       moreInfoPack.id = p1;
       moreInfoPack.index = p2;
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public static void b(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "18")) {
          return;
       }
       a.c("HISTORY_VOTE_TAB", p0);
       return;
    }
    public static void c(String p0,ClientContent$LiveStreamPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "8")) {
          return;
       }
       if (!PatchProxy.applyVoidThreeRefs(p0, "", p1, null, a.class, "9")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = p0;
          uElementPack.params = "";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = p1;
          u1.u(1, uElementPack, uContentPack);
       }
       return;
    }
    public static void d(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, uoa, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = p0;
       u1.u0(p1, uElementPack, null);
       return;
    }
    public static void e(ClientContent$LiveStreamPackage p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 0x7919;
       uElementPack.index = p1;
       uElementPack.value = 2.00f;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u0(6, uElementPack, uContentPack);
       return;
    }
    public static void f(){
       if (PatchProxy.applyVoid(null, null, a.class, "5")) {
          return;
       }
       a.d(0x7877, 4);
       return;
    }
    public static void g(ClientContent$LiveStreamPackage p0){
       a uoa = a.class;
       ClientEvent$ElementPackage obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uoa, "14")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs("VOTE_RESULT_PANEL", p0, obj, uoa, "10")) {
          String str = "";
          if (!PatchProxy.applyVoidThreeRefs("VOTE_RESULT_PANEL", str, p0, null, a.class, "11")) {
             obj = new ClientEvent$ElementPackage();
             obj.action2 = "VOTE_RESULT_PANEL";
             obj.params = str;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = p0;
             u1.u0(6, obj, uContentPack);
          }
       }
       return;
    }
}
