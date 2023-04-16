package com.kwai.framework.debuglog.i;
import java.lang.String;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jg6.a;
import com.yxcorp.zcompress.ZstdUtil;
import e66.c;
import java.lang.Throwable;
import q87.c;
import android.content.Context;
import com.kwai.framework.debuglog.RetrieveType;
import java.util.Map;
import java.lang.System;
import java.lang.Double;
import java.util.HashMap;
import java.lang.StringBuilder;
import f66.e;
import com.kwai.framework.model.user.QCurrentUser;
import qkd.b;
import f66.h;
import com.kwai.framework.debuglog.i$a;
import java.lang.Enum;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import android.content.pm.ApplicationInfo;
import com.yxcorp.utility.AbiUtil;
import java.lang.Long;
import fg6.a;
import com.google.gson.Gson;
import ekd.s;

public class i	// class@001516
{
    public static final String[] a;

    static {
       String[] stringArray = new String[]{"base.odex","base.vdex","base.art"};
       i.a = stringArray;
    }
    public void i(){
       super();
    }
    public static boolean a(File p0,File p1,int p2){
       if (PatchProxy.isSupport(i.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, i.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       try{
          if (!a.b()) {
             return b;
          }else {
             ZstdUtil.compressFile(p0, p1, p2);
             return true;
          }
       }catch(java.lang.Exception e7){
          Object[] objArray = new Object[b];
          c.C().u("OatFile", e7, objArray);
          return b;
       }
    }
    public static File b(Context p0,RetrieveType p1,Map p2){
       int i;
       File uFile1;
       StringBuilder str3;
       String str4;
       File uFile2;
       int i2;
       String[] a;
       Map map = p2;
       File obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = System.currentTimeMillis();
       String str = "zstd";
       String str1 = null;
       str = (map.containsKey(str))? map.get(str): str1;
       i = (str != null)? Double.valueOf(String.valueOf(str)).intValue(): -1;
       Integer integer = Integer.valueOf(i);
       HashMap hashMap = new HashMap();
       hashMap.put("extraData", map);
       String separator = File.separator;
       File uFile = new File(e.a.getAbsolutePath()+separator+QCurrentUser.me().getId()+"_"+p1);
       if (uFile.exists()) {
          b.x(uFile);
       }
       uFile.mkdirs();
       String str2 = "extraFile";
       if (map.containsKey(str2)) {
          str1 = map.get(str2);
       }
       if (str1 != null) {
          uFile1 = new File(str1);
          hashMap.put(uFile1.getName(), h.a(uFile1));
          if (uFile1.exists()) {
             if (uFile1.isDirectory()) {
                b.c(uFile1, uFile);
             }else {
                b.i(uFile1, uFile);
             }
          }
       }
       int i1 = i$a.a[p1.ordinal()];
       if (i1 != 1) {
          if (i1 != 2) {
             if (i1 != 3) {
                if (i1 == 4 && !PatchProxy.applyVoidThreeRefs(p0, hashMap, uFile, null, i.class, "7")) {
                   i.c(p0.getFilesDir().getParentFile(), new BufferedWriter(new FileWriter(new File(uFile, "tree.txt").getAbsolutePath())));
                }
             }else if(PatchProxy.applyVoidFourRefs(p0, hashMap, uFile, integer, null, i.class, "6")){
                uFile1 = new File(p0.getApplicationInfo().sourceDir);
                hashMap.put(uFile1.getName(), h.a(uFile1));
                if (integer != null) {
                   i.a(uFile1, new File(uFile, uFile1.getName()), integer.intValue());
                }else {
                   b.i(uFile1, uFile);
                }
             }
             i1 = 0;
          }else {
             i1 = 0;
             if (!PatchProxy.applyVoidFourRefs(p0, hashMap, uFile, integer, null, i.class, "5")) {
                uFile1 = i.d(p0);
                str3 = separator+"lib"+separator;
                str4 = (AbiUtil.b())? "arm64": "arm";
                uFile2 = new File(uFile1, str3+str4);
                hashMap.put("baseDir", uFile2);
                hashMap.put("baseDirInfo", h.a(uFile2));
                File[] uFileArray = uFile2.listFiles();
                if (uFileArray != null) {
                   int len = uFileArray.length;
                   i2 = 0;
                   while (i2 < len) {
                      object oobject = uFileArray[i2];
                      hashMap.put(oobject.getName(), h.a(oobject));
                      if (integer != null) {
                         i.a(oobject, new File(uFile, oobject.getName()), integer.intValue());
                      }else {
                         b.i(oobject, uFile);
                      }
                      i2 = i2 + 1;
                   }
                }
             }
          }
       }else {
          i1 = 0;
          if (!PatchProxy.applyVoidFourRefs(p0, hashMap, uFile, integer, null, i.class, "4")) {
             uFile1 = i.d(p0);
             str3 = separator+"oat"+separator;
             str4 = (AbiUtil.b())? "arm64": "arm";
             uFile2 = new File(uFile1, str3+str4);
             hashMap.put("baseDir", uFile2);
             hashMap.put("baseDirInfo", h.a(uFile2));
             a = i.a;
             int len1 = a.length;
             i2 = 0;
             while (i2 < len1) {
                object oobject1 = a[i2];
                File uFile3 = new File(uFile2, oobject1);
                hashMap.put(oobject1, h.a(uFile3));
                if (uFile3.exists()) {
                   if (integer != null) {
                      i.a(uFile3, new File(uFile, uFile3.getName()), integer.intValue());
                   }else {
                      b.i(uFile3, uFile);
                   }
                }
                i2 = i2 + 1;
             }
          }
       }
       long l1 = System.currentTimeMillis() - l;
       Object[] objArray = new Object[i1];
       c.C().w("OatFile", "Prepare cost "+l1, objArray);
       hashMap.put("cost", Long.valueOf(l1));
       hashMap.put("temp", uFile.getAbsolutePath());
       b.v0(new File(uFile, "meta.json"), a.a.q(hashMap));
       obj = new File(uFile.getAbsolutePath()+".zip");
       if (obj.exists()) {
          b.q(obj);
       }
       s.d(uFile, obj, (uFile.getAbsolutePath()).length());
       b.x(uFile);
       objArray = new Object[i1];
       c.C().w("OatFile", "Zip cost "+(System.currentTimeMillis() - System.currentTimeMillis()), objArray);
       return obj;
    }
    public static void c(File p0,BufferedWriter p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, i.class, "8")) {
          return;
       }
       Map map = h.a(p0);
       map.put("path", p0.getAbsolutePath());
       p1.write(a.a.q(map));
       p1.write(10);
       if (p0.isDirectory()) {
          File[] uFileArray = p0.listFiles();
          int len = uFileArray.length;
          for (i = 0; i < len; i = i + 1) {
             i.c(uFileArray[i], p1);
          }
       }
       return;
    }
    public static File d(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       File parentFile = new File(p0.getApplicationInfo().sourceDir).getParentFile();
       if (parentFile == null) {
          return null;
       }
       return parentFile;
    }
}
