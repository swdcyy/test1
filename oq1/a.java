package oq1.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import com.kuaishou.live.common.core.component.multiline.log.a$a;
import java.lang.String;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.Map;
import com.facebook.common.internal.ImmutableMap;
import com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogger;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeam;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import java.util.ArrayList;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeamMember;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.util.Arrays;
import java.util.Objects;

public final class a	// class@003553
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final void a(ClientContent$LiveStreamPackage p0,e0 p1,a$a p2,String p3,Integer p4,String p5){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       a.p(p0, "liveStreamPackage");
       a.p(p1, "page");
       a.p(p2, "logInfo");
       a.p(p3, "buttonName");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MULTI_HEAD_FUCTION_BUTTON";
       String str = String.valueOf(p4);
       if (p5 == null) {
          p5 = "";
       }
       Map map = ImmutableMap.of("btn_name", p3, "chat_mode", str, "mode_session_id", p5);
       a.o(map, "ImmutableMap.of\(\n      \"\x20\x02d\", subModeId ?: \"\"\n    \)\x00");
       uElementPack.params = LiveMultiLineLogger.a(p2, map);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.B(new ClickMetaData().setLogPage(p1).setContentPackage(uContentPack).setElementPackage(uElementPack));
       return;
    }
    public final void b(ClientContent$LiveStreamPackage p0,e0 p1,a$a p2,String p3,Integer p4,String p5){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       a.p(p0, "liveStreamPackage");
       a.p(p1, "page");
       a.p(p2, "logInfo");
       a.p(p3, "buttonName");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MULTI_HEAD_FUCTION_BUTTON";
       String str = String.valueOf(p4);
       if (p5 == null) {
          p5 = "";
       }
       Map map = ImmutableMap.of("btn_name", p3, "chat_mode", str, "mode_session_id", p5);
       a.o(map, "ImmutableMap.of\(\n      \"\x20\x02d\", subModeId ?: \"\"\n    \)\x00");
       uElementPack.params = LiveMultiLineLogger.a(p2, map);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.B0(new ShowMetaData().setLogPage(p1).setContentPackage(uContentPack).setElementPackage(uElementPack));
       return;
    }
    public final void c(ClientContent$LiveStreamPackage p0,e0 p1,a$a p2,boolean p3,String p4,LiveScoreLineChatTeam[] p5,Integer p6){
       ClientContent$UserPackage[] userPackageA;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       a uoa = a.class;
       int i = 1;
       int i1 = 0;
       int i2 = 2;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,Boolean.valueOf(p3),oobject3,oobject4,oobject5};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "3")) {
             return;
          }
       }
       a.p(oobject, "liveStreamPackage");
       a.p(oobject1, "page");
       a.p(oobject2, "logInfo");
       a.p(oobject3, "isSetWishList");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MULTI_WISH_LIST_TAG_BUTTON";
       Map map = (p3)? ImmutableMap.of("if_set", oobject3): null;
       uElementPack.params = LiveMultiLineLogger.a(oobject2, map);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject;
       ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
       Object[] objArray1 = PatchProxy.applyTwoRefs(oobject4, oobject5, obj, uoa, "5");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          ArrayList uArrayList = new ArrayList();
          if (oobject4 == null || oobject5 == null) {
             userPackageA = new ClientContent$UserPackage[0];
             objArray1 = uArrayList.toArray(userPackageA);
             Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
          }else {
             int len = oobject4.length;
             int i3 = 0;
             while (i3 < len) {
                ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
                object oobject6 = oobject4[i3].teamMember[i1];
                userPackage.identity = String.valueOf(oobject6.player.userId);
                long[] olongArray = new long[]{oobject6.score,oobject6.targetScore};
                String str = Arrays.toString(olongArray);
                a.o(str, "java.util.Arrays.toString\(this\)");
                userPackage.params = str;
                userPackage.avatarStatus = String.valueOf(p6.intValue());
                uArrayList.add(userPackage);
                i3 = i3 + 1;
                i2 = 2;
             }
             userPackageA = new ClientContent$UserPackage[0];
             objArray1 = uArrayList.toArray(userPackageA);
             Objects.requireNonNull(objArray1, "null cannot be cast to non-null type kotlin.Array<T>");
          }
       }
       uBatchUserPa.userPackage = objArray1;
       uContentPack.batchUserPackage = uBatchUserPa;
       u1.B0(new ShowMetaData().setLogPage(oobject1).setContentPackage(uContentPack).setElementPackage(uElementPack));
       return;
    }
}
