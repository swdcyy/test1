package com.kuaishou.krn.log.model.KrnLogCommonParams;
import fk0.a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import lk0.l;
import com.kuaishou.krn.load.JsRuntimeState;
import java.lang.Enum;
import com.kuaishou.krn.model.BundleType;
import com.kuaishou.krn.experiment.ExpConfigKt;
import java.lang.Integer;
import com.kuaishou.krn.experiment.KdsSharedRuntimeBundleGroupKt;
import java.lang.Boolean;
import lj0.c;
import ou6.c;
import com.kwai.robust.PatchProxyResult;
import sj0.b;
import iu6.a;
import java.lang.Long;
import xj0.c;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import ik0.m;
import com.kuaishou.krn.delegate.KrnDelegate;
import java.lang.Number;
import com.kuaishou.krn.model.LaunchModel;
import android.os.Bundle;
import java.lang.Exception;
import com.facebook.react.a;
import com.kwai.kxb.storage.clean.KxbDiskManager;

public class KrnLogCommonParams	// class@0008e0
{
    public Boolean isT1Completed;
    public final String mBundleId;
    public String mBundleList;
    public final int mBundlePreloaded;
    public final int mBundleType;
    public final String mBundleVersion;
    public final int mBundleVersionCode;
    public Integer mClickRetryTimes;
    public final String mComponentName;
    public String mContainerSource;
    public String mDegradeUrl;
    public Boolean mEnableSharedRuntime;
    public Integer mEngineUseCount;
    public final String mError;
    public String mEvent;
    public Integer mGroupId;
    public Boolean mHasFirstPreloadEnd;
    public Boolean mHasFirstPreloadStart;
    public boolean mIsPluginDownloaded;
    public boolean mIsPluginInstalled;
    public String mJsExecutor;
    public String mJsFramework;
    public Long mJsFrameworkTaskId;
    public String mJsFrameworkVersion;
    public Integer mJsFrameworkVersionCode;
    public final int mJsRuntimeStarted;
    public int mLowDiskState;
    public Integer mMaxGroupId;
    public String mPushId;
    public int mResult;
    public Integer mRetryTimes;
    public final String mRnVersion;
    public String mScheme;
    public final int mSdkVersion;
    public String mSessionId;
    public Boolean mSharingEngine;
    public final long mTaskId;
    public Integer mV8PluginType;
    public Double sampleRatio;

