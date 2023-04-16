package com.yxcorp.gifshow.photoad.download.h;
import java.lang.Object;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import com.yxcorp.gifshow.photoad.download.c;
import com.yxcorp.gifshow.photoad.download.d;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import com.yxcorp.gifshow.photoad.download.h$a;
import com.yxcorp.gifshow.photoad.download.h$b;
import com.yxcorp.gifshow.photoad.download.h$c;
import com.yxcorp.gifshow.photoad.download.h$f;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.StringBuilder;
import com.kwai.framework.model.feed.BaseFeed;
import g59.g$a;
import com.yxcorp.gifshow.commercial.model.PhotoApkDownloadTaskInfo;
import mxb.j0;
import mxb.i0;
import nxb.b0;
import erd.g;
import brd.t;
import java.lang.Integer;
import java.lang.Long;
import erd.o;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import java.util.Map;
import nxb.s;
import java.util.concurrent.Callable;
import t45.d;
import io.reactivex.internal.functions.Functions;
import crd.b;
import nxb.w;
import nxb.t;
import java.util.LinkedHashMap;
import java.io.File;
import wkd.b;
import j80.c;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import com.yxcorp.gifshow.photoad.download.g;
import java.lang.Runnable;
import java.util.concurrent.Future;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import yx.j0;
import com.yxcorp.gifshow.commercial.model.AdDownloaderType;
import g59.b;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import com.yxcorp.gifshow.photoad.download.i;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import ekd.p;
import java.util.ArrayList;
import java.util.Collection;
import ok.o;
import com.google.common.collect.e;
import com.google.common.collect.e$a;
import java.util.Iterator;
import com.google.common.collect.AbstractIterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import nl9.u;
import java.util.List;
import ekd.q;
import java.util.concurrent.TimeUnit;
import nxb.c0;
import com.yxcorp.gifshow.photoad.download.e;
import nxb.e0;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import com.google.common.collect.ImmutableList;
import java.lang.Number;
import android.util.Pair;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import nxb.u;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams;
import nxb.l;
import com.yxcorp.gifshow.gamecenter.api.model.GameCenterDownloadParams$DownloadInfo;
import com.yxcorp.gifshow.gamecenter.api.pluginimpl.GameCenterPlugin;
import ekd.p0;
import com.yxcorp.gifshow.photoad.download.h$d;
import java.lang.Enum;
import nxb.v;
import com.yxcorp.gifshow.photoad.download.h$e;
import nxb.x;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.FileObserver;

public class h	// class@000f86
{
    public final ExecutorService a;
    public final z b;
    public FileObserver c;
    public Map d;
    public ReentrantReadWriteLock e;
    public File f;
    public h$e g;
    public o h;
    public o i;
    public o j;
    public Map k;
    public final o l;
    public final o m;
    public static h n;
    public static Object o;

