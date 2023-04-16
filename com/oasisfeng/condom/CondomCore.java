package com.oasisfeng.condom.CondomCore;
import com.oasisfeng.condom.CondomCore$4;
import com.oasisfeng.condom.CondomCore$5;
import android.content.Context;
import com.oasisfeng.condom.CondomOptions;
import java.lang.String;
import java.lang.Object;
import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;
import com.oasisfeng.condom.CondomCore$2;
import com.oasisfeng.condom.CondomCore$3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.oasisfeng.condom.CondomCore$CondomKitManager;
import java.util.Iterator;
import com.oasisfeng.condom.CondomKit;
import com.oasisfeng.condom.CondomKit$CondomKitRegistry;
import java.lang.StringBuilder;
import java.lang.Thread;
import java.lang.StackTraceElement;
import android.content.Intent;
import android.content.ComponentName;
import com.oasisfeng.condom.OutboundType;
import android.content.pm.ResolveInfo;
import android.os.Process;
import android.content.pm.ServiceInfo;
import com.oasisfeng.condom.OutboundJudge;
import com.oasisfeng.condom.CondomCore$BackgroundUidFilter;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.ActivityManager$RunningServiceInfo;
import com.oasisfeng.condom.CondomCore$CondomEvent;
import android.content.ContentResolver;
import com.oasisfeng.condom.util.Lazy;
import android.content.pm.PackageManager;
import java.util.Set;
import java.util.Collections;
import java.util.Map;
import com.oasisfeng.condom.CondomKit$SystemServiceSupplier;
import java.lang.System;
import java.lang.Enum;
import android.util.EventLog;
import java.util.Arrays;
import java.lang.Throwable;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedureThrows;
import com.oasisfeng.condom.CondomCore$WrappedValueProcedure;
import android.content.BroadcastReceiver;
import java.lang.Boolean;
import com.oasisfeng.condom.CondomCore$ReceiverRestrictedContext;
import com.oasisfeng.condom.CondomCore$Function;
import com.oasisfeng.condom.CondomCore$1;
import android.content.pm.ProviderInfo;

public class CondomCore	// class@000a7b
{
    public final boolean DEBUG;
    public final Context mBase;
    public final Lazy mContentResolver;
    public boolean mDryRun;
    public boolean mExcludeBackgroundReceivers;
    public boolean mExcludeBackgroundServices;
    public boolean mExcludeStoppedPackages;
    public final CondomCore$CondomKitManager mKitManager;
    public OutboundJudge mOutboundJudge;
    public final Lazy mPackageManager;
    public static final int EVENT_TAG = 0;
    public static final int FLAG_RECEIVER_EXCLUDE_BACKGROUND = 8388608;
    public static final CondomCore$Function RECEIVER_PACKAGE_GETTER;
    public static final CondomCore$Function SERVICE_PACKAGE_GETTER;

