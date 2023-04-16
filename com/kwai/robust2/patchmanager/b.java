package com.kwai.robust2.patchmanager.b;
import java.io.File;
import java.lang.String;
import pm7.h;
import com.kwai.robust.Patch;
import qkd.b;
import com.kwai.robust2.patchmanager.model.PatchModel;
import com.kwai.robust.PatchFile;
import android.content.Context;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Class;
import com.kwai.robust.Patch$Builder;
import com.kwai.robust.Robust;
import java.lang.Object;
import java.util.List;
import com.kwai.robust2.patchmanager.c;
import pm7.j;
import java.io.FileFilter;
import pm7.e;
import pm7.d;
import java.lang.Boolean;
import pm7.b;
import java.lang.StringBuilder;
import java.io.IOException;
import com.yxcorp.utility.AbiUtil$Abi;
import com.yxcorp.utility.AbiUtil;
import com.kwai.robust2.patchmanager.b$a;
import java.lang.Enum;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Throwable;
import java.lang.ClassLoader;
import com.kwai.robust2.patchmanager.a;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.kwai.robust.RobustException;
import com.kwai.robust2.patchmanager.VerifyException;
import ekd.a0;

public class b	// class@000ef6
{
    public static final boolean a;

    public static File a(File p0,String p1,String p2){
       File uFile = new File(b.d(p0, p1, p2), "lib");
       b.j(uFile);
       return uFile;
    }
    public static File b(File p0,String p1,String p2){
       File uFile = new File(b.a(p0, p1, p2), b.k());
       b.j(uFile);
       return uFile;
    }
    public static Patch c(h p0,File p1){
       PatchModel patchModel = PatchModel.fromJsonString(b.f0(new File(p1.getParent(), "patch.info")));
       PatchFile orCreate = PatchFile.getOrCreate(p1.getPath());
       b.v(p0.b(), patchModel, p1, orCreate);
       PatchModel patchModel1 = null;
       if (b.o(orCreate)) {
          try{
             b.u(p0, patchModel, p1);
          }catch(java.lang.Exception e0){
             orCreate.extractNativePatch(p0.b(), b.k(), new File(b.g(p0.e(), e0.robustId, e0.patchId).getPath()));
             b.u(p0, e0, p1);
          }catch(java.lang.Exception e6){
             if (!TextUtils.x(b.g(p0.e(), e0.robustId, e0.patchId).getPath())) {
                b.q(new File(b.g(p0.e(), e0.robustId, e0.patchId).getPath()));
             }
             throw e6;
          }
       }
       return Patch$Builder.patch(PatchModel.class).withId(e0.patchId).withMd5(e0.md5).withRobustId(Robust.get().getRobustId(p0.b())).withLocalPath(p1.getPath()).withExtra(e0).withFeatureName(e0.featureName).withFeatureVersion(e0.featureVersion).withNativeInstallPath(patchModel1).withApplyTime(orCreate.getApplyTime()).build();
    }
    public static File d(File p0,String p1,String p2){
       File uFile = new File(b.f(p0, p1), p2);
       b.j(uFile);
       return uFile;
    }
    public static File e(File p0,String p1,String p2){
       File uFile = new File(b.d(p0, p1, p2), "patch.info");
       b.j(uFile.getParentFile());
       return uFile;
    }
    public static File f(File p0,String p1){
       return new File(p0, p1);
    }
    public static File g(File p0,String p1,String p2){
       File uFile = new File(b.a(p0, p1, p2), b.k());
       if (uFile.exists()) {
          b.q(uFile);
       }
       b.j(uFile);
       return uFile;
    }
    public static void h(File p0,String p1){
       boolean b;
       Boolean uBoolean;
       File[] uFileArray = b.f(p0, p1).listFiles(new j(c.c()));
       if (uFileArray != null && uFileArray.length > 0) {
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = uFileArray[i];
             b = b.q(oobject);
             Object[] objArray = new Object[]{oobject.getPath(),uBoolean};
             uBoolean = Boolean.valueOf(b);
             d.b().a("PatchFileUtils", "clearNeedDeletePatchDirIfNeed %s delete:%s", objArray);
          }
       }
       return;
    }
    public static void i(File p0,String p1){
       String path = new File(p0, p1).getPath();
       File[] uFileArray = p0.listFiles();
       if (uFileArray != null && uFileArray.length > 0) {
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             String path1 = oobject.getPath();
             if (!TextUtils.n(path1, path) && !path1.contains(p1)) {
                Object[] objArray = new Object[]{path,path1,Boolean.valueOf(b.q(oobject))};
                d.b().a("PatchFileUtils", "clearOtherRobustIdIfNeed cur=%s,path=%s delete:%s", objArray);
             }
             i = i + 1;
          }
       }
       return;
    }
    public static void j(File p0){
       if (p0 == null) {
          return;
       }
       if (p0.exists()) {
          if (!p0.isDirectory()) {
             throw new IOException("File "+p0+" exists and is not a directory. Unable to create directory.");
          }
       }else if(p0.mkdirs() || p0.isDirectory()){
          throw new IOException("Unable to create directory "+p0);
       }
       return;
    }
    public static String k(){
       AbiUtil$Abi uAbi = AbiUtil.a();
       int i = b$a.a[uAbi.ordinal()];
       if (i == 1) {
          return "armeabi-v7a";
       }
       if (i == 2) {
          return "arm64-v8a";
       }
       throw new Exception("error current abi: "+uAbi);
    }
    public static List l(h p0){
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = b.r(p0.e(), p0.f());
       if (uArrayList1.size() > 0) {
          Iterator iterator = uArrayList1.iterator();
          while (iterator.hasNext()) {
             File uFile = iterator.next();
             if (!uFile.exists() || !uFile.isFile()) {
                continue ;
             }else {
                Patch patch = b.c(p0, uFile);
                if (patch.isFeaturePatch() || patch.isApplyByReboot()) {
                   uArrayList.add(patch);
                }
             }
          }
       }
       return uArrayList;
    }
    public static List m(h p0,String p1){
       int i = TextUtils.x(p1) ^ 0x01;
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       ArrayList uArrayList2 = b.r(p0.e(), p0.f());
       if (uArrayList2.size() > 0) {
          Iterator iterator = uArrayList2.iterator();
          while (iterator.hasNext()) {
             File uFile = iterator.next();
             if (!uFile.exists() || !uFile.isFile()) {
                continue ;
             }else {
                Patch patch = b.c(p0, uFile);
                if (i) {
                   if (patch.isFeaturePatch() && ((patch.getFeatureName()).equals(p1) && Robust.get().getCustomLoader(patch.getFeatureName()) != null)) {
                      uArrayList1.add(patch);
                   }
                }else if(!patch.isFeaturePatch()){
                   uArrayList.add(patch);
                }
             }
          }
       }
       if (i) {
          uArrayList = uArrayList1;
       }
       return uArrayList;
    }
    public static File n(File p0,String p1,String p2){
       return new File(b.d(p0, p1, p2), "real_time.info");
    }
    public static boolean o(PatchFile p0){
       if (!p0.getAllNativeModels().isEmpty()) {
          return (p0.getNativeModels(b.k()).isEmpty() ^ 0x01);
       }
       return false;
    }
    public static boolean p(File p0){
       boolean b = (p0 != null && (p0.exists() && (p0.isFile() && (p0.canRead() && p0.length() > 0))))? true: false;
       return b;
    }
    public static boolean q(File p0){
       Object[] objArray;
       int i = 1;
       if (p0 == null) {
          objArray = new Object[i];
          objArray[0] = p0;
          d.b().a("PatchFileUtils", "isValidPatchDir 1 dir=%s", objArray);
          return 0;
       }else if(!p0.isDirectory()){
          objArray = new Object[i];
          objArray[0] = p0;
          d.b().a("PatchFileUtils", "isValidPatchDir 2 dir=%s", objArray);
          return 0;
       }else {
          File uFile = new File(p0, "patch.jar");
          if (uFile.exists()) {
             long l = 0;
             if (uFile.length() - l <= 0 || (uFile.isFile() && uFile.canRead())) {
                File uFile1 = new File(p0, "patch.info");
                if (uFile1.exists() && (uFile1.length() - l > 0 && (!uFile1.isFile() || !uFile1.canRead()))) {
                   objArray = new Object[i];
                   objArray[0] = p0;
                   d.b().a("PatchFileUtils", "isValidPatchDir 4 dir=%s", objArray);
                   return 0;
                }else if(PatchModel.fromJsonString(b.f0(uFile1)).patchSize - uFile.length()){
                   Object[] objArray1 = new Object[i];
                   objArray1[0] = p0;
                   d.b().a("PatchFileUtils", "isValidPatchDir 5 dir=%s", objArray1);
                   return 0;
                }else {
                   return i;
                }
             }
          }
          objArray = new Object[i];
          objArray[0] = p0;
          d.b().a("PatchFileUtils", "isValidPatchDir 3 dir=%s", objArray);
          return 0;
       }
    }
    public static List r(File p0,String p1){
       ArrayList uArrayList = new ArrayList();
       File[] uFileArray = b.f(p0, p1).listFiles(a.b);
       if (uFileArray != null && uFileArray.length > 0) {
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             uArrayList.add(new File(uFileArray[i], "patch.jar"));
          }
       }
       return uArrayList;
    }
    public static File s(File p0,String p1,String p2){
       p0 = b.n(p0, p1, p2);
       b.j(p0.getParentFile());
       if (p0.isDirectory()) {
          throw new RobustException("Can not makeRealTimeReportFile:"+p0+",for "+p2+",file.isDirectory\(\)");
       }
       if (!p0.exists()) {
          p0.createNewFile();
          FileOutputStream uFileOutputS = new FileOutputStream(p0);
          uFileOutputS.write(("Robust2:"+p2).getBytes());
          uFileOutputS.close();
       }
       return p0;
    }
    public static boolean t(File p0,String p1,String p2){
       boolean b = b.q(b.e(p0, p1, p2));
       Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(b)};
       d.b().a("PatchFileUtils", "markPatchAsDelete baseDir=%s, robustId=%s, patchId=%s ret=%s", objArray);
       return b;
    }
    public static void u(h p0,PatchModel p1,File p2){
       File uFile = b.b(p0.e(), p1.robustId, p1.patchId);
       PatchFile orCreate = PatchFile.getOrCreate(p2.getPath());
       if (uFile.exists() && uFile.isDirectory()) {
          orCreate.verifyNativePatch(p0.b(), b.k(), uFile);
          return;
       }else {
          Object[] objArray = new Object[]{p1,uFile};
          throw new VerifyException(String.format("invalid native dir = %s ", objArray));
       }
    }
    public static void v(Context p0,PatchModel p1,File p2,PatchFile p3){
       Object[] objArray;
       if (!p1.patchSize - p2.length()) {
          PatchModel md5 = p1.md5;
          if (md5 != null && md5.equalsIgnoreCase(a0.b(p2))) {
             String robustId = Robust.get().getRobustId(p0);
             md5 = p1.robustId;
             if (md5 != null && md5.equalsIgnoreCase(robustId)) {
                if (robustId != null && robustId.equalsIgnoreCase(p3.getRobustId())) {
                   PatchModel patchId = p1.patchId;
                   if (patchId != null && patchId.equalsIgnoreCase(p3.getPatchId())) {
                      if (p1.isMatchFeatureName(p3.getFeatureName()) && p1.isMatchFeatureVersion(p3.getFeatureVersion())) {
                         return;
                      }
                      objArray = new Object[]{p1,p2};
                      throw new VerifyException(String.format("verify fail feature info on %s destFile=%s", objArray));
                   }else {
                      objArray = new Object[]{p1,p2};
                      throw new VerifyException(String.format("verify fail patchId on %s destFile=%s", objArray));
                   }
                }else {
                   objArray = new Object[]{p1,p2};
                   throw new VerifyException(String.format("verify fail robustId2 on %s destFile=%s", objArray));
                }
             }else {
                objArray = new Object[]{p1,p2};
                throw new VerifyException(String.format("verify fail robustId1 on %s destFile=%s", objArray));
             }
          }else {
             objArray = new Object[]{p1,p2};
             throw new VerifyException(String.format("verify fail md5 on %s destFile=%s", objArray));
          }
       }else {
          objArray = new Object[]{p1,p2};
          throw new VerifyException(String.format("verify fail size on %s destFile=%s", objArray));
       }
    }
}