    public void KrnLogCommonParams(a p0,String p1,int p2,u p3){
       a.p(p0, "bundleMeta");
       super();
       this.mSdkVersion = l.b();
       p1 = l.a();
       a.o(p1, "VersionUtils.getRNVersion\(\)");
       this.mRnVersion = p1;
       this.mJsExecutor = "";
       this.mIsPluginInstalled = true;
       this.mIsPluginDownloaded = true;
       this.mLowDiskState = this.b();
       this.mBundleId = p0.bundleId;
       this.mComponentName = null;
       this.mBundleVersion = p0.version;
       this.mBundleVersionCode = p0.versionCode;
       this.mTaskId = p0.taskId;
       this.mJsRuntimeStarted = JsRuntimeState.NOT_START.ordinal();
       this.mBundleType = BundleType.DOWNLOADING.ordinal();
       this.mBundlePreloaded = 0;
       this.mResult = 1;
       this.mError = null;
       this.mMaxGroupId = Integer.valueOf(ExpConfigKt.n());
       this.mEnableSharedRuntime = Boolean.valueOf(KdsSharedRuntimeBundleGroupKt.b());
    }
    public void KrnLogCommonParams(c p0,String p1){
       long l;
       a uoa;
       Object[] objArray1;
       Object[] objArray2;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       this.mSdkVersion = l.b();
       String str = l.a();
       a.o(str, "VersionUtils.getRNVersion\(\)");
       this.mRnVersion = str;
       this.mJsExecutor = "";
       boolean b = true;
       this.mIsPluginInstalled = b;
       this.mIsPluginDownloaded = b;
       this.mLowDiskState = this.b();
       Object[] objArray = null;
       String str1 = (p0 != null)? p0.b(): objArray;
       this.mBundleId = str1;
       str1 = (p0 != null)? p0.f(): objArray;
       this.mComponentName = str1;
       str1 = (p0 != null)? p0.d(): objArray;
       this.mBundleVersion = str1;
       int i = (p0 != null)? p0.e(): 0;
       this.mBundleVersionCode = i;
       l = (p0 != null)? (long)p0.v(): -1;
       this.mTaskId = l;
       c k = (p0 != null)? p0.k: JsRuntimeState.NOT_START.ordinal();
       this.mJsRuntimeStarted = k;
       if (p0 != null) {
          k = p0.l;
          if (k != null) {
          label_0073 :
             this.mBundleType = k.ordinal();
             i = (p0 != null && p0.w() == b)? 1: 0;
             this.mBundlePreloaded = i;
             String str2 = (p0 != null)? p0.t(): objArray;
             this.mSessionId = str2;
             if (p0 != null) {
                b uob = p0.i();
                if (uob != null) {
                   uoa = uob.c();
                label_009e :
                   String str3 = (uoa != null)? uoa.i(): objArray;
                   this.mJsFrameworkVersion = str3;
                   Integer integer = (uoa != null)? Integer.valueOf(uoa.h()): objArray;
                   this.mJsFrameworkVersionCode = integer;
                   Long longx = (uoa != null)? Long.valueOf(uoa.g()): objArray;
                   this.mJsFrameworkTaskId = longx;
                   this.mJsExecutor = c.a(p0);
                   if (p1 != null) {
                      b = 0;
                   }
                   this.mResult = b;
                   this.mError = p1;
                   c e = c.e;
                   Objects.requireNonNull(e);
                   Object obj = PatchProxy.apply(objArray, e, uoc, "1");
                   b = (obj != patchProxyRe)? obj.booleanValue(): c.a.get();
                   this.mHasFirstPreloadStart = Boolean.valueOf(b);
                   Objects.requireNonNull(e);
                   e = PatchProxy.apply(objArray, e, uoc, "2");
                   int b1 = (e != patchProxyRe)? e.booleanValue(): c.b.get();
                   this.mHasFirstPreloadEnd = Boolean.valueOf(b1);
                   if (p0 != null) {
                      m om = p0.l();
                      if (om != null) {
                         KrnDelegate krnDelegate = om.getKrnDelegate();
                         if (krnDelegate != null) {
                            Integer integer1 = Integer.valueOf(krnDelegate.d());
                         label_0128 :
                            this.mRetryTimes = integer1;
                            if (p0 != null) {
                               om = p0.l();
                               if (om != null) {
                                  krnDelegate = om.getKrnDelegate();
                                  if (krnDelegate != null) {
                                     KrnDelegate obj1 = PatchProxy.apply(objArray, krnDelegate, KrnDelegate.class, "44");
                                     if (obj1 != patchProxyRe) {
                                        b1 = obj1.intValue();
                                     }else {
                                        obj1 = krnDelegate.d;
                                        Objects.requireNonNull(obj1);
                                        obj = PatchProxy.apply(objArray, obj1, LaunchModel.class, "5");
                                        int i1 = (obj != patchProxyRe)? obj.intValue(): obj1.d.getInt("krnClickRetryTimes");
                                     }
                                     integer1 = Integer.valueOf(b1);
                                  label_0178 :
                                     this.mClickRetryTimes = integer1;
                                     if (p0 != null) {
                                        b uob1 = p0.i();
                                        if (uob1 != null) {
                                           a uoa1 = uob1.i();
                                           if (uoa1 != null) {
                                              integer1 = Integer.valueOf(uoa1.p());
                                           label_0192 :
                                              this.mGroupId = integer1;
                                              this.mMaxGroupId = Integer.valueOf(ExpConfigKt.n());
                                              this.mEnableSharedRuntime = Boolean.valueOf(KdsSharedRuntimeBundleGroupKt.b());
                                              if (p0 != null) {
                                                 LaunchModel launchModel = p0.m();
                                                 if (launchModel != null) {
                                                    Bundle uBundle = launchModel.g();
                                                    if (uBundle != null) {
                                                       objArray = uBundle.getString("krnUri");
                                                    }
                                                 }
                                              }
                                              this.mScheme = objArray;
                                              return;
                                           }
                                        }
                                     }
                                     objArray1 = objArray;
                                     goto label_0192 ;
                                  }
                               }
                            }
                            objArray1 = objArray;
                            goto label_0178 ;
                         }
                      }
                   }
                   objArray1 = objArray;
                   goto label_0128 ;
                }
             }
             uoa = objArray;
             goto label_009e ;
          }
       }
       BundleType iNTERNAL = BundleType.INTERNAL;
       goto label_0073 ;
    }
    public void KrnLogCommonParams(c p0,String p1,int p2,u p3){
       super(p0, null);
    }
    public final String a(){
       return this.mBundleId;
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, KrnLogCommonParams.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return KxbDiskManager.c.e();
    }
    public final void c(boolean p0){
       this.mIsPluginDownloaded = p0;
    }
    public final void d(boolean p0){
       this.mIsPluginInstalled = p0;
    }
    public final void e(int p0){
       this.mResult = p0;
    }
    public final void f(boolean p0){
       KrnLogCommonParams krnLogCommon = KrnLogCommonParams.class;
       if (PatchProxy.isSupport(krnLogCommon) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, krnLogCommon, "1")) {
          return;
       }
       this.mSharingEngine = Boolean.valueOf(p0);
       return;
    }
    public final void g(Boolean p0){
       this.isT1Completed = p0;
    }
}
