package com.kwai.robust.PatchFile;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.lang.Throwable;
import java.util.Map;
import android.content.Context;
import java.io.File;
import java.util.List;
import com.kwai.robust.NativePatchHelper;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import com.kwai.robust.NativeModel;
import java.util.Collection;
import java.util.jar.Attributes;
import java.util.Iterator;
import android.util.Base64;

public class PatchFile	// class@0013f6
{
    public final List mAllNativeModels;
    public final String mFilePath;
    public boolean mHasLoadNativeModels;
    public Manifest mManifest;
    public static final Map sInstances;
    public static final Object sLock;

    static {
       PatchFile.sInstances = new HashMap();
       PatchFile.sLock = new Object();
    }
    public void PatchFile(String p0){
       super();
       this.mAllNativeModels = new ArrayList();
       this.mHasLoadNativeModels = false;
       JarFile jarFile = new JarFile(p0, false);
       this.mManifest = jarFile.getManifest();
       jarFile.close();
       this.mFilePath = p0;
    }
    public static PatchFile create(String p0){
       return new PatchFile(p0);
    }
    public static PatchFile getOrCreate(String p0){
       Object sLock = PatchFile.sLock;
       _monitor_enter(sLock);
       Map sInstances = PatchFile.sInstances;
       PatchFile patchFile = sInstances.get(p0);
       if (patchFile == null) {
          patchFile = new PatchFile(p0);
          sInstances.put(p0, patchFile);
       }
       _monitor_exit(sLock);
       return patchFile;
    }
    public void extractNativePatch(Context p0,String p1,File p2){
       NativePatchHelper.extractNative(p0, new File(this.mFilePath), this.getNativeModels(p1), p2);
    }
    public List getAllNativeModels(){
       return this.getAllNativeModelsInner();
    }
    public final List getAllNativeModelsInner(){
       if (this.mHasLoadNativeModels == null) {
          String soInfo = this.getSoInfo();
          if (!TextUtils.isEmpty(soInfo)) {
             ArrayList uArrayList = new ArrayList();
             JSONArray jSONArray = new JSONArray(soInfo);
             for (int i = 0; i < jSONArray.length(); i = i + 1) {
                uArrayList.add(NativeModel.fromJson(jSONArray.getJSONObject(i)));
             }
             this.mAllNativeModels.addAll(uArrayList);
          }
          this.mHasLoadNativeModels = true;
       }
       return this.mAllNativeModels;
    }
    public String getApkPackageName(){
       return this.mManifest.getMainAttributes().getValue("Apk-PackageName");
    }
    public String getApkVersionCode(){
       return this.mManifest.getMainAttributes().getValue("Apk-Version-Code");
    }
    public String getApplyTime(){
       return this.mManifest.getMainAttributes().getValue("Apply-Time");
    }
    public String getDetailType(){
       return this.mManifest.getMainAttributes().getValue("Detail-Type");
    }
    public String getDexMd5(){
       return this.mManifest.getMainAttributes().getValue("Dex-MD5");
    }
    public String getEffectProcesses(){
       return this.mManifest.getMainAttributes().getValue("Effect-Processes");
    }
    public String getExtraInfo(){
       return this.mManifest.getMainAttributes().getValue("Extra-Info");
    }
    public String getFeatureName(){
       return this.mManifest.getMainAttributes().getValue("featureName");
    }
    public String getFeatureVersion(){
       return this.mManifest.getMainAttributes().getValue("featureVersion");
    }
    public Map getMainAttributes(){
       return new HashMap(this.mManifest.getMainAttributes());
    }
    public List getNativeModels(String p0){
       ArrayList uArrayList = new ArrayList();
       boolean b = TextUtils.isEmpty(p0);
       Iterator iterator = this.getAllNativeModelsInner().iterator();
       while (iterator.hasNext()) {
          NativeModel nativeModel = iterator.next();
          if (b || TextUtils.equals(nativeModel.getAbi(), p0)) {
             uArrayList.add(nativeModel);
          }
       }
       return uArrayList;
    }
    public String getPatchDesc(){
       return this.mManifest.getMainAttributes().getValue("Patch-Desc");
    }
    public String getPatchId(){
       return this.mManifest.getMainAttributes().getValue("Patch-Id");
    }
    public String getPatchInfoClassname(){
       return this.mManifest.getMainAttributes().getValue("Patch-Info-Classname");
    }
    public String getRobustId(){
       return this.mManifest.getMainAttributes().getValue("Robust-Id");
    }
    public String getSoInfo(){
       String value = this.mManifest.getMainAttributes().getValue("SO-INFO");
       if (TextUtils.isEmpty(value)) {
          return null;
       }
       return new String(Base64.decode(value, 8), "utf-8");
    }
    public void verifyNativePatch(Context p0,String p1,File p2){
       NativePatchHelper.verifyNativePatch(p0, this.getNativeModels(p1), p1, p2);
    }
}
