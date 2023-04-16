package ob1.c;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.user.QCurrentUser;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import java.lang.Integer;
import k2b.e0;

public class c	// class@0034c0
{

    public void c(){
       super();
    }
    public static ClientContent$LiveStreamPackage a(String p0,String p1){
       ClientContent$LiveStreamPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$LiveStreamPackage();
       obj.liveStreamId = TextUtils.k(p0);
       obj.anchorUserId = TextUtils.k(p1);
       return obj;
    }
    public static void b(String p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "QUESTION_RECEIVED_PENDANT";
       i3 oi3 = i3.f();
       String str = (p1)? "BOTH": "WRITE";
       oi3.d("type", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = c.a(p0, QCurrentUser.me().getId());
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "15")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUDIENCE_QUESTION_ENTRANCE_SUBCARD";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = c.a(p0, p1);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void d(String p0,String p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, c.class, "16")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUDIENCE_QUESTION_SETTING";
       i3 oi3 = i3.f();
       String str = (p2)? "OPEN": "CLOSE";
       oi3.d("type", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = c.a(p0, p1);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void e(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "7")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ANCHOR_ANSWERING_PENDANT";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void f(ClientContent$LiveStreamPackage p0,String p1,boolean p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), null, c.class, "18")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "HANDLE_THE_QUESTION_SUBCARD";
       String str = (p2)? "ANSWER": "END";
       uElementPack.name = str;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       moreInfoPack.id = p1;
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.moreInfoPackage = moreInfoPack;
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public static void g(String p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoc, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "QUESTION_RECEIVED_PENDANT";
       i3 oi3 = i3.f();
       String str = (p1)? "BOTH": "WRITE";
       oi3.d("type", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = c.a(p0, QCurrentUser.me().getId());
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void h(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "14")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUDIENCE_QUESTION_ENTRANCE_SUBCARD";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = c.a(p0, p1);
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void i(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ANCHOR_ANSWERING_PENDANT";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void j(ClientContent$LiveStreamPackage p0,boolean p1,int p2,String p3,int p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Integer.valueOf(p2),p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uoc, "8")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ANSWER_LIST";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       moreInfoPack.index = String.valueOf(p2);
       moreInfoPack.id = TextUtils.k(p3);
       moreInfoPack.vlaue = String.valueOf(p4);
       String str = (p1)? "1": "2";
       moreInfoPack.type = str;
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.moreInfoPackage = moreInfoPack;
       u1.D0("", null, 9, uElementPack, uContentPack, uContentWrap);
       return;
    }
}
