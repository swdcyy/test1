package com.kwai.robust.Robust;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import com.kwai.robust.Robust$a;
import java.lang.String;
import java.lang.ClassLoader;
import com.kwai.robust.NativePatchInstaller;
import com.kwai.robust.RobustException;
import com.kwai.robust.Robust$Holder;
import java.lang.Class;
import com.kwai.robust.ChangeQuickRedirect;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import android.content.Context;
import com.kwai.robust.Robust$InnerPatch;
import java.util.ArrayList;
import com.kwai.robust.Robust$PatchDex;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.robust.Patch;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Runtime;
import com.kwai.robust.PatchesInfo;
import com.kwai.robust.Robust$PatchNative;
import java.io.File;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.io.PrintWriter;
import java.lang.Integer;
import java.util.Collection;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import java.lang.Package;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Build$VERSION;
import java.lang.Exception;
import om7.c;
import om7.b;
import om7.a;
import com.kwai.robust.Robust$MethodListener;
import com.kwai.robust.PatchProxy$a;
import com.kwai.robust.PatchFile;

public final class Robust	// class@000eee
{
    public final Map mCustomLoaders;
    public final Object mCustomLoadersLock;
    public String mRobustId;
    public final Map sAppliedPatches;
    public final Object sAppliedPatchesLock;
    public final Object sRobustIdLock;
    public final Set sRollbackPatches;

