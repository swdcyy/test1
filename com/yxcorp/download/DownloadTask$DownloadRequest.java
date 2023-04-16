package com.yxcorp.download.DownloadTask$DownloadRequest;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import com.yxcorp.download.DownloadConfig;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import ekd.e0;
import java.util.ArrayList;
import com.yxcorp.utility.Log;
import java.util.Iterator;
import com.kuaishou.webkit.URLUtil;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.io.File;
import android.content.Context;
import android.net.NetworkInfo;
import ekd.p0;
import com.kwai.video.hodor.HodorConfig;
import com.yxcorp.download.DownloadTask$DownloadRequest$CacheKeyGenStrategy;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.CharSequence;
import java.util.Map;
import java.lang.Number;
import android.text.TextUtils;
import com.yxcorp.download.f;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import mu8.o;
import com.yxcorp.download.DownloadTask$TagType;
import java.lang.Integer;

public class DownloadTask$DownloadRequest implements Serializable	// class@0011af
{
    public boolean isSyncCallback;
    public int mAllowedNetworkTypes;
    public DownloadTask$DownloadBizExtra mBizExtra;
    public String mBizFT;
    public String mBizType;
    public DownloadTask$DownloadRequest$CacheKeyGenStrategy mCacheKeyStrategy;
    public int mCallbackProgressTimes;
    public int mConnectTimeout;
    public String mCustomExtension;
    public boolean mDeleteCacheOnCancel;
    public String mDestinationDir;
    public String mDestinationFileName;
    public boolean mDisableForceRangeRequest;
    public int mDownloadHostType;
    public DownloadTask$DownloadTaskType mDownloadTaskType;
    public String mDownloadUrl;
    public List mDownloadUrls;
    public int mEvictStrategy;
    public String mExtraMessage;
    public String mGroupName;
    public int mGroupPriority;
    public int mId;
    public boolean mInstallAfterDownload;
    public o mInstallCallListener;
    public boolean mIsNotForceReDownload;
    public boolean mIsPhotoAdDownloadRequest;
    public int mMaxSpeedKbps;
    public boolean mNeedCDNReport;
    public int mNotificationVisibility;
    public String mP2spPolicy;
    public int mPriority;
    public int mProgressCallbackIntervalMs;
    public int mReadTimeout;
    public final Map mRequestHeaders;
    public int mResourceType;
    public int mRetryTimes;
    public Map mTagMap;
    public int mTaskId;
    public int mTaskQosClass;
    public boolean mUnifyCdnLog;
    public boolean mUpdatePriorityIfExist;
    public static final long serialVersionUID = 0x87981e40c74891d6;

