package com.kwai.component.misc.wallpaper.WallPaperDownloadUtil;
import java.lang.String;
import java.io.File;
import android.os.Environment;
import com.kwai.sdk.switchconfig.a;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$WallpaperDownloadType;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.DialogFragment;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$b;
import java.lang.Enum;
import lnc.a1;
import java.lang.CharSequence;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import wc5.i;
import erd.g;
import crd.b;
import com.yxcorp.download.DownloadManager;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.entity.QPhoto;
import s31.d;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.utility.RomUtils;
import com.kwai.component.misc.wallpaper.VideoWallpaperService;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import e17.i;
import android.content.SharedPreferences;
import oe6.n;
import java.util.ArrayList;
import java.util.List;
import qkd.b;
import java.util.Collection;
import ekd.q;
import pc5.b;
import java.lang.StringBuilder;
import q87.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.os.Parcelable;
import wc5.b;
import n3d.a;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.System;
import java.lang.Float;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import lnc.t3;
import u07.t$a;
import android.app.Activity;
import u07.f;
import wc5.g;
import u07.u;
import wc5.f;
import wc5.j;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import android.os.SystemClock;
import wkd.b;
import zwb.a;
import com.kwai.framework.model.user.QCurrentUser;
import cjd.e;
import erd.o;
import com.kwai.component.misc.wallpaper.c;
import sfc.a;
import com.yxcorp.gifshow.video.c;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.video.c$e;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$a;
import com.yxcorp.gifshow.video.c$c;
import wc5.c;
import android.os.Build$VERSION;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ekd.w0;
import java.lang.Exception;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kwai.framework.ui.popupmanager.dialog.a;
import wc5.h;
import io.reactivex.internal.functions.Functions;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$VideoWatermarkDetailPackage;
import com.yxcorp.gifshow.media.util.c;
import lnc.i3;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kp.r1;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import lnc.b9;
import java.lang.Math;

public final class WallPaperDownloadUtil	// class@0009dd
{
    public static final String a;
    public static final String b;
    public static long c;
    public static b d;
    public static boolean e;
    public static boolean f;
    public static final long g;

