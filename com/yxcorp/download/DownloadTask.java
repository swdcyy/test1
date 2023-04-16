package com.yxcorp.download.DownloadTask;
import java.io.Serializable;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadDispatcher;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.f;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import mu8.u;
import com.yxcorp.download.DownloadConfig;
import java.util.Iterator;
import java.util.List;
import android.util.Pair;
import java.util.regex.Pattern;
import java.lang.Integer;
import ekd.e0;
import java.util.Map;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadBizExtra$DownloadUpBizFt;
import com.kwai.video.hodor.ResourceDownloadTask;
import java.util.HashMap;
import com.kwai.video.hodor.AbstractHodorTask;
import zk.d;
import com.google.gson.Gson;
import mu8.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Set;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kwai.video.hodor.logEvent.CdnStatEvent;
import com.yxcorp.download.d;
import com.kwai.video.hodor.logEvent.CdnStatEvent$OnCdnStatEventListener;
import com.yxcorp.download.e;
import com.kwai.video.hodor.ResourceDownloadTask$ResourceDownloadCallback;
import com.kwai.video.hodor.ResourceDownloadTask$TaskInfo;
import com.kwai.video.hodor.BaseTaskInfo;
import mu8.p;
import com.yxcorp.download.b;
import java.lang.Boolean;
import nu8.a;
import nu8.c;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Long;
import java.lang.System;
import com.yxcorp.download.DownloadTask$TagType;
import java.lang.Thread;
import mu8.o;
import qkd.b;
import android.content.Intent;
import android.net.Uri;
import mu8.m;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import com.kwai.performance.fluency.ipcproxy.lib.b;
import com.yxcorp.download.DownloadReceiver;
import java.lang.Throwable;
import mu8.b;
import java.lang.Runnable;

public class DownloadTask implements Serializable	// class@0011b2
{
    public boolean limitSpeedByFactor;
    public long mCompleteTime;
    public final DownloadDispatcher mDownloadDispatcher;
    public List mDownloadListeners;
    public long mEnqueueTime;
    public ResourceDownloadTask mHodorDownloadTask;
    public int mHodorId;
    public boolean mIsContinue;
    public int mPreDownloadPriority;
    public DownloadTask$DownloadRequest mRequest;
    public long mStartTime;
    public static int b = 63625;
    public static Handler sUIHandler;
    public static final long serialVersionUID;

