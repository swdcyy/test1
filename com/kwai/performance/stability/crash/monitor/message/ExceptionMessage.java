package com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import vg7.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import vg7.j;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import vg7.d;
import com.kwai.performance.stability.crash.monitor.message.DiskInfo;
import java.lang.Class;
import com.google.gson.Gson;
import com.kwai.performance.stability.crash.monitor.message.DeviceInfo;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.performance.stability.crash.monitor.message.ClueMirror;
import com.kwai.performance.stability.crash.monitor.message.MemoryInfo;
import java.lang.Exception;

public abstract class ExceptionMessage implements Serializable	// class@000e37
{
    public String mAbi;
    public String mAppVersionBeforeLastUpload;
    public String mBuglyEnabled;
    public String mBuildConfigInfo;
    public String mCrashDetail;
    public String mCrashType;
    public String mCurrentActivity;
    public long mCurrentTimeStamp;
    public String mCustomMsg;
    public String mDeviceInfo;
    public String mDiskInfo;
    public boolean mDumpCrashHprof;
    public String mDumpsys;
    public String mErrorMessage;
    public String mExceptionClues;
    public String mFdOverflow;
    public String mFirstLaunch;
    public String mGCInfo;
    public int mIndex;
    public String mIsAppOnForeground;
    public String mJNIError;
    public String mJavaBacktrace;
    public long mLastAppUploadTime;
    public String mLaunchSessionId;
    public long mLaunchTimeStamp;
    public String mLaunched;
    public String mLiveActivities;
    public String mLiveAuthorId;
    public String mLiveStreamId;
    public String mLockInfo;
    public String mLogUUID;
    public String mMemoryInfo;
    public String mMonitorInfo;
    public String mNativeBacktrace;
    public String mPage;
    public String mPhotoId;
    public int mPid;
    public int mPlayerCount;
    public String mPluginInfo;
    public String mProcessName;
    public String mRobustInfo;
    public String mScene;
    public final int mSdkMajorVersion;
    public String mSlowLooper;
    public String mSlowOperation;
    public String mStatusMap;
    public String mTaskId;
    public String mThreadName;
    public String mThreadOverflow;
    public String mThreadPoolQueueInfo;
    public int mTid;
    public long mUsageTimeMills;
    public String mVersionCode;
    public boolean mVersionCodeConflict;
    public String mVirtualApp;
    public String mWebUrl;
    public static final long serialVersionUID = 0xb5e9a3790d8cfb1e;

