package mc1.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BusinessPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LivePkPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import zb6.a;
import lnc.i3;
import q2b.h$b;
import com.yxcorp.gifshow.log.model.CommonParams;

public class a	// class@00314c
{

    public void a(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,FeedLogCtx p1,String p2,String p3,String p4){
       a uoa = a.class;
       int i = 5;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          if (PatchProxy.applyVoid(objArray, null, uoa, "7")) {
             return;
          }
       }
       String str = "LIVE_COMMENT_NOTICE";
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray1 = new Object[]{str,p0,p1,p2,p3,p4,null};
          if (PatchProxy.applyVoid(objArray1, null, uoa, "8")) {
          label_0098 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = str;
       if (!TextUtils.x(p4)) {
          uElementPack.params = p4;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       if (!TextUtils.x(null)) {
          ClientContent$BusinessPackageV2 uBusinessPac = new ClientContent$BusinessPackageV2();
          uBusinessPac.businessLine = null;
          uContentPack.businessPackage = uBusinessPac;
       }
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       moreInfoPack.type = p2;
       moreInfoPack.id = p3;
       uContentWrap.moreInfoPackage = moreInfoPack;
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setContentWrapper(uContentWrap).setFeedLogCtx(p1));
       goto label_0098 ;
    }
    public static void b(ClientContent$LiveStreamPackage p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "5")) {
          return;
       }
       a.c(p0, p1, p2, "");
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "6")) {
          return;
       }
       a.a(p0, null, p1, p2, p3);
       return;
    }
    public static void d(ClientContent$LiveStreamPackage p0,FeedLogCtx p1,String p2,String p3,String p4){
       a uoa = a.class;
       int i = 5;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = p3;
          objArray[4] = p4;
          if (PatchProxy.applyVoid(objArray, null, uoa, "3")) {
             return;
          }
       }
       String str = "LIVE_COMMENT_NOTICE";
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray1 = new Object[]{str,p0,p1,p2,p3,p4,null};
          if (PatchProxy.applyVoid(objArray1, null, uoa, "4")) {
          label_009a :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = str;
       if (!TextUtils.x(p4)) {
          uElementPack.params = p4;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       if (!TextUtils.x(null)) {
          ClientContent$BusinessPackageV2 uBusinessPac = new ClientContent$BusinessPackageV2();
          uBusinessPac.businessLine = null;
          uContentPack.businessPackage = uBusinessPac;
       }
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$MoreInfoPackage moreInfoPack = new ClientContentWrapper$MoreInfoPackage();
       moreInfoPack.type = p2;
       moreInfoPack.id = p3;
       uContentWrap.moreInfoPackage = moreInfoPack;
       u1.B0(new ShowMetaData().setType(9).setElementPackage(uElementPack).setContentPackage(uContentPack).setContentWrapper(uContentWrap).setFeedLogCtx(p1));
       goto label_009a ;
    }
    public static void e(ClientContent$LiveStreamPackage p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "1")) {
          return;
       }
       a.f(p0, p1, p2, "");
       return;
    }
    public static void f(ClientContent$LiveStreamPackage p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "2")) {
          return;
       }
       a.d(p0, null, p1, p2, p3);
       return;
    }
    public static void g(e0 p0,ClientContent$LiveStreamPackage p1,int p2,int p3,boolean p4,int p5,int p6,String p7,long p8,JsonElement p9,int p10,String p11,String p12,FeedLogCtx p13,Throwable p14){
       String str1;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p7;
       object oobject3 = p9;
       object oobject4 = p11;
       object oobject5 = p12;
       object oobject6 = p13;
       a uoa = a.class;
       int i = 15;
       int i1 = 11;
       int i2 = 10;
       int i3 = 9;
       int i4 = 8;
       int i5 = 7;
       int i6 = 6;
       int i7 = 5;
       int i8 = 4;
       int i9 = 2;
       int i10 = 0;
       int i11 = 3;
       int i12 = 14;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i];
          objArray[i10] = oobject;
          objArray[1] = oobject1;
          objArray[i9] = Integer.valueOf(p2);
          objArray[i11] = Integer.valueOf(p3);
          objArray[i8] = Boolean.valueOf(p4);
          objArray[i7] = Integer.valueOf(p5);
          objArray[i6] = Integer.valueOf(p6);
          objArray[i5] = oobject2;
          objArray[i4] = Long.valueOf(p8);
          objArray[i3] = oobject3;
          objArray[i2] = Integer.valueOf(p10);
          objArray[i1] = oobject4;
          objArray[12] = oobject5;
          objArray[13] = oobject6;
          objArray[i12] = p14;
          if (PatchProxy.applyVoid(objArray, null, uoa, "18")) {
             return;
          }
       }
       int i13 = 49;
       String str = "";
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray1 = new Object[18];
          objArray1[i10] = oobject;
          objArray1[1] = oobject1;
          objArray1[i9] = Integer.valueOf(i12);
          objArray1[i11] = Integer.valueOf(p2);
          objArray1[i8] = Integer.valueOf(p3);
          objArray1[i7] = Boolean.valueOf(p4);
          objArray1[i6] = Integer.valueOf(p5);
          objArray1[i5] = Integer.valueOf(i13);
          objArray1[i4] = Integer.valueOf(p6);
          objArray1[i3] = oobject2;
          objArray1[10] = str;
          objArray1[11] = Long.valueOf(p8);
          objArray1[12] = oobject3;
          objArray1[13] = Integer.valueOf(p10);
          objArray1[i12] = oobject4;
          objArray1[15] = oobject5;
          objArray1[16] = oobject6;
          objArray1[17] = p14;
          if (PatchProxy.applyVoid(objArray1, null, uoa, "17")) {
          label_01b9 :
             return;
          }
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject1;
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.identity = String.valueOf(p2);
       giftPackage.giftEntryType = i12;
       giftPackage.position = p5 + 1;
       giftPackage.sourceType = i13;
       giftPackage.totalCount = p6;
       uContentPack.giftPackage = giftPackage;
       ClientContent$UserPackage userPackage = PatchProxy.applyOneRefs(oobject2, null, uoa, "19");
       if (userPackage != PatchProxyResult.class) {
       }else {
          userPackage = new ClientContent$UserPackage();
          userPackage.identity = oobject2;
       }
       uContentPack.userPackage = userPackage;
       if (!TextUtils.x(str)) {
          ClientContent$LivePkPackage livePkPackag = new ClientContent$LivePkPackage();
          livePkPackag.pkId = str;
          uContentPack.livePkPackage = livePkPackag;
       }
       ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
       moreInfoPack.type = String.valueOf(p10);
       moreInfoPack.id = oobject4;
       uContentPack.moreInfoPackage = moreInfoPack;
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.code = a.b(p14);
       resultPackag.timeCost = p8;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_SENT_GIFT";
       if (PatchProxy.isSupport(uoa)) {
          str1 = PatchProxy.applyThreeRefs(Boolean.TRUE, Boolean.valueOf(p4), p12, null, a.class, "20");
          if (str1 != PatchProxyResult.class) {
          label_0192 :
             uElementPack.params = str1;
             h$b uob = h$b.e(p3, "LIVE_SENT_GIFT");
             CommonParams uCommonParam = new CommonParams();
             uCommonParam.mCsLogCorrelateInfo = oobject3;
             uob.t(3);
             uob.h(uContentPack);
             uob.q(resultPackag);
             uob.g(uCommonParam);
             uob.k(uElementPack);
             uob.l(oobject6);
             u1.p0("702408", oobject, uob);
             goto label_01b9 ;
          }
       }
       i3 oi3 = i3.f();
       oi3.a("is_normal_live", Boolean.TRUE);
       oi3.a("is_slide", Boolean.valueOf(p4));
       oi3.d("voice_party_pk_id", oobject5);
       str1 = oi3.e();
       goto label_0192 ;
    }
}
