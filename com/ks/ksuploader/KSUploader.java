package com.ks.ksuploader.KSUploader;
import com.ks.ksuploader.KSUploader$1;
import java.lang.reflect.Type;
import el.a;
import com.ks.ksuploader.KSUploaderLogLevel;
import android.content.Context;
import com.ks.ksapi.b;
import java.lang.Object;
import java.util.HashMap;
import com.ks.ksuploader.KSUploader$RickonConfig;
import com.ks.ksuploader.KSUploader$UploadInfo;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import com.ks.ksuploader.KSNetworkManager;
import com.ks.ksapi.a;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Enum;
import com.ks.ksuploader.KSNetworkMonitor;
import java.lang.Throwable;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Enumeration;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import com.kwai.framework.deviceid.a;
import java.net.InetAddress;
import java.lang.CharSequence;
import android.util.Pair;
import com.ks.ksapi.DefaultDynamicLibLoader;
import java.lang.Exception;
import com.ks.ksuploader.KSUploaderLogListener;
import com.kwai.video.ksuploaderkit.DefaultUploaderLogListener;
import java.lang.Integer;
import java.lang.Long;
import ln.a;
import com.ks.ksuploader.KSEncryptConfig;
import com.ks.ksuploader.KSGateWayInfo;
import com.ks.ksuploader.KSUploader$NicInfo;
import java.lang.Boolean;
import java.lang.Number;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.Math;
import com.ks.ksuploader.KSUploaderUtils;
import java.util.Map;
import java.io.IOException;
import android.os.Build$VERSION;
import android.net.Network;
import com.ks.ksuploader.ProgressPercentage;
import com.google.gson.Gson;
import com.ks.ksuploader.KSUploader$ResumeInfo;
import com.ks.ksuploader.KSUploaderEventListener;
import com.ks.ksuploader.KSUploader$KSUploaderSpeedTestListener;
import java.util.Arrays;
import java.util.Collection;
import ln.b;
import ln.b$a;
import oe6.g;
import rr4.a$a;
import com.google.protobuf.nano.MessageNano;

public abstract class KSUploader	// class@000764
{
    public String mCachedFileKey;
    public KSUploaderEventListener mEventListener;
    public int mFragUniqueId;
    public Map mFragmentCrcs;
    public KSGateWayInfo[] mGatewayInfoArray;
    public boolean mIsStarted;
    public double mLastReportedPercentage;
    public Object mLock;
    public long mNativeContext;
    public b mNetAgent;
    public KSNetworkManager mNetworkManager;
    public KSUploader$RickonConfig mRickonConfig;
    public SharedPreferences$Editor mSharedEditor;
    public SharedPreferences mSharedPreference;
    public KSUploader$KSUploaderSpeedTestListener mSpeedTestListener;
    public b mTokenResponse;
    public KSUploader$UploadInfo uploadInfo;
    public static final Type mCrcMapType;
    public static boolean mIsConsoleEnable;
    public static a mLibLoader;
    public static KSUploaderLogLevel mLogLevel;
    public static KSUploaderLogListener mLogListener;
    public static a mModelDownloader;