    static {
       CondomCore.SERVICE_PACKAGE_GETTER = new CondomCore$4();
       CondomCore.RECEIVER_PACKAGE_GETTER = new CondomCore$5();
       CondomCore.EVENT_TAG = 0x78a468a0;
    }
    public void CondomCore(Context p0,CondomOptions p1,String p2){
       super();
       boolean b = true;
       this.mExcludeStoppedPackages = b;
       this.mBase = p0;
       boolean b1 = (p0.getApplicationInfo().flags & 0x02)? true: false;
       this.DEBUG = b1;
       this.mExcludeBackgroundReceivers = p1.mExcludeBackgroundReceivers;
       if (Build$VERSION.SDK_INT >= 26 || p1.mExcludeBackgroundServices == null) {
          b = false;
       }
       this.mExcludeBackgroundServices = b;
       this.mOutboundJudge = p1.mOutboundJudge;
       this.mDryRun = p1.mDryRun;
       this.mPackageManager = new CondomCore$2(this, p0, p2);
       this.mContentResolver = new CondomCore$3(this, p0);
       CondomCore uCondomCore = null;
       List list = (p1.mKits == null)? uCondomCore: new ArrayList(p1.mKits);
       if (list != null && !list.isEmpty()) {
          this.mKitManager = new CondomCore$CondomKitManager();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(this.mKitManager);
          }
       }else {
          this.mKitManager = uCondomCore;
       }
       return;
    }
    public static String asLogTag(String p0){
       if (p0.length() > 23) {
          p0 = p0.substring(0, 23);
       }
       return p0;
    }
    public static String buildLogTag(String p0,String p1,String p2){
       if (p2 != null && !p2.isEmpty()) {
          p0 = CondomCore.asLogTag(p1+p2);
       }
       return p0;
    }
    public static String getCaller(){
       StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
       int i = 5;
       if (stackTrace.length <= i) {
          return "<bottom>";
       }
       object oobject = stackTrace[i];
       return oobject.getClassName()+"."+oobject.getMethodName()+":"+oobject.getLineNumber();
    }
    public static String getTargetPackage(Intent p0){
       ComponentName component = p0.getComponent();
       String packageName = (component != null)? component.getPackageName(): p0.getPackage();
       return packageName;
    }
    public final int adjustIntentFlags(OutboundType p0,Intent p1){
       int flags = p1.getFlags();
       if (this.mDryRun != null) {
          return flags;
       }
       if (this.mExcludeBackgroundReceivers != null && (p0 == OutboundType.BROADCAST || p0 == OutboundType.QUERY_RECEIVERS)) {
          int i = (Build$VERSION.SDK_INT >= 24)? Float.MIN_NORMAL: 0x40000000;
          p1.addFlags(i);
       }
       if (this.mExcludeStoppedPackages != null) {
          p1.setFlags(((p1.getFlags() & 0xdf) | 0x10));
       }
       return flags;
    }
    public ResolveInfo filterCandidates(OutboundType p0,Intent p1,List p2,String p3,boolean p4){
       int i2;
       ResolveInfo resolveInfo2;
       Iterator iterator1;
       CondomCore uCondomCore = this;
       if (p2 != null && !p2.isEmpty()) {
          int i = Process.myUid();
          Iterator iterator = p2.iterator();
          ResolveInfo resolveInfo = null;
          while (iterator.hasNext()) {
             ResolveInfo resolveInfo1 = iterator.next();
             ServiceInfo applicationI = resolveInfo1.serviceInfo.applicationInfo;
             ApplicationInfo uid = applicationI.uid;
             int i1 = 1;
             if (uid == i) {
                i2 = p1;
             }else {
                CondomCore mOutboundJud = uCondomCore.mOutboundJudge;
                if (mOutboundJud != null) {
                   if (!mOutboundJud.shouldAllow(p0, p1, applicationI.packageName)) {
                   label_0043 :
                      resolveInfo2 = null;
                   label_0099 :
                      if (resolveInfo2 == null) {
                         String[] stringArray = new String[2];
                         stringArray[0] = applicationI.packageName;
                         stringArray[i1] = p1.toString();
                         uCondomCore.log(p3, CondomCore$CondomEvent.FILTER_BG_SERVICE, stringArray);
                      }else {
                         int i3 = p3;
                      }
                      if (uCondomCore.mDryRun != null) {
                         return resolveInfo1;
                      }else if(p4){
                         if (resolveInfo2 == null) {
                            iterator.remove();
                         }else {
                            continue ;
                         }
                      }else if(resolveInfo2 != null){
                         return resolveInfo2;
                      }else {
                         continue ;
                      }
                   }
                }else {
                   i2 = p1;
                }
                if (uCondomCore.mExcludeBackgroundServices != null) {
                   if (resolveInfo == null) {
                      resolveInfo = new CondomCore$BackgroundUidFilter(uCondomCore);
                   }
                   CondomCore$BackgroundUidFilter b = resolveInfo.b;
                   if (b != null) {
                      iterator1 = b.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            ActivityManager$RunningAppProcessInfo runningAppPr = iterator1.next();
                            if (runningAppPr.pid != null && (runningAppPr.importance < 400 && runningAppPr.uid == uid)) {
                            label_0093 :
                               resolveInfo2 = 1;
                            }
                         }
                      }
                   }else {
                      b = resolveInfo.a;
                      if (b != null) {
                         iterator1 = b.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               ActivityManager$RunningServiceInfo runningServi = iterator1.next();
                               if (runningServi.pid != null && runningServi.uid == uid) {
                                  goto label_0093 ;
                               }else {
                                  continue ;
                               }
                            }
                         }
                         if (!resolveInfo2) {
                         }
                      }
                   }
                   resolveInfo2 = null;
                   goto label_0096 ;
                }
             }
             resolveInfo2 = resolveInfo1;
             goto label_0099 ;
          }
       }
       return null;
    }
    public ContentResolver getContentResolver(){
       return this.mContentResolver.get();
    }
    public PackageManager getPackageManager(){
       return this.mPackageManager.get();
    }
    public String getPackageName(){
       return this.mBase.getPackageName();
    }
    public Set getSpoofPermissions(){
       CondomCore tmKitManager = this.mKitManager;
       CondomCore$CondomKitManager b = (tmKitManager != null)? tmKitManager.b: Collections.emptySet();
       return b;
    }
    public Object getSystemService(String p0){
       CondomCore tmKitManager = this.mKitManager;
       if (tmKitManager != null) {
          CondomKit$SystemServiceSupplier systemServic = tmKitManager.a.get(p0);
          if (systemServic != null) {
             p0 = systemServic.b(this.mBase, p0);
             if (p0 != null) {
                return p0;
             }
          }
       }
       return null;
    }
    public final void log(String p0,CondomCore$CondomEvent p1,String[] p2){
       Object[] objArray = new Object[(p2.length + 2)];
       objArray[0] = this.mBase.getPackageName();
       objArray[1] = p0;
       System.arraycopy(p2, 0, objArray, 2, p2.length);
       EventLog.writeEvent((CondomCore.EVENT_TAG + p1.ordinal()), objArray);
       if (this.DEBUG != null) {
          CondomCore.asLogTag(p0);
          p1.name();
          Arrays.toString(p2);
       }
       return;
    }
    public void logConcern(String p0,String p1){
       Object[] objArray = new Object[]{this.mBase.getPackageName(),p0,p1,CondomCore.getCaller()};
       EventLog.writeEvent((CondomCore.EVENT_TAG + CondomCore$CondomEvent.CONCERN.ordinal()), objArray);
       if (this.DEBUG != null) {
          CondomCore.asLogTag(p0);
          Throwable throwable = new Throwable();
       }
       return;
    }
    public void logIfOutboundPass(String p0,Intent p1,String p2,CondomCore$CondomEvent p3){
       if (p2 != null && !(this.mBase.getPackageName()).equals(p2)) {
          String[] stringArray = new String[]{p2,p1.toString()};
          this.log(p0, p3, stringArray);
       }
       return;
    }
    public Object proceed(OutboundType p0,Intent p1,Object p2,CondomCore$WrappedValueProcedureThrows p3){
       String tarPackage = (p1 != null)? CondomCore.getTargetPackage(p1): null;
       if (tarPackage != null) {
          if ((this.mBase.getPackageName()).equals(tarPackage)) {
             return p3.a();
          }else if(this.shouldBlockRequestTarget(p0, p1, tarPackage)){
             return p2;
          }
       }
       int i = (p1 != null)? this.adjustIntentFlags(p0, p1): 0;
       p2 = p3.a();
       if (p1 != null) {
          p1.setFlags(i);
       }
       return p2;
    }
    public Object proceed(OutboundType p0,String p1,Object p2,CondomCore$WrappedValueProcedureThrows p3){
       if ((this.mBase.getPackageName()).equals(p1)) {
          return p3.a();
       }
       if (this.shouldBlockRequestTarget(p0, null, p1)) {
          return p2;
       }
       return p3.a();
    }
    public void proceedBroadcast(Context p0,Intent p1,CondomCore$WrappedValueProcedure p2,BroadcastReceiver p3){
       Boolean fALSE = Boolean.FALSE;
       if (this.proceed(OutboundType.BROADCAST, p1, fALSE, p2) == fALSE && p3 != null) {
          p3.onReceive(new CondomCore$ReceiverRestrictedContext(this, p0), p1);
       }
       return;
    }
    public List proceedQuery(OutboundType p0,Intent p1,CondomCore$WrappedValueProcedureThrows p2,CondomCore$Function p3){
       CondomCore$1 u1 = new CondomCore$1(this, p2, p1, p3, p0);
       return this.proceed(p0, p1, Collections.emptyList(), v7);
    }
    public boolean shouldAllowProvider(Context p0,String p1,int p2){
       return this.shouldAllowProvider(p0.getPackageManager().resolveContentProvider(p1, p2));
    }
    public boolean shouldAllowProvider(ProviderInfo p0){
       if (p0 == null) {
          return true;
       }
       if ((this.mBase.getPackageName()).equals(p0.packageName)) {
          return true;
       }
       if (this.shouldBlockRequestTarget(OutboundType.CONTENT, null, p0.packageName)) {
          return false;
       }
       if (("settings").equals(p0.authority)) {
          return true;
       }
       if (this.mExcludeStoppedPackages != null && (p0.applicationInfo.flags & 0x200001) == 0x200000) {
          return this.mDryRun;
       }
       return true;
    }
    public boolean shouldBlockRequestTarget(OutboundType p0,Intent p1,String p2){
       CondomCore tmOutboundJu = this.mOutboundJudge;
       boolean b = (tmOutboundJu != null && (!tmOutboundJu.shouldAllow(p0, p1, p2) && this.mDryRun == null))? true: false;
       return b;
    }
    public boolean shouldSpoofPermission(String p0){
       CondomCore tmKitManager = this.mKitManager;
       boolean b = (tmKitManager != null && tmKitManager.b.contains(p0))? true: false;
       return b;
    }
}
