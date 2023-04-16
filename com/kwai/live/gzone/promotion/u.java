package com.kwai.live.gzone.promotion.u;
import java.lang.Object;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadAction;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterDownloadLogParam;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.TextUtils;
import s67.i1;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Activity;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGame;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kwai.live.gzone.promotion.u$a;
import java.lang.Integer;
import java.lang.Boolean;
import android.content.pm.PackageManager;
import android.content.Intent;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import java.util.Objects;
import com.kwai.live.gzone.promotion.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import fg6.a;
import com.google.gson.Gson;
import e17.i;
import u37.d;
import u37.e;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class u	// class@000ddb
{

    public void u(){
       super();
    }
    public static GameCenterDownloadParams a(GameCenterDownloadParams$DownloadInfo p0,GameCenterDownloadParams$DownloadAction p1){
       GameCenterDownloadParams obj = PatchProxy.applyTwoRefs(p0, p1, null, u.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GameCenterDownloadParams();
       obj.mDownloadId = p0.mGameId;
       obj.mDownloadUrl = p0.mUrl;
       obj.mGameIconUrl = p0.mGameIcon;
       obj.mPackageName = p0.mPackageName;
       obj.mGameName = p0.mGameName;
       obj.mLogParam = p0.mStatsticData;
       obj.mAction = p1;
       return obj;
    }
    public static GameCenterDownloadLogParam b(BaseFeed p0,String p1,String p2){
       GameCenterDownloadLogParam obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, u.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GameCenterDownloadLogParam();
       obj.sceneId = "127";
       obj.authorId = p1;
       obj.photoId = p2;
       obj.imeiId = TextUtils.k(SystemUtil.m(a.B));
       obj.mFansTopExt = i1.c(p0);
       obj.userId = QCurrentUser.me().getId();
       return obj;
    }
    public static void c(Activity p0,LiveGzonePromotionGame p1,BaseFeed p2,String p3,String p4,int p5,boolean p6,ClientContent$LiveStreamPackage p7,u$a p8){
       int i6;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p7;
       u ou = u.class;
       int i = 0;
       int i1 = 2;
       int i2 = 3;
       int i3 = 4;
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[9];
          objArray[i] = oobject;
          objArray[1] = oobject1;
          objArray[i1] = p2;
          objArray[i2] = p3;
          objArray[i3] = p4;
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = oobject2;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, ou, "1")) {
             return;
          }
       }
       if (SystemUtil.M(oobject, oobject1.mIdentifier)) {
          if (!PatchProxy.applyVoidTwoRefs(oobject, oobject1, null, ou, "6")) {
             Intent launchIntent = p0.getPackageManager().getLaunchIntentForPackage(oobject1.mIdentifier);
             if (launchIntent != null) {
                int i4 = 0x10000000;
                try{
                   launchIntent.addFlags(i4);
                   oobject.startActivity(launchIntent);
                }catch(android.content.ActivityNotFoundException e0){
                   b.I(LiveLogTag.GZONE, "open game", e0);
                }
             }
          }
       }else {
          int i5 = -1986139969;
          GameCenterDownloadParams$DownloadInfo gameCenterDo = d.a(i5).getGameCenterDownloadInfoByGameId(oobject1.mGameId);
          if (gameCenterDo == null) {
             u.d(oobject, oobject1, u.b(p2, p3, p4));
             i1.e(p3, p4, oobject1.mGameId, "game", p5, i1.c(p2), p6, p7);
          }else {
             GameCenterDownloadParams$DownloadInfo mStage = gameCenterDo.mStage;
             Objects.requireNonNull(mStage);
             switch (mStage.hashCode()){
                 case 0xae7a2e7a:
                   if (mStage.equals("cancel")) {
                      i6 = 0;
                   }
                   break;
                 case 0xc454c22d:
                   if (mStage.equals("progress")) {
                      i6 = 1;
                   }
                   break;
                 case 0xc84dc82d:
                   if (mStage.equals("resume")) {
                      i6 = 2;
                   }
                   break;
                 case 0xdc453139:
                   if (mStage.equals("complete")) {
                      i6 = 3;
                   }
                   break;
                 case 0x379175:
                   if (mStage.equals("wait")) {
                      i6 = 4;
                   }
                   break;
                 case 0x5c4d208:
                   if (mStage.equals("error")) {
                      i6 = 5;
                   }
                   break;
                 case 0x65825f6:
                   if (mStage.equals("pause")) {
                      i6 = 6;
                   }
                   break;
                 case 0x68ac462:
                   if (mStage.equals("start")) {
                      i6 = 7;
                   }
                   break;
                 default:
                label_00bd :
                   i6 = -1;
             }
             switch (i6){
                 case 0:
                   u.d(oobject, oobject1, u.b(p2, p3, p4));
                   i1.e(p3, p4, oobject1.mGameId, "game", p5, i1.c(p2), p6, p7);
                   break;
                 case 1:
                 case 7:
                 case 2:
                   d.a(i5).gameDownload(oobject, u.a(gameCenterDo, GameCenterDownloadParams$DownloadAction.PAUSE));
                   if (p8 != null) {
                      p8.a(gameCenterDo);
                   }
                   LiveGzonePromotionGame mGameId = oobject1.mGameId;
                   String str = i1.c(p2);
                   i1 oi1 = i1.class;
                   if (PatchProxy.isSupport(oi1)) {
                      Object[] objArray1 = new Object[]{p3,p4,mGameId,Integer.valueOf(p5),str,Boolean.valueOf(p6),oobject2};
                      if (!PatchProxy.applyVoid(objArray1, null, oi1, "13")) {
                      }
                   }else {
                   }
                   break;
                 case 3:
                   i1.g(p3, p4, oobject1.mGameId, p5, i1.c(p2), p6, p7);
                   break;
                 case 4:
                 case 6:
                 case 5:
                   d.a(i5).gameDownload(oobject, u.a(gameCenterDo, GameCenterDownloadParams$DownloadAction.RESUME));
                   i1.f(p3, p4, oobject1.mGameId, p5, i1.c(p2), p6, p7);
                   break;
                 default:
             }
          }
          return;
       }
    }
    public static void d(Activity p0,LiveGzonePromotionGame p1,GameCenterDownloadLogParam p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, u.class, "2")) {
          return;
       }
       GameCenterDownloadParams gameCenterDo = new GameCenterDownloadParams();
       gameCenterDo.mDownloadId = p1.mGameId;
       gameCenterDo.mDownloadUrl = p1.mDownloadUrl;
       Object obj = null;
       String str = (j.h(p1.mGameIcons))? obj: p1.mGameIcons[0].mUrl;
       gameCenterDo.mGameIconUrl = str;
       gameCenterDo.mAction = GameCenterDownloadParams$DownloadAction.START;
       gameCenterDo.mPackageName = p1.mIdentifier;
       gameCenterDo.mGameName = p1.mGameName;
       gameCenterDo.mLogParam = a.a.q(p2);
       d.a(-1986139969).gameDownload(p0, gameCenterDo);
       i.a(R.style.arg_RES_7f11066a, 0x7f102426);
       if (!PatchProxy.applyVoidTwoRefs(p2, p1, obj, u.class, "3")) {
          e.b().a(p1.mGameId, p2.photoId, p2.authorId, p2.sceneId, TextUtils.k(d.a(-1986139969).getDownloadTraceId(p1.mGameId))).subscribe(Functions.d(), Functions.d());
       }
       return;
    }
}
