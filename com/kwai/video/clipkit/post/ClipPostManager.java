package com.kwai.video.clipkit.post.ClipPostManager;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.video.clipkit.post.ClipPostManager$1;
import com.kwai.video.clipkit.post.ClipPostManager$Holder;
import com.kwai.video.clipkit.post.ClipPostInfo;
import com.kwai.video.clipkit.post.ClipPostListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.clipkit.KSClipLog;
import com.kwai.video.clipkit.post.ClipPostTask;
import java.util.List;
import android.content.Context;
import com.kwai.video.clipkit.log.ClipEditExtraInfo;
import com.kwai.video.clipkit.log.ClipEditLogger;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.video.clipkit.post.ClipPostManager$ClipPostTaskInfo;
import com.kwai.video.clipkit.post.ClipPostResult;
import com.kwai.video.clipkit.post.ClipPostStatus;
import java.lang.System;
import com.kwai.video.clipkit.post.ClipEditPostBaseLog;
import com.kwai.video.ksuploaderkit.KSUploaderKitCommon$SceneType;
import com.kwai.video.clipkit.post.ClipPostInfo$ClipUploadInfo;
import com.kwai.video.clipkit.post.ClipPostInfo$ClipWatermarkParam;

public class ClipPostManager	// class@001ae9
{
    public Context mApplicationContext;
    public List mClipPostTasks;
    public AtomicBoolean mIsInit;
    public Object mLock;
    public Handler mMainHandler;
    public String mProcessSessionId;

