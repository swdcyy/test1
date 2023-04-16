package com.kuaishou.weapon.ks.z;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import android.content.Context;
import android.app.Application;
import android.content.IntentFilter;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.io.File;
import android.util.Pair;
import com.kuaishou.weapon.ks.bs;
import java.lang.Boolean;
import com.kuaishou.weapon.ks.j;
import java.lang.Class;
import java.lang.reflect.Field;
import com.kuaishou.weapon.ks.aa;
import java.util.HashSet;
import java.util.zip.ZipInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import android.os.Build;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipFile;
import java.io.IOException;
import com.kuaishou.weapon.ks.b;
import java.util.Enumeration;
import java.io.FileNotFoundException;
import java.lang.Throwable;
import java.lang.System;
import com.kuaishou.weapon.ks.d;
import com.kuaishou.weapon.ks.br;
import java.lang.ClassLoader;
import com.kuaishou.weapon.ks.by;
import com.kuaishou.weapon.jni.W;
import java.util.Map;
import com.kuaishou.weapon.ks.y;
import java.lang.Exception;
import com.kuaishou.weapon.ks.ac;
import java.util.Set;
import com.kuaishou.weapon.WeaponRECE;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.Thread;
import java.lang.RuntimeException;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import java.lang.Integer;
import com.kuaishou.weapon.ks.e;

public class z	// class@00123d
{
    public boolean a;
    public String e;
    public static List b;
    public static z c;
    public static Application d;
    public static Random f;
    public static Map g;
    public static Map h;
    public static Map i;