    static {
       h.o = new Object();
    }
    public void h(){
       super();
       this.e = new ReentrantReadWriteLock();
       this.l = c.b;
       this.m = d.b;
       ExecutorService uExecutorSer = c.f("PhotoAdAPKDownloadTaskManager");
       this.a = uExecutorSer;
       this.b = b.b(uExecutorSer);
       this.h = new h$a(this);
       this.i = new h$b(this);
       h$c uoc = new h$c(this);
       try{
          this.j = uoc;
          this.c = new h$f(this);
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
       }
       return;
    }
    public static String f(){
       String obj = PatchProxy.apply(null, null, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "apk_download_task";
       if (QCurrentUser.ME != null && QCurrentUser.ME.getId() != null) {
          obj = obj+"_"+QCurrentUser.ME.getId();
       }
       return obj;
    }
    public static h n(){
       h oh = h.class;
       Object obj = PatchProxy.apply(null, null, oh, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (h.n == null) {
          _monitor_enter(oh);
          if (h.n == null) {
             h.n = new h();
          }
          _monitor_exit(oh);
       }
       return h.n;
    }
    public static void p(BaseFeed p0,g$a p1,PhotoApkDownloadTaskInfo p2){
       i0.a().e(32, p0).d(new b0(p1, p2)).a();
    }
    public t A(int p0,long p1,long p2){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, h.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.t(p0, p1, p2).map(this.j);
    }
    public final void a(int p0,APKDownloadTask p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "11")) {
          return;
       }
       ReentrantReadWriteLock$WriteLock writeLock = this.e.writeLock();
       writeLock.lock();
       this.d.put(Integer.valueOf(p0), p1);
       writeLock.unlock();
       return;
    }
    public t b(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.fromCallable(new s(this, p0)).subscribeOn(this.b).observeOn(d.a).map(this.h).map(this.j);
    }
    public void c(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "18")) {
          return;
       }
       this.b(p0).subscribe(Functions.d(), Functions.d());
       return;
    }
    public t d(int p0,long p1,Throwable p2){
       Object obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), p2, this, h.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       w ow = new w(this, p0, p1, p2);
       return t.fromCallable(obj).subscribeOn(this.b).observeOn(d.a).map(this.h).map(this.i);
    }
    public t e(int p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oh, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.fromCallable(new t(this, p0)).subscribeOn(this.b).observeOn(d.a).map(this.h).map(this.j);
    }
    public Map g(){
       InputStream inputStream;
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, oh, "32");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          return obj;
       }
       this.d = new LinkedHashMap();
       obj = PatchProxy.apply(objArray, this, oh, "40");
       if (obj != patchProxyRe) {
       }else {
          obj = this.f;
          if (obj == null) {
             File uFile = new File(b.a(-1504323719).c(".ad_apk_cache"), h.f());
             this.f = uFile;
             if (!uFile.exists()) {
                this.f.mkdirs();
             }
             obj = this.f;
          }
       }
       File[] uFileArray = obj.listFiles();
       String str = "DownloadTaskManager";
       int i = 0;
       if (uFileArray == null || !uFileArray.length) {
          Object[] objArray1 = new Object[i];
          j0.a(str, "apkDownloadTaskFiles is empty", objArray1);
          return this.d;
       }else {
          int len = uFileArray.length;
          int i1 = 0;
          int i2 = 1;
          while (i1 < len) {
             object oobject = uFileArray[i1];
             try{
                FileInputStream uFileInputSt = new FileInputStream(oobject);
                try{
                   ObjectInputStream objectInputS = new ObjectInputStream(uFileInputSt);
                   APKDownloadTask uAPKDownload = objectInputS.readObject();
                   if (!this.q(uAPKDownload) || PatchProxy.applyVoidOneRefs(uAPKDownload, this, oh, "37")) {
                   label_008f :
                      this.s(uAPKDownload);
                      APKDownloadTask mCurrentStat = uAPKDownload.mCurrentStatus;
                      if (mCurrentStat != APKDownloadTask$DownloadStatus.STARTED && (mCurrentStat == APKDownloadTask$DownloadStatus.PAUSED || mCurrentStat == APKDownloadTask$DownloadStatus.ERROR)) {
                         Object[] objArray2 = new Object[i];
                         j0.a(str, uAPKDownload.getAppName()+" init:"+uAPKDownload.mDownloadType, objArray2);
                         mCurrentStat = uAPKDownload.mDownloadRequest;
                         if (mCurrentStat != null) {
                            if (uAPKDownload.mDownloadType == AdDownloaderType.DOWNLOAD_LIMIT_SPEED) {
                               mCurrentStat.setMaxSpeedKbps(b.a());
                            }
                            b[] uobArray = new b[i2];
                            uobArray[i] = new i(uAPKDownload.mTaskInfo);
                            DownloadManager.n().r(uAPKDownload.mDownloadRequest, uobArray);
                         }
                      }
                      if (uAPKDownload.mCurrentStatus != APKDownloadTask$DownloadStatus.DELETED) {
                         this.a(uAPKDownload.mId, uAPKDownload);
                      }
                   }else {
                      c.l(new g(uAPKDownload));
                      goto label_008f ;
                   }
                   p.c(inputStream);
                   i1 = i1 + 1;
                }catch(java.lang.Exception e7){
                }
                oobject.delete();
                j0.b(str, "cannot read download tasks", e7);
                goto label_00fe ;
             }catch(java.lang.Exception e7){
                inputStream = objArray;
                goto label_00f6 ;
             }
          }
          h td = this.d;
          if (PatchProxy.applyVoidOneRefs(td, this, oh, "35") || (td != null && !td.isEmpty())) {
             e$a uoa = e.c(new ArrayList(td.values()), this.m);
             if (uoa.size() > 0) {
                ArrayList uArrayList = new ArrayList(uoa.size());
                iterator = uoa.iterator();
                Iterator iterator1 = iterator;
                while (iterator1.hasNext()) {
                   APKDownloadTask uAPKDownload1 = iterator1.next();
                   APKDownloadTask mDownloadReq = uAPKDownload1.mDownloadRequest;
                   if (mDownloadReq != null && !TextUtils.x(mDownloadReq.getDownloadUrl())) {
                      uArrayList.add(uAPKDownload1.mDownloadRequest.getDownloadUrl());
                   }
                }
                d.a(-1694791652).wq(uArrayList);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, oh, "33")) {
             List list = this.i();
             if (!q.f(list)) {
                iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (iterator.next().mCurrentStatus != APKDownloadTask$DownloadStatus.INSTALLED) {
                         continue ;
                      }
                   }else {
                      i2 = 0;
                   }
                   if (i2) {
                      t.just(Integer.valueOf(i)).delay(30, TimeUnit.SECONDS, d.c).subscribe(new c0(this), e.b);
                      break ;
                   }
                }
             }
          }
          return this.d;
       }
    }
    public t h(){
       Object obj = PatchProxy.apply(null, this, h.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(new e0(this)).subscribeOn(this.b);
    }
    public List i(){
       Object[] objArray = null;
       ReentrantReadWriteLock$ReadLock obj = PatchProxy.apply(objArray, this, h.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e.readLock();
       obj.lock();
       h td = this.d;
       if (td != null) {
          objArray = ImmutableList.copyOf(td.values());
       }
       obj.unlock();
       return objArray;
    }
    public int j(){
       List obj = PatchProxy.apply(null, this, h.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.i();
       int i = 0;
       if (obj != null && obj.size()) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().mCurrentStatus == APKDownloadTask$DownloadStatus.STARTED) {
                i = i + 1;
             }
          }
       }
       return i;
    }
    public APKDownloadTask$DownloadStatus k(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       APKDownloadTask uAPKDownload = this.l(p0);
       if (uAPKDownload != null) {
          return uAPKDownload.mCurrentStatus;
       }
       return null;
    }
    public APKDownloadTask l(String p0){
       List obj = PatchProxy.applyOneRefs(p0, this, h.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       obj = this.i();
       if (obj != null) {
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             APKDownloadTask uAPKDownload = iterator.next();
             if (TextUtils.n(p0, uAPKDownload.getDownloadUrl())) {
                return uAPKDownload;
             }
          }
       }
       return null;
    }
    public final Pair m(APKDownloadTask p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DownloadManager.n().m(p0.mId);
    }
    public APKDownloadTask o(){
       List obj = PatchProxy.apply(null, this, h.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.g();
       obj = this.i();
       StringBuilder str = "getNotInstallDownloadTask ";
       int i = 0;
       int i1 = (obj == null)? 0: obj.size();
       Object[] objArray = new Object[i];
       j0.f("DownloadTaskManager", str+i1, objArray);
       if (obj != null) {
          int i2 = obj.size() - 1;
          while (i2 >= 0) {
             if (obj.get(i2).mCurrentStatus == APKDownloadTask$DownloadStatus.COMPLETED && obj.get(i2).mTaskInfo instanceof PhotoApkDownloadTaskInfo) {
                return obj.get(i2);
             }
             i2 = i2 - 1;
          }
       }
       return null;
    }
    public final boolean q(APKDownloadTask p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.mCurrentStatus == APKDownloadTask$DownloadStatus.COMPLETED && (p0.mReportedInstalled == null && (p0.getTaskInfo() instanceof PhotoApkDownloadTaskInfo && SystemUtil.M(a.b(), p0.mTaskInfo.getPkgName())))))? true: false;
       return b;
    }
    public t r(int p0,long p1,long p2){
       Object obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, h.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       u ou = new u(this, p0, p1, p2);
       return t.fromCallable(obj).subscribeOn(this.b).observeOn(d.a).map(this.h);
    }
    public final void s(APKDownloadTask p0){
       Pair pair;
       Object[] objArray2;
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "41")) {
          return;
       }
       String str = "DownloadTaskManager";
       int i = 0;
       if (p0.getDownloadAPKFile() == null) {
          Object[] objArray = new Object[i];
          j0.a(str, "refreshAPKDownloadTaskStatus downloadRequest error", objArray);
          p0.setToDeletedStatus();
          return;
       }else if(SystemUtil.M(a.b(), p0.mTaskInfo.getPkgName())){
          p0.setToInstalledStatus();
          p0.updateDownloadAPKFileSizeIfNecessary();
          return;
       }else {
          GameCenterDownloadParams gameCenterDo = l.a(p0);
          StringBuilder str1 = 5;
          String str2 = 4;
          if (gameCenterDo != null) {
             if (!PatchProxy.applyVoidTwoRefs(p0, gameCenterDo, this, oh, "42")) {
                GameCenterDownloadParams$DownloadInfo uDownloadInf = PatchProxy.applyOneRefs(gameCenterDo, null, l.class, "3");
                if (uDownloadInf != PatchProxyResult.class) {
                }else {
                   uDownloadInf = d.a(-1986139969).gameDownloadProgress(gameCenterDo);
                }
                if (uDownloadInf == null || TextUtils.x(uDownloadInf.mStage)) {
                   p0.setToDeletedStatus();
                   this.c(p0.mId);
                }else {
                   GameCenterDownloadParams$DownloadInfo mStage = uDownloadInf.mStage;
                   switch (mStage.hashCode()){
                       case 0xae7a2e7a:
                         if (mStage.equals("cancel")) {
                            i = 6;
                         }else {
                         label_00c4 :
                            i = -1;
                         }
                         break;
                       case 0xc454c22d:
                         if (mStage.equals("progress")) {
                            i = 2;
                         }else {
                            goto label_00c4 ;
                         }
                         break;
                       case 0xc84dc82d:
                         if (mStage.equals("resume")) {
                            i = 1;
                         }else {
                            goto label_00c4 ;
                         }
                         break;
                       case 0xdc453139:
                         if (mStage.equals("complete")) {
                            i = 5;
                         }else {
                            goto label_00c4 ;
                         }
                         break;
                       case 0x5c4d208:
                         if (mStage.equals("error")) {
                            i = 4;
                         }else {
                            goto label_00c4 ;
                         }
                         break;
                       case 0x65825f6:
                         if (mStage.equals("pause")) {
                            i = 3;
                         }else {
                            goto label_00c4 ;
                         }
                         break;
                       case 0x68ac462:
                         if (!mStage.equals("start")) {
                         }
                         break;
                       default:
                         goto label_00c4 ;
                   }
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      if (i != str2) {
                         if (i != str1) {
                            p0.setToDeletedStatus();
                            this.c(p0.mId);
                         }else {
                            p0.setToCompletedStatus();
                            p0.mSoFarBytes = uDownloadInf.mSoFarBytes;
                            p0.mTotalBytes = uDownloadInf.mTotalBytes;
                         }
                      }else if(p0.C(a.B)){
                         p0.setToPausedStatus(uDownloadInf.mSoFarBytes, uDownloadInf.mTotalBytes);
                      }else {
                         p0.setToFailedStatus(uDownloadInf.mTotalBytes, p0.mErrorMessage);
                      }
                   }else {
                      p0.setToPausedStatus(uDownloadInf.mSoFarBytes, uDownloadInf.mTotalBytes);
                   }
                }
             }
             return;
          }else if(PatchProxy.applyVoidOneRefs(p0, this, oh, "43")){
             Object[] objArray1 = new Object[i];
             j0.a(str, "refresh:"+p0.mCurrentStatus+";cacheKey:"+p0.mId, objArray1);
             int i1 = h$d.a[p0.mCurrentStatus.ordinal()];
             String str3 = "/";
             if (i1 != 1) {
                if (i1 != 2) {
                   if (i1 != 3) {
                      if (i1 != str2) {
                         if (i1 == str1) {
                            p0.setToUninstalledStatus();
                            p0.updateDownloadAPKFileSizeIfNecessary();
                         }
                      }else {
                         File downloadAPKF = p0.getDownloadAPKFile();
                         if (downloadAPKF == null || !downloadAPKF.exists()) {
                            p0.setToAPKFileDeletedStatus();
                         }
                         p0.updateDownloadAPKFileSizeIfNecessary();
                      }
                   }else {
                      pair = this.m(p0);
                      if (pair != null) {
                         objArray2 = new Object[i];
                         j0.a(str, "pause:"+pair.first+str3+pair.second, objArray2);
                         p0.setToPausedStatus(pair.first.longValue(), pair.second.longValue());
                      }
                   }
                }else {
                   pair = this.m(p0);
                   if (pair != null) {
                      if (p0.C(a.B)) {
                         p0.setToPausedStatus(pair.first.longValue(), pair.second.longValue());
                      }else {
                         p0.setToFailedStatus(pair.second.longValue(), p0.mErrorMessage);
                      }
                   }
                   p0.mShouldAutoResume = p0.mIsFailForMobileNetwork;
                }
             }else {
                pair = this.m(p0);
                if (pair != null) {
                   objArray2 = new Object[i];
                   j0.a(str, "start:"+pair.first+str3+pair.second, objArray2);
                   p0.setToPausedStatus(pair.first.longValue(), pair.second.longValue());
                   p0.mShouldAutoResume = true;
                }
             }
          }
          return;
       }
    }
    public t t(int p0,long p1,long p2){
       Object obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, h.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       v ov = new v(this, p0, p1, p2);
       return t.fromCallable(obj).subscribeOn(this.b).observeOn(d.a).map(this.h);
    }
    public void u(h$e p0){
       this.g = p0;
    }
    public t v(int p0,DownloadTask$DownloadRequest p1,ApkDownloadTaskInfo p2,AdDownloaderType p3){
       Object obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, this, h.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null || p2 == null) {
          return t.empty();
       }else {
          x ox = new x(this, p0, p1, p2, p3);
          return t.fromCallable(obj).subscribeOn(this.b).observeOn(d.a).map(this.h).map(this.j);
       }
    }
    public t w(int p0,DownloadTask$DownloadRequest p1,AdDataWrapper p2){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, h.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.x(p0, p1, p2, AdDownloaderType.DOWNLOAD_FULL_SPEED);
    }
    public t x(int p0,DownloadTask$DownloadRequest p1,AdDataWrapper p2,AdDownloaderType p3){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, p3, this, h.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p1 == null || p2 == null) {
          return t.empty();
       }else {
          return this.v(p0, p1, new PhotoApkDownloadTaskInfo(new QPhoto(p2.getPhoto()), p2, p2.getAdPosition()), p3);
       }
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       h tc = this.c;
       if (tc != null) {
          tc.startWatching();
       }
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       h tc = this.c;
       if (tc != null) {
          tc.stopWatching();
       }
       return;
    }
}