    public void ExceptionMessage(){
       super();
       this.mCrashDetail = "Unknown";
       this.mMemoryInfo = "Unknown";
       this.mDiskInfo = "Unknown";
       this.mProcessName = "Unknown";
       this.mCrashType = this.getTypeCommon();
       this.mCurrentActivity = "Unknown";
       this.mPage = "Unknown";
       this.mScene = "Unknown";
       this.mWebUrl = "Unknown";
       this.mThreadName = "Unknown";
       this.mIsAppOnForeground = "Unknown";
       this.mBuglyEnabled = "Unknown";
       this.mLogUUID = "Unknown";
       this.mVirtualApp = "Unknown";
       this.mCustomMsg = "";
       this.mPhotoId = "";
       this.mLiveAuthorId = "";
       this.mLiveStreamId = "";
       this.mLiveActivities = "Unknown";
       this.mThreadOverflow = "Unknown";
       this.mFdOverflow = "Unknown";
       this.mTaskId = "Unknown";
       this.mLaunched = "Unknown";
       this.mLaunchSessionId = "Unknown";
       this.mErrorMessage = "";
       this.mCurrentTimeStamp = -1;
       this.mLaunchTimeStamp = -1;
       this.mUsageTimeMills = -1;
       this.mVersionCode = "Unknown";
       this.mVersionCodeConflict = false;
       this.mAppVersionBeforeLastUpload = "Unknown";
       this.mPlayerCount = -1;
       this.mJNIError = "";
       this.mGCInfo = "";
       this.mLockInfo = "";
       this.mMonitorInfo = "";
       this.mSlowLooper = "";
       this.mSlowOperation = "";
       this.mStatusMap = "";
       this.mExceptionClues = "";
       this.mBuildConfigInfo = "";
       this.mAbi = "Unknown";
       this.mDumpsys = "";
       this.mPluginInfo = "";
       this.mRobustInfo = "";
       this.mDeviceInfo = "";
       this.mFirstLaunch = "Unknown";
       this.mSdkMajorVersion = 1;
       this.mNativeBacktrace = "";
       this.mJavaBacktrace = "";
       this.mIndex = -1;
       this.mDumpCrashHprof = false;
    }
    public final String getTypeCommon(){
       return this.getTypePrefix()+"COMMON";
    }
    public final String getTypeFdOOM(){
       return this.getTypePrefix()+"FD_OOM";
    }
    public final String getTypeHeapOOM(){
       return this.getTypePrefix()+"HEAP_OOM";
    }
    public abstract String getTypePrefix();
    public final String getTypeThreadOOM(){
       return this.getTypePrefix()+"THREAD_OOM";
    }
    public String toString(){
       int i;
       Iterator iterator;
       String str = "\)";
       String str1 = " \(";
       String str2 = "Unknown";
       StringBuilder str3 = new h().a();
       try{
          i = 0;
          str3 = str3+"异常状态汇总:\n"+"CPU架构: "+this.mAbi+"\n"+"是否安装后第一次启动: "+this.mFirstLaunch+"\n"+"启动完成: "+this.mLaunched+"\n"+"异常进程: "+this.mProcessName+str1+this.mPid+str+"\n"+"异常线程: "+this.mThreadName+str1+this.mTid+str+"\n"+"异常类型: "+this.mCrashType+"\n"+"应用多开环境: "+this.mVirtualApp+"\n"+"Activity: "+this.mCurrentActivity+"\n";
          if (!TextUtils.isEmpty(this.mCustomMsg)) {
             str3 = str3+"自定义信息: "+this.mCustomMsg+"\n";
          }
          str3 = str3+"页面: "+this.mPage+"\n";
          if (!str2.equals(this.mScene) && !TextUtils.isEmpty(this.mScene)) {
             str3 = str3+"业务场景: "+this.mScene+"\n";
          }
          if (!TextUtils.isEmpty(this.mPhotoId)) {
             str3 = str3+"作品id: "+this.mPhotoId+"\n";
          }
          if (!TextUtils.isEmpty(this.mLiveAuthorId)) {
             str3 = str3+"主播id: "+this.mLiveAuthorId+"\n";
          }
          if (!TextUtils.isEmpty(this.mLiveStreamId)) {
             str3 = str3+"推流id: "+this.mLiveStreamId+"\n";
          }
          str3 = str3+"前后台状态: "+this.mIsAppOnForeground+"\n"+"是否上报Bugly: "+this.mBuglyEnabled+"\n"+"异常发生时间: "+j.a(this.mCurrentTimeStamp)+"\n"+"版本号: "+this.mVersionCode+"\n"+"升级前版本号: "+this.mAppVersionBeforeLastUpload+"\n"+"升级时间: "+j.a(this.mLastAppUploadTime)+"\n"+"使用时长: "+j.b(this.mUsageTimeMills)+"\n"+"播放器实例: "+this.mPlayerCount+"\n"+"异常详情: \n";
          str3 = (this instanceof JavaExceptionMessage)? str3+((this.mCrashDetail).replace("##", "\n\t")).replace("#", "\n")+"\n": str3+this.mCrashDetail+"\n";
          if (!str2.equals(this.mDiskInfo) && !TextUtils.isEmpty(this.mDiskInfo)) {
             str3 = str3+"磁盘详情: \n"+d.j.h(this.mDiskInfo, DiskInfo.class)+"\n";
          }
          if (!TextUtils.isEmpty(this.mDeviceInfo)) {
             str3 = str3+"设备详情: \n"+d.j.h(this.mDeviceInfo, DeviceInfo.class)+"\n";
          }
          if (!str2.equals(this.mLiveActivities) && !TextUtils.isEmpty(this.mLiveActivities)) {
             List list = d.j.h(this.mLiveActivities, List.class);
             if (list.size() > 0) {
                str3 = str3+"页面列表: \n";
                iterator = list.iterator();
                while (iterator.hasNext()) {
                   str3 = str3+iterator.next()+"\n";
                }
             }
          }
          if (!TextUtils.isEmpty(this.mThreadPoolQueueInfo)) {
             str3 = str3+"线程池队列详情: \n"+this.mThreadPoolQueueInfo+"\n";
          }
          if (!TextUtils.isEmpty(this.mErrorMessage)) {
             str3 = str3+"异常上报Debug: \n"+this.mErrorMessage+"\n";
          }
          str1 = ":";
          int i1 = 1;
          if (!TextUtils.isEmpty(this.mStatusMap)) {
             str3 = str3+"业务自定义上报: \n";
             Type[] typeArray = new Type[2];
             typeArray[i] = String.class;
             typeArray[i1] = Object.class;
             iterator = d.j.i(this.mStatusMap, a.getParameterized(HashMap.class, typeArray).getType()).entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                str3 = str3+uEntry.getKey()+str1+uEntry.getValue()+"\n";
             }
          }
          if (!TextUtils.isEmpty(this.mExceptionClues) && !("[]").equals(this.mExceptionClues)) {
             str3 = str3+"异常线索上报: \n";
             Type[] typeArray1 = new Type[i1];
             typeArray1[i] = ClueMirror.class;
             iterator = d.j.i(this.mExceptionClues, a.getParameterized(List.class, typeArray1).getType()).iterator();
             while (iterator.hasNext()) {
                ClueMirror uClueMirror = iterator.next();
                str3 = str3+uClueMirror.key+str1+uClueMirror.value+"\n";
             }
          }
          if (!TextUtils.isEmpty(this.mBuildConfigInfo)) {
             str3 = str3+"BuildConfig信息: \n"+this.mBuildConfigInfo+"\n";
          }
          if (!TextUtils.isEmpty(this.mPluginInfo)) {
             str3 = str3+"插件配置信息: \n"+this.mPluginInfo+"\n";
          }
          if (!TextUtils.isEmpty(this.mJNIError)) {
             str3 = str3+"JNI异常: \n"+this.mJNIError+"\n";
          }
          if (!TextUtils.isEmpty(this.mGCInfo)) {
             str3 = str3+"GC耗时: \n"+this.mGCInfo+"\n";
          }
          if (!TextUtils.isEmpty(this.mLockInfo)) {
             str3 = str3+"锁耗时\(dvm_lock_sample\): \n"+this.mLockInfo+"\n";
          }
          if (!TextUtils.isEmpty(this.mMonitorInfo)) {
             str3 = str3+"锁耗时\(monitor\): \n"+this.mMonitorInfo+"\n";
          }
          if (!TextUtils.isEmpty(this.mSlowLooper)) {
             str3 = str3+"Looper耗时: \n"+this.mSlowLooper+"\n";
          }
          if (!TextUtils.isEmpty(this.mSlowOperation)) {
             str3 = str3+"AMS调度耗时: \n"+this.mSlowOperation+"\n";
          }
          str3 = str3+"内存详情: \n"+d.j.h(this.mMemoryInfo, MemoryInfo.class)+"\n";
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return str3.substring(i);
    }
}
