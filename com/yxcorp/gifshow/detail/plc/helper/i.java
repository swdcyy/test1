package com.yxcorp.gifshow.detail.plc.helper.i;
import f4a.k;
import android.app.Activity;
import com.yxcorp.gifshow.detail.plc.helper.ApkDownloadHelper$a;
import f4a.o;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import f4a.l;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterDownloadLogParam;
import com.kwai.framework.model.user.QCurrentUser;
import fg6.a;
import com.google.gson.Gson;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import com.yxcorp.gifshow.detail.plc.helper.i$a;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.w0;
import com.google.common.base.Optional;
import com.yxcorp.gifshow.detail.plc.helper.h;
import ok.h;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadAction;
import f4a.j;
import java.lang.Number;
import com.yxcorp.gifshow.detail.plc.helper.g;
import java.lang.Integer;
import z1.a;
import yka.c;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.net.NetworkInfo;
import ekd.p0;
import f4a.q;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import nz6.a;

public class i implements k	// class@00167c
{
    public final String a;
    public GameCenterDownloadParams b;
    public GameCenterPlugin c;
    public ApkDownloadHelper$a d;
    public Activity e;
    public i$a f;
    public l g;

    public void i(Activity p0,ApkDownloadHelper$a p1,o p2,AdDataWrapper p3,l p4,String p5){
       super();
       GameCenterDownloadParams gameCenterDo = p2.e();
       this.b = gameCenterDo;
       String str = PatchProxy.applyOneRefs(p3, this, i.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          GameCenterDownloadLogParam gameCenterDo1 = new GameCenterDownloadLogParam();
          gameCenterDo1.sceneId = this.a;
          gameCenterDo1.photoId = p3.getPhotoId();
          gameCenterDo1.authorId = p3.getUserId();
          gameCenterDo1.userId = QCurrentUser.ME.getId();
          str = a.a.q(gameCenterDo1);
       }
       gameCenterDo.mLogParam = str;
       this.c = d.a(-1986139969);
       this.d = p1;
       this.e = p0;
       this.f = new i$a(this);
       this.g = p4;
       this.a = p5;
       return;
    }
    public static boolean k(GameCenterDownloadParams$DownloadInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(i.n(p0), "progress");
    }
    public static GameCenterDownloadParams m(String p0,String p1,String p2,String p3){
       GameCenterDownloadParams obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, i.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new GameCenterDownloadParams();
       if (TextUtils.x(p0)) {
          return obj;
       }
       Uri uri = w0.f(p0);
       if (!uri.isHierarchical()) {
          return obj;
       }
       String str = w0.a(uri, "gc");
       if (TextUtils.x(str)) {
          return obj;
       }
       String[] stringArray = str.split("_");
       if (stringArray.length >= 3 && ("1").equals(stringArray[0])) {
          obj.mDownloadUrl = p0;
          obj.mPackageName = p1;
          obj.mDownloadId = stringArray[2];
          obj.mGameIconUrl = p2;
          obj.mGameName = p3;
       }
       return obj;
    }
    public static String n(GameCenterDownloadParams$DownloadInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Optional.fromNullable(p0).transform(h.b).or("");
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       i tb = this.b;
       tb.mAction = GameCenterDownloadParams$DownloadAction.PAUSE;
       this.c.gameDownload(this.e, tb);
       return;
    }
    public int b(long p0,long p1,int p2){
       return j.a(this, p0, p1, p2);
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, i.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Optional.fromNullable(this.c.gameDownloadProgress(this.b)).transform(g.b).or(Integer.valueOf(0)).intValue();
    }
    public boolean d(a p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i oi = i.class;
       p0 = PatchProxy.applyOneRefs(p0, this, oi, "5");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       GameCenterDownloadParams$DownloadInfo uDownloadInf = this.c.gameDownloadProgress(this.b);
       Object obj = PatchProxy.applyOneRefs(uDownloadInf, null, oi, "12");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          String str = i.n(uDownloadInf);
          b = (TextUtils.n(str, "pause") || TextUtils.n(str, "error"))? true: false;
       }
       if (b) {
          i tg = this.g;
          if (tg != null) {
             tg.C(uDownloadInf.mSoFarBytes, uDownloadInf.mTotalBytes);
          }
          this.l(this.e, GameCenterDownloadParams$DownloadAction.RESUME);
       }else if(i.k(uDownloadInf)){
          uDownloadInf.mAction = GameCenterDownloadParams$DownloadAction.START;
       }else {
          return false;
       }
       return true;
    }
    public void e(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "11")) {
          this.c.registerGameCenterDownloadListener(String.valueOf(this.hashCode()), this.b.mDownloadId, this.f);
       }
       return;
    }
    public void f(Activity p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "7")) {
          return;
       }
       p0.startActivity(p0.getPackageManager().getLaunchIntentForPackage(p1));
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, i.class, "8")) {
          return;
       }
       this.c.clearDownloadListeners(String.valueOf(this.hashCode()));
       return;
    }
    public boolean h(){
       return j.b(this);
    }
    public void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       this.l(this.e, GameCenterDownloadParams$DownloadAction.START);
       if (p0 != null) {
          p0.accept(Integer.valueOf(12));
       }
       return;
    }
    public void j(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "9")) {
          return;
       }
       return;
    }
    public final void l(Activity p0,GameCenterDownloadParams$DownloadAction p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "2")) {
          return;
       }
       NetworkInfo networkInfo = p0.e(a.b());
       if (networkInfo != null && !networkInfo.getType()) {
          a.c(R.string.arg_RES_7f1039a1, new int[2]{R.string.arg_RES_7f10081a,0x7f1004b4}, p0, new q(this, p1)).show();
       }else {
          i tb = this.b;
          tb.mAction = p1;
          this.c.gameDownload(this.e, tb);
       }
       return;
    }
}