    static {
       z.f = new Random();
       z.g = new ConcurrentHashMap();
       z.h = new ConcurrentHashMap();
       z.i = new HashMap();
       z.b = new ArrayList();
    }
    public void z(){
       super();
    }
    public static z a(){
       return z.c;
    }
    public static z a(Context p0,boolean p1){
       if (z.c == null) {
          z.d = p0.getApplicationContext();
          z.c = new z();
       }
       return z.c;
    }
    public static String a(IntentFilter p0){
       String action;
       if (p0 == null) {
          return "";
       }
       StringBuilder str = "";
       int i = p0.countActions();
       int i1 = 0;
       if (i > 0) {
          ArrayList uArrayList = new ArrayList();
          int i2 = 0;
          while (i2 < i) {
             action = p0.getAction(i2);
             if (!TextUtils.isEmpty(action)) {
                uArrayList.add(action);
             }
             i2 = i2 + 1;
          }
          if (uArrayList.size() > 0) {
             Collections.sort(uArrayList);
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                str = str+iterator.next();
             }
             i = p0.countCategories();
             if (i > 0) {
                uArrayList = new ArrayList();
                i2 = 0;
                while (i2 < i) {
                   action = p0.getCategory(i2);
                   if (!TextUtils.isEmpty(action)) {
                      uArrayList.add(action);
                   }
                   i2 = i2 + 1;
                }
                if (uArrayList.size() > 0) {
                   Collections.sort(uArrayList);
                   Iterator iterator1 = uArrayList.iterator();
                   while (iterator1.hasNext()) {
                      str = str+iterator1.next();
                   }
                   if (p0.countDataTypes() > 0) {
                      uArrayList = new ArrayList();
                      i2 = 0;
                      while (i2 < i) {
                         action = p0.getDataType(i2);
                         if (!TextUtils.isEmpty(action)) {
                            uArrayList.add(action);
                         }
                         i2 = i2 + 1;
                      }
                      if (uArrayList.size() > 0) {
                         Collections.sort(uArrayList);
                         iterator = uArrayList.iterator();
                         while (iterator.hasNext()) {
                            str = str+iterator.next();
                         }
                         i = p0.countDataSchemes();
                         if (i > 0) {
                            uArrayList = new ArrayList();
                            while (i1 < i) {
                               String dataScheme = p0.getDataScheme(i1);
                               if (!TextUtils.isEmpty(dataScheme)) {
                                  uArrayList.add(dataScheme);
                               }
                               i1 = i1 + 1;
                            }
                            if (uArrayList.size() > 0) {
                               Collections.sort(uArrayList);
                               Iterator iterator2 = uArrayList.iterator();
                               while (iterator2.hasNext()) {
                                  str = str+iterator2.next();
                               }
                               return str;
                            }
                         }
                         str = str+"_";
                         goto label_0104 ;
                      }
                   }
                   str = str+"_";
                   goto label_00c7 ;
                }
             }
             str = str+"_";
             goto label_0089 ;
          }
       }
       str = str+"_";
       goto label_004b ;
    }
    public static boolean g(String p0){
       File uFile = new File(p0);
       if (uFile.exists() && !uFile.isDirectory()) {
          uFile.delete();
       }
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       return true;
    }
    public final Pair a(String p0,String p1){
       if (TextUtils.isEmpty(p0) || TextUtils.isEmpty(p1)) {
          return new Pair(Boolean.FALSE, "");
       }
       File uFile = new File(p1);
       if (!bs.a(uFile)) {
          return new Pair(Boolean.FALSE, "");
       }
       p1 = j.a(uFile);
       if (TextUtils.isEmpty(p1)) {
          return new Pair(Boolean.FALSE, "");
       }
       if (!p1.equalsIgnoreCase(p0)) {
          return new Pair(Boolean.FALSE, p1);
       }
       return new Pair(Boolean.TRUE, "");
    }
    public void a(Application p0,Context p1){
       Class class = p1.getClass();
       for (Application uApplication = Application.class; uApplication != null; uApplication = uApplication.getSuperclass()) {
          Field declaredFiel = uApplication.getDeclaredField("mBase");
          declaredFiel.setAccessible(true);
          if (declaredFiel.getType().isAssignableFrom(class)) {
             declaredFiel.set(p0, p1);
          }
       }
       return;
    }
    public final void a(aa p0,String p1,String p2,HashSet p3,byte[] p4,StringBuilder p5,boolean p6){
       aa uoaa = p0;
       byte[] uobyteArray = p4;
       StringBuilder str = p5;
       ZipInputStream zipInputStre = new ZipInputStream(new FileInputStream(uoaa.e));
       int i = 0;
       ZipEntry nextEntry = zipInputStre.getNextEntry();
       while (nextEntry != null) {
          String name = nextEntry.getName();
          if (name.contains("../")) {
          }else {
             int i1 = 0;
             if (name.startsWith("lib/") && !nextEntry.isDirectory()) {
                String cPU_ABI = Build.CPU_ABI;
                String cPU_ABI2 = Build.CPU_ABI2;
                if (!name.contains(cPU_ABI) && (TextUtils.isEmpty(cPU_ABI2) || (!name.contains(cPU_ABI2) && (!name.contains("armeabi") || (!"armeabi-v7a".equalsIgnoreCase(cPU_ABI) && (TextUtils.isEmpty(cPU_ABI2) || !"armeabi-v7a".equalsIgnoreCase(cPU_ABI2))))))) {
                   continue ;
                }else {
                   cPU_ABI = p1+(name.substring(3)).replace(".so", p2+".so");
                   String str1 = cPU_ABI.substring(i1, cPU_ABI.lastIndexOf(47));
                   int i2 = str1.lastIndexOf(47) + 1;
                   p3.add(str1.substring(i2));
                   z.g(str1);
                   File uFile = new File(cPU_ABI);
                   uFile.delete();
                   uFile.createNewFile();
                   FileOutputStream uFileOutputS = new FileOutputStream(cPU_ABI);
                   i = zipInputStre.read(uobyteArray);
                   while (i > 0) {
                      uFileOutputS.write(uobyteArray, 0, i);
                   }
                   uFileOutputS.close();
                   bs.a(cPU_ABI, Boolean.TRUE);
                   i = uFileOutputS;
                }
             }else {
                i1 = p3;
             }
             if (name.endsWith(".dex") && (!nextEntry.isDirectory() && p6)) {
                aa m = uoaa.m;
                z.g(m);
                File uFile1 = new File(m, uoaa.a+"-"+uoaa.d+".dex");
                uFile1.delete();
                uFile1.createNewFile();
                FileOutputStream uFileOutputS1 = new FileOutputStream(uFile1);
                i = zipInputStre.read(uobyteArray);
                while (i > 0) {
                   uFileOutputS1.write(uobyteArray, 0, i);
                }
                uFileOutputS1.close();
                if (p5.length() > 0) {
                   str.setLength(0);
                }
                str = str+uFile1.getAbsolutePath();
                bs.a(p5, Boolean.TRUE);
                i = uFileOutputS1;
             }
          label_015c :
             zipInputStre.closeEntry();
          }
       }
       zipInputStre.close();
       if (i != null) {
          i.close();
       }
       return;
    }
    public final void a(aa p0,String p1,String p2,boolean p3){
       int i;
       String str13;
       String str16;
       int i2;
       int i3;
       int i4;
       ZipFile zipFile;
       String cPU_ABI;
       String cPU_ABI2;
       FileOutputStream uFileOutputS;
       String str17;
       int i6;
       boolean b;
       aa uoaa = p0;
       String str = p1;
       String str1 = "a1_p_s_p_s";
       StringBuilder str2 = "n";
       String str3 = ".dex";
       String str4 = "-";
       String str5 = "armeabi";
       String str6 = "1002001";
       String str7 = "p";
       String str8 = "l";
       String str9 = "v";
       String str10 = "armeabi-v7a";
       HashSet hashSet = new HashSet();
       String str11 = "e";
       if (!p3 && !TextUtils.isEmpty(uoaa.n)) {
          File uFile = new File(uoaa.n);
          if (uFile.exists() && uFile.isFile()) {
             i = 0;
          label_004f :
             String str12 = "";
             if (!TextUtils.isEmpty(uoaa.d)) {
                str13 = str9;
                str9 = (uoaa.d).replace(".", str12);
             }else {
                str13 = str9;
                str9 = str12;
             }
             String str14 = str2;
             str2 = "";
             if (!i) {
                str2 = str2+uoaa.n;
             }
             String str15 = str7;
             byte[] uobyteArray = new byte[4096];
             int i1 = 0;
             try{
                str16 = str12;
                try{
                   zipFile = new ZipFile(uoaa.e);
                   i2 = str8;
                   i3 = str6;
                   i4 = str1;
                label_010a :
                   Enumeration uEnumeration = zipFile.entries();
                   InputStream inputStream = i1;
                   int i5 = inputStream;
                   while (uEnumeration.hasMoreElements()) {
                      ZipEntry zipEntry = uEnumeration.nextElement();
                      Enumeration uEnumeration1 = uEnumeration;
                      str12 = zipEntry.getName();
                      if (str12.startsWith("lib/") && !zipEntry.isDirectory()) {
                         cPU_ABI = Build.CPU_ABI;
                         cPU_ABI2 = Build.CPU_ABI2;
                         if (!str12.contains(cPU_ABI)) {
                            if (!TextUtils.isEmpty(cPU_ABI2)) {
                               uFileOutputS = i5;
                               str6 = cPU_ABI2;
                               if (str12.contains(str6)) {
                               label_017e :
                                  cPU_ABI2 = str5;
                                  str17 = str10;
                                  str6 = str+(str12.substring(3)).replace(".so", str9+".so");
                                  str5 = str6.substring(0, str6.lastIndexOf(47));
                                  i6 = str5.lastIndexOf(47) + 1;
                                  hashSet.add(str5.substring(i6));
                                  z.g(str5);
                                  new File(str6).delete();
                                  inputStream = zipFile.getInputStream(zipEntry);
                                  FileOutputStream uFileOutputS1 = new FileOutputStream(str6);
                                  i6 = inputStream.read(uobyteArray);
                                  while (i6 > 0) {
                                     uFileOutputS1.write(uobyteArray, 0, i6);
                                  }
                                  bs.a(str6, Boolean.TRUE);
                                  i5 = uFileOutputS1;
                               }
                            }else {
                               uFileOutputS = i5;
                               str6 = cPU_ABI2;
                            }
                            if (!str12.contains(str5) || (!str10.equalsIgnoreCase(cPU_ABI) && (TextUtils.isEmpty(str6) || !str10.equalsIgnoreCase(str6)))) {
                               uEnumeration = uEnumeration1;
                               i5 = uFileOutputS;
                            }else {
                               goto label_017e ;
                            }
                         }else {
                            uFileOutputS = i5;
                            goto label_017e ;
                         }
                      }else {
                         cPU_ABI2 = str5;
                         str17 = str10;
                         i5 = i5;
                      }
                      if (str12.endsWith(str3) && (!zipEntry.isDirectory() && i)) {
                         aa m = uoaa.m;
                         z.g(m);
                         File uFile2 = new File(m, uoaa.a+str4+uoaa.d+str3);
                         inputStream = zipFile.getInputStream(zipEntry);
                         FileOutputStream uFileOutputS2 = new FileOutputStream(uFile2);
                         i5 = inputStream.read(uobyteArray);
                         while (i5 > 0) {
                            uFileOutputS2.write(uobyteArray, 0, i5);
                         }
                         uFileOutputS2.close();
                         inputStream.close();
                         str2 = str2+uFile2.getAbsolutePath();
                         bs.a(str2, Boolean.TRUE);
                         i5 = uFileOutputS2;
                      }else {
                         i6 = 0;
                      }
                   label_0276 :
                      str = p1;
                      uEnumeration = uEnumeration1;
                      str5 = cPU_ABI2;
                      str10 = str17;
                   }
                   uFileOutputS = i5;
                   cPU_ABI2 = str5;
                   str17 = str10;
                   zipFile.close();
                   if (inputStream != null) {
                      inputStream.close();
                   }
                   if (uFileOutputS != null) {
                      uFileOutputS.close();
                   }
                   String str18 = str15;
                   String str19 = i3;
                   cPU_ABI = cPU_ABI2;
                   b = true;
                   String cPU_ABI1 = Build.CPU_ABI;
                   str4 = "java.library.path";
                   str12 = ":";
                   str9 = "/";
                   if (hashSet.contains(cPU_ABI1)) {
                      str8 = p1;
                      cPU_ABI1 = str8+str9+cPU_ABI1;
                      str3 = Build.CPU_ABI2;
                      str3 = (hashSet.contains(str3))? str8+str9+str3: i1;
                      if (str3 != null) {
                         str3 = cPU_ABI1+str12+str3+str12+System.getProperty(str4);
                      }else {
                         str3 = cPU_ABI1+str12+System.getProperty(str4);
                      }
                   }else {
                      str8 = p1;
                      cPU_ABI1 = Build.CPU_ABI2;
                      if (hashSet.contains(cPU_ABI1)) {
                         str12 = str8+str9+cPU_ABI1+str12+System.getProperty(str4);
                         cPU_ABI1 = str8+str9+cPU_ABI1;
                      }else {
                         cPU_ABI1 = str16;
                         str12 = cPU_ABI1;
                      }
                      str3 = str12;
                   }
                   str12 = cPU_ABI1;
                   if (TextUtils.isEmpty(str3)) {
                      str7 = str17;
                      if (!str7.equals(Build.CPU_ABI) || (hashSet.contains(cPU_ABI) || (str7.equals(Build.CPU_ABI2) && hashSet.contains(cPU_ABI)))) {
                         str3 = str8+"/armeabi:"+System.getProperty(str4);
                         str12 = str8+"/armeabi";
                      }
                   }
                   str4 = "v8";
                   str7 = "v7";
                   if (!TextUtils.isEmpty(str12) && (!(uoaa.c).endsWith(str7) && !(uoaa.c).endsWith(str4))) {
                      d.a(z.d).a("plc001_s_v_w", str12, b);
                   }
                label_049d :
                   uoaa.h = str3;
                   uoaa.n = str2;
                   String absolutePath = new File(p2, "apkDex").getAbsolutePath();
                   bs.c(absolutePath);
                   z.g(absolutePath);
                   cPU_ABI1 = br.a(z.d);
                   if (TextUtils.isEmpty(uoaa.n) && ((uoaa.c).endsWith(str7) || (uoaa.c).endsWith(str4))) {
                      by.a(this.getClass().getClassLoader(), new File(str8+str9+cPU_ABI1));
                      if (!TextUtils.isEmpty(str8+str9+cPU_ABI1)) {
                         d.a(z.d).a("plc001_k_v_w", str8+str9+cPU_ABI1, b);
                      }
                      W.soVersion = uoaa.d;
                      W.getInstance(z.d);
                      return;
                   }else {
                      cPU_ABI = str19;
                      y oy = new y(str2, absolutePath, str3, this.getClass().getClassLoader(), uoaa.A);
                      uoaa.g = cPU_ABI1;
                      Class uClass = uoaa.g.loadClass(uoaa.c+".WeaponEngineImpl");
                      if (uClass != null && !TextUtils.isEmpty(uClass.getName())) {
                         return;
                      }else {
                         throw new Exception("class W_ENGINE_IMPL_CLASS_FULL_PATH loaded is null");
                      }
                   }
                }catch(java.io.IOException e0){
                }
                str12 = e0.getMessage();
                i2 = str8;
                i3 = str6;
                uFile = new File(uoaa.f.getFilesDir(), ".bud");
                if (uFile.exists()) {
                   i4 = str1;
                   File uFile1 = new File(uFile, uoaa.a+str4+uoaa.d);
                   if (uFile1.exists()) {
                      uFile = new File(uoaa.e);
                      bs.a(uFile1, uFile);
                      bs.a(uoaa.e, Boolean.TRUE);
                      b.a(uFile);
                      b.a(uFile, uFile1);
                      if (uFile.exists()) {
                         zipFile = new ZipFile(uoaa.e);
                         goto label_010a ;
                      }else {
                         throw new FileNotFoundException(str12+"--file not exists after copy");
                      }
                   }else {
                      throw new FileNotFoundException(str12+"--backupFile not exists");
                   }
                }else {
                   throw new FileNotFoundException(str12+"--backupDir not exists");
                }
             }catch(java.io.IOException e0){
                str16 = str12;
                goto label_00a8 ;
             }
          }
       }
       i = 1;
       goto label_004f ;
    }
    public synchronized void a(ac p0){
       if (p0.d == null) {
          return;
       }
       aa uoaa = z.h.get(p0.a);
       if (uoaa != null) {
          if (uoaa.r == null) {
             uoaa.r = new ArrayList();
          }
          Application uApplication = null;
          int i = 0;
          while (true) {
             if (i < uoaa.r.size()) {
                if (p0.a(uoaa.r.get(i))) {
                   return;
                }else {
                   i = i + 1;
                }
             }else {
                uoaa.r.add(p0);
                String str = z.a(p0.d);
                if (TextUtils.isEmpty(str) || str.equals("____")) {
                   return;
                }else if(!z.i.keySet().contains(str) && !("android.intent.action.PACKAGE_REMOVED__package").equals(str)){
                   WeaponRECE weaponRECE = new WeaponRECE();
                   UniversalReceiver.e(z.d, weaponRECE, p0.d);
                   if (uApplication) {
                      long l = 3000;
                      try{
                         Thread.sleep(l);
                         UniversalReceiver.e(z.d, weaponRECE, p0.d);
                      }catch(java.lang.InterruptedException e0){
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public synchronized final boolean a(aa p0){
       String str;
       String str2;
       if (p0 == null || TextUtils.isEmpty(p0.e)) {
          HashMap hashMap = new HashMap();
          hashMap.put("e", "apkInfo is null");
          hashMap.put("l", "CBH");
          str = "n";
          String str1 = (d.a(z.d).f("a1_p_s_p_s"))? "0": "1";
          hashMap.put(str, str1);
          bs.a(z.d, "1002001", hashMap);
          return false;
       }else {
          aa uoaa = z.g.get(p0.e);
          boolean b = true;
          if (uoaa != null) {
             if ((uoaa.d).equals(p0.d)) {
                return b;
             }else {
                this.a(uoaa.e);
             }
          }
          p0.f = z.d;
          if (p0.p == b) {
             if (!TextUtils.isEmpty(p0.c) && !TextUtils.isEmpty(p0.e)) {
                p0.m = z.d.getFilesDir().getCanonicalPath()+"/."+p0.a;
                str = p0.m+"/dex";
                bs.c(p0.m+"/lib");
                str2 = p0.m+"/lib/"+this.e+"/"+z.f.nextInt();
                z.g(str);
                bs.a(str, Boolean.FALSE);
                z.g(str2);
                this.a(p0, str2, str, false);
                z.h.put(p0.c, p0);
                z.g.put(p0.e, p0);
                this.a(p0, p0.o);
             }else {
                throw new RuntimeException("apkPackageName or apkPkgPath is null");
             }
          }
          uoaa = null;
          if (p0.p != b || uoaa) {
             uoaa = p0.s;
             if (uoaa == null || (TextUtils.isEmpty(uoaa.packageName) || TextUtils.isEmpty(uoaa.versionName))) {
                PackageInfo packageArchi = z.d.getPackageManager().getPackageArchiveInfo(p0.e, b);
             }
             if (uoaa != null && (!TextUtils.isEmpty(uoaa.packageName) && (uoaa.packageName).startsWith("com.kuaishou.weapon"))) {
                if (p0.p != b && (p0.b != b && !this.a(p0.j, p0.e).first.booleanValue())) {
                   return false;
                }else {
                   p0.c = uoaa.packageName;
                   PackageInfo applicationI = uoaa.applicationInfo;
                   p0.o = applicationI.className;
                   p0.d = uoaa.versionName;
                   p0.l = uoaa.activities;
                   p0.q = applicationI.theme;
                   p0.m = z.d.getFilesDir().getCanonicalPath()+"/."+p0.a;
                   str2 = p0.m+"/dex";
                   bs.c(p0.m+"/lib");
                   String str3 = p0.m+"/lib/"+this.e+"/"+z.f.nextInt();
                   z.g(str2);
                   bs.a(str2, Boolean.FALSE);
                   z.g(str3);
                   this.a(p0, str3, str2, b);
                   z.h.put(p0.c, p0);
                   z.g.put(p0.e, p0);
                   z.b.add(Integer.valueOf(p0.a));
                   this.a(p0, uoaa.applicationInfo.className);
                }
             }else {
                throw new Exception("weapon package name check failed");
             }
          }
          return b;
       }
    }
    public final boolean a(aa p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          return true;
       }
       Application uApplication = p0.g.loadClass(p1).newInstance();
       e.a(Application.class, z.d, uApplication);
       this.a(uApplication, z.d);
       uApplication.onCreate();
       return true;
    }
    public boolean a(aa p0,boolean p1){
       this.a = p1;
       this.e = p0.d;
       return this.a(p0);
    }
    public boolean a(String p0){
       aa uoaa = z.g.get(p0);
       if (uoaa == null) {
          return false;
       }
       z.g.remove(p0);
       z.h.remove(uoaa.c);
       bs.c(uoaa.m);
       Application d = z.d;
       if (d != null) {
          bs.c(d.getFileStreamPath(uoaa.c).getAbsolutePath());
       }
       return true;
    }
    public List b(){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = z.h.keySet().iterator();
       while (iterator.hasNext()) {
          uArrayList.add(z.h.get(iterator.next()));
       }
       return uArrayList;
    }
    public synchronized void b(ac p0){
       Iterator iterator;
       aa r1;
       if (p0 == null || p0.d == null) {
          return;
       }
       aa uoaa = z.h.get(p0.a);
       if (uoaa != null && uoaa.r != null) {
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          while (i < uoaa.r.size()) {
             if (p0.a(uoaa.r.get(i))) {
                uArrayList.add(Integer.valueOf(i));
             }
             i = i + 1;
          }
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             i = iterator.next().intValue();
             aa r = uoaa.r;
             if (r != null) {
                r.remove(i);
             }
          }
          r1 = uoaa.r;
          if (r1 != null && !r1.size()) {
             uoaa.r = null;
          }
       }
       String str = z.a(p0.d);
       if (TextUtils.isEmpty(str) || ("android.intent.action.PACKAGE_REMOVED__package").equals(str)) {
          return;
       }else {
          Iterator iterator1 = this.b().iterator();
          while (true) {
             if (iterator1.hasNext()) {
                r1 = iterator1.next();
                aa r2 = r1.r;
                if (r2 != null && r2.size() > 0) {
                   iterator = r1.r.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         String str1 = z.a(iterator.next().d);
                         if (!TextUtils.isEmpty(str1) && str1.equals(str)) {
                         }else {
                            continue ;
                         }
                      }else {
                         continue ;
                      }
                   }
                   return;
                }
             }else {
                UniversalReceiver.f(z.d, z.i.get(str));
                z.i.remove(str);
                goto label_00d7 ;
             }
          }
          return;
       }
    }
    public boolean b(String p0){
       aa uoaa = z.h.get(p0);
       if (uoaa == null) {
          return false;
       }
       z.g.remove(uoaa.e);
       z.h.remove(p0);
       bs.c(uoaa.m);
       Application d = z.d;
       if (d != null) {
          bs.c(d.getFileStreamPath(uoaa.c).getAbsolutePath());
       }
       return true;
    }
    public aa c(String p0){
       return z.g.get(p0);
    }
    public Map c(){
       return z.h;
    }
    public aa d(String p0){
       return z.h.get(p0);
    }
    public String e(String p0){
       aa uoaa = z.h.get(p0);
       uoaa = (uoaa == null)? null: uoaa.e;
       return uoaa;
    }
    public boolean f(String p0){
       return z.h.containsKey(p0);
    }
}
