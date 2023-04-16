package com.yxcorp.gifshow.photoad.download.a;
import nl9.d;
import java.lang.Object;
import java.lang.Throwable;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.photoad.download.h;
import java.util.Objects;
import nxb.f0;
import java.util.concurrent.Callable;
import brd.z;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import wkd.b;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Boolean;
import nxb.a;
import java.io.IOException;
import javax.net.ssl.SSLException;
import java.lang.CharSequence;
import o56.a;
import android.content.Context;
import android.app.Activity;
import msd.l;
import nxb.g;
import m49.a;
import m49.a$a;
import kotlin.jvm.internal.a;
import mxb.j0;
import java.lang.Number;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import lnc.h;
import s59.s;
import vq4.c;
import p29.j;
import com.yxcorp.gifshow.ad.download.intercept.AdDownloadVpnManager;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import com.yxcorp.gifshow.entity.QPhoto;
import nxb.t0;
import mxb.h0;
import nxb.s0;
import t45.d;
import com.yxcorp.gifshow.commercial.model.AdDownloadCenterSource;
import e3a.a;
import lnc.y0;
import ul9.a;
import nxb.h;
import erd.g;
import crd.b;
import android.view.View;
import nxb.q;
import oe6.b;
import j9c.b;
import nc5.i;
import e17.i;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment;
import com.yxcorp.gifshow.widget.BubbleHintNewStyleFragment$BackgroundColorType;
import dub.z;
import nxb.f;
import com.kwai.framework.activitycontext.ActivityContext;
import android.content.Intent;
import android.net.VpnService;
import java.lang.System;
import bx.a;
import com.kwai.framework.model.feed.BaseFeed;
import nxb.e;
import java.lang.Runnable;
import ekd.k1;
import tw.d;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import com.yxcorp.gifshow.commercial.model.AdDownloaderType;
import com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import nxb.r0;
import java.util.List;
import z1.a;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import oxb.a;
import com.yxcorp.gifshow.photoad.e;
import com.yxcorp.gifshow.photoad.game.d;
import tkd.b;
import tkd.d;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import nxb.b;
import nxb.c;
import com.yxcorp.download.DownloadTask$TagType;
import java.io.Serializable;
import com.yxcorp.gifshow.photoad.download.PhotoAdAPKDownloadNotificationInfo;
import g59.c;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import g59.b;
import mxb.f0;
import com.yxcorp.gifshow.photoad.download.i;
import java.util.Iterator;
import java.lang.Iterable;
import io.reactivex.internal.functions.Functions;
import nxb.d;
import nxb.i;

public class a implements d	// class@000f79
{

