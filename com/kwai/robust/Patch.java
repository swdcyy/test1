package com.kwai.robust.Patch;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchFile;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.robust.Patch$a;
import android.content.Context;
import java.lang.ClassLoader;
import java.io.File;
import android.content.pm.ApplicationInfo;
import com.kwai.robust.Robust;
import dalvik.system.DexClassLoader;
import android.os.Build;
import android.os.Build$VERSION;
import com.kwai.robust.Reflect;
import java.lang.Class;
import om7.c;
import om7.b;
import om7.a;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.AssertionError;

public class Patch	// class@0013f5
{
    public final String mApplyTime;
    public ClassLoader mClassLoader;
    public final Object mClassLoaderLock;
    public final Object mExtra;
    public final String mFeatureName;
    public final String mFeatureVersion;
    public final String mId;
    public final String mImplClassName;
    public boolean mIsApplied;
    public final String mLocalPath;
    public final String mMd5;
    public final String mNativeInstallPath;
    public final String mRobustId;
    public static final boolean $assertionsDisabled = false;
    public static final String TAG;

    public void Patch(String p0,String p1,Object p2,String p3,String p4){
       super();
       this.mIsApplied = false;
       this.mClassLoaderLock = new Object();
       this.mLocalPath = p0;
       PatchFile orCreate = PatchFile.getOrCreate(p0);
       this.mImplClassName = orCreate.getPatchInfoClassname();
       this.mId = orCreate.getPatchId();
       this.mMd5 = p1;
       this.mRobustId = orCreate.getRobustId();
       this.mExtra = p2;
       this.mNativeInstallPath = p3;
       if (!TextUtils.isEmpty(p4)) {
       }else {
          p4 = "Realtime";
       }
       this.mApplyTime = p4;
       this.mFeatureName = orCreate.getFeatureName();
       this.mFeatureVersion = orCreate.getFeatureVersion();
       this.verify();
       return;
    }
    public void Patch(String p0,String p1,String p2,String p3,String p4,Object p5,String p6,String p7,String p8,String p9){
       super();
       this.mIsApplied = false;
       this.mClassLoaderLock = new Object();
       this.mImplClassName = p0;
       this.mId = p1;
       this.mRobustId = p4;
       this.mMd5 = p3;
       this.mLocalPath = p2;
       this.mExtra = p5;
       this.mNativeInstallPath = p6;
       if (!TextUtils.isEmpty(p7)) {
       }else {
          p7 = "Realtime";
       }
       this.mApplyTime = p7;
       this.mFeatureName = p8;
       this.mFeatureVersion = p9;
       this.verify();
       return;
    }
    public void Patch(String p0,String p1,String p2,String p3,String p4,Object p5,String p6,String p7,String p8,String p9,Patch$a p10){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }
    public String getApplyTime(){
       return this.mApplyTime;
    }
    public ClassLoader getClassLoader(Context p0){
       this.loadClassClassLoaderIfNeed(p0);
       return this.mClassLoader;
    }
    public Object getExtra(){
       return this.mExtra;
    }
    public String getFeatureName(){
       return this.mFeatureName;
    }
    public String getId(){
       return this.mId;
    }
    public String getImplClassName(){
       return this.mImplClassName;
    }
    public String getLocalPath(){
       return this.mLocalPath;
    }
    public String getMd5(){
       return this.mMd5;
    }
    public String getNativePath(){
       return this.mNativeInstallPath;
    }
    public String getRobustId(){
       return this.mRobustId;
    }
    public boolean isApplied(){
       return this.mIsApplied;
    }
    public boolean isApplyByRealtime(){
       return ("Realtime").equals(this.mApplyTime);
    }
    public boolean isApplyByReboot(){
       return ("Reboot").equals(this.mApplyTime);
    }
    public boolean isDexReady(){
       return (TextUtils.isEmpty(this.mImplClassName) ^ 0x01);
    }
    public boolean isFeaturePatch(){
       boolean b = (!TextUtils.isEmpty(this.mFeatureName) && !TextUtils.isEmpty(this.mFeatureVersion))? true: false;
       return b;
    }
    public boolean isSoReady(){
       boolean b = (!TextUtils.isEmpty(this.mNativeInstallPath) && new File(this.mNativeInstallPath).isDirectory())? true: false;
       return b;
    }
    public final void loadClassClassLoaderIfNeed(Context p0){
       Patch tmClassLoade = this.mClassLoaderLock;
       _monitor_enter(tmClassLoade);
       if (this.mClassLoader == null) {
          ApplicationInfo applicationI = p0.getApplicationInfo();
          File parentFile = new File(this.getLocalPath()).getParentFile();
          ClassLoader customLoader = (this.isFeaturePatch())? Robust.get().getCustomLoader(this.mFeatureName): p0.getClassLoader();
          this.mClassLoader = this.makeClassLoader(applicationI, parentFile, customLoader);
       }
       _monitor_exit(tmClassLoade);
       return;
    }
    public final DexClassLoader makeClassLoader(ApplicationInfo p0,File p1,ClassLoader p2){
       DexClassLoader uDexClassLoa;
       if ((Build.MANUFACTURER).equalsIgnoreCase("xiaomi") && Build$VERSION.SDK_INT < 31) {
          uDexClassLoa = new DexClassLoader(this.getLocalPath(), p1.getAbsolutePath(), p0.nativeLibraryDir, ClassLoader.getSystemClassLoader());
          Reflect.on(uDexClassLoa).set("parent", p2);
          uDexClassLoa.loadClass(Robust.class.getName());
          Object[] objArray = new Object[]{uDexClassLoa,p2};
          b.b().c("Robust2", "makeClassLoader 1=>ret={%s} parent={%s}", objArray);
          return uDexClassLoa;
       }else {
          uDexClassLoa = new DexClassLoader(this.getLocalPath(), p1.getAbsolutePath(), p0.nativeLibraryDir, p2);
          Object[] objArray1 = new Object[]{uDexClassLoa};
          b.b().c("Robust2", "makeClassLoader 2=>ret={%s}", objArray1);
          return uDexClassLoa;
       }
    }
    public void setApplied(boolean p0){
       this.mIsApplied = p0;
    }
    public String toString(){
       return "Patch{mImplClassName=\'"+this.mImplClassName+'''+", mId=\'"+this.mId+'''+", mLocalPath=\'"+this.mLocalPath+'''+", mMd5=\'"+this.mMd5+'''+", mRobustId=\'"+this.mRobustId+'''+", mFeatureName=\'"+this.mFeatureName+'''+", mFeatureVersion=\'"+this.mFeatureVersion+'''+", mExtra="+this.mExtra+", mIsApplied="+this.mIsApplied+", mClassLoader="+this.mClassLoader+", mClassLoaderLock="+this.mClassLoaderLock+", mNativeInstallPath=\'"+this.mNativeInstallPath+'''+'}';
    }
    public final void verify(){
       if (TextUtils.isEmpty(this.mImplClassName)) {
          throw new AssertionError("mImplClassName failed");
       }
       if (TextUtils.isEmpty(this.mId)) {
          throw new AssertionError("mId failed");
       }
       if (TextUtils.isEmpty(this.mRobustId)) {
          throw new AssertionError("mRobustId failed");
       }
       if (TextUtils.isEmpty(this.mMd5)) {
          throw new AssertionError("mMd5 failed");
       }
       File uFile = new File(this.mLocalPath);
       if (TextUtils.isEmpty(this.mLocalPath) || (!uFile.exists() || (!uFile.isFile() || !uFile.canRead()))) {
          throw new AssertionError("mLocalPath failed");
       }
       if (TextUtils.isEmpty(this.mFeatureName) || (!TextUtils.isEmpty(this.mFeatureVersion) && (!TextUtils.isEmpty(this.mFeatureName) || (TextUtils.isEmpty(this.mFeatureVersion) && (TextUtils.isEmpty(this.mFeatureVersion) || (this.mFeatureVersion).equals("1")))))) {
          return;
       }
       throw new AssertionError("Feature info illegal");
    }
}