    static {
       DownloadTask.sUIHandler = new Handler(Looper.getMainLooper());
    }
    public void DownloadTask(DownloadTask$DownloadRequest p0,DownloadDispatcher p1){
       String str;
       int i;
       boolean hostType;
       DownloadConfig u;
       super();
       this.mDownloadListeners = new CopyOnWriteArrayList();
       this.mEnqueueTime = Long.MAX_VALUE;
       boolean b = false;
       this.limitSpeedByFactor = b;
       this.mIsContinue = b;
       this.mDownloadDispatcher = p1;
       this.mRequest = p0;
       Integer obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadTask.class, "64")) {
       }else {
          this.mHodorId = p0.generateId();
          if (TextUtils.isEmpty(this.getDestinationDir()) && DownloadManager.j() != null) {
             p1.mDestinationDir = DownloadManager.j().getPath();
          }
          if (TextUtils.isEmpty(this.mRequest.mDestinationFileName)) {
             p1.mDestinationFileName = f.b(this.getUrl(), this.mRequest.getCustomExtension());
             Log.b("DownloadManager:DownloadTask", "generateFileName : "+this.mRequest.mDestinationFileName);
          }
          if (this.mRequest.getDownloadTaskType() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD) {
             str = "DownloadManager:PreDownloadPriorityManager";
             if (!PatchProxy.applyVoidOneRefs(this, obj, u.class, "1")) {
                try{
                   Iterator iterator1 = DownloadManager.h.t.iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         Pair pair = iterator1.next();
                         if (Pattern.matches(pair.first, this.getUrl())) {
                            Log.b(str, "Set priority according to url ## Task url:"+this.getUrl()+"  ## Pattern:"+pair.first+"  ## Priority:"+pair.second);
                            this.setPreDownloadPriority(pair.second.intValue());
                            break ;
                         }
                      }
                   }
                }catch(java.util.regex.PatternSyntaxException e2){
                   if (!e0.a) {
                   }else {
                      throw e2;
                   }
                }
                u = DownloadManager.h.u;
                String bizType = this.getBizType();
                String str2 = " ## Priority:";
                if (!TextUtils.isEmpty(bizType) && u.containsKey(bizType)) {
                   Log.b(str, "Set priority according to biz-type ## Task biz-type:"+this.getBizType()+str2+u.get(bizType));
                   this.setPreDownloadPriority(u.get(bizType).intValue());
                }else {
                   i = 70;
                   Log.b(str, "Set priority according to default ## Task url:"+this.getUrl()+" ## Task biz-type:"+this.getBizType()+str2+i);
                   this.setPreDownloadPriority(i);
                }
             }
          }
          if (DownloadManager.i().B != null) {
             if (this.mRequest.getDownloadTaskType() == DownloadTask$DownloadTaskType.PRE_DOWNLOAD) {
                this.mRequest.setGroupPriority(this.getPreDownloadPriority());
             }else if(this.mRequest.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD){
                if (this.mRequest.getBizExtra() != null) {
                   DownloadTask tmRequest = this.mRequest;
                   tmRequest.setGroupPriority(DownloadTask$DownloadBizExtra.groupPriorityWithLaunchBizFt(tmRequest.getBizExtra().getPluginLaunchBizFt()));
                }else {
                   this.mRequest.setGroupPriority(b);
                }
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, DownloadTask.class, "65")) {
          String[] stringArray = new String[b];
          ResourceDownloadTask resourceDown = new ResourceDownloadTask(p0.getDownloadUrls().toArray(stringArray), new HashMap(), String.valueOf(this.mHodorId));
          this.mHodorDownloadTask = resourceDown;
          resourceDown.setDisableForceRangeRequest(p0.mDisableForceRangeRequest);
          this.mHodorDownloadTask.setP2spPolicy(p0.mP2spPolicy);
          this.mHodorDownloadTask.setEvictStrategy(p0.mEvictStrategy);
          this.mHodorDownloadTask.setDeleteCacheOnCancel(p0.mDeleteCacheOnCancel);
          if (!TextUtils.isEmpty(this.mRequest.getBizFT())) {
             this.mHodorDownloadTask.setBizFt(this.mRequest.getBizFT());
          }
          if (!TextUtils.isEmpty(this.mRequest.getBizType())) {
             this.mHodorDownloadTask.setBizType(this.mRequest.getBizType());
          }
          if (this.mRequest.getBizExtra() != null) {
             str = new d().b().q(this.mRequest.getBizExtra());
             DownloadTask tmHodorDownl = this.mHodorDownloadTask;
             if (str == null) {
                str = obj;
             }
             tmHodorDownl.setBizExtra(str);
          }
          if (!TextUtils.isEmpty(this.getDestinationDir()) && !TextUtils.isEmpty(this.getFilename())) {
             this.mHodorDownloadTask.setExpectSavePath(f.c(this.getDestinationDir(), this.getFilename()));
          }
          this.mHodorDownloadTask.setTaskQosClass(this.mRequest.getTaskQosClass());
          this.mHodorDownloadTask.setPriority(this.mRequest.getPriority());
          this.mHodorDownloadTask.setUpdatePriorityIfExist(this.mRequest.mUpdatePriorityIfExist);
          this.mHodorDownloadTask.setMaxSpeedKbps(this.mRequest.getMaxSpeedKbps());
          i = 1;
          this.mHodorDownloadTask.setForceReDownload((p0.getIsNotForceReDownload() ^ i));
          this.mHodorDownloadTask.setTaskMaxRetryCount(this.mRequest.getRetryTimes());
          if (!TextUtils.isEmpty(this.mRequest.mGroupName)) {
             this.mHodorDownloadTask.setGroupName(p0.mGroupName);
          }
          int i1 = 2;
          if (DownloadManager.i().B != null) {
             this.mHodorDownloadTask.setGroupPriority(this.mRequest.getGroupPriority());
             if (this.mRequest.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD) {
                this.mHodorDownloadTask.setPreemptionType(i);
                this.mHodorDownloadTask.setBePreemptedTimeoutMs((DownloadManager.i().w * 1000));
             }
             hostType = this.getHostType();
             n on = n.class;
             if (PatchProxy.isSupport(on)) {
                obj = PatchProxy.applyOneRefs(Integer.valueOf(hostType), obj, on, "2");
                if (obj != PatchProxyResult.class) {
                   hostType = obj.intValue();
                }else {
                label_0312 :
                   boolean b1 = n.c(hostType, i);
                   if (n.c(hostType, 4)) {
                      b1 = b1 | 0x02;
                   }
                   if (n.c(hostType, i1)) {
                      b1 = b1 | 0x02;
                   }
                   if (n.c(hostType, 8)) {
                      b1 = b1 | 0x04;
                   }
                   if (n.c(hostType, 16)) {
                      hostType = b1 | 0x08;
                   }else {
                      hostType = b1;
                   }
                }
             }else {
                goto label_0312 ;
             }
             this.mHodorDownloadTask.setIgnoreNetworkFocusSet((hostType | DownloadManager.g(this.getDownloadTaskType())));
          }
          if (this.mRequest.getProgressCallbackIntervalMs() > 0) {
             this.mHodorDownloadTask.setProgressCallbackIntervalMs(this.mRequest.getProgressCallbackIntervalMs());
          }
          hostType = this.mRequest.mTagMap;
          if (hostType != null) {
             Iterator iterator = hostType.keySet().iterator();
             while (iterator.hasNext()) {
                obj = iterator.next();
                String str1 = String.valueOf(obj);
                this.mHodorDownloadTask.setTag(str1, this.mRequest.mTagMap.get(obj));
             }
          }
          DownloadTask tmHodorDownl1 = this.mHodorDownloadTask;
          if (i1 ^ this.mRequest.getAllowedNetworkTypes()) {
             i = false;
          }
          tmHodorDownl1.setOnlyDownloadUnderWifi(i);
          if (this.mRequest.getConnectTimeout() > 0) {
             this.mHodorDownloadTask.setConnectTimeoutMs((this.mRequest.getConnectTimeout() * 1000));
          }
          if (this.mRequest.getReadTimeout() > 0) {
             this.mHodorDownloadTask.setReadTimeout(this.mRequest.getReadTimeout());
          }
          tmHodorDownl1 = this.mRequest;
          if (tmHodorDownl1.mUnifyCdnLog != null && tmHodorDownl1.isNeedCDNReport()) {
             this.mHodorDownloadTask.setUnifyCdnLog(this.mRequest.mUnifyCdnLog);
             this.mHodorDownloadTask.setCdnStatEvent(new CdnStatEvent(new ClientStat$CdnResourceLoadStatEvent(), new d(this)));
          }else {
             this.mHodorDownloadTask.setUnifyCdnLog(b);
          }
          this.mHodorDownloadTask.addHeader(this.mRequest.mRequestHeaders);
          this.mHodorDownloadTask.setResourceDownloadCallback(new e(this));
       }
       this.mRequest.setTaskId(this.getId());
       return;
    }
    public final int a(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p.a(this.mHodorDownloadTask.getTaskInfo().getTaskState());
    }
    public synchronized void addListener(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadTask.class, "53")) {
          return;
       }
       if (p0 != null && !this.mDownloadListeners.contains(p0)) {
          this.mDownloadListeners.add(p0);
       }
       return;
    }
    public final void b(boolean p0){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DownloadTask.class, "60")) {
          return;
       }
       boolean b = false;
       if (!this.getTotalBytes() - b && !this.getSoFarBytes() - b) {
          return;
       }
       if (TextUtils.isEmpty(this.getFilename())) {
          return;
       }
       if (this.getNotificationVisibility() & 0x01) {
          a uoa = a.b();
          a uoa1 = a.class;
          _monitor_enter(uoa);
          if (PatchProxy.isSupport(uoa1) && PatchProxy.applyVoidTwoRefs(this, Boolean.valueOf(p0), uoa, uoa1, "2")) {
             _monitor_exit(uoa);
          }else {
             uoa1 = uoa.a;
             if (uoa1 != null) {
                uoa1.a(this, p0);
             }
             _monitor_exit(uoa);
          }
       }
       return;
    }
    public final void c(){
       Log.g("DownloadManager:DownloadTask", "onLowStorage "+this.getDebugLogInfo());
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().g(this);
       }
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, DownloadTask.class, "4")) {
          return;
       }
       this.mHodorDownloadTask.abandon();
       return;
    }
    public void cancel(boolean p0){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DownloadTask.class, "5")) {
          return;
       }
       if (p0) {
          this.mHodorDownloadTask.abandon();
       }else {
          this.mHodorDownloadTask.cancel();
       }
       return;
    }
    public synchronized void clearListener(){
       if (PatchProxy.applyVoid(null, this, DownloadTask.class, "55")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (!uob.f()) {
             uArrayList.add(uob);
          }
       }
       this.mDownloadListeners.removeAll(uArrayList);
       return;
    }
    public final void d(long p0,long p1){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, DownloadTask.class, "11")) {
          return;
       }
       Log.g("DownloadManager:DownloadTask", "onResume "+this.getDebugLogInfo()+" ## soFarBytes:"+p0+" ## totalBytes:"+p1);
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().m(this, p0, p1);
       }
       this.b(true);
       return;
    }
    public final void e(){
       long l1;
       if (PatchProxy.applyVoid(null, this, DownloadTask.class, "3")) {
          return;
       }
       long l = 0;
       if (DownloadManager.i().B != null) {
          this.mHodorDownloadTask.setBeforeSubmitWaitCost(l);
       }else if(this.getEnqueueTime() - l > 0){
          l1 = (System.nanoTime() - this.getEnqueueTime()) / 0xf4240;
       }else {
          l1 = -1;
       }
       if (this.mRequest.getDownloadTaskType() != DownloadTask$DownloadTaskType.IMMEDIATE) {
          l = l1;
       }
       this.mHodorDownloadTask.setBeforeSubmitWaitCost(l);
       this.mHodorDownloadTask.submitIfNotInQueue();
       return;
    }
    public int getAllowedNetworkTypes(){
       return this.mRequest.mAllowedNetworkTypes;
    }
    public DownloadTask$DownloadBizExtra getBizExtra(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRequest.getBizExtra();
    }
    public String getBizFT(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRequest.getBizFT();
    }
    public String getBizType(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRequest.getBizType();
    }
    public long getCostTime(){
       DownloadTask tmStartTime = this.mStartTime;
       int i = 0;
       if (tmStartTime - i > 0) {
          DownloadTask tmCompleteTi = this.mCompleteTime;
          if (tmCompleteTi - i > 0 && (tmCompleteTi - tmStartTime > 0 && this.mIsContinue == null)) {
             return (tmCompleteTi - tmStartTime);
          }
       }
       return -1;
    }
    public String getDebugLogInfo(){
       StringBuilder obj = PatchProxy.apply(null, this, DownloadTask.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = " ## task bizType: "+this.getBizType()+" taskType: "+this.getDownloadTaskType()+" url: "+this.getUrl();
       String str = (this.mRequest.getDownloadTaskType() == DownloadTask$DownloadTaskType.INIT_DOWNLOAD && this.getBizExtra() != null)? " lauchBizFt: "+this.getBizExtra().getPluginLaunchBizFt()+" initPriority: "+this.getBizExtra().getInitPriority(): "";
       return obj+str;
    }
    public String getDestinationDir(){
       return this.mRequest.mDestinationDir;
    }
    public DownloadDispatcher getDownloadDispatcher(){
       return this.mDownloadDispatcher;
    }
    public DownloadTask$DownloadTaskType getDownloadTaskType(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mRequest.getDownloadTaskType();
    }
    public long getEnqueueTime(){
       return this.mEnqueueTime;
    }
    public String getFilename(){
       return this.mRequest.mDestinationFileName;
    }
    public int getHostType(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mRequest.getDownloadHostType();
    }
    public int getId(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          return Integer.parseInt(this.mHodorDownloadTask.getCacheKey());
       }catch(java.lang.NumberFormatException e0){
          Log.n("DownloadManager:DownloadTask", "Hodor cache key is not an integer which shouldn\'t happen! Hodor cache key : "+this.mHodorDownloadTask.getCacheKey());
          return this.mHodorId;
       }
    }
    public int getInitPriority(){
       DownloadTask$DownloadRequest mBizExtra = this.mRequest.mBizExtra;
       if (mBizExtra != null) {
          return mBizExtra.mInitPriority;
       }
       return Integer.MAX_VALUE;
    }
    public int getNotificationVisibility(){
       return this.mRequest.mNotificationVisibility;
    }
    public int getPreDownloadPriority(){
       return this.mPreDownloadPriority;
    }
    public DownloadTask$DownloadRequest getRequest(){
       return this.mRequest;
    }
    public int getResourceType(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mRequest.getDownloadHostType();
    }
    public long getSoFarBytes(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mHodorDownloadTask.getTaskInfo().getProgressBytes();
    }
    public long getSpeed(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mHodorDownloadTask.getCurrentDownloadSpeed();
    }
    public int getStatus(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p.a(this.mHodorDownloadTask.getTaskState());
    }
    public Object getTag(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mHodorDownloadTask.getTag(String.valueOf(DownloadTask$TagType.TAG_DEFAULT.type));
    }
    public Object getTag(DownloadTask$TagType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadTask.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mHodorDownloadTask.getTag(String.valueOf(p0.type));
    }
    public String getTargetFilePath(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mHodorDownloadTask.getTargetFilePath();
    }
    public ResourceDownloadTask$TaskInfo getTaskInfo(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mHodorDownloadTask.getTaskInfo();
    }
    public int getTaskQosClass(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mRequest.getTaskQosClass();
    }
    public long getTotalBytes(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "43");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.mHodorDownloadTask.getTotalBytes();
    }
    public String getUrl(){
       return this.mRequest.mDownloadUrl;
    }
    public boolean isCompleted(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a() == -3)? true: false;
       return b;
    }
    public boolean isError(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a() == -1)? true: false;
       return b;
    }
    public boolean isErrorBecauseWifiRequired(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "49");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mHodorDownloadTask.isOnlyDownloadUnderWifi() && (this.isError() && this.mHodorDownloadTask.getTaskInfo().getErrorCode() == DownloadTask.b))? true: false;
       return b;
    }
    public boolean isInvalid(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.a())? true: false;
       return b;
    }
    public boolean isNeedWakeInstallApk(){
       return this.mRequest.mInstallAfterDownload;
    }
    public boolean isPaused(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a() == -2)? true: false;
       return b;
    }
    public boolean isRunning(){
       Object obj = PatchProxy.apply(null, this, DownloadTask.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (DownloadManager.i().B != null) {
          if (this.a() != 3) {
             b = false;
          }
          return b;
       }else if(this.a() > 0){
          b = false;
       }
       return b;
    }
    public boolean isSyncCallback(){
       return this.mRequest.isSyncCallback;
    }
    public boolean isWaiting(){
       DownloadTask obj = PatchProxy.apply(null, this, DownloadTask.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (DownloadManager.i().B != null) {
          if (this.a() == 1) {
             b = true;
          }
          return b;
       }else {
          obj = this.mDownloadDispatcher;
          if (obj != null && obj.h(this)) {
             b = true;
          }
          return b;
       }
    }
    public boolean needUpdatePriorityIfExist(){
       return this.mRequest.mUpdatePriorityIfExist;
    }
    public void onBlockCompleted(){
       if (PatchProxy.applyVoid(null, this, DownloadTask.class, "14")) {
          return;
       }
       Log.g("DownloadManager:DownloadTask", "onBlockCompleted "+this.getDebugLogInfo()+" ## tid:"+Thread.currentThread().getId());
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this);
       }
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, DownloadTask.class, "10")) {
          return;
       }
       Log.g("DownloadManager:DownloadTask", "onCancel "+this.getDebugLogInfo());
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this);
       }
       a.b().a(this.getId());
       return;
    }
    public void onCompleted(){
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DownloadTask.class, "15")) {
          return;
       }
       Log.g("DownloadManager:DownloadTask", "onCompleted "+this.getDebugLogInfo()+" ## task path:"+this.getTargetFilePath()+" ## tid:"+Thread.currentThread().getId());
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(this);
       }
       if (!PatchProxy.applyVoid(objArray, this, DownloadTask.class, "59") && (this.getNotificationVisibility() & 0x02)) {
          a uoa = a.b();
          _monitor_enter(uoa);
          if (PatchProxy.applyVoidOneRefs(this, uoa, a.class, "3")) {
             _monitor_exit(uoa);
          }else {
             a = uoa.a;
             if (a != null) {
                a.b(this);
             }
             _monitor_exit(uoa);
          }
       }
       DownloadTask tmRequest = this.mRequest;
       if (tmRequest.mInstallAfterDownload != null) {
          int b = false;
          if (tmRequest.getInstallCallListener() != null) {
             b = this.mRequest.getInstallCallListener().a(this);
          }
          if (b || (b.K(this.getFilename()) && !PatchProxy.applyVoid(objArray, this, DownloadTask.class, "52"))) {
             Intent intent = new Intent("android.intent.action.VIEW");
             intent.addFlags(0x10000000);
             b = 3;
             intent.addFlags(b);
             Uri uri = m.c(new File(this.getTargetFilePath()));
             intent.setDataAndType(uri, TextUtils.u(this.getFilename()));
             Context uContext = DownloadManager.h();
             Iterator iterator1 = uContext.getPackageManager().queryIntentActivities(intent, 0x10000).iterator();
             while (iterator1.hasNext()) {
                uContext.grantUriPermission(iterator1.next().activityInfo.packageName, uri, b);
             }
             DownloadManager.h().startActivity(intent);
          }
       }
    label_010b :
       return;
    }
    public void onConnected(int p0,String p1,boolean p2,long p3,long p4){
       Intent intent;
       Object obj = this;
       long l = p4;
       if (PatchProxy.isSupport(DownloadTask.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Boolean.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, DownloadTask.class, "13")) {
             return;
          }
       }
       String str = "onConnected "+this.getDebugLogInfo()+" ## progressBytes:"+p3+" ## totalBytes:"+l+"## isContinue:"+p2;
       String str1 = "DownloadManager:DownloadTask";
       try{
          Log.b(str1, str);
          long l1 = (new File(this.getDestinationDir()).exists())? b.a(this.getDestinationDir()): b.a(b.i().getPath());
          if (l1 - l < 0) {
             Context uContext = DownloadManager.h();
             if (PatchProxy.isSupport(DownloadReceiver.class)) {
                intent = PatchProxy.applyTwoRefs(uContext, Integer.valueOf(p0), null, DownloadReceiver.class, "1");
                if (intent != PatchProxyResult.class) {
                label_00c1 :
                   DownloadManager.h().sendBroadcast(intent);
                   this.c();
                   return;
                }
             }
             intent = DownloadReceiver.a(uContext, p0, "download.intent.action.DOWNLOAD_CANCEL");
             goto label_00c1 ;
          }
       }catch(java.lang.Exception e0){
          if (!e0.a) {
          }else {
             throw e0;
          }
       }
       Iterator iterator = obj.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(this, p1, p2, p3, p4);
       }
       obj.b(0);
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadTask.class, "9")) {
          return;
       }
       Log.g("DownloadManager:DownloadTask", "onError "+this.getDebugLogInfo()+" ## error:"+p0.getMessage());
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(this, p0);
       }
       this.b(true);
       return;
    }
    public void onPause(long p0,long p1){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, DownloadTask.class, "8")) {
          return;
       }
       Log.g("DownloadManager:DownloadTask", "onPause "+this.getDebugLogInfo()+" ## soFarBytes:"+p0+" ## totalBytes:"+p1);
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().i(this, p0, p1);
       }
       this.b(true);
       return;
    }
    public void onPending(long p0,long p1){
       a a;
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, DownloadTask.class, "16")) {
          return;
       }
       Log.g("DownloadManager:DownloadTask", "onPending "+this.getDebugLogInfo());
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().j(this, p0, p1);
       }
       if (!PatchProxy.applyVoid(null, this, DownloadTask.class, "58") && (this.getNotificationVisibility() & 0x02)) {
          a uoa = a.b();
          _monitor_enter(uoa);
          if (PatchProxy.applyVoidOneRefs(this, uoa, a.class, "1")) {
             _monitor_exit(uoa);
          }else {
             a = uoa.a;
             if (a != null) {
                a.c(this);
             }
             _monitor_exit(uoa);
          }
       }
       return;
    }
    public void onProgress(long p0,long p1){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, DownloadTask.class, "12")) {
          return;
       }
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().k(this, p0, p1);
       }
       this.b(false);
       return;
    }
    public void onStarted(){
       if (PatchProxy.applyVoid(null, this, DownloadTask.class, "17")) {
          return;
       }
       Log.g("DownloadManager:DownloadTask", "onStarted "+this.getDebugLogInfo()+" ## task path:"+this.getTargetFilePath());
       Iterator iterator = this.mDownloadListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().o(this);
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, DownloadTask.class, "6")) {
          return;
       }
       Log.b("DownloadManager:DownloadTask", "pause "+this.getDebugLogInfo());
       this.mHodorDownloadTask.pause();
       return;
    }
    public synchronized void removeListener(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadTask.class, "54")) {
          return;
       }
       if (p0 != null && !p0.f()) {
          this.mDownloadListeners.remove(p0);
       }
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, DownloadTask.class, "7")) {
          return;
       }
       Log.b("DownloadManager:DownloadTask", "resume "+this.getDebugLogInfo());
       if (DownloadManager.i().A != null || DownloadManager.i().B != null) {
          if (this.mHodorDownloadTask.getTaskState() != -1 && (this.mHodorDownloadTask.getTaskState() != 2 && this.mHodorDownloadTask.getTaskState() != 3)) {
             this.mHodorDownloadTask.resume();
          }else {
             this.e();
          }
       }else {
          this.schedule();
       }
       if (this.mRequest.isSyncCallback != null) {
          ResourceDownloadTask$TaskInfo taskInfo = this.mHodorDownloadTask.getTaskInfo();
          if (taskInfo != null) {
             this.d(taskInfo.getProgressBytes(), taskInfo.getTotalBytes());
          }
       }else {
          DownloadTask.sUIHandler.post(new b(this));
       }
       return;
    }
    public void schedule(){
       if (PatchProxy.applyVoid(null, this, DownloadTask.class, "1")) {
          return;
       }
       Log.g("DownloadManager:DownloadTask", "schedule "+this.getDebugLogInfo());
       DownloadTask$DownloadTaskType downloadTask = this.mRequest.getDownloadTaskType();
       if (downloadTask != DownloadTask$DownloadTaskType.ENQUEUE && (downloadTask == DownloadTask$DownloadTaskType.PRE_DOWNLOAD || downloadTask == DownloadTask$DownloadTaskType.INIT_DOWNLOAD)) {
          this.mDownloadDispatcher.c(this);
       }else {
          this.mDownloadDispatcher.d(this);
       }
       return;
    }
    public void setAllowedNetworkTypes(int p0){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DownloadTask.class, "50")) {
          return;
       }
       this.mRequest.mAllowedNetworkTypes = p0;
       boolean b = (!(p0 ^ 0x02))? true: false;
       this.mHodorDownloadTask.setOnlyDownloadUnderWifi(b);
       return;
    }
    public void setEnqueueTime(long p0){
       this.mEnqueueTime = p0;
    }
    public void setHostType(int p0){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DownloadTask.class, "46")) {
          return;
       }
       this.mRequest.setDownloadHostType(p0);
       return;
    }
    public void setInstallCallListener(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadTask.class, "56")) {
          return;
       }
       this.mRequest.setInstallCallListener(p0);
       return;
    }
    public void setMaxSpeedKbps(int p0){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DownloadTask.class, "33")) {
          return;
       }
       this.mRequest.setMaxSpeedKbps(p0);
       this.mHodorDownloadTask.setMaxSpeedKbps(p0);
       this.mHodorDownloadTask.updateMaxSpeedKbps(p0);
       return;
    }
    public void setPreDownloadPriority(int p0){
       this.mPreDownloadPriority = p0;
    }
    public void setProgressCallbackIntervalMs(int p0){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DownloadTask.class, "48")) {
          return;
       }
       this.mHodorDownloadTask.setProgressCallbackIntervalMs(p0);
       return;
    }
    public void setSyncCallback(boolean p0){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, DownloadTask.class, "36")) {
          return;
       }
       this.mRequest.setSyncCallback(p0);
       return;
    }
    public void setTaskQosClass(int p0){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DownloadTask.class, "34")) {
          return;
       }
       this.mRequest.setTaskQosClass(p0);
       this.mHodorDownloadTask.setTaskQosClass(p0);
       return;
    }
    public void submit(){
       if (PatchProxy.applyVoid(null, this, DownloadTask.class, "2")) {
          return;
       }
       if (this.mHodorDownloadTask.getTaskState() == 1) {
          Log.d("DownloadManager:DownloadTask", "warning warning warning, submit already finished task, "+this.getDebugLogInfo());
       }else if(this.mHodorDownloadTask.getTaskState() != -1 && (this.mHodorDownloadTask.getTaskState() != 2 && this.mHodorDownloadTask.getTaskState() != 3)){
          this.mHodorDownloadTask.resume();
       }else {
          this.e();
       }
       return;
    }
    public void syncRequestParams(DownloadTask$DownloadRequest p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DownloadTask.class, "62")) {
          return;
       }
       DownloadTask tmRequest = this.mRequest;
       tmRequest.mInstallAfterDownload = p0.mInstallAfterDownload;
       tmRequest.mNotificationVisibility = p0.mNotificationVisibility;
       tmRequest.mInstallCallListener = p0.getInstallCallListener();
       this.mRequest.setDownloadTaskType(p0.getDownloadTaskType());
       this.mRequest.setBizFT(p0.getBizFT());
       this.mRequest.setBizType(p0.getBizType());
       this.mRequest.setBizExtra(p0.getBizExtra());
       this.mRequest.setPriority(p0.getPriority());
       this.mRequest.setGroupName(p0.mGroupName);
       this.mRequest.setUpdatePriorityIfExist(p0.mUpdatePriorityIfExist);
       this.mRequest.setMaxSpeedKbps(p0.getMaxSpeedKbps());
       return;
    }
    public void updateGroupPriority(int p0,Boolean p1){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, DownloadTask.class, "57")) {
          return;
       }
       if (!p1.booleanValue() && p0 <= this.mRequest.getGroupPriority()) {
          return;
       }
       this.mRequest.setGroupPriority(p0);
       this.mHodorDownloadTask.updateGroupPriority(p0);
       return;
    }
    public void updateTask(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DownloadTask.class, "61")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, DownloadTask.class, "63")) {
          DownloadTask tmHodorDownl = this.mHodorDownloadTask;
          if (tmHodorDownl != null) {
             tmHodorDownl.setTaskQosClass(this.mRequest.getTaskQosClass());
             this.mHodorDownloadTask.setPriority(this.mRequest.getPriority());
             this.mHodorDownloadTask.setUpdatePriorityIfExist(this.mRequest.mUpdatePriorityIfExist);
             this.mHodorDownloadTask.setMaxSpeedKbps(this.mRequest.getMaxSpeedKbps());
             this.mHodorDownloadTask.updateTaskQosClass(this.mRequest.getTaskQosClass());
             this.mHodorDownloadTask.updateMaxSpeedKbps(this.mRequest.getMaxSpeedKbps());
          }
       }
       return;
    }
    public void updateTaskQosClass(int p0){
       if (PatchProxy.isSupport(DownloadTask.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DownloadTask.class, "35")) {
          return;
       }
       this.mHodorDownloadTask.updateTaskQosClass(p0);
       return;
    }
}
