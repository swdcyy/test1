package com.kwai.video.ksmodelmanager.ModelRepo;
import java.lang.Object;
import com.kwai.video.ksmodelmanager.CachePolicy;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.ksmodelmanager.ModelRepo$1;
import java.lang.Enum;
import java.io.File;
import qkd.b;
import java.lang.StringBuilder;
import java.io.IOException;
import com.yxcorp.utility.Log;
import java.util.List;
import java.util.ArrayList;
import com.kwai.video.ksmodelmanager.config.CacheModelInfo;
import java.util.Iterator;
import com.kwai.video.ksmodelmanager.config.ModelConfig$ModelInfo;
import com.kwai.video.ksmodelmanager.a;
import java.util.Comparator;
import java.util.Collections;
import java.util.Locale;
import com.kwai.video.ksmodelmanager.ModelSDKConfig;
import com.kwai.video.ksmodelmanager.ModelSDK;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class ModelRepo	// class@000910
{

    public void ModelRepo(){
       super();
    }
    public static boolean checkPolicy(int p0,int p1,CachePolicy p2){
       if (PatchProxy.isSupport(ModelRepo.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, ModelRepo.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = ModelRepo$1.$SwitchMap$com$kwai$video$ksmodelmanager$CachePolicy[p2.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   return false;
                }else if(p0 >= p1){
                   b = false;
                }
                return b;
             }else if(p0 <= p1){
                b = false;
             }
             return b;
          }else if(p1 == p0){
             b = false;
          }
       }
       return b;
    }
    public static void clearAllCache(){
       if (PatchProxy.applyVoid(null, null, ModelRepo.class, "6")) {
          return;
       }
       File modelFolder = ModelRepo.getModelFolder();
       if (modelFolder != null) {
          try{
             b.b(modelFolder);
          }catch(java.io.IOException e0){
             Log.g("ModelRepo", "clearAllCache failed, "+e0.getMessage());
          }
       }
    }
    public static List getAllModelCache(String p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, ModelRepo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       File modelFolder = ModelRepo.getModelFolder();
       if (modelFolder != null && modelFolder.exists()) {
          File uFile = new File(modelFolder, p0);
          if (!uFile.exists()) {
             return obj;
          }else {
             File[] uFileArray = uFile.listFiles();
             if (uFileArray == null) {
                return obj;
             }else {
                int len = uFileArray.length;
                int i = 0;
                while (i < len) {
                   CacheModelInfo modelInfoFro = ModelRepo.getModelInfoFromFile(p0, uFileArray[i]);
                   if (modelInfoFro != null) {
                      obj.add(modelInfoFro);
                   }
                   i = i + 1;
                }
             }
          }
       }
       return obj;
    }
    public static CacheModelInfo getModelFile(String p0,int p1,int p2,CachePolicy p3,CachePolicy p4){
       ArrayList obj;
       ModelRepo modelRepo = ModelRepo.class;
       if (PatchProxy.isSupport(modelRepo)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          obj = PatchProxy.apply(objArray, null, modelRepo, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       Iterator iterator = ModelRepo.getAllModelCache(p0).iterator();
       while (iterator.hasNext()) {
          CacheModelInfo uCacheModelI = iterator.next();
          if (ModelRepo.checkPolicy(uCacheModelI.deviceLevel, p2, p4) && ModelRepo.checkPolicy(uCacheModelI.modelVersion, p1, p3)) {
             obj.add(uCacheModelI);
          }
       }
       if (obj.isEmpty()) {
          return null;
       }else {
          Collections.sort(obj, a.b);
          return obj.get(0);
       }
    }
    public static String getModelFileName(ModelConfig$ModelInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ModelRepo.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{"version",Integer.valueOf(p0.modelVersion),"level",Integer.valueOf(p0.deviceLevel)};
       return String.format(Locale.getDefault(), "%s:%d-%s:%d", objArray);
    }
    public static File getModelFolder(){
       Object[] objArray = null;
       ModelSDKConfig obj = PatchProxy.apply(objArray, objArray, ModelRepo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ModelSDK.getConfig();
       if (obj == null) {
          return objArray;
       }
       return obj.getDirInRoot(".model_resource");
    }
    public static CacheModelInfo getModelInfoFromFile(String p0,File p1){
       String[] obj = PatchProxy.applyTwoRefs(p0, p1, null, ModelRepo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p1.isDirectory()) {
          return null;
       }
       obj = (p1.getName()).split("-");
       if (!obj.length) {
          return null;
       }
       CacheModelInfo uCacheModelI = new CacheModelInfo(p1, p0);
       String[] stringArray = new String[]{"level","version"};
       ArrayList uArrayList = new ArrayList(Arrays.asList(stringArray));
       int len = obj.length;
       int i = 0;
       while (true) {
          if (i < len) {
             String[] stringArray1 = (obj[i]).split(":");
             if (stringArray1.length != 2) {
                break ;
             }else {
                object oobject = stringArray1[0];
                Objects.requireNonNull(oobject);
                if (!oobject.equals("level")) {
                   if (oobject.equals("version")) {
                      try{
                         uCacheModelI.modelVersion = Integer.parseInt(stringArray1[1]);
                         uArrayList.remove("version");
                      }catch(java.lang.Exception e0){
                         return null;
                      }
                   }
                }else {
                   try{
                      uCacheModelI.deviceLevel = Integer.parseInt(stringArray1[1]);
                      uArrayList.remove("level");
                   }catch(java.lang.Exception e0){
                      return null;
                   }
                }
                i = i + 1;
             }
          }else if(!uArrayList.isEmpty()){
             return null;
          }else {
             return uCacheModelI;
          }
       }
       return null;
    }
    public static int lambda$getModelFile$0(CacheModelInfo p0,CacheModelInfo p1){
       ModelConfig$ModelInfo modelVersion = p0.modelVersion;
       ModelConfig$ModelInfo modelVersion1 = p1.modelVersion;
       int i = (modelVersion != modelVersion1)? modelVersion1 - modelVersion: p1.deviceLevel - p0.deviceLevel;
       return i;
    }
}
