package com.kwai.performance.stability.app.exit.monitor.ApplicationExitInfoMirror;
import java.io.Serializable;
import android.app.ApplicationExitInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.util.HashMap;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Boolean;
import android.app.ActivityManager;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Throwable;
import yf7.h;

public class ApplicationExitInfoMirror implements Serializable	// class@001184
{
    public final String mCurrentPage;
    public final int mDefiningUid;
    public final String mDescription;
    public final int mImportance;
    public final boolean mIsLaunchFinished;
    public final boolean mIsLowMemoryKillReportSupported;
    public final String mPackageName;
    public final int mPackageUid;
    public final int mPid;
    public final String mProcessName;
    public final long mPss;
    public final int mRealUid;
    public final int mReason;
    public final long mRss;
    public final int mStatus;
    public final int mSubReason;
    public final long mTimestamp;
    public static final long serialVersionUID = 0xce4afbb7ccddc321;

    public void ApplicationExitInfoMirror(ApplicationExitInfo p0){
       int i;
       object oobject1;
       super();
       this.mPid = p0.getPid();
       this.mRealUid = p0.getRealUid();
       this.mPackageUid = p0.getPackageUid();
       this.mDefiningUid = p0.getDefiningUid();
       this.mProcessName = p0.getProcessName();
       this.mPackageName = ApplicationExitInfoMirror.callMethod(p0, "getPackageName");
       int reason = p0.getReason();
       this.mReason = reason;
       int status = p0.getStatus();
       boolean b = false;
       if (reason != 1 && reason != 2) {
          status = 0;
       }
       this.mStatus = status;
       try{
          reason = ApplicationExitInfoMirror.callMethod(p0, "getSubReason").intValue();
       }catch(java.lang.Exception e0){
          reason = 0;
       }
       this.mSubReason = reason;
       this.mImportance = p0.getImportance();
       this.mPss = p0.getPss();
       this.mRss = p0.getRss();
       this.mTimestamp = p0.getTimestamp();
       this.mDescription = p0.getDescription();
       byte[] uobyteArray = ApplicationExitInfoMirror.callMethod(p0, "getProcessStateSummary");
       HashMap hashMap = new HashMap();
       if (uobyteArray != null) {
          String[] stringArray = (new String(uobyteArray)).split("[<>]");
          if (stringArray != null) {
             status = 0;
             while (status < stringArray.length) {
                object oobject = stringArray[status];
                status = status + 1;
                if (TextUtils.isEmpty(oobject)) {
                   continue ;
                }else if(status < stringArray.length){
                   i = status + 1;
                   oobject1 = stringArray[status];
                }else {
                   i = status;
                   oobject1 = "";
                }
                hashMap.put(oobject, oobject1);
                status = i;
             }
          }
       }
       String str = hashMap.get("launchFinished");
       if (str != null && str.equals(Boolean.TRUE.toString())) {
          b = true;
       }
       this.mIsLaunchFinished = b;
       str = hashMap.get("page");
       if (TextUtils.isEmpty(str)) {
          str = "UNKNOWN";
       }
       this.mCurrentPage = str;
       this.mIsLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
       return;
    }
    public static String a(String p0,String p1){
       return "<"+p0+">"+p1;
    }
    public static Object callMethod(Object p0,String p1){
       Class[] uClassArray = new Class[0];
       Object[] objArray = new Object[0];
       return p0.getClass().getMethod(p1, uClassArray).invoke(p0, objArray);
    }
    public static byte[] encodeProcessState(boolean p0,String p1){
       StringBuilder str = ApplicationExitInfoMirror.a("launchFinished", String.valueOf(p0));
       if (TextUtils.isEmpty(p1)) {
          p1 = "UNKNOWN";
       }
       str = str+ApplicationExitInfoMirror.a("page", p1);
       if (str.length() > 128) {
          str.delete(128, str.length());
       }
       return (str).getBytes();
    }
    public String getCurrentPage(){
       return this.mCurrentPage;
    }
    public int getDefiningUid(){
       return this.mDefiningUid;
    }
    public String getDescription(){
       return this.mDescription;
    }
    public int getImportance(){
       return this.mImportance;
    }
    public boolean getIsLaunchFinished(){
       return this.mIsLaunchFinished;
    }
    public boolean getLowMemoryKillReportSupported(){
       return this.mIsLowMemoryKillReportSupported;
    }
    public String getPackageName(){
       return this.mPackageName;
    }
    public int getPackageUid(){
       return this.mPackageUid;
    }
    public int getPid(){
       return this.mPid;
    }
    public String getProcessName(){
       return this.mProcessName;
    }
    public long getPss(){
       return this.mPss;
    }
    public int getRealUid(){
       return this.mRealUid;
    }
    public int getReason(){
       return this.mReason;
    }
    public long getRss(){
       return this.mRss;
    }
    public int getStatus(){
       return this.mStatus;
    }
    public int getSubReason(){
       return this.mSubReason;
    }
    public long getTimestamp(){
       return this.mTimestamp;
    }
}