    public void Robust(){
       super();
       this.sAppliedPatches = new HashMap(8);
       this.sRollbackPatches = new HashSet();
       this.sAppliedPatchesLock = new Object();
       this.mRobustId = "ba5ee4445f1a88f4f482681c75ac6cea";
       this.sRobustIdLock = new Object();
       this.mCustomLoaders = new HashMap(8);
       this.mCustomLoadersLock = new Object();
    }
    public void Robust(Robust$a p0){
       super();
    }
    public static void applyNativePatch(String p0,ClassLoader p1){
       if (p1 == null) {
          throw new RobustException("native patch apply: classLoader is null");
       }
       if (NativePatchInstaller.installNativeLibraryABI(p1, p0, true)) {
          return;
       }
       throw new RobustException("native patch apply fail");
    }
    public static Robust get(){
       return Robust$Holder.sInstance;
    }
    public static String getVersion(){
       return "0.4.23";
    }
    public void addChangeQuickRedirect(Class p0,ChangeQuickRedirect p1){
       PatchProxy.addChangeQuickRedirect(p0, p1);
    }
    public void addCustomLoader(String p0,ClassLoader p1){
       Robust tmCustomLoad = this.mCustomLoadersLock;
       _monitor_enter(tmCustomLoad);
       this.mCustomLoaders.put(p0, p1);
       _monitor_exit(tmCustomLoad);
    }
    public final boolean applyDexPatch(Context p0,Robust$InnerPatch p1){
       ArrayList uArrayList;
       try{
          uArrayList = new ArrayList();
          if (p1.patchDex.patchObject.isEmpty()) {
             return false;
          }
          Iterator iterator1 = p1.patchDex.patchObject.entrySet().iterator();
          while (iterator1.hasNext()) {
             Map$Entry uEntry = iterator1.next();
             PatchProxy.addChangeQuickRedirect(uEntry.getKey(), uEntry.getValue());
             uArrayList.add(uEntry.getKey());
          }
          return true;
       }catch(java.lang.Exception e5){
          Iterator iterator = uArrayList.iterator();
       label_004b :
          if (!iterator.hasNext()) {
             throw e5;
          }
          PatchProxy.removeChangeQuickRedirect(iterator.next());
          goto label_004b ;
       }
    }
    public void applyPatch(Context p0,Patch p1){
       this.applyPatch(p0, p1, true);
    }
    public void applyPatch(Context p0,Patch p1,boolean p2){
       if (!TextUtils.equals(p1.getRobustId(), this.getRobustId(p0))) {
          throw new RobustException("robust id no match");
       }
       Robust tsAppliedPat = this.sAppliedPatchesLock;
       _monitor_enter(tsAppliedPat);
       if (this.sAppliedPatches.containsKey(p1.getId())) {
          throw new RobustException("Patch has been applied! "+p1);
       }
       _monitor_exit(tsAppliedPat);
       if (p2 && this.shouldRunGcBeforeApply(p0, p1)) {
          Runtime.getRuntime().gc();
       }
       ClassLoader classLoader = p1.getClassLoader(p0);
       PatchesInfo patchesInfo = classLoader.loadClass(p1.getImplClassName()).newInstance();
       patchesInfo.setup();
       Robust$a uoa = null;
       Robust$PatchDex patchDex = new Robust$PatchDex(p1, classLoader, patchesInfo, uoa);
       Robust$InnerPatch innerPatch = (!TextUtils.isEmpty(p1.getNativePath()))? new Robust$InnerPatch(p1, patchDex, new Robust$PatchNative(p1, p1.getNativePath(), p0.getClassLoader(), uoa), uoa): new Robust$InnerPatch(p1, patchDex, uoa, uoa);
       if (this.shouldApplyNativePatch(innerPatch)) {
          Robust$InnerPatch patchNative = innerPatch.patchNative;
          Robust.applyNativePatch(patchNative.nativePath, patchNative.classLoader);
       }
       int i = 0;
       try{
          this.applyDexPatch(p0, innerPatch);
          innerPatch.patch.setApplied(true);
          innerPatch.patchDex.patch.setApplied(true);
          if (this.shouldApplyNativePatch(innerPatch)) {
             innerPatch.patchNative.patch.setApplied(true);
             File[] uFileArray = new File(innerPatch.patchNative.nativePath).listFiles();
             int len = uFileArray.length;
             while (i < len) {
                object oobject = uFileArray[i];
                if ((oobject.getAbsolutePath()).endsWith(".so")) {
                   System.load(oobject.getAbsolutePath());
                }
                i = i + 1;
             }
          }
          Robust tsAppliedPat1 = this.sAppliedPatchesLock;
          _monitor_enter(tsAppliedPat1);
          this.sAppliedPatches.put(p1.getId(), innerPatch);
          _monitor_exit(tsAppliedPat1);
          patchesInfo.onApplied(true);
          return;
       }catch(java.lang.Exception e3){
          if (this.shouldApplyNativePatch(innerPatch) && p1.isSoReady()) {
             NativePatchInstaller.installNativeLibraryABI(this.shouldApplyNativePatch(innerPatch).getClassLoader(), p1.getNativePath(), i);
          }
          throw e3;
       }
    }
    public Boolean containsChangeQuickRedirect(Class p0){
       return PatchProxy.containsChangeQuickRedirect(p0);
    }
    public void dumpPatchStatus(PrintWriter p0){
       object oobject;
       Robust tsAppliedPat = this.sAppliedPatchesLock;
       _monitor_enter(tsAppliedPat);
       HashMap hashMap = new HashMap(this.sAppliedPatches);
       _monitor_exit(tsAppliedPat);
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = Integer.valueOf(hashMap.size());
       p0.println(String.format("--------> dumpPatchStatus:%s <----", objArray));
       Iterator iterator = hashMap.values().iterator();
       while (iterator.hasNext()) {
          Robust$InnerPatch innerPatch = iterator.next();
          if (innerPatch.patchDex != null) {
             p0.println("Patch:"+innerPatch.patch);
             if (!innerPatch.patchDex.patchObject.isEmpty()) {
                int i1 = innerPatch.patchDex.patchObject.size();
                Iterator iterator1 = innerPatch.patchDex.patchObject.entrySet().iterator();
                int i2 = 1;
                while (iterator1.hasNext()) {
                   Map$Entry uEntry = iterator1.next();
                   Class key = uEntry.getKey();
                   String value = uEntry.getValue();
                   Object[] objArray1 = new Object[4];
                   int i3 = i2 + 1;
                   objArray1[0] = Integer.valueOf(i2);
                   objArray1[i] = Integer.valueOf(i1);
                   objArray1[2] = key;
                   i2 = 3;
                   value = (value != null)? value.getClass().getName(): null;
                   objArray1[i2] = value;
                   p0.println(String.format("PatchObject\(%s/%s\): %s => %s", objArray1));
                   i2 = i3;
                }
             }else {
                p0.println("PatchObject:Null/Empty");
             }
          }
          innerPatch = innerPatch.patchNative;
          if (innerPatch != null) {
             Object[] objArray2 = new Object[i];
             objArray2[0] = innerPatch.nativePath;
             p0.println(String.format("SoPatch Patch : %s", objArray2));
          }
       }
       Object[] objArray3 = new Object[i];
       objArray3[0] = Integer.valueOf(hashMap.size());
       p0.println(String.format("--------< dumpPatchStatus:%s >----", objArray3));
       return;
    }
    public Collection getAppliedPatches(){
       ArrayList uArrayList = new ArrayList();
       Robust tsAppliedPat = this.sAppliedPatchesLock;
       _monitor_enter(tsAppliedPat);
       Iterator iterator = this.sAppliedPatches.values().iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().patch);
       }
       _monitor_exit(tsAppliedPat);
       return uArrayList;
    }
    public ClassLoader getCustomLoader(String p0){
       Robust tmCustomLoad = this.mCustomLoadersLock;
       _monitor_enter(tmCustomLoad);
       _monitor_exit(tmCustomLoad);
       return this.mCustomLoaders.get(p0);
    }
    public Patch getPatch(String p0){
       Robust tsAppliedPat = this.sAppliedPatchesLock;
       _monitor_enter(tsAppliedPat);
       Robust$InnerPatch innerPatch = this.sAppliedPatches.get(p0);
       _monitor_exit(tsAppliedPat);
       if (innerPatch != null) {
          return innerPatch.patch;
       }
       return null;
    }
    public String getRobustId(Context p0){
       return "ba5ee4445f1a88f4f482681c75ac6cea";
    }
    public boolean hasRobustInStack(Throwable p0){
       StackTraceElement[] stackTrace = p0.getStackTrace();
       if (stackTrace.length > 0) {
          int len = stackTrace.length;
          int i = 0;
          while (i < len) {
             object oobject = stackTrace[i];
             String className = oobject.getClassName();
             if (("accessDispatch").equals(oobject.getMethodName()) && (className != null && className.equals("_RobustPatchControl"))) {
                return true;
             }else if((PatchProxy.class.getName()).equals(className)){
                return true;
             }else if(className != null && className.startsWith(PatchProxy.class.getPackage().getName())){
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public boolean isPatchApplied(String p0){
       Robust tsAppliedPat = this.sAppliedPatchesLock;
       _monitor_enter(tsAppliedPat);
       Robust$InnerPatch innerPatch = this.sAppliedPatches.get(p0);
       _monitor_exit(tsAppliedPat);
       if (innerPatch == null) {
          return false;
       }
       return innerPatch.patch.isApplied();
    }
    public final String readRobustId(Context p0){
       String str = "";
       try{
          ApplicationInfo metaData = p0.getApplicationInfo().metaData;
          if (metaData == null) {
             metaData = p0.getPackageManager().getApplicationInfo(p0.getPackageName(), 128).metaData;
          }
          String str1 = metaData.getString("robust2_id");
          if (str1 != null) {
             str = str1;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public void removeChangeQuickRedirect(Class p0){
       PatchProxy.removeChangeQuickRedirect(p0);
    }
    public void rollbackPatch(Context p0,String p1){
       Robust$InnerPatch patchDex;
       Robust tsAppliedPat = this.sAppliedPatchesLock;
       _monitor_enter(tsAppliedPat);
       Robust$InnerPatch innerPatch = this.sAppliedPatches.get(p1);
       if (innerPatch == null) {
          throw new Exception("Patch has not been applied! "+p1);
       }
       if (innerPatch.patchNative == null) {
          patchDex = innerPatch.patchDex;
          if (patchDex != null && !patchDex.patchObject.isEmpty()) {
             Iterator iterator = innerPatch.patchDex.patchObject.keySet().iterator();
             while (iterator.hasNext()) {
                PatchProxy.removeChangeQuickRedirect(iterator.next());
             }
             innerPatch.patchDex.patchesInfo.onRollback();
          }
       }
       innerPatch.patch.setApplied(false);
       innerPatch.patchDex.patch.setApplied(false);
       patchDex = innerPatch.patchNative;
       if (patchDex != null) {
          patchDex.patch.setApplied(false);
       }
       this.sAppliedPatches.remove(p1);
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT == 26 || sDK_INT == 27) {
          this.sRollbackPatches.add(innerPatch);
       }
       _monitor_exit(tsAppliedPat);
       return;
    }
    public void setLogger(c p0){
       if (p0 != null) {
          b.b().i(p0);
       }else {
          b.b().i(null);
       }
       return;
    }
    public void setMethodCall(Robust$MethodListener p0){
       if (p0 != null) {
          PatchProxy.setMethodCall(new Robust$a(this, p0));
       }else {
          PatchProxy.setMethodCall(null);
       }
       return;
    }
    public boolean shouldApplyNativePatch(Robust$InnerPatch p0){
       boolean b = (Build$VERSION.SDK_INT > 22 && p0.patchNative != null)? true: false;
       return b;
    }
    public final boolean shouldRunGcBeforeApply(Context p0,Patch p1){
       boolean b = false;
       if (Build$VERSION.SDK_INT < 26) {
          return b;
       }
       String extraInfo = PatchFile.getOrCreate(p1.getLocalPath()).getExtraInfo();
       if (!TextUtils.isEmpty(extraInfo) && extraInfo.contains("GcBeforeApply=ON")) {
          b = true;
       }
       return b;
    }
}