    public void a(){
       super();
    }
    public t Ay(int p0,long p1,Throwable p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), p2, this, a.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h.n().d(p0, p1, p2);
    }
    public t D40(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, a.class, "23");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = h.n();
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(objArray, obj, h.class, "28");
       if (ot != patchProxyRe) {
       }else {
          ot = t.fromCallable(new f0(obj)).subscribeOn(obj.b);
       }
       return ot;
    }
    public void D5(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "37")) {
          return;
       }
       b[] uobArray = new b[]{b.a(-901401630)};
       DownloadManager.n().b(p0, uobArray);
       return;
    }
    public boolean D6(AdDataWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.c(p0);
    }
    public t EJ(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h.n().e(p0);
    }
    public String FZ(Throwable p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, h.class, "30");
       if (obj != patchProxyRe) {
       }else {
          obj = "";
          if (!p0 instanceof IOException && !p0 instanceof SSLException) {
             p0.getClass();
             if (!(p0.getClass().getName()).contains("liulishuo")) {
             label_0049 :
                return obj;
             }
          }
          Application b = a.B;
          if (b == null) {
             goto label_0049 ;
          }else {
             obj = b.getString(0x7f100c5b);
             goto label_0049 ;
          }
       }
    }
    public void Fg(Activity p0,AdDataWrapper p1,l p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "36")) {
          return;
       }
       g og = new g(p2);
       a uoa = a.d.a(p0).a(p1);
       Objects.requireNonNull(uoa);
       p1 = PatchProxy.applyOneRefs(og, uoa, a.class, "2");
       if (p1 != PatchProxyResult.class) {
          uoa = p1;
       }else {
          a.p(og, "callback");
          uoa.b = og;
       }
       uoa.e();
       return;
    }
    public void J10(String p0,AdDataWrapper p1,String p2,j0 p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "14")) {
          return;
       }
       a.d(p0, p1, p2, p3);
       return;
    }
    public int Je(){
       Object obj = PatchProxy.apply(null, this, a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return h.n().j();
    }
    public APKDownloadTask KK(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.n().l(p0);
    }
    public String L9(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.a(p0);
    }
    public void LA(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       h.n().z();
       return;
    }
    public void MH(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "28")) {
          return;
       }
       b.a(-901401630).q(p0, p1);
       return;
    }
    public void PZ(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "33")) {
          return;
       }
       j.a(p0);
       return;
    }
    public void Q5(int p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, uoa, "30")) {
          return;
       }
       AdDownloadVpnManager.c(p0, p1);
       return;
    }
    public APKDownloadTask$DownloadStatus QT(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.n().k(p0);
    }
    public void TJ(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       a.a.a(p0);
       return;
    }
    public t TR(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t0 obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = t0.c();
       Objects.requireNonNull(obj);
       t ot = PatchProxy.applyOneRefs(p0, obj, t0.class, "2");
       if (ot != patchProxyRe) {
       }else if(p0 == null || !h0.e(p0)){
          ot = t.empty();
       }else {
          ot = t.fromCallable(new s0(obj, p0)).subscribeOn(obj.b).observeOn(d.a);
       }
       return ot;
    }
    public void W10(Context p0,AdDownloadCenterSource p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       Activity uActivity = a.b(p0);
       t ot = (y0.o(uActivity))? a.c("commercial_download_center", 0, 0, 40): a.e(uActivity, "commercial_download_center", 0, 0);
       ot.onTerminateDetach().subscribe(new h(p0, p1));
       return;
    }
    public String Wz(){
       return ".ad_apk_cache";
    }
    public void YN(Context p0,View p1){
       int i;
       Integer[] obj = p0;
       Object obj1 = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, a.class, "12")) {
          return;
       }
       Object obj2 = null;
       if (!PatchProxy.applyVoidTwoRefs(obj, obj1, obj2, q.class, "1") && (obj1 == null || (!b.f() && (h.n().j() > 0 && b.b(-5) > 0)))) {
          if (!i.c(1022)) {
             i.d(R.style.arg_RES_7f11066a, obj.getString(R.string.arg_RES_7f103c0c));
          }else {
             String str = obj.getString(R.string.arg_RES_7f103bfe);
             i = 10;
             long l = 0;
             if (PatchProxy.isSupport(BubbleHintNewStyleFragment.class)) {
                Object[] objArray = new Object[]{obj1,str,Integer.valueOf(0),Integer.valueOf(i),"download",obj2,Long.valueOf(l)};
                if (PatchProxy.apply(objArray, obj2, BubbleHintNewStyleFragment.class, "7") != PatchProxyResult.class) {
                }
             }
             BubbleHintNewStyleFragment.Nh(p1, str, 1, 0, 10, "download", 0, 0);
          }
          obj = new Integer[]{Integer.valueOf(-5)};
          z.a("PhotoAdAPKDownloadNotificationUtil", obj);
       }
    label_00b7 :
       return;
    }
    public String Z20(){
       Object obj = PatchProxy.apply(null, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.f();
    }
    public boolean bp(AdDataWrapper p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return j.d(p0);
    }
    public void by(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       h.n().y();
       return;
    }
    public void dk(AdDataWrapper p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "3")) {
          a.p(p0, "adDataWrapper");
          a.p(p1, "apkPath");
          if (j.d(p0)) {
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             Activity uActivity = uActivityCon.e();
             if (uActivity != null) {
                if (VpnService.prepare(uActivity) != null && j.e()) {
                   AdDownloadVpnManager.b(uActivity, p1, p0);
                   a.a(System.currentTimeMillis());
                }else if(VpnService.prepare(uActivity) == null){
                   AdDownloadVpnManager.d(uActivity, p0.getPhoto());
                   k1.o(new e(p1, p0));
                }else {
                   d.k(p1, p0);
                }
             }
          }else {
             d.k(p1, p0);
          }
       }
       return;
    }
    public void fc(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "29")) {
          return;
       }
       b.a(-901401630).u(p0, p1);
       return;
    }
    public t g30(int p0,DownloadTask$DownloadRequest p1,ApkDownloadTaskInfo p2,AdDownloaderType p3){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, this, a.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h.n().v(p0, p1, p2, p3);
    }
    public t g70(int p0,DownloadTask$DownloadRequest p1,QPhoto p2){
       h obj;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "7");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = h.n();
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(h.class)) {
          ot = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, obj, h.class, "7");
          if (ot != patchProxyRe) {
          }else if(p1 == null || p2 == null){
             ot = t.empty();
          }else {
             ot = obj.v(p0, p1, new PhotoApkDownloadTaskInfo(p2, null, 0), AdDownloaderType.DOWNLOAD_FULL_SPEED);
          }
       }else {
          goto label_0041 ;
       }
       return ot;
    }
    public t h60(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       t0 obj = PatchProxy.apply(objArray, this, a.class, "26");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = t0.c();
       Objects.requireNonNull(obj);
       t ot = PatchProxy.apply(objArray, obj, t0.class, "5");
       if (ot != patchProxyRe) {
       }else {
          ot = t.fromCallable(new r0(obj)).subscribeOn(obj.b);
       }
       return ot;
    }
    public t hR(){
       Object obj = PatchProxy.apply(null, this, a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h.n().h();
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean jZ(Activity p0,AdDataWrapper p1,List p2,a p3){
       e[] uoeArray;
       GameCenterDownloadParams obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.d(p1);
       if (!a.c(obj)) {
          return 0;
       }
       if (p2 == null) {
          uoeArray = null;
       }else {
          e[] uoeArray1 = new e[0];
          uoeArray = p2.toArray(uoeArray1);
       }
       d.a(p0, p1, obj, p3, uoeArray);
       return true;
    }
    public t kP(int p0,long p1,long p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, a.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h.n().t(p0, p1, p2);
    }
    public boolean l30(Activity p0,AdDataWrapper p1,a p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GameCenterDownloadParams obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = a.d(p1);
       if (a.c(obj)) {
          Object obj1 = PatchProxy.applyOneRefs(obj, null, a.class, "6");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             GameCenterDownloadParams$DownloadInfo uDownloadInf = d.a(-1986139969).gameDownloadProgress(obj);
             b = (uDownloadInf != null && uDownloadInf.mSoFarBytes > 0)? true: false;
          }
          if (b) {
             d.a(p0, p1, obj, p2, null);
             return true;
          }
       }
       return false;
    }
    public void mY(DownloadTask$DownloadRequest p0,AdDataWrapper p1,AdDownloaderType p2,List p3,boolean p4){
       f a;
       b[] uobArray;
       int i4;
       b[] uobArray1;
       Iterator iterator;
       b[] uobArray2;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       a uoa = a.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 5;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[i3];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[i2] = oobject2;
          objArray[i1] = p3;
          objArray[i] = Boolean.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, this, uoa, "38")) {
             return;
          }
       }else {
          int i5 = this;
       }
       f uof = f.class;
       Object obj = null;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray1 = new Object[i3];
          objArray1[0] = oobject;
          objArray1[1] = oobject1;
          objArray1[i2] = oobject2;
          objArray1[i1] = p3;
          objArray1[i] = Boolean.valueOf(p4);
          if (PatchProxy.applyVoid(objArray1, obj, uof, "1")) {
          label_017a :
             return;
          }
       }
       a.p(p0, "downloadRequest");
       a.p(p1, "dataWrapper");
       a.p(oobject2, "adDownloaderType");
       b uob = c.a(p1.getPhoto());
       j.g(p1);
       p0.setIsPhotoAdDownloadRequest();
       p0.setTag(DownloadTask$TagType.TAG1, p1);
       p0.setTag(DownloadTask$TagType.TAG3, new PhotoAdAPKDownloadNotificationInfo(p1.getAppIconUrl()));
       String str = "kwai-android";
       String obj1 = PatchProxy.apply(obj, obj, c.class, "2");
       if (obj1 != PatchProxyResult.class) {
          str = obj1;
       }else {
          try{
             obj1 = System.getProperty("http.agent");
             if (!TextUtils.x(obj1)) {
                a.m(obj1);
                str = obj1+str+"/"+a.m;
             }
          }catch(java.lang.Exception e0){
             ExceptionHandler.handleCaughtException(e0);
          }
       }
    }
    public void t10(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "31")) {
          return;
       }
       AdDownloadVpnManager.e(p0);
       return;
    }
    public t ti(int p0,long p1,long p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, a.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h.n().A(p0, p1, p2);
    }
    public t um(int p0,long p1,long p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, a.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h.n().r(p0, p1, p2);
    }
    public b wj(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(p0);
    }
    public void wn(Activity p0,AdDataWrapper p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "35")) {
          return;
       }
       a uoa = a.d.a(p0).a(p1);
       Objects.requireNonNull(uoa);
       k1.o(new i(uoa));
       return;
    }
    public t yP(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return h.n().b(p0);
    }
}
