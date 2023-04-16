package com.yxcorp.gifshow.pymk.log.PymkLogSender;
import java.lang.Object;
import java.lang.String;
import com.kwai.framework.model.user.User;
import rq4.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.System;
import rq4.m;
import com.yxcorp.utility.TextUtils;
import k2b.k2;
import k2b.u1;
import rq4.n;
import java.lang.CharSequence;
import lnc.i3;
import java.lang.Number;
import g7c.a;
import java.util.Objects;
import com.kwai.framework.model.user.UserExtraInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import rq4.o;
import java.lang.Long;
import com.kuaishou.android.model.mix.CommonMeta;
import cg5.c;
import wkd.b;
import i7c.a;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import h7c.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Math;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.google.protobuf.nano.MessageNano;
import android.util.Base64;

public final class PymkLogSender	// class@0016c3
{

    public void PymkLogSender(){
       super();
    }
    public static r createClientLog(int p0,String p1,User p2){
       if (PatchProxy.isSupport(PymkLogSender.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, null, PymkLogSender.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return PymkLogSender.createClientLog(p0, p1, p2, null);
    }
    public static r createClientLog(int p0,String p1,User p2,QPhoto p3){
       r obj;
       if (PatchProxy.isSupport(PymkLogSender.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, null, PymkLogSender.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new r();
       obj.a = QCurrentUser.ME.getId();
       obj.c = System.currentTimeMillis();
       m om = new m();
       obj.e = om;
       om.c = TextUtils.I(p1);
       p1.d = p0;
       k2 ok2 = u1.n();
       if (ok2 != null) {
          p1.j = ok2.d;
       }
       if (p2 != null) {
          obj.g = PymkLogSender.createRecoUserParams(p2);
       }
       if (p3 != null) {
          if (!TextUtils.x(p3.getUserId())) {
             ok2.g = p3.getUserId();
          }
          i3 oi3 = i3.f();
          oi3.c("feedType", Integer.valueOf(p3.getType()));
          i3 oi31 = i3.f();
          oi31.d("bizInfo", oi3.e());
          oi3.i = oi31.e();
       }
       return obj;
    }
    public static r createFollowClientLog(int p0,String p1,User p2,a p3){
       if (PatchProxy.isSupport(PymkLogSender.class)) {
          p3 = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, null, PymkLogSender.class, "10");
          if (p3 != PatchProxyResult.class) {
             return p3;
          }
       }
       r or = PymkLogSender.createClientLog(p0, p1, p2);
       int i = (p2.isFollowingOrFollowRequesting())? 2: 10;
       or.d = i;
       r g = or.g;
       p2 = p2.mPage;
       if (p2 != null) {
          Objects.requireNonNull(p2);
          int i1 = -1;
          switch (p2.hashCode()){
              case 0xed8e89a9:
                if (p2.equals("profile")) {
                   i1 = 0;
                }
                break;
              case 0x32b0ec:
                if (p2.equals("live")) {
                   i1 = 1;
                }
                break;
              case 0x3559df:
                if (p2.equals("reco")) {
                   i1 = 2;
                }
                break;
              case 0x65b3e32:
                if (p2.equals("photo")) {
                   i1 = 3;
                }
                break;
              default:
          }
          switch (i1){
              case 0:
                g.f = 2;
                break;
              case 1:
                g.f = 4;
                break;
              case 2:
                g.f = 1;
                break;
              case 3:
                g.f = 3;
                break;
              default:
                g.f = 0;
          }
       }else {
          g.f = 1;
       }
       or.g = g;
       return or;
    }
    public static n createRecoUserParams(User p0){
       n obj = PatchProxy.applyOneRefs(p0, null, PymkLogSender.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new n();
       obj.a = p0.getId();
       obj.d = p0.mPosition + 1;
       obj.j = p0.mIsLiving;
       User mExtraInfo = p0.mExtraInfo;
       if (mExtraInfo != null) {
          obj.h = mExtraInfo.mRecommendReasonValue;
       }
       if (p0.mIsNewFriend != null || p0.mNewest != null) {
          obj.g = true;
       }
       return obj;
    }
    public static void pymkCloseBtnClick(int p0){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, pymkLogSende, "29")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "USER_RECO_CARD_CLOSE_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("portal", Integer.valueOf(p0));
       uElementPack.params = oi3.e();
       u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack));
       return;
    }
    public static void pymkCloseBtnShow(int p0){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, pymkLogSende, "28")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "USER_RECO_CARD_CLOSE_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("portal", Integer.valueOf(p0));
       uElementPack.params = oi3.e();
       u1.u0(6, uElementPack, null);
       return;
    }
    public static void reportClickCloseContactCard(int p0,String p1){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, pymkLogSende, "17")) {
          return;
       }
       r or = PymkLogSender.createClientLog(p0, p1, null);
       or.d = 17;
       PymkLogSender.sendClientLog(or, null);
       return;
    }
    public static void reportClickFollow(int p0,String p1,User p2,a p3){
       if (PatchProxy.isSupport(PymkLogSender.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, PymkLogSender.class, "9")) {
          return;
       }
       PymkLogSender.sendClientLog(PymkLogSender.createFollowClientLog(p0, p1, p2, p3), p3);
       return;
    }
    public static void reportClickLive(int p0,String p1,QPhoto p2,User p3,int p4,a p5){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, pymkLogSende, "23")) {
             return;
          }
       }
       PymkLogSender.reportClickPhoto(p0, p1, p2, p3, p4, 11, p5);
       return;
    }
    public static void reportClickLive(int p0,String p1,String p2,User p3,a p4){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, pymkLogSende, "25")) {
             return;
          }
       }
       r or = PymkLogSender.createClientLog(p0, p1, p3);
       or.d = 11;
       o oo = new o();
       oo.a = p2;
       oo.c = p2;
       or.h = oo;
       PymkLogSender.sendClientLog(or, p4);
       return;
    }
    public static void reportClickPhoto(int p0,String p1,QPhoto p2,User p3,int p4,int p5,a p6){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5),p6};
          if (PatchProxy.applyVoid(objArray, null, pymkLogSende, "24")) {
             return;
          }
       }
       r or = PymkLogSender.createClientLog(p0, p1, p3);
       or.d = p5;
       o oo = new o();
       oo.b = p4 + 1;
       oo.a = p2.getPhotoId();
       or.h = oo;
       PymkLogSender.sendClientLog(or, p6);
       return;
    }
    public static void reportClickPhoto(int p0,String p1,QPhoto p2,User p3,int p4,a p5){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, pymkLogSende, "22")) {
             return;
          }
       }
       PymkLogSender.reportClickPhoto(p0, p1, p2, p3, p4, 7, p5);
       return;
    }
    public static void reportClickReplaceContactCard(int p0,String p1){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, pymkLogSende, "18")) {
          return;
       }
       r or = PymkLogSender.createClientLog(p0, p1, null);
       or.d = 18;
       PymkLogSender.sendClientLog(or, null);
       return;
    }
    public static void reportClickUser(int p0,String p1,User p2,a p3){
       if (PatchProxy.isSupport(PymkLogSender.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, PymkLogSender.class, "19")) {
          return;
       }
       PymkLogSender.reportClickUser(p0, p1, p2, p3, null);
       return;
    }
    public static void reportClickUser(int p0,String p1,User p2,a p3,QPhoto p4){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, pymkLogSende, "20")) {
             return;
          }
       }
       r or = PymkLogSender.createClientLog(p0, p1, p2, p4);
       or.d = 1;
       PymkLogSender.sendClientLog(or, p3);
       return;
    }
    public static void reportPhotoPlayDuration(int p0,String p1,String p2,User p3,int p4,int p5,long p6){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5),Long.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, null, pymkLogSende, "4")) {
             return;
          }
       }
       r or = PymkLogSender.createClientLog(p0, p1, p3);
       or.d = 16;
       o oo = new o();
       oo.b = p4 + 1;
       oo.a = p2;
       oo.d = p6;
       oo.e = p5;
       or.h = oo;
       PymkLogSender.sendClientLog(or, null);
       return;
    }
    public static void reportPolicy(int p0,int p1,String p2,a p3){
       if (PatchProxy.isSupport(PymkLogSender.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, null, PymkLogSender.class, "26")) {
          return;
       }
       r or = PymkLogSender.createClientLog(p1, p2, null);
       or.d = p0;
       PymkLogSender.sendClientLog(or, p3);
       return;
    }
    public static void reportPymkNegative(String p0,int p1,int p2,CommonMeta p3,int p4,String p5,String p6,String p7,String p8){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, pymkLogSende, "8")) {
             return;
          }
       }
       k2 ok2 = u1.n();
       String str = (ok2 == null)? "": ok2.d;
       c.k(null, p1, p2, str, p5, p6, p4, p7, null, p8, p0);
       return;
    }
    public static void reportPymkRefresh(int p0,String p1,a p2){
       if (PatchProxy.isSupport(PymkLogSender.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, PymkLogSender.class, "21")) {
          return;
       }
       r or = PymkLogSender.createClientLog(p0, p1, null);
       or.d = 6;
       PymkLogSender.sendClientLog(or, p2);
       return;
    }
    public static void reportPymkRemove(User p0,int p1,String p2){
       if (PatchProxy.isSupport(PymkLogSender.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, PymkLogSender.class, "7")) {
          return;
       }
       k2 ok2 = u1.n();
       String str = (ok2 == null)? "": ok2.d;
       String str1 = str;
       ok2 = (u1.j() != null)? u1.j().d: null;
       i3 oi3 = i3.f();
       oi3.d("page_name", ok2);
       String str2 = oi3.e();
       b.a(-1302358859).h(p0.getId(), p1, p2, str1, (p0.mPosition + 1), str2).subscribe(Functions.d(), Functions.d());
       return;
    }
    public static void reportRemoveAll(int p0,String p1){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, pymkLogSende, "6")) {
          return;
       }
       r or = PymkLogSender.createClientLog(p0, p1, null);
       or.d = 8;
       PymkLogSender.sendClientLog(or, null);
       return;
    }
    public static void reportShowContactCard(int p0,String p1){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       if (PatchProxy.isSupport(pymkLogSende) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, pymkLogSende, "16")) {
          return;
       }
       r or = PymkLogSender.createClientLog(p0, p1, null);
       or.d = 19;
       PymkLogSender.sendClientLog(or, null);
       return;
    }
    public static void reportShowRecoUsers(int p0,String p1,b p2,a p3){
       if (PatchProxy.isSupport(PymkLogSender.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, PymkLogSender.class, "11")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(p2);
       PymkLogSender.reportShowRecoUsers(p0, p1, uArrayList, p3, null);
       return;
    }
    public static void reportShowRecoUsers(int p0,String p1,List p2,a p3){
       if (PatchProxy.isSupport(PymkLogSender.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, PymkLogSender.class, "12")) {
          return;
       }
       PymkLogSender.reportShowRecoUsers(p0, p1, p2, p3, null);
       return;
    }
    public static void reportShowRecoUsers(int p0,String p1,List p2,a p3,QPhoto p4){
       PymkLogSender pymkLogSende = PymkLogSender.class;
       Object obj = null;
       int i = 4;
       if (PatchProxy.isSupport(pymkLogSende)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, obj, pymkLogSende, "13")) {
             return;
          }
       }
       if (q.f(p2)) {
          return;
       }else {
          r or = PymkLogSender.createClientLog(p0, p1, obj, p4);
          or.d = i;
          n[] onArray = new n[p2.size()];
          or.f = onArray;
          int i1 = 0;
          while (i1 < or.f.length) {
             b uob = p2.get(i1);
             if (uob != null) {
                b a = uob.a;
                if (a != null) {
                   n on = PymkLogSender.createRecoUserParams(a);
                   o[] ooArray = new o[3];
                   on.e = ooArray;
                   if (!q.f(uob.b)) {
                      int i2 = Math.min(3, uob.b.size());
                      int i3 = 0;
                      while (i3 < i2) {
                         BaseFeed uBaseFeed = uob.b.get(i3);
                         if (uBaseFeed != null) {
                            on.e[i3] = new o();
                            on.e[i3].a = r1.t1(uBaseFeed);
                            int i4 = i3 + 1;
                            on.e[i3].b = i4;
                         }
                         i3 = i3 + 1;
                      }
                   }
                   uob[i1] = on;
                }
             }
             i1++;
          }
          PymkLogSender.sendClientLog(or, p3);
          return;
       }
    }
    public static void reportShowUser(int p0,String p1,User p2,a p3){
       if (PatchProxy.isSupport(PymkLogSender.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, PymkLogSender.class, "15")) {
          return;
       }
       r or = PymkLogSender.createClientLog(p0, p1, p2);
       or.d = 4;
       PymkLogSender.sendClientLog(or, p3);
       return;
    }
    public static void reportShowUsers(int p0,String p1,List p2,a p3){
       if (PatchProxy.isSupport(PymkLogSender.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, PymkLogSender.class, "14")) {
          return;
       }
       if (q.f(p2)) {
          return;
       }
       r or = PymkLogSender.createClientLog(p0, p1, null);
       or.d = 4;
       n[] onArray = new n[p2.size()];
       or.f = onArray;
       int i = 0;
       while (i < or.f.length) {
          User user = p2.get(i);
          if (user != null) {
             or.f[i] = PymkLogSender.createRecoUserParams(user);
          }
          i++;
       }
       PymkLogSender.sendClientLog(or, p3);
       return;
    }
    public static void reportUserRemove(int p0,String p1,User p2,a p3){
       if (PatchProxy.isSupport(PymkLogSender.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, null, PymkLogSender.class, "5")) {
          return;
       }
       r or = PymkLogSender.createClientLog(p0, p1, p2);
       or.d = 3;
       PymkLogSender.sendClientLog(or, p3);
       return;
    }
    public static void sendClientLog(r p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PymkLogSender.class, "30")) {
          return;
       }
       PymkLogSender.sendClientLog(p0, null);
       return;
    }
    public static void sendClientLog(r p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, PymkLogSender.class, "27")) {
          return;
       }
       if (p1 != null) {
          p0 = p1.a(p0);
       }
       b.a(-1302358859).a(Base64.encodeToString(MessageNano.toByteArray(p0), 2)).subscribe(Functions.d(), Functions.d());
       return;
    }
}