    static {
       WallPaperDownloadUtil.a = ("https://static.yximgs.com/udata/pkg/KS-FT-wallpaper_plugin_outer/kwai_wallpaper_plugin_1.5.apk").substring(65);
       WallPaperDownloadUtil.b = Environment.getExternalStorageDirectory().getAbsolutePath();
       WallPaperDownloadUtil.g = (long)(a.t().a("abtest_wallpaper_download_time_threshold", 0) * 1000);
    }
    public void WallPaperDownloadUtil(){
       super();
    }
    public static ProgressFragment a(GifshowActivity p0,WallPaperDownloadUtil$WallpaperDownloadType p1,View$OnClickListener p2){
       ProgressFragment obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, null, WallPaperDownloadUtil.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ProgressFragment();
       obj.Eh(0, 100);
       obj.setCancelable(0);
       int i = WallPaperDownloadUtil$b.a[p1.ordinal()];
       if (i != 1 && i != 2) {
          if (i == 3) {
             obj.yh(a1.p(R.string.arg_RES_7f105150));
          }
       }else {
          obj.yh(a1.p(R.string.arg_RES_7f105152));
       }
       obj.Jh(a1.p(R.string.arg_RES_7f105155));
       obj.Kh(true);
       obj.Bh(p2);
       obj.show(p0.getSupportFragmentManager(), "runner");
       if (!PatchProxy.applyVoidTwoRefs(obj, p1, null, WallPaperDownloadUtil.class, "16")) {
          WallPaperDownloadUtil.d = t.timer(WallPaperDownloadUtil.g, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new i(obj, p1));
       }
       PatchProxy.onMethodExit(WallPaperDownloadUtil.class, "19");
       return obj;
    }
    public static void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, WallPaperDownloadUtil.class, "25")) {
          return;
       }
       Integer integer = DownloadManager.n().p(p0);
       if (integer != null) {
          DownloadManager.n().c(integer.intValue());
       }
       return;
    }
    public static void c(ProgressFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, WallPaperDownloadUtil.class, "20")) {
          return;
       }
       WallPaperDownloadUtil.l();
       if (p0 != null && p0.isAdded()) {
          p0.dismiss();
       }
       return;
    }
    public static void d(GifshowActivity p0,QPhoto p1,String p2,ProgressFragment p3,String p4){
       WallPaperDownloadUtil wallPaperDow = WallPaperDownloadUtil.class;
       Intent obj = null;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(wallPaperDow)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, obj, wallPaperDow, "18")) {
             return;
          }
       }
       WallPaperDownloadUtil.l();
       int i2 = 100;
       if (p3 != null && p3.isAdded()) {
          p3.Nh(i2);
          k1.r(new d(p3), 1);
       }
       if (!RomUtils.s() && !RomUtils.w()) {
          i = false;
       }
       if (!PatchProxy.isSupport(VideoWallpaperService.class) || !PatchProxy.applyVoidThreeRefs(p0, p4, Boolean.valueOf(i), null, VideoWallpaperService.class, "9")) {
          int i3 = 0x7f11066a;
          if (TextUtils.x(p4) || !VideoWallpaperService.d(p4)) {
             i.a(i3, R.string.arg_RES_7f105153);
          }else {
             String str = "wall_paper_path";
             if (i) {
                obj = new Intent();
                Bundle uBundle = new Bundle();
                uBundle.putString(str, p4);
                obj.putExtras(uBundle);
                obj.setComponent(new ComponentName("com.kwai.wallpaperplugin", "com.kwai.wallpaperplugin.MainActivity"));
                p0.startActivity(obj);
                if (VideoWallpaperService.e(p0, "com.kwai.wallpaperplugin.service.KwaiWallPaperService")) {
                   i.a(i3, R.string.arg_RES_7f105154);
                }
             }else if(PatchProxy.applyVoidOneRefs(p4, obj, VideoWallpaperService.class, "13")){
                String str1 = n.b().getString(str, "");
                String str2 = n.b().getString(str, "");
                File parentFile = new File(p4).getParentFile();
                String str3 = "VideoWallpaperService";
                if (parentFile == null || !parentFile.isDirectory()) {
                   Object[] objArray1 = new Object[i1];
                   b.C().t(str3, "video file parent should be dir", objArray1);
                }else {
                   ArrayList uArrayList = new ArrayList();
                   uArrayList.add(str1);
                   uArrayList.add(str2);
                   uArrayList.add(p4);
                   ArrayList uArrayList1 = new ArrayList();
                   b.n(parentFile, uArrayList, uArrayList1);
                   if (!q.f(uArrayList1)) {
                      Object[] objArray2 = new Object[i1];
                      b.C().t(str3, "delete other files failed "+uArrayList1, objArray2);
                   }
                }
             }
             if (!VideoWallpaperService.e(p0, VideoWallpaperService.class.getName())) {
                g.a(n.b().edit().putString(str, p4));
                Intent intent = new Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
                intent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", new ComponentName(p0, VideoWallpaperService.class));
                p0.t1(intent, i2, new b(p0));
             }else {
                Intent intent1 = new Intent(p0, VideoWallpaperService.class);
                intent1.putExtra(str, p4);
                a.e(p0, intent1);
             }
             VideoWallpaperService.f = System.currentTimeMillis();
          }
       }
       WallPaperDownloadUtil.k(p0, p1, p4, 7, "", p2);
       return;
    }
    public static void e(GifshowActivity p0,QPhoto p1){
       boolean b;
       float f;
       float f1;
       WallPaperDownloadUtil wallPaperDow = WallPaperDownloadUtil.class;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, wallPaperDow, "3")) {
          return;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, wallPaperDow, "4");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          f = Float.parseFloat("1.5");
          String str = "com.kwai.wallpaperplugin";
          int i = 0;
          PackageInfo packageInfo = (TextUtils.x(str))? obj: p0.getPackageManager().getPackageInfo(str, i).versionName;
       }
       if (b) {
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, wallPaperDow, "6")) {
             t$a uoa = f.e(new t$a(p0));
             uoa.W0(R.string.arg_RES_7f105151);
             uoa.y0(R.string.arg_RES_7f10514f);
             uoa.S0(R.string.arg_RES_7f1016d0);
             uoa.Q0(R.string.cancel);
             uoa.u0(new g(p1, p0));
             uoa.t0(new f(p1));
             uoa.Y(new j(p1));
          }
       }else if(PatchProxy.applyVoidTwoRefs(p1, p0, obj, wallPaperDow, "8")){
          WallPaperDownloadUtil.c = SystemClock.elapsedRealtime();
          b.a(-258426948).d(p1.getPhotoId(), QCurrentUser.ME.getId(), p1.getSource(), null, 0).map(new e()).subscribe(new c(p1, p0), new a());
       }
       return;
    }
    public static void f(c p0,List p1,String p2,QPhoto p3,GifshowActivity p4,ProgressFragment p5){
       WallPaperDownloadUtil wallPaperDow = WallPaperDownloadUtil.class;
       if (PatchProxy.isSupport(wallPaperDow)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, wallPaperDow, "13")) {
             return;
          }
       }
       c$e uoe = p0.cB(a.a().a(), p1, p2);
       uoe.b(new WallPaperDownloadUtil$a(p4, p3, p5, p2));
       uoe.run();
       p5.Bh(new c(uoe));
       return;
    }
    public static String g(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, WallPaperDownloadUtil.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getPhotoId()+"_"+"wallpaper.mp4";
    }
    public static File h(){
       Object obj = PatchProxy.apply(null, null, WallPaperDownloadUtil.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(Environment.getExternalStorageDirectory(), ".gifshowWallPaper");
    }
    public static void i(GifshowActivity p0){
       Uri uriForFile;
       if (PatchProxy.applyVoidOneRefs(p0, null, WallPaperDownloadUtil.class, "27")) {
          return;
       }
       try{
          Intent intent = new Intent("android.intent.action.VIEW");
          File uFile = new File(WallPaperDownloadUtil.b+File.separator+WallPaperDownloadUtil.a);
          if (Build$VERSION.SDK_INT >= 24) {
             uriForFile = FileProvider.getUriForFile(a.a().a(), a.a().a().getPackageName()+".fileprovider", uFile);
             intent.addFlags(1);
          }else {
             uriForFile = w0.c(uFile);
          }
          intent.addFlags(0x10000000);
          intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
          p0.startActivity(intent);
       }catch(java.lang.Exception e5){
          e5.printStackTrace();
       }
       return;
    }
    public static void j(BaseFeed p0,GifshowActivity p1){
       WallPaperDownloadUtil wallPaperDow = WallPaperDownloadUtil.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, wallPaperDow, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       QPhoto qPhoto = new QPhoto(p0);
       if (!qPhoto.isAllowPhotoDownload() && !qPhoto.isMine()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100ecc);
          return;
       }else if(PatchProxy.applyVoidOneRefs(qPhoto, null, wallPaperDow, "5")){
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CREATE_LIVE_PHOTO";
          JsonObject jsonObject = new JsonObject();
          String str1 = "content_type";
          if (qPhoto.isAtlasPhotos()) {
             jsonObject.c0(str1, "IMAGE");
          }else if(qPhoto.isVideoType()){
             jsonObject.c0(str1, "PHOTO");
          }
          uElementPack.params = TextUtils.I(jsonObject.toString());
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(qPhoto.mEntity);
          ClickMetaData uClickMetaDa = new ClickMetaData();
          uClickMetaDa.setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack);
          u1.B(uClickMetaDa);
       }
       if (!PatchProxy.applyVoidTwoRefs(p1, qPhoto, null, wallPaperDow, "2")) {
          String str = "android.permission.WRITE_EXTERNAL_STORAGE";
          if (!PermissionUtils.a(p1, str)) {
             a.g(p1, str).subscribe(new h(p1, qPhoto), Functions.d());
          }else {
             WallPaperDownloadUtil.e(p1, qPhoto);
          }
       }
       return;
    }
    public static void k(GifshowActivity p0,QPhoto p1,String p2,int p3,String p4,String p5){
       WallPaperDownloadUtil wallPaperDow = WallPaperDownloadUtil.class;
       if (PatchProxy.isSupport(wallPaperDow)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, wallPaperDow, "26")) {
             return;
          }
       }
       h$b uob = h$b.d(p3, 1182);
       if (!TextUtils.x(p4)) {
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          resultPackag.message = p4;
          uob.q(resultPackag);
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       JsonObject jsonObject = new JsonObject();
       jsonObject.c0("download_type", "LIVE_PHOTO");
       String str = "content_type";
       if (p1.isAtlasPhotos()) {
          jsonObject.c0(str, "IMAGE");
       }else if(p1.isVideoType()){
          jsonObject.c0(str, "PHOTO");
       }
       uElementPack.params = TextUtils.I(jsonObject.toString());
       uob.k(uElementPack);
       ClientContent$VideoWatermarkDetailPackage videoWaterma = new ClientContent$VideoWatermarkDetailPackage();
       File uFile = new File(p2);
       if (!TextUtils.x(p2) && uFile.exists()) {
          videoWaterma.duration = (long)c.m(uFile.getAbsolutePath());
          videoWaterma.length = uFile.length();
       }
       videoWaterma.cost = SystemClock.elapsedRealtime() - WallPaperDownloadUtil.c;
       videoWaterma.downloadUrl = TextUtils.k(p5);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.g(p1.mEntity, p1.getPosition());
       i3 oi3 = i3.f();
       oi3.d("search_session_id", TextUtils.I(p1.getSearchSessionId()));
       uContentPack.photoPackage.extraInfo = oi3.e();
       uContentPack.videoWatermarkDetailPackage = videoWaterma;
       uob.l(r1.O0(p1.mEntity));
       uob.h(uContentPack);
       u1.p0("", p0.N2(), uob);
       return;
    }
    public static void l(){
       if (PatchProxy.applyVoid(null, null, WallPaperDownloadUtil.class, "15")) {
          return;
       }
       WallPaperDownloadUtil.e = false;
       b9.a(WallPaperDownloadUtil.d);
       WallPaperDownloadUtil.d = null;
       return;
    }
    public static void m(ProgressFragment p0,float p1){
       WallPaperDownloadUtil wallPaperDow = WallPaperDownloadUtil.class;
       if (PatchProxy.isSupport(wallPaperDow) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), null, wallPaperDow, "21")) {
          return;
       }
       if (p1 - (float)p0.uh() < 0) {
          return;
       }
       if (p0.isAdded()) {
          p0.Fh((int)Math.min(p1, 100.00f), 100, true);
       }
       return;
    }
}