    static {
       KSUploader.mCrcMapType = new KSUploader$1().getType();
       KSUploader.mLibLoader = null;
       KSUploader.mModelDownloader = null;
       KSUploader.mLogLevel = KSUploaderLogLevel.KSUploaderLogLevel_Debug;
       KSUploader.mIsConsoleEnable = false;
    }
    public void KSUploader(Context p0,b p1){
       super();
       String str = null;
       this.mCachedFileKey = str;
       boolean b = false;
       this.mIsStarted = b;
       this.mFragmentCrcs = new HashMap();
       this.mRickonConfig = new KSUploader$RickonConfig();
       this.mLastReportedPercentage = 0;
       this.mFragUniqueId = b;
       this.uploadInfo = new KSUploader$UploadInfo();
       this.mLock = new Object();
       this.mTokenResponse = str;
       this.mNativeContext = 0;
       this.mNetAgent = p1;
       if (p0 != null) {
          SharedPreferences sharedPrefer = o.c(p0, "RickonInfo", b);
          this.mSharedPreference = sharedPrefer;
          this.mSharedEditor = sharedPrefer.edit();
          this.mNetworkManager = new KSNetworkManager(p0);
       }
       KSUploaderLogLevel kSUploaderLo = KSUploaderLogLevel.KSUploaderLogLevel_Warn;
       KSUploader.postLog(kSUploaderLo, "KSUploader try load ksuploaderjni");
       a dynamicLibLo = KSUploader.getDynamicLibLoader();
       if (dynamicLibLo != null) {
          KSUploader.postLog(kSUploaderLo, "KSUploader dynamic load lib ret "+dynamicLibLo.loadLibs());
       }else {
          KSUploader.postLog(kSUploaderLo, "KSUploader dynamic loader not set");
       }
       System.loadLibrary("ykit");
       System.loadLibrary("ksuploaderjni");
       if (KSUploader.mLogLevel != null) {
          KSUploader._setLogLevel(KSUploader.mLogLevel.ordinal(), KSUploader.mIsConsoleEnable);
          KSUploader.mLogLevel = str;
       }
       this.mNativeContext = this._init();
       if (p0 != null) {
          KSNetworkMonitor.initNetworkChangeReceiver(p0);
       }
       return;
    }
    public static native void _setLocalNetworkInfo(int p0,String p1);
    public static native void _setLogLevel(int p0,boolean p1);
    public static List getActiveNetworkInterfaces(){
       ArrayList obj = PatchProxy.apply(null, null, KSUploader.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new ArrayList();
          Iterator iterator = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
          while (iterator.hasNext()) {
             NetworkInterface networkInter = iterator.next();
             Iterator iterator1 = Collections.list(a.c(networkInter)).iterator();
             while (iterator1.hasNext()) {
                InetAddress inetAddress = iterator1.next();
                if (!inetAddress.isLoopbackAddress() && !(inetAddress.getHostAddress()).contains(":")) {
                   obj.add(new Pair(networkInter.getDisplayName(), inetAddress.getHostAddress()));
                }
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static synchronized a getDynamicLibLoader(){
       _monitor_enter(KSUploader.class);
       Object obj = PatchProxy.apply(null, null, KSUploader.class, "38");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KSUploader.class);
          return obj;
       }else if(KSUploader.mLibLoader == null){
          try{
             KSUploader.mLibLoader = DefaultDynamicLibLoader.class.newInstance();
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "get default lib loader: "+KSUploader.mLibLoader);
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
       }
    }
    public static synchronized KSUploaderLogListener getLogListener(){
       _monitor_enter(KSUploader.class);
       Object obj = PatchProxy.apply(null, null, KSUploader.class, "36");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KSUploader.class);
          return obj;
       }else if(KSUploader.mLogListener == null){
          try{
             KSUploader.mLogListener = DefaultUploaderLogListener.class.newInstance();
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "get default log listener: "+KSUploader.mLogListener);
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
       }
    }
    public static void networkChanged(int p0,String p1){
       KSUploader kSUploader = KSUploader.class;
       if (PatchProxy.isSupport(kSUploader) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, kSUploader, "3")) {
          return;
       }
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "networkChanged type "+p0+", ip "+p1);
       KSUploader._setLocalNetworkInfo(p0, p1);
       return;
    }
    public static void postLog(KSUploaderLogLevel p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSUploader.class, "34")) {
          return;
       }
       if (KSUploader.getLogListener() == null) {
          return;
       }
       KSUploader.getLogListener().onLog(p0, p1, (long)p1.length());
       return;
    }
    public static void postLogFromNative(int p0,String p1,long p2){
       if (PatchProxy.isSupport(KSUploader.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), null, KSUploader.class, "35")) {
          return;
       }
       if (KSUploader.getLogListener() == null) {
          return;
       }
       KSUploader.getLogListener().onLog(KSUploaderLogLevel.values()[p0], p1, p2);
       return;
    }
    public static synchronized void setDynamicLibLoader(a p0){
       _monitor_enter(KSUploader.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, KSUploader.class, "37")) {
          _monitor_exit(KSUploader.class);
          return;
       }else {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "KSUploader setDynamicLibLoader");
          KSUploader.mLibLoader = p0;
          _monitor_exit(KSUploader.class);
          return;
       }
    }
    public static void setLogLevel(KSUploaderLogLevel p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSUploader.class, "33")) {
          return;
       }
       KSUploader.setLogLevel(p0, false);
       return;
    }
    public static void setLogLevel(KSUploaderLogLevel p0,boolean p1){
       KSUploader.mLogLevel = p0;
       KSUploader.mIsConsoleEnable = p1;
    }
    public static void setLogListener(KSUploaderLogListener p0){
       KSUploader.mLogListener = p0;
    }
    public static void setModelDownloader(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSUploader.class, "39")) {
          return;
       }
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "KSUploader setModelDownloader");
       KSUploader.mModelDownloader = p0;
       return;
    }
    public native final boolean _bClosed(long p0);
    public native final int _bindSocket(long p0,long p1);
    public native final int _cancel(long p0);
    public native final int _closeReason(long p0);
    public native final int _finishStreamingUpload(long p0,String p1,int p2,byte[] p3);
    public native final int _getNetSpeed(long p0);
    public native final long _init();
    public native final int _markFragCanceled(long p0,String p1,int p2);
    public native final int _onFileFinished(long p0,String p1,long p2,int p3);
    public native final int _onFinished(long p0,byte[] p1);
    public native final void _release(long p0);
    public native final void _setConfig(long p0,String p1);
    public native final int _setEncryptConfig(long p0,String p1,KSEncryptConfig p2);
    public native final int _setFileIDs(long p0,String[] p1,boolean p2);
    public native final void _setModelPath(long p0,String p1,String p2);
    public native final void _setup(long p0,KSGateWayInfo[] p1,KSUploader$NicInfo[] p2);
    public native final boolean _speedTest(long p0);
    public native final int _startStreamingUpload(long p0,String p1,String p2,long p3,int p4,int p5,int p6,long p7);
    public native final int _startUploadFragment(long p0,String p1,String p2,int p3,int p4,long p5,long p6,long p7,byte[] p8,boolean p9,int p10);
    public native final int _updateStreamingUpload(long p0,String p1,long p2,int p3,boolean p4);
    public boolean bClosed(){
       KSUploader obj = PatchProxy.apply(null, this, KSUploader.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (!null - this.mNativeContext) {
          _monitor_exit(obj);
          return false;
       }else {
          _monitor_exit(obj);
          return this._bClosed(this.mNativeContext);
       }
    }
    public int bindSocket(long p0){
       KSUploader kSUploader = KSUploader.class;
       if (PatchProxy.isSupport(kSUploader)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, kSUploader, "12");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       kSUploader = this.mLock;
       _monitor_enter(kSUploader);
       if (!null - this.mNativeContext) {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "multiNic: bindSocket failed as mNativeContext=0");
          _monitor_exit(kSUploader);
          return 0;
       }else {
          _monitor_exit(kSUploader);
          return this._bindSocket(this.mNativeContext, p0);
       }
    }
    public int cancel(){
       KSUploader obj = PatchProxy.apply(null, this, KSUploader.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "KSUploader cancal called");
       obj = this.mLock;
       _monitor_enter(obj);
       if (!null - this.mNativeContext) {
          _monitor_exit(obj);
          return -1;
       }else {
          _monitor_exit(obj);
          return this._cancel(this.mNativeContext);
       }
    }
    public KSUploaderCloseReason closeReason(){
       KSUploader obj = PatchProxy.apply(null, this, KSUploader.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (!null - this.mNativeContext) {
          _monitor_exit(obj);
          return KSUploaderCloseReason.KSUploaderCloseReason_StoppedByUser;
       }else {
          _monitor_exit(obj);
          return KSUploaderCloseReason.valueOf(this._closeReason(this.mNativeContext));
       }
    }
    public final String crcMapKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSUploader.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "crc_"+p0;
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, KSUploader.class, "28")) {
          return;
       }
       super.finalize();
       if (this.mNativeContext > 0) {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "Delete native uploader in finalize, release\(\) was not called!");
          this.mEventListener = null;
          this._release(this.mNativeContext);
          this.mNativeContext = 0;
       }
       return;
    }
    public int finishFragmentInner(byte[] p0,long p1,int p2){
       int this;
       if (PatchProxy.isSupport(KSUploader.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, KSUploader.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       if (!i - this.mNativeContext) {
          return -1;
       }else if(!p1 - i){
          this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_InvalidFile, 0, null, this.uploadInfo.fileID, "finishFragmentInner: fileSize zero!");
          return -1;
       }else if(this.uploadInfo.fileID != null){
          this = this._onFileFinished(this.mNativeContext, this.uploadInfo.fileID, p1, p2);
       }else {
          this = -1;
       }
       if (this < 0) {
          return -1;
       }else {
          return this._onFinished(this.mNativeContext, p0);
       }
    }
    public int finishStreamingUploadInner(int p0,byte[] p1){
       KSUploader kSUploader = KSUploader.class;
       if (PatchProxy.isSupport(kSUploader)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, kSUploader, "22");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._finishStreamingUpload(this.mNativeContext, this.uploadInfo.fileID, p0, p1);
    }
    public int fragmentAndUpload(){
       KSUploader kSUploader1;
       int i;
       BufferedInputStream uBufferedInp;
       int i2;
       KSUploader$UploadInfo uploadInfo1;
       long l5;
       long l6;
       KSUploader kSUploader2;
       long l7;
       long l8;
       BufferedInputStream uBufferedInp1;
       KSUploader kSUploader = this;
       FileInputStream obj = PatchProxy.apply(null, kSUploader, KSUploader.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       try{
          obj = new FileInputStream(kSUploader.uploadInfo.filePath);
          try{
             uBufferedInp = new BufferedInputStream(obj);
             long l = 0;
             if (kSUploader.uploadInfo.startIndexSize - l > 0) {
                try{
                   KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "Resume upload directly as resumePosition given, index "+kSUploader.uploadInfo.startIndex+", position "+kSUploader.uploadInfo.startIndexSize);
                   KSUploader uploadInfo = kSUploader.uploadInfo;
                   KSUploader$UploadInfo startIndexSi = uploadInfo.startIndexSize;
                   i2 = (int)uploadInfo.startIndex;
                   uBufferedInp.skip(startIndexSi);
                   kSUploader.mRickonConfig.disableResumeCrcCheck = true;
                   uploadInfo1 = startIndexSi;
                }catch(java.io.IOException e0){
                }
                kSUploader1 = kSUploader;
                i = -1;
             }else {
                uploadInfo1 = l;
                i2 = 0;
             }
             try{
                while (true) {
                   if (uploadInfo1 - kSUploader.uploadInfo.getFileSize() < 0) {
                      try{
                         long l1 = uploadInfo1 + 0x100000;
                         long l2 = 1;
                         long l3 = Math.min(l1, kSUploader.uploadInfo.getFileSize()) - l2;
                         long l4 = (long)i2;
                         int i3 = -1;
                         if (l4 - kSUploader.uploadInfo.startIndex < 0) {
                            try{
                               if (kSUploader.mRickonConfig.disableResumeCrcCheck == null) {
                                  l5 = l3 - uploadInfo1;
                                  l5 = l5 + l2;
                                  l5 = KSUploaderUtils.getContinuousFileCRC32(uBufferedInp, l5);
                                  if (!kSUploader.mFragmentCrcs.containsKey(Integer.valueOf(i2)) || kSUploader.mFragmentCrcs.get(Integer.valueOf(i2)).longValue() - l5) {
                                     KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "Resume upload failed due to crc mismatch, reset startIndex "+kSUploader.uploadInfo.startIndex+" to 0");
                                     kSUploader.uploadInfo.startIndex = l;
                                  }
                               }else {
                                  l2 = l3 - uploadInfo1;
                                  l2 = l2 + 1;
                                  uBufferedInp.skip(l2);
                               label_00f5 :
                                  int i7 = i3;
                               }
                            }catch(java.io.IOException e0){
                            }
                         }else {
                            goto label_00f5 ;
                         }
                         try{
                            String str = ", size: ";
                            if (l4 - kSUploader.uploadInfo.startIndex >= 0) {
                               if (!i3 - l5) {
                                  l4 = l3 - uploadInfo1;
                                  l4 = l4 + 1;
                                  l6 = KSUploaderUtils.getContinuousFileCRC32(uBufferedInp, l4);
                               }else {
                                  l6 = l5;
                               }
                               try{
                                  l2 = l3 - uploadInfo1;
                                  l2 = l2 + 1;
                                  KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "Uploaded fragment seq: "+i2+str+l2);
                                  KSUploader$UploadInfo filePath = kSUploader.uploadInfo.filePath;
                                  byte[] uobyteArray = null;
                                  i3 = 0;
                                  kSUploader2 = this;
                                  int i4 = i2;
                                  KSUploader$UploadInfo uploadInfo2 = uploadInfo1;
                                  l7 = l1;
                                  l1 = l3;
                                  l8 = l;
                                  KSUploader$UploadInfo uploadInfo3 = uploadInfo1;
                                  uBufferedInp1 = uBufferedInp;
                                  long l9 = l6;
                                  i = -1;
                                  try{
                                     int i5 = i3;
                                     if (i == kSUploader2.startUploadFragmentInner(filePath, i4, 0, uploadInfo2, l1, uploadInfo3, uobyteArray, l9, i5)) {
                                        try{
                                           uBufferedInp1.close();
                                           break ;
                                        }catch(java.io.IOException e0){
                                           e0.printStackTrace();
                                        }
                                     }else {
                                        kSUploader1 = this;
                                     }
                                  }catch(java.io.IOException e0){
                                     kSUploader1 = this;
                                  }
                                  uBufferedInp = uBufferedInp1;
                               }catch(java.io.IOException e0){
                                  kSUploader1 = this;
                               }
                               this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_SDK_Failed, 0, null, kSUploader1.uploadInfo.fileID, "fragmentAndUpload: IOException "+e0.toString());
                               if (uBufferedInp) {
                                  try{
                                     uBufferedInp.close();
                                  }catch(java.io.IOException e0){
                                     e0.printStackTrace();
                                  }
                               }
                            }else {
                               l7 = l1;
                               l8 = l;
                               uBufferedInp1 = uBufferedInp;
                               kSUploader = -1;
                               l3 = l3 - uploadInfo1;
                               l2 = l3 + 1;
                               KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "Skip uploaded fragment seq: "+i2+str+l2);
                               int i6 = this;
                               kSUploader2 = i6.uploadInfo;
                               l5 = kSUploader2.skipedSize + l2;
                               kSUploader2.skipedSize = l5;
                            }
                            i2 = i2 + 1;
                            kSUploader1.uploadInfo.fragNum = i2;
                            kSUploader = kSUploader1;
                            uBufferedInp = uBufferedInp1;
                            uploadInfo1 = l7;
                            l = l8;
                         }catch(java.io.IOException e0){
                         }catch(java.io.IOException e0){
                            goto label_01b8 ;
                         }
                      }catch(java.io.IOException e0){
                         int i1 = uBufferedInp;
                         goto label_01d3 ;
                      }
                   }else {
                      uBufferedInp1 = uBufferedInp;
                      Object obj1 = kSUploader;
                      try{
                         uBufferedInp1.close();
                      }catch(java.io.IOException e0){
                         e0.printStackTrace();
                      }
                      return 0;
                   }
                }
                return i;
             }catch(java.io.IOException e0){
             }
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
          kSUploader1 = kSUploader;
          i = -1;
          uBufferedInp = null;
          goto label_01de ;
       }
    }
    public final Map getLocalNics(){
       int i1;
       HashMap obj = PatchProxy.apply(null, this, KSUploader.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (Build$VERSION.SDK_INT < 23) {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "multiNic: Will not call getLocalNics as model too old");
          return obj;
       }else {
          Iterator iterator = KSUploader.getActiveNetworkInterfaces().iterator();
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             KSUploader$NicInfo nicInfo = new KSUploader$NicInfo();
             nicInfo.ip = pair.second;
             Pair first = pair.first;
             KSUploaderLogLevel kSUploaderLo = KSUploaderLogLevel.KSUploaderLogLevel_Info;
             String str = ", ip: ";
             KSUploader.postLog(kSUploaderLo, "multiNic: dealing with network interface: "+first+str+pair.second);
             String str1 = ", fd: ";
             int i = 1;
             if (first != null && (first.contains("wlan") && KSNetworkManager.getWifiNetwork() != null)) {
                nicInfo.socketFd = this.bindSocket(KSNetworkManager.getWifiNetwork().getNetworkHandle());
                KSUploader.postLog(kSUploaderLo, "multiNic: wifi bind interface: "+first+str+pair.second+", netId: "+KSNetworkManager.getWifiNetwork().getNetworkHandle()+str1+nicInfo.socketFd);
                if (!obj.containsKey(Integer.valueOf(i))) {
                   obj.put(Integer.valueOf(i), new ArrayList());
                }
                obj.get(Integer.valueOf(i)).add(nicInfo);
             }else if(first != null && (first.contains("rmnet") || (first.contains("ccmni") && KSNetworkManager.getMobileNetwork() != null))){
                nicInfo.isCellular = i;
                nicInfo.socketFd = this.bindSocket(KSNetworkManager.getMobileNetwork().getNetworkHandle());
                KSUploader.postLog(kSUploaderLo, "multiNic: mobile bind interface: "+first+str+pair.second+", netId: "+KSNetworkManager.getMobileNetwork().getNetworkHandle()+str1+nicInfo.socketFd);
                i1 = 0;
                if (!obj.containsKey(Integer.valueOf(i1))) {
                   obj.put(Integer.valueOf(i1), new ArrayList());
                }
                obj.get(Integer.valueOf(i1)).add(nicInfo);
             }else if(first != null && (first.contains("eth") && KSNetworkManager.getEthernetNetwork() != null)){
                nicInfo.socketFd = this.bindSocket(KSNetworkManager.getEthernetNetwork().getNetworkHandle());
                KSUploader.postLog(kSUploaderLo, "multiNic: ethernet bind interface: "+first+str+pair.second+", netId: "+KSNetworkManager.getEthernetNetwork().getNetworkHandle()+str1+nicInfo.socketFd);
                i1 = 3;
                if (!obj.containsKey(Integer.valueOf(i1))) {
                   obj.put(Integer.valueOf(i1), new ArrayList());
                }
                obj.get(Integer.valueOf(i1)).add(nicInfo);
             }else {
                KSUploader.postLog(kSUploaderLo, "multiNic: unknown interface or network not available: "+first+str+pair.second);
             }
          }
          return obj;
       }
    }
    public int getNetSpeed(){
       KSUploader obj = PatchProxy.apply(null, this, KSUploader.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (!null - this.mNativeContext) {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "getNetSpeed failed as mNativeContext=0");
          _monitor_exit(obj);
          return 0;
       }else {
          _monitor_exit(obj);
          return this._getNetSpeed(this.mNativeContext);
       }
    }
    public abstract ProgressPercentage getProgressPercentageFromEvent(long p0,long p1,long p2,long p3);
    public boolean getResumeCrcMap(String p0){
       KSUploader obj = PatchProxy.applyOneRefs(p0, this, KSUploader.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.mFragmentCrcs = new HashMap();
       boolean b = false;
       if (this.uploadInfo.enableResume == null || (p0 != null && !p0.isEmpty())) {
          obj = this.mSharedPreference;
          if (obj != null && obj.contains(this.crcMapKey(p0))) {
             Map map = new Gson().i(this.mSharedPreference.getString(this.crcMapKey(p0), ""), KSUploader.mCrcMapType);
             this.mFragmentCrcs = map;
             if (map == null || map.isEmpty()) {
                this.mFragmentCrcs = new HashMap();
                KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Debug, "getResumeCrcMap taskId: "+p0+", not cached");
             }else {
                KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Debug, "getResumeCrcMap taskId: "+p0+" crcs size: "+this.mFragmentCrcs.size());
                return true;
             }
          }
       }
       return b;
    }
    public boolean getResumeInfo(String p0){
       KSUploader obj = PatchProxy.applyOneRefs(p0, this, KSUploader.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.mCachedFileKey = null;
       if (this.uploadInfo.enableResume == null || (p0 != null && !p0.isEmpty())) {
          obj = this.mSharedPreference;
          if (obj != null && obj.contains(p0)) {
             KSUploader$ResumeInfo resumeInfo = new Gson().h(this.mSharedPreference.getString(p0, ""), KSUploader$ResumeInfo.class);
             String str = "getResumeInfo taskId: ";
             if (resumeInfo != null) {
                KSUploader$ResumeInfo fileKey = resumeInfo.fileKey;
                if (fileKey != null && !fileKey.isEmpty()) {
                   KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Debug, str+p0+", key: "+resumeInfo.fileKey);
                   if (resumeInfo.expireTime - (System.currentTimeMillis() / 1000) > 0 && (resumeInfo.taskId).equals(this.uploadInfo.taskId)) {
                      this.mCachedFileKey = resumeInfo.fileKey;
                      this.getResumeCrcMap(p0);
                      return true;
                   }
                }
             }
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Debug, str+p0+", not cached");
          }
       }
    label_00ae :
       return false;
    }
    public long getSentDuration(){
       KSUploader tuploadInfo = this.uploadInfo;
       return (tuploadInfo.sentDuration + tuploadInfo.skipedDuration);
    }
    public long getSentSize(){
       KSUploader$UploadInfo totalSegment;
       KSUploader$UploadInfo overwrittenS;
       KSUploader tuploadInfo = this.uploadInfo;
       if (tuploadInfo.isStreaming != null) {
          totalSegment = tuploadInfo.totalSegmentSize;
          overwrittenS = tuploadInfo.overwrittenSize;
       }else {
          totalSegment = tuploadInfo.skipedSize + tuploadInfo.sentSize;
          overwrittenS = tuploadInfo.overwrittenSize;
       }
       return (totalSegment - overwrittenS);
    }
    public int markFragCanceled(int p0){
       KSUploader kSUploader = KSUploader.class;
       if (PatchProxy.isSupport(kSUploader)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kSUploader, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = -1;
       if (!null - this.mNativeContext) {
          return i;
       }else if(this.uploadInfo.fileID != null){
          i = this._markFragCanceled(this.mNativeContext, this.uploadInfo.fileID, p0);
       }
       return i;
    }
    public void onNativeComplete(long p0,long p1,String p2,String p3){
       KSUploader kSUploader = this;
       long l = p0;
       if (PatchProxy.isSupport(KSUploader.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), Long.valueOf(p1), p2, p3, this, KSUploader.class, "30")) {
          return;
       }
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "onNativeComplete, reason:"+l+", status:"+p1+", response:"+p2+", stats:"+p3+", sentSize:"+this.getSentSize());
       KSUploaderCloseReason kSUploaderCl = KSUploaderCloseReason.valueOf((int)l);
       if (kSUploaderCl == KSUploaderCloseReason.KSUploaderCloseReason_UploadSucceeded) {
          kSUploader.setResumeInfo(kSUploader.uploadInfo.taskId, null);
       }
       KSUploader mEventListen = kSUploader.mEventListener;
       if (mEventListen == null) {
          return;
       }else {
          mEventListen.onComplete(kSUploaderCl, p1, p2, p3, kSUploader.uploadInfo.fileID, this.getSentSize(), null);
          return;
       }
    }
    public void onNativeProgress(String p0,long p1,long p2,long p3,long p4){
       ProgressPercentage this;
       KSUploader kSUploader = this;
       KSUploader kSUploader1 = KSUploader.class;
       if (PatchProxy.isSupport(kSUploader1)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, kSUploader1, "29")) {
             return;
          }
       }
       KSUploader mEventListen = kSUploader.mEventListener;
       if (mEventListen == null) {
          return;
       }else {
          kSUploader1 = kSUploader.uploadInfo;
          if (kSUploader1 != null) {
             long l = p1;
             kSUploader1.sentSize = l;
             long l1 = p2;
             kSUploader1.sentDuration = l1;
             this = this.getProgressPercentageFromEvent(l, l1, p3, p4);
             if (Math.abs((kSUploader.mLastReportedPercentage - this.percent)) - 0x3f1a36e2eb1c432d > 0) {
                ProgressPercentage percent = this.percent;
                kSUploader.mLastReportedPercentage = percent;
                mEventListen.onProgress(percent, this.estimatedRemainingTimeMs);
             }
          }
          return;
       }
    }
    public void onNativeSpeedTestComplete(int p0,int p1,long p2){
       if (PatchProxy.isSupport(KSUploader.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Long.valueOf(p2), this, KSUploader.class, "31")) {
          return;
       }
       KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "onNativeSpeedTestComplete, speed "+p0);
       KSUploader tmSpeedTestL = this.mSpeedTestListener;
       if (tmSpeedTestL != null) {
          tmSpeedTestL.onSpeedTestComplete(p0, p1, p2);
       }
       return;
    }
    public int onUploadReady(){
       Object[] objArray = null;
       KSUploader obj = PatchProxy.apply(objArray, this, KSUploader.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mRickonConfig;
       int i = 1;
       if (obj.useMultihoming != null || obj.probeMultiNic != null) {
          Map localNics = this.getLocalNics();
          if (localNics.size() > i) {
             ArrayList uArrayList = new ArrayList();
             Integer[] integerArray = new Integer[]{Integer.valueOf(3),Integer.valueOf(i),Integer.valueOf(0)};
             Iterator iterator = Arrays.asList(integerArray).iterator();
             while (iterator.hasNext()) {
                int i1 = iterator.next().intValue();
                if (localNics.containsKey(Integer.valueOf(i1))) {
                   uArrayList.addAll(localNics.get(Integer.valueOf(i1)));
                }
             }
             if (!uArrayList.isEmpty()) {
                uArrayList.add(0, new KSUploader$NicInfo("::", 0, -1));
                KSUploader$NicInfo[] nicInfoArray = new KSUploader$NicInfo[uArrayList.size()];
                objArray = uArrayList.toArray(nicInfoArray);
                KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "multiNic: interface num "+localNics.size());
             }
          }else {
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "multiNic: interface not enough to open multiNic "+localNics.size());
          }
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (!null - this.mNativeContext) {
          _monitor_exit(obj);
          return -1;
       }else {
          this._setup(this.mNativeContext, this.mGatewayInfoArray, objArray);
          String[] stringArray = new String[i];
          stringArray[0] = this.uploadInfo.fileID;
          _monitor_exit(obj);
          return this._setFileIDs(this.mNativeContext, stringArray, this.mRickonConfig.stressTestMark);
       }
    }
    public void postUploadFailedAndRelease(KSUploaderCloseReason p0,long p1,String p2,String p3,String p4){
       KSUploader kSUploader = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p4;
       KSUploader kSUploader1 = KSUploader.class;
       if (PatchProxy.isSupport(kSUploader1)) {
          Object[] objArray = new Object[]{oobject,Long.valueOf(p1),oobject1,p3,oobject2};
          if (PatchProxy.applyVoid(objArray, this, kSUploader1, "32")) {
             return;
          }
       }
       if (kSUploader.mEventListener != null) {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "postUploadFailedAndRelease, reason:"+p0+", status:"+p1+", stats:"+oobject1+", sentSize:"+this.getSentSize()+", errMsg:"+oobject2);
          kSUploader1 = kSUploader.mEventListener;
          String str = (oobject1 == null)? "": oobject1;
          String str1 = (p3 == null)? "": p3;
          kSUploader1.onComplete(p0, p1, "", str, str1, this.getSentSize(), p4);
       }
       kSUploader.mEventListener = null;
       this.release();
       return;
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSUploader.class, "27")) {
          return;
       }
       KSUploaderLogLevel kSUploaderLo = KSUploaderLogLevel.KSUploaderLogLevel_Info;
       KSUploader.postLog(kSUploaderLo, "KSUploader release called");
       KSUploader tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (this.mNativeContext > 0) {
          this.mEventListener = objArray;
          this._release(this.mNativeContext);
          this.mNativeContext = 0;
       }
       _monitor_exit(tmLock);
       KSUploader.postLog(kSUploaderLo, "KSUploader release finished");
       return;
    }
    public b requestUploadInfo(String p0){
       KSUploaderLogLevel obj = PatchProxy.applyOneRefs(p0, this, KSUploader.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = KSUploaderLogLevel.KSUploaderLogLevel_Debug;
       KSUploader.postLog(obj, "requestUploadInfo of taskId: "+p0);
       if (this.getResumeInfo(p0)) {
          KSUploader.postLog(obj, "Start resume upload");
          this.mTokenResponse = this.mNetAgent.fetchResumeInfo(this.mCachedFileKey);
       }else {
          KSUploader.postLog(obj, "Start new upload");
          this.mTokenResponse = this.mNetAgent.fetchRickonToken();
       }
       KSUploader tmTokenRespo = this.mTokenResponse;
       if (tmTokenRespo != null) {
          b a = tmTokenRespo.a;
          if (a != null || this.mCachedFileKey != null) {
             KSUploader tuploadInfo = this.uploadInfo;
             if (a == null) {
                a = this.mCachedFileKey;
             }
             tuploadInfo.fileID = a;
             tuploadInfo.startIndex = (long)tmTokenRespo.b;
             tuploadInfo.startIndexSize = tmTokenRespo.c;
             tmTokenRespo = "Upload with token: "+this.uploadInfo.fileID+", is cached: ";
             KSUploader tmCachedFile = this.mCachedFileKey;
             int i = 0;
             boolean b = (tmCachedFile != null && tmCachedFile.equals(this.mTokenResponse.a))? true: false;
             KSUploader.postLog(obj, tmTokenRespo+b+", start index: "+this.uploadInfo.startIndex+", start size: "+this.uploadInfo.startIndexSize);
             KSGateWayInfo[] kSGateWayInf = new KSGateWayInfo[this.mTokenResponse.d.size()];
             this.mGatewayInfoArray = kSGateWayInf;
             for (; i < this.mTokenResponse.d.size(); i = i + 1) {
                KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Debug, "Gateway server ip: "+this.mTokenResponse.d.get(i).a+", port: "+this.mTokenResponse.d.get(i).b+", proto: "+this.mTokenResponse.d.get(i).c);
                kSGateWayInf[i] = new KSGateWayInfo(("TCP").equals(this.mTokenResponse.d.get(i).c), this.mTokenResponse.d.get(i).a, this.mTokenResponse.d.get(i).b);
             }
             return this.mTokenResponse;
          }
       }
       this.postUploadFailedAndRelease(KSUploaderCloseReason.KSUploaderCloseReason_SDK_APICall_Failed, 0, null, this.uploadInfo.fileID, "requestUploadInfo: invalid token response");
       return this.mTokenResponse;
    }
    public void setConfig(KSUploader$RickonConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploader.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       KSUploader tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (!null - this.mNativeContext) {
          _monitor_exit(tmLock);
          return;
       }else {
          this.mRickonConfig = p0;
          p0.setNativeConfig(p0.nativeConfig);
          if ((this.mRickonConfig.congestionControlType).equals("NNCC") && !(this.mRickonConfig.nnccModelPath).isEmpty()) {
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "setConfig with nnccModelPath "+this.mRickonConfig.nnccModelPath);
             System.loadLibrary("ykit");
             this._setModelPath(this.mNativeContext, this.mRickonConfig.nnccModelPath, "");
          }else if((this.mRickonConfig.congestionControlType).equals("DUGU") && !(this.mRickonConfig.duguModelPath).isEmpty()){
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "setConfig with duguModelPath "+this.mRickonConfig.duguModelPath);
             System.loadLibrary("ykit");
             this._setModelPath(this.mNativeContext, "", this.mRickonConfig.duguModelPath);
          }else if((this.mRickonConfig.congestionControlType).equals("NNCC") || ((this.mRickonConfig.congestionControlType).equals("DUGU") && KSUploader.mModelDownloader != null)){
             String str = KSUploader.mModelDownloader.a(this.mRickonConfig.congestionControlType);
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Info, "mModelDownloader get path "+str+" for cc "+this.mRickonConfig.congestionControlType);
             if (str != null && !str.isEmpty()) {
                System.loadLibrary("ykit");
                KSUploader$RickonConfig congestionCo = this.mRickonConfig.congestionControlType;
                int i = -1;
                int i1 = congestionCo.hashCode();
                if (i1 != 0x20313f) {
                   if (i1 == 0x24a220 && congestionCo.equals("NNCC")) {
                      i = 0;
                   }
                }else if(congestionCo.equals("DUGU")){
                   i = 1;
                }
                if (i) {
                   if (i == 1) {
                      this._setModelPath(this.mNativeContext, "", str);
                   }
                }else {
                   this._setModelPath(this.mNativeContext, str, "");
                }
             }
          }
          KSUploader tmRickonConf = this.mRickonConfig;
          if (tmRickonConf.useMultihoming != null || tmRickonConf.probeMultiNic != null) {
             this.mNetworkManager.prepareMultiNetwork();
          }
          this._setConfig(this.mNativeContext, this.mRickonConfig.nativeConfig);
          _monitor_exit(tmLock);
          return;
       }
    }
    public void setConfig(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSUploader.class, "2")) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          return;
       }
       KSUploader tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (!null - this.mNativeContext) {
          _monitor_exit(tmLock);
          return;
       }else {
          KSUploader$RickonConfig rickonConfig = new KSUploader$RickonConfig();
          rickonConfig.nativeConfig = p0;
          this.setConfig(rickonConfig);
          _monitor_exit(tmLock);
          return;
       }
    }
    public int setEncryptConfig(){
       Object obj = PatchProxy.apply(null, this, KSUploader.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = -1;
       if (!null - this.mNativeContext) {
          return i;
       }
       if (this.uploadInfo.fileID != null) {
          KSUploader tuploadInfo = this.uploadInfo;
          i = this._setEncryptConfig(this.mNativeContext, tuploadInfo.fileID, tuploadInfo.encryptConfig);
       }
       return i;
    }
    public void setEventListener(KSUploaderEventListener p0){
       KSUploader tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mEventListener = p0;
       _monitor_exit(tmLock);
    }
    public void setResumeCrcMap(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploader.class, "7")) {
          return;
       }
       if (this.uploadInfo.enableResume != null && (p0 == null || (!p0.isEmpty() && this.mSharedPreference != null))) {
          if (p1 == null || p1.isEmpty()) {
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Debug, "setResumeCrcMap remove cached of taskId: "+p0);
             this.mSharedEditor.remove(this.crcMapKey(p0));
             g.b(this.mSharedEditor);
          }else {
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Debug, "setResumeCrcMap taskId: "+p0+", crcs size:"+p1.size());
             this.mSharedEditor.putString(this.crcMapKey(p0), new Gson().r(p1, KSUploader.mCrcMapType));
             g.b(this.mSharedEditor);
          }
       }
       return;
    }
    public void setResumeInfo(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSUploader.class, "5")) {
          return;
       }
       if (this.uploadInfo.enableResume != null && (p0 == null || (!p0.isEmpty() && this.mSharedPreference != null))) {
          Map map = null;
          if (p1 == null || p1.isEmpty()) {
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Debug, "setResumeInfo remove cached of taskId: "+p0);
             this.mSharedEditor.remove(p0);
             g.b(this.mSharedEditor);
             this.setResumeCrcMap(p0, map);
          }else {
             KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Debug, "setResumeInfo taskId: "+p0+", key: "+p1);
             KSUploader$ResumeInfo resumeInfo = new KSUploader$ResumeInfo(this, map);
             resumeInfo.taskId = this.uploadInfo.taskId;
             resumeInfo.fileKey = p1;
             resumeInfo.expireTime = (System.currentTimeMillis() / 1000) + 0x15180;
             this.mSharedEditor.putString(p0, new Gson().q(resumeInfo));
             g.b(this.mSharedEditor);
          }
       }
       return;
    }
    public void setSpeedTestListener(KSUploader$KSUploaderSpeedTestListener p0){
       KSUploader tmLock = this.mLock;
       _monitor_enter(tmLock);
       this.mSpeedTestListener = p0;
       _monitor_exit(tmLock);
    }
    public boolean startSpeedTest(String p0){
       KSUploaderLogLevel obj = PatchProxy.applyOneRefs(p0, this, KSUploader.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KSUploaderLogLevel.KSUploaderLogLevel_Info;
       KSUploader.postLog(obj, "Try startSpeedTest, taskId: "+p0);
       this.uploadInfo.update("", p0, 0, 0);
       boolean b = false;
       if (this.requestUploadInfo(p0) == null) {
          return b;
       }
       KSUploader tmLock = this.mLock;
       _monitor_enter(tmLock);
       if (!null - this.mNativeContext) {
          KSUploader.postLog(KSUploaderLogLevel.KSUploaderLogLevel_Warn, "startSpeedTest failed as mNativeContext=0");
          _monitor_exit(tmLock);
          return b;
       }else {
          this._setup(this.mNativeContext, this.mGatewayInfoArray, null);
          KSUploader.postLog(obj, "startSpeedTest, taskId: "+p0+", ret: "+this._speedTest(this.mNativeContext));
          _monitor_exit(tmLock);
          return true;
       }
    }
    public int startStreamingUploadInner(String p0,String p1,long p2,int p3,int p4,int p5,long p6){
       KSUploader kSUploader = this;
       KSUploader kSUploader1 = KSUploader.class;
       if (PatchProxy.isSupport(kSUploader1)) {
          Object[] objArray = new Object[]{p0,p1,Long.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Long.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, this, kSUploader1, "20");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._startStreamingUpload(kSUploader.mNativeContext, kSUploader.uploadInfo.fileID, p1, p2, p3, p4, p5, p6);
    }
    public int startUploadFragmentInner(String p0,int p1,int p2,long p3,long p4,long p5,byte[] p6,long p7,boolean p8){
       a$a obj1;
       Object obj = this;
       object oobject = p6;
       KSUploader kSUploader = KSUploader.class;
       if (PatchProxy.isSupport(kSUploader)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = Long.valueOf(p4);
          objArray[5] = Long.valueOf(p5);
          objArray[6] = oobject;
          objArray[7] = Long.valueOf(p7);
          objArray[8] = Boolean.valueOf(p8);
          obj1 = PatchProxy.apply(objArray, obj, kSUploader, "17");
          if (obj1 != PatchProxyResult.class) {
             return obj1.intValue();
          }
       }
       int i = -1;
       if (!null - obj.mNativeContext) {
          return i;
       }else if(obj.uploadInfo.fileID != null && p0 != null){
          obj1 = new a$a();
          if (oobject != null) {
             obj1.b = oobject;
          }
          obj1.a = p7;
          obj.mFragmentCrcs.put(Integer.valueOf(p1), Long.valueOf(p7));
          obj.setResumeCrcMap(obj.uploadInfo.taskId, obj.mFragmentCrcs);
          byte[] uobyteArray = MessageNano.toByteArray(obj1);
          if (obj.uploadInfo.encryptConfig.cipher == null) {
             i = this._startUploadFragment(obj.mNativeContext, obj.uploadInfo.fileID, p0, p1, p2, p3, p4, p5, uobyteArray, p8, obj.mFragUniqueId);
          }else {
             i = this._startUploadFragment(obj.mNativeContext, obj.uploadInfo.fileID, p0, p1, p2, p3, p4, p5, null, p8, obj.mFragUniqueId);
          }
       }
       return i;
    }
    public int updateStreamingUploadInner(long p0,int p1,boolean p2){
       if (PatchProxy.isSupport(KSUploader.class)) {
          Object obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, KSUploader.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this._updateStreamingUpload(this.mNativeContext, this.uploadInfo.fileID, p0, p1, p2);
    }
}
