package k6a.u;
import java.lang.Object;
import java.lang.String;
import rq4.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.System;
import rq4.m;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.User;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Boolean;
import com.kwai.framework.model.user.User$FollowStatus;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kwai.framework.model.user.UserCoverMeta;
import java.lang.CharSequence;
import com.kuaishou.client.log.content.packages.nano.ClientContent$BatchUserPackage;
import java.util.List;
import java.util.Collections;
import rq4.n;
import psb.c;
import psb.b;
import com.google.protobuf.nano.MessageNano;
import android.util.Base64;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class u	// class@002c02
{

    public void u(){
       super();
    }
    public static r a(String p0){
       r obj = PatchProxy.applyOneRefsWithListener(p0, null, u.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new r();
       obj.a = QCurrentUser.ME.getId();
       obj.c = System.currentTimeMillis();
       m om = new m();
       obj.e = om;
       om.c = TextUtils.I(p0);
       p0.d = 74;
       PatchProxy.onMethodExit(u.class, "17");
       return obj;
    }
    public static void b(User p0,int p1,String p2){
       if (PatchProxy.isSupport2(u.class, "9") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), p2, null, u.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "USER_RECO_CARD";
       i3 oi3 = i3.f();
       oi3.c("portal", Integer.valueOf(74));
       oi3.d("click_area", p2);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       uContentPack.userPackage = userPackage;
       p1++;
       userPackage.index = p1;
       userPackage.identity = p0.getId();
       u1.M(null, null, 1, uElementPack, uContentPack, null);
       if (("to_profile").equals(p2)) {
          u.h(p0.mPrsid, p0);
       }else if(("follow").equals(p2)){
          u.i(p0.mPrsid, p0);
       }
       PatchProxy.onMethodExit(u.class, "9");
       return;
    }
    public static void c(User p0,int p1,String p2,boolean p3){
       String str;
       User mCoverMeta;
       if (PatchProxy.isSupport2(u.class, "6") && PatchProxy.applyVoidFourRefsWithListener(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), null, u.class, "6")) {
          return;
       }
       if (p0 == null || ("empty").equals(p0.mId)) {
          PatchProxy.onMethodExit(u.class, "6");
          return;
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          if (("to_profile").equals(p2)) {
             str = (p3)? "FRIEND_PORTRAIT_BUTTON": "RECOMMENDED_USER_CARD";
             uElementPack.action2 = str;
          }else if(("detail").equals(p2)){
             uElementPack.action2 = "ACQUAINTANCE_PHOTO_CARD";
          }else {
             uElementPack.action2 = "FRIEND_USER_FOLLOW";
          }
          if (("follow").equals(p2)) {
             if (p0.mVisitorBeFollowed != null) {
             label_0070 :
                str = "REPLY_FOLLOW";
             }else {
                mCoverMeta = p0.mFollowStatus;
                if (mCoverMeta == User$FollowStatus.FOLLOWING) {
                   str = "FOLLOW";
                }else if(mCoverMeta == User$FollowStatus.FOLLOW_REQUESTING){
                   goto label_0070 ;
                }else {
                   str = "";
                }
             }
             i3 oi3 = i3.f();
             oi3.d("follow_type", str);
             uElementPack.params = oi3.e();
          }
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          int i = 1;
          if (p3) {
             ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
             uContentPack.photoPackage = photoPackage;
             photoPackage.type = i;
             mCoverMeta = p0.mCoverMeta;
             if (mCoverMeta != null) {
                photoPackage.identity = mCoverMeta.mPhotoID;
                if (!TextUtils.x(mCoverMeta.mExpTag)) {
                   photoPackage.expTag = p0.mCoverMeta.mExpTag;
                }
                photoPackage.index = (long)p1;
             }
             ClientContent$ContentPackage photoPackage1 = uContentPack.photoPackage;
             photoPackage1.llsid = p0.mLlsid;
             photoPackage1.sAuthorId = p0.mId;
          }else {
             ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
             uContentPack.batchUserPackage = uBatchUserPa;
             ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[i];
             uBatchUserPa.userPackage = userPackageA;
             int i1 = 0;
             userPackageA[i1] = new ClientContent$UserPackage();
             uBatchUserPa = uContentPack.batchUserPackage.userPackage;
             uBatchUserPa[i1].index = p1 + i;
             p1.identity = p0.getId();
          }
          u1.M(null, null, 1, uElementPack, uContentPack, null);
          if ("to_profile".equals(p2)) {
             u.h(p0.mPrsid, p0);
          }else if("follow".equals(p2)){
             u.i(p0.mPrsid, p0);
          }
          PatchProxy.onMethodExit(u.class, "6");
          return;
       }
    }
    public static void d(User p0,int p1){
       n[] obj = null;
       if (PatchProxy.isSupport2(u.class, "8") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), obj, u.class, "8")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "USER_RECO_CARD";
       i3 oi3 = i3.f();
       oi3.c("portal", Integer.valueOf(74));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       uContentPack.userPackage = userPackage;
       p1++;
       userPackage.index = p1;
       userPackage.identity = p0.getId();
       u1.D0(null, null, 3, uElementPack, uContentPack, null);
       User mPrsid = p0.mPrsid;
       List list = Collections.singletonList(p0);
       if (!PatchProxy.applyVoidTwoRefsWithListener(mPrsid, list, obj, u.class, "13")) {
          r or = u.a(mPrsid);
          or.d = 4;
          obj = new n[list.size()];
          for (int i = 0; i < list.size(); i = i + 1) {
             obj[i] = new n();
             obj[i].a = list.get(i).getId();
             int i1 = list.get(i).mPosition + 1;
             obj[i].d = i1;
          }
          or.f = obj;
          u.l(or);
          PatchProxy.onMethodExit(u.class, "13");
       }
       PatchProxy.onMethodExit(u.class, "8");
       return;
    }
    public static void e(User p0,int p1,boolean p2){
       if (PatchProxy.isSupport2(u.class, "5") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, u.class, "5")) {
          return;
       }
       if (p0 == null || ("empty").equals(p0.mId)) {
          PatchProxy.onMethodExit(u.class, "5");
          return;
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = (p2)? "ACQUAINTANCE_PHOTO_CARD": "RECOMMENDED_USER_CARD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          int i = 1;
          if (p2) {
             ClientContent$PhotoPackage photoPackage = new ClientContent$PhotoPackage();
             uContentPack.photoPackage = photoPackage;
             photoPackage.type = i;
             User mCoverMeta = p0.mCoverMeta;
             if (mCoverMeta != null) {
                photoPackage.identity = mCoverMeta.mPhotoID;
                if (!TextUtils.x(mCoverMeta.mExpTag)) {
                   photoPackage.expTag = p0.mCoverMeta.mExpTag;
                }
                photoPackage.index = (long)p1;
             }
             ClientContent$ContentPackage photoPackage1 = uContentPack.photoPackage;
             photoPackage1.llsid = p0.mLlsid;
             photoPackage1.sAuthorId = p0.mId;
          }else {
             ClientContent$BatchUserPackage uBatchUserPa = new ClientContent$BatchUserPackage();
             uContentPack.batchUserPackage = uBatchUserPa;
             ClientContent$UserPackage[] userPackageA = new ClientContent$UserPackage[i];
             uBatchUserPa.userPackage = userPackageA;
             int i1 = 0;
             userPackageA[i1] = new ClientContent$UserPackage();
             uBatchUserPa = uContentPack.batchUserPackage.userPackage;
             uBatchUserPa[i1].index = p1 + i;
             p1.identity = p0.getId();
          }
          u1.D0(null, null, 3, uElementPack, uContentPack, null);
          PatchProxy.onMethodExit(u.class, "5");
          return;
       }
    }
    public static void f(){
       if (PatchProxy.applyVoidWithListener(null, null, u.class, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "NO_MORE_RECO_FRIENDS_TOAST";
       u1.D0(null, null, 4, uElementPack, null, null);
       PatchProxy.onMethodExit(u.class, "10");
       return;
    }
    public static void g(e0 p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, null, u.class, "19")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "RECOMMEND_PYMK_CARD";
       i3 oi3 = i3.f();
       oi3.d("photo_id", p1);
       oi3.d("show_type", p2);
       uElementPack.params = oi3.e();
       u1.D0(null, p0, 3, uElementPack, null, null);
       PatchProxy.onMethodExit(u.class, "19");
       return;
    }
    public static void h(String p0,User p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, null, u.class, "15")) {
          return;
       }
       r or = u.a(p0);
       or.d = 1;
       n on = new n();
       or.g = on;
       on.a = p1.getId();
       or.g.d = p1.mPosition + 1;
       u.l(or);
       PatchProxy.onMethodExit(u.class, "15");
       return;
    }
    public static void i(String p0,User p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, null, u.class, "14")) {
          return;
       }
       r or = u.a(p0);
       or.d = 2;
       n on = new n();
       or.g = on;
       on.a = p1.getId();
       r g = or.g;
       g.d = p1.mPosition + 1;
       g.f = 1;
       u.l(or);
       PatchProxy.onMethodExit(u.class, "14");
       return;
    }
    public static void j(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, u.class, "12")) {
          return;
       }
       r or = u.a(p0);
       or.d = 15;
       u.l(or);
       PatchProxy.onMethodExit(u.class, "12");
       return;
    }
    public static void k(String p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, u.class, "11")) {
          return;
       }
       r or = u.a(p0);
       or.d = 14;
       u.l(or);
       PatchProxy.onMethodExit(u.class, "11");
       return;
    }
    public static void l(r p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, u.class, "18")) {
          return;
       }
       b.a().a(Base64.encodeToString(MessageNano.toByteArray(p0), 2)).subscribe(Functions.d(), Functions.d());
       PatchProxy.onMethodExit(u.class, "18");
       return;
    }
}