    public void DownloadTask$DownloadRequest(String p0){
       String[] stringArray = new String[]{p0};
       super(Arrays.asList(stringArray));
    }
    public void DownloadTask$DownloadRequest(List p0){
       ArrayList uArrayList;
       DownloadTask$DownloadRequest$CacheKeyGenStrategy wholeUrl;
       super();
       this.mRequestHeaders = new HashMap();
       this.mBizFT = "unknown";
       this.mBizType = "Default";
       String str = "";
       this.mExtraMessage = str;
       this.mProgressCallbackIntervalMs = -1;
       this.mResourceType = 37;
       this.mNeedCDNReport = DownloadManager.i().C;
       this.mUnifyCdnLog = false;
       this.mIsNotForceReDownload = true;
       this.mRetryTimes = 3;
       this.mConnectTimeout = -1;
       this.mReadTimeout = -1;
       this.isSyncCallback = false;
       this.mTagMap = new HashMap();
       this.mInstallAfterDownload = true;
       this.mUpdatePriorityIfExist = false;
       this.mIsPhotoAdDownloadRequest = false;
       this.mCallbackProgressTimes = 0;
       this.mDownloadTaskType = DownloadTask$DownloadTaskType.PRE_DOWNLOAD;
       this.mDownloadHostType = 0;
       this.mEvictStrategy = 0;
       this.mTaskQosClass = 0;
       this.mPriority = 2000;
       this.mDeleteCacheOnCancel = true;
       this.mDisableForceRangeRequest = false;
       this.mAllowedNetworkTypes = 3;
       this.mNotificationVisibility = 0;
       this.mMaxSpeedKbps = -1;
       this.mId = Integer.MIN_VALUE;
       this.mTaskId = -1;
       this.mGroupPriority = -1;
       String str1 = "DownloadManager:DownloadTask";
       if (p0 == null) {
          if (!e0.a) {
             uArrayList = new ArrayList();
             Log.d(str1, "DownloadRequest url null");
          }else {
             throw null;
          }
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = uArrayList.iterator();
       while (true) {
          if (iterator.hasNext()) {
             String str2 = iterator.next();
             if (!URLUtil.isNetworkUrl(str2)) {
                if (!e0.a) {
                   Log.d(str1, "DownloadRequest invalid url : "+str2);
                }else {
                   throw new IllegalArgumentException("Can only download HTTP/HTTPS URIs: "+str2);
                }
             }
             uArrayList1.add(str2);
          }else if(uArrayList1.size() > 0){
             str = uArrayList.get(false);
          }
          this.mDownloadUrl = str;
          this.mDownloadUrls = uArrayList1;
          File uFile = DownloadManager.j();
          if (uFile != null) {
             if (!uFile.exists()) {
                uFile.mkdirs();
             }
             this.mDestinationDir = uFile.getPath();
          }
          NetworkInfo networkInfo = p0.e(DownloadManager.h());
          this.mAllowedNetworkTypes = (networkInfo != null && !networkInfo.getType())? 3: 2;
          this.mUnifyCdnLog = HodorConfig.isDefaultEnableUnifyLog();
          wholeUrl = (DownloadManager.s())? DownloadTask$DownloadRequest$CacheKeyGenStrategy.WholeUrl: DownloadTask$DownloadRequest$CacheKeyGenStrategy.UrlPathWithQuery;
          break ;
       }
       this.mCacheKeyStrategy = wholeUrl;
       return;
    }
    public DownloadTask$DownloadRequest addRequestHeader(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DownloadTask$DownloadRequest.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "header cannot be null");
       if (p0.contains(":")) {
          throw new IllegalArgumentException("header may not contain \':\'");
       }
       if (p1 == null) {
          p1 = "";
       }
       this.mRequestHeaders.put(p0, p1);
       return this;
    }
    public int generateId(){
       String str;
       DownloadTask$DownloadRequest obj = PatchProxy.apply(null, this, DownloadTask$DownloadRequest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mId;
       if (obj != Integer.MIN_VALUE) {
          return obj;
       }
       if (TextUtils.isEmpty(this.mDestinationDir) && DownloadManager.j() != null) {
          this.mDestinationDir = DownloadManager.j().getPath();
       }
       if (TextUtils.isEmpty(this.mDestinationFileName)) {
          this.mDestinationFileName = f.b(this.mDownloadUrl, this.mCustomExtension);
          Log.b("DownloadManager:DownloadTask", "generateFileName : "+this.mDestinationFileName);
       }
       obj = this.mDestinationFileName;
       if (!TextUtils.isEmpty(this.mDestinationDir) && !TextUtils.isEmpty(this.mDestinationFileName)) {
          str = f.c(this.mDestinationDir, this.mDestinationFileName);
       }
       int i = f.e(this.mDownloadUrl, str, this.mCacheKeyStrategy);
       this.mId = i;
       return i;
    }
    public int getAllowedNetworkTypes(){
       return this.mAllowedNetworkTypes;
    }
    public DownloadTask$DownloadBizExtra getBizExtra(){
       return this.mBizExtra;
    }
    public String getBizFT(){
       return this.mBizFT;
    }
    public String getBizType(){
       return this.mBizType;
    }
    public int getCallbackProgressTimes(){
       return this.mCallbackProgressTimes;
    }
    public int getConnectTimeout(){
       return this.mConnectTimeout;
    }
    public String getCustomExtension(){
       return this.mCustomExtension;
    }
    public String getDestinationDir(){
       return this.mDestinationDir;
    }
    public String getDestinationFileName(){
       return this.mDestinationFileName;
    }
    public int getDownloadHostType(){
       return this.mDownloadHostType;
    }
    public DownloadTask$DownloadTaskType getDownloadTaskType(){
       return this.mDownloadTaskType;
    }
    public String getDownloadUrl(){
       return this.mDownloadUrl;
    }
    public List getDownloadUrls(){
       return this.mDownloadUrls;
    }
    public int getGroupPriority(){
       return this.mGroupPriority;
    }
    public o getInstallCallListener(){
       return this.mInstallCallListener;
    }
    public boolean getIsNotForceReDownload(){
       return this.mIsNotForceReDownload;
    }
    public int getMaxSpeedKbps(){
       return this.mMaxSpeedKbps;
    }
    public int getPriority(){
       return this.mPriority;
    }
    public int getProgressCallbackIntervalMs(){
       return this.mProgressCallbackIntervalMs;
    }
    public int getReadTimeout(){
       return this.mReadTimeout;
    }
    public int getResourceType(){
       return this.mResourceType;
    }
    public int getRetryTimes(){
       return this.mRetryTimes;
    }
    public Serializable getTag(){
       Object obj = PatchProxy.apply(null, this, DownloadTask$DownloadRequest.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getTag(DownloadTask$TagType.TAG_DEFAULT);
    }
    public Serializable getTag(DownloadTask$TagType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadTask$DownloadRequest.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTagMap.get(Integer.valueOf(p0.type));
    }
    public int getTaskId(){
       return this.mTaskId;
    }
    public int getTaskQosClass(){
       return this.mTaskQosClass;
    }
    public boolean isNeedCDNReport(){
       return this.mNeedCDNReport;
    }
    public boolean isPhotoAdDownloadRequest(){
       return this.mIsPhotoAdDownloadRequest;
    }
    public boolean isSyncCallback(){
       return this.isSyncCallback;
    }
    public DownloadTask$DownloadRequest setAllowedNetworkTypes(int p0){
       this.mAllowedNetworkTypes = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setBizExtra(DownloadTask$DownloadBizExtra p0){
       this.mBizExtra = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setBizFT(String p0){
       this.mBizFT = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setBizInfo(String p0,String p1,DownloadTask$DownloadBizExtra p2){
       this.mBizFT = p0;
       this.mBizType = p1;
       this.mBizExtra = p2;
       return this;
    }
    public DownloadTask$DownloadRequest setBizType(String p0){
       this.mBizType = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setCacheKeyStrategy(DownloadTask$DownloadRequest$CacheKeyGenStrategy p0){
       this.mCacheKeyStrategy = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setCallbackProgressTimes(int p0){
       this.mCallbackProgressTimes = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setConnectTimeout(int p0){
       this.mConnectTimeout = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setCustomExtension(String p0){
       this.mCustomExtension = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setDeleteCacheOnCancel(boolean p0){
       this.mDeleteCacheOnCancel = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setDestinationDir(String p0){
       this.mDestinationDir = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setDestinationFileName(String p0){
       this.mDestinationFileName = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setDisableForceRangeRequest(boolean p0){
       this.mDisableForceRangeRequest = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setDownloadHostType(int p0){
       this.mDownloadHostType = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setDownloadTaskType(DownloadTask$DownloadTaskType p0){
       this.mDownloadTaskType = p0;
       if (p0 == DownloadTask$DownloadTaskType.IMMEDIATE) {
          this.mTaskQosClass = 8;
       }else if(p0 == DownloadTask$DownloadTaskType.ENQUEUE){
          this.mTaskQosClass = 1;
       }else if(p0 == DownloadTask$DownloadTaskType.PRE_DOWNLOAD){
          this.mTaskQosClass = 0;
       }else if(p0 == DownloadTask$DownloadTaskType.INIT_DOWNLOAD){
          this.mTaskQosClass = 4;
       }
       return this;
    }
    public DownloadTask$DownloadRequest setEvictStrategy(int p0){
       this.mEvictStrategy = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setExtraMessage(String p0){
       this.mExtraMessage = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setGroupName(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadTask$DownloadRequest.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.mGroupName = p0;
       }
       return this;
    }
    public void setGroupPriority(int p0){
       this.mGroupPriority = p0;
    }
    public DownloadTask$DownloadRequest setId(int p0){
       this.mId = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setInstallAfterDownload(boolean p0){
       this.mInstallAfterDownload = p0;
       return this;
    }
    public void setInstallCallListener(o p0){
       this.mInstallCallListener = p0;
    }
    public void setIsNotForceReDownload(boolean p0){
       this.mIsNotForceReDownload = p0;
    }
    public void setIsPhotoAdDownloadRequest(){
       this.mIsPhotoAdDownloadRequest = true;
    }
    public DownloadTask$DownloadRequest setMaxSpeedKbps(int p0){
       this.mMaxSpeedKbps = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setNeedCDNReport(boolean p0){
       this.mNeedCDNReport = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setNotificationVisibility(int p0){
       this.mNotificationVisibility = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setP2spPolicy(String p0){
       this.mP2spPolicy = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setPriority(int p0){
       this.mPriority = p0;
       return this;
    }
    public void setProgressCallbackIntervalMs(int p0){
       this.mProgressCallbackIntervalMs = p0;
    }
    public DownloadTask$DownloadRequest setReadTimeout(int p0){
       this.mReadTimeout = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setResourceType(int p0){
       this.mResourceType = p0;
       return this;
    }
    public DownloadTask$DownloadRequest setRetryTimes(int p0){
       this.mRetryTimes = p0;
       return this;
    }
    public void setSyncCallback(boolean p0){
       this.isSyncCallback = p0;
    }
    public DownloadTask$DownloadRequest setTag(DownloadTask$TagType p0,Serializable p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, DownloadTask$DownloadRequest.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.mTagMap.put(Integer.valueOf(p0.type), p1);
       return this;
    }
    public DownloadTask$DownloadRequest setTag(Serializable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DownloadTask$DownloadRequest.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.setTag(DownloadTask$TagType.TAG_DEFAULT, p0);
    }
    public void setTaskId(int p0){
       this.mTaskId = p0;
       DownloadTask$DownloadRequest tmBizExtra = this.mBizExtra;
       if (tmBizExtra != null) {
          tmBizExtra.mTaskId = p0;
       }
       return;
    }
    public DownloadTask$DownloadRequest setTaskQosClass(int p0){
       this.mTaskQosClass = p0;
       if (p0 == 8) {
          this.mDownloadTaskType = DownloadTask$DownloadTaskType.IMMEDIATE;
       }else if(p0 == 1){
          this.mDownloadTaskType = DownloadTask$DownloadTaskType.ENQUEUE;
       }else if(!p0){
          this.mDownloadTaskType = DownloadTask$DownloadTaskType.PRE_DOWNLOAD;
       }else if(p0 == 4){
          this.mDownloadTaskType = DownloadTask$DownloadTaskType.INIT_DOWNLOAD;
       }
       return this;
    }
    public void setUnifyCdnLog(boolean p0){
       this.mUnifyCdnLog = p0;
    }
    public DownloadTask$DownloadRequest setUpdatePriorityIfExist(boolean p0){
       this.mUpdatePriorityIfExist = p0;
       return this;
    }
}