    public void ClipPostManager(){
       super();
       this.mLock = new Object();
       this.mIsInit = new AtomicBoolean(false);
       this.mMainHandler = new Handler(Looper.getMainLooper());
       this.mClipPostTasks = new CopyOnWriteArrayList();
    }
    public void ClipPostManager(ClipPostManager$1 p0){
       super();
    }
    public static ClipPostManager getInstance(){
       return ClipPostManager$Holder.sManager;
    }
    public boolean add(ClipPostInfo p0,ClipPostListener p1){
       ClipPostManager obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipPostManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       boolean b = false;
       if (!this.mIsInit.get()) {
          KSClipLog.e("ClipPostManager", "please call init before use it");
          _monitor_exit(obj);
          return b;
       }else {
          ClipPostTask uClipPostTas = this.findClipPostInfo(p0.getId());
          if (uClipPostTas != null) {
             if (uClipPostTas.isStatusSuccess()) {
                this.mClipPostTasks.remove(uClipPostTas);
             }else {
                _monitor_exit(obj);
                return this.retry(p0.getId(), p1);
             }
          }
          uClipPostTas = new ClipPostTask(p0, this.mApplicationContext);
          if (p0.postBusiness == true) {
             ClipEditExtraInfo uClipEditExt = new ClipEditExtraInfo();
             ClipEditLogger.addDataToExtraInfoIfNeed(p0.postBusiness, uClipEditExt);
             uClipPostTas.setExtraInfo(uClipEditExt);
          }
          this.setPostListener(uClipPostTas, p1);
          this.mClipPostTasks.add(uClipPostTas);
          if (this.startPostTaskIfNeed()) {
             KSClipLog.i("ClipPostManager", "add task and start,id:"+p0.getId());
             _monitor_exit(obj);
             return true;
          }else {
             KSClipLog.i("ClipPostManager", "add task not start,id:"+p0.getId());
             _monitor_exit(obj);
             return b;
          }
       }
    }
    public boolean cancel(String p0){
       ClipPostManager obj = PatchProxy.applyOneRefs(p0, this, ClipPostManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ClipPostTask uClipPostTas = this.findClipPostInfo(p0);
       if (uClipPostTas != null) {
          uClipPostTas.cancel();
          KSClipLog.i("ClipPostManager", "cancel success,id:"+p0);
          _monitor_exit(obj);
          return true;
       }else {
          _monitor_exit(obj);
          return false;
       }
    }
    public final ClipPostTask findClipPostInfo(String p0){
       ClipPostTask uClipPostTas;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, ClipPostManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mClipPostTasks.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uClipPostTas = obj.next();
          if (!TextUtils.isEmpty(p0) && p0.equals(uClipPostTas.getPostInfo().getId())) {
             break ;
          }
       }
       return uClipPostTas;
    }
    public ClipPostManager$ClipPostTaskInfo getTaskInfo(String p0){
       ClipPostManager obj = PatchProxy.applyOneRefs(p0, this, ClipPostManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ClipPostTask uClipPostTas = this.findClipPostInfo(p0);
       if (uClipPostTas != null) {
          ClipPostManager$ClipPostTaskInfo uClipPostTas1 = new ClipPostManager$ClipPostTaskInfo();
          uClipPostTas1.postFlag = uClipPostTas.getPostInfo().postFlag;
          uClipPostTas1.postResult = uClipPostTas.getClipResult();
          uClipPostTas1.postStatus = uClipPostTas.getStatus();
          _monitor_exit(obj);
          return uClipPostTas1;
       }else {
          _monitor_exit(obj);
          return null;
       }
    }
    public void init(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPostManager.class, "1")) {
          return;
       }
       ClipPostManager tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (!this.mIsInit.get()) {
          this.mApplicationContext = p0.getApplicationContext();
          this.mIsInit.set(true);
          KSClipLog.i("ksclipkit", "xbuild_"+System.currentTimeMillis());
       }
       _monitor_exit(tmLock);
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, ClipPostManager.class, "2")) {
          return;
       }
       ClipPostManager tmLock = this.mLock;
       _monitor_enter(tmLock);
       Iterator iterator = this.mClipPostTasks.iterator();
       while (iterator.hasNext()) {
          ClipPostTask uClipPostTas = iterator.next();
          String str = "";
          if (uClipPostTas.getPostInfo() != null) {
             str = uClipPostTas.getPostInfo().id;
          }
          uClipPostTas.cancel();
          KSClipLog.i("ClipPostManager", "release cancel id:"+str);
       }
       this.mClipPostTasks.clear();
       _monitor_exit(tmLock);
       return;
    }
    public void reportPostFail(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPostManager.class, "8")) {
          return;
       }
       ClipPostTask uClipPostTas = this.findClipPostInfo(p0);
       if (uClipPostTas != null) {
          uClipPostTas.reportPostStatusExternal(8);
       }else {
          KSClipLog.w("ClipPostManager", "reportPostFail session "+p0+" not exists");
       }
       return;
    }
    public void reportPostStart(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPostManager.class, "7")) {
          return;
       }
       ClipPostTask uClipPostTas = this.findClipPostInfo(p0);
       if (uClipPostTas != null) {
          uClipPostTas.reportPostStatusExternal(1);
       }else {
          KSClipLog.w("ClipPostManager", "reportPostStart session "+p0+" not exists");
       }
       return;
    }
    public void reportPostSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClipPostManager.class, "9")) {
          return;
       }
       ClipPostTask uClipPostTas = this.findClipPostInfo(p0);
       if (uClipPostTas != null) {
          uClipPostTas.reportPostStatusExternal(7);
       }else {
          KSClipLog.w("ClipPostManager", "reportPostSuccess session "+p0+" not exists");
       }
       return;
    }
    public void reportUploadFailBeforeAddTask(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipPostManager.class, "10")) {
          return;
       }
       ClipEditPostBaseLog uClipEditPos = new ClipEditPostBaseLog(p0, 0, -100100, p1, true);
       ClipEditLogger.reportPostLog(1, v0);
       ClipEditLogger.reportPostLog(8, v0);
       return;
    }
    public boolean resume(){
       ClipPostManager obj = PatchProxy.apply(null, this, ClipPostManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       boolean b = this.startPostTaskIfNeed();
       KSClipLog.i("ClipPostManager", "resume call,result:"+b);
       _monitor_exit(obj);
       return b;
    }
    public boolean retry(String p0,ClipPostListener p1){
       ClipPostManager obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipPostManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ClipPostTask uClipPostTas = this.findClipPostInfo(p0);
       if (uClipPostTas != null && !uClipPostTas.isStatusSuccess()) {
          this.setPostListener(uClipPostTas, p1);
          uClipPostTas.changeStatusFailedToIdle();
          uClipPostTas.setUserWaitingStartTime(p0.equals(this.mProcessSessionId));
          p1.sceneType = KSUploaderKitCommon$SceneType.RetryByUser;
          if (this.startPostTaskIfNeed()) {
             KSClipLog.i("ClipPostManager", "retry success,id:"+p0+",processId:"+this.mProcessSessionId);
             _monitor_exit(obj);
             return true;
          }else {
             KSClipLog.i("ClipPostManager", "find id,start failed,id:"+p0+",processId:"+this.mProcessSessionId);
          }
       }
       _monitor_exit(obj);
       return false;
    }
    public boolean setExtraInfo(String p0,ClipEditExtraInfo p1){
       ClipPostManager obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipPostManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ClipPostTask uClipPostTas = this.findClipPostInfo(p0);
       if (uClipPostTas != null) {
          uClipPostTas.setExtraInfo(p1);
          KSClipLog.i("ClipPostManager", "setExtraInfo success,id:"+p0);
          _monitor_exit(obj);
          return true;
       }else {
          _monitor_exit(obj);
          KSClipLog.i("ClipPostManager", "setExtraInfo,id:"+p0+" not found");
          return false;
       }
    }
    public final void setPostListener(ClipPostTask p0,ClipPostListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ClipPostManager.class, "18")) {
          return;
       }
       p0.setClipPostListener(new ClipPostManager$1(this, p1, p0));
       return;
    }
    public boolean startPostTaskIfNeed(){
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, ClipPostManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       int i = 0;
       while (true) {
          if (i < this.mClipPostTasks.size()) {
             ClipPostTask uClipPostTas = this.mClipPostTasks.get(i);
             if (uClipPostTas.isEncodeUploadProcessing()) {
                KSClipLog.i("ClipPostManager", "startPostTaskIfNeed,id:"+uClipPostTas.getPostInfo().getId()+" is running,return true");
                return true;
             }else if(uClipPostTas.isStatusIdle()){
                objArray = uClipPostTas;
             label_005c :
                if (objArray != null) {
                   this.mProcessSessionId = objArray.getPostInfo().id;
                   objArray.start();
                   return true;
                }else {
                   break ;
                }
             }else {
                i = i + 1;
             }
          }else {
             goto label_005c ;
          }
       }
       KSClipLog.d("ClipPostManager", "startPostTaskIfNeed not find startTask");
       return obj;
    }
    public boolean updateUploadInfo(String p0,ClipPostInfo$ClipUploadInfo p1){
       ClipPostManager obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipPostManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ClipPostTask uClipPostTas = this.findClipPostInfo(p0);
       if (uClipPostTas != null) {
          boolean b = uClipPostTas.updateUploadInfo(p1, p0.equals(this.mProcessSessionId));
          KSClipLog.i("ClipPostManager", "updateUploadInfo,id:"+p0+",processId:"+this.mProcessSessionId+",result:"+b);
          _monitor_exit(obj);
          return b;
       }else {
          _monitor_exit(obj);
          KSClipLog.i("ClipPostManager", "updateUploadInfo,id:"+p0+" not found");
          return false;
       }
    }
    public boolean updateWatermarkParam(String p0,ClipPostInfo$ClipWatermarkParam p1){
       ClipPostManager obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipPostManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ClipPostTask uClipPostTas = this.findClipPostInfo(p0);
       boolean b = false;
       if (uClipPostTas != null) {
          ClipPostManager tmProcessSes = this.mProcessSessionId;
          if (tmProcessSes == null || p0.equals(tmProcessSes)) {
             b = true;
          }
          boolean b1 = uClipPostTas.updateWatermarkParam(p1, b);
          KSClipLog.i("ClipPostManager", "updateWatermarkParam,id:"+p0+",processId:"+this.mProcessSessionId+",result:"+b1);
          _monitor_exit(obj);
          return b1;
       }else {
          _monitor_exit(obj);
          KSClipLog.i("ClipPostManager", "updateWatermarkParam,id:"+p0+" not found");
          return b;
       }
    }
    public boolean userWaitStart(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClipPostManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.userWaitStartTime(p0, null);
    }
    public boolean userWaitStartTime(String p0,ClipPostInfo$ClipUploadInfo p1){
       ClipPostManager obj = PatchProxy.applyTwoRefs(p0, p1, this, ClipPostManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       ClipPostTask uClipPostTas = this.findClipPostInfo(p0);
       StringBuilder str = null;
       if (uClipPostTas != null) {
          boolean b = true;
          if (p1 == null) {
             KSClipLog.i("ClipPostManager", "userWaitStart success,id:"+p0+",processId:"+this.mProcessSessionId);
             uClipPostTas.setUserWaitingStartTime(p0.equals(this.mProcessSessionId));
             _monitor_exit(obj);
             return b;
          }else if(p1.coverPath != null && p1.coverAuthentication != null){
             KSClipLog.i("ClipPostManager", "userWaitStart with cover success,id:"+p0+",processId:"+this.mProcessSessionId);
             uClipPostTas.setUserWaitingStartTime(p0.equals(this.mProcessSessionId), p1);
             _monitor_exit(obj);
             return b;
          }else {
             KSClipLog.e("ClipPostManager", "userWaitStart with cover, id:"+p0+"illegal cover upload info");
             _monitor_exit(obj);
             return str;
          }
       }else {
          _monitor_exit(obj);
          KSClipLog.e("ClipPostManager", "userWaitStart with cover, id:"+p0+" not found");
          return str;
       }
    }
}
