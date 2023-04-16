package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.io.FilesKt__UtilsKt;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.Iterator;
import java.lang.Iterable;
import zsd.u;
import java.util.Collection;
import java.lang.Integer;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import msd.p;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper$getFileSize$1;
import java.lang.Number;
import java.lang.NullPointerException;
import java.lang.Exception;
import android.os.Environment;

public final class GrowthCleanerHelper	// class@001333
{

    public static final boolean a(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthCleanerHelper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!p0.exists()) {
          return b;
       }
       if (p0.isFile()) {
          b = p0.delete();
       }else if(FilesKt__UtilsKt.V(p0)){
          b = true;
       }else {
          File[] uFileArray = p0.listFiles();
          if (uFileArray != null) {
             int len = uFileArray.length;
             for (int i = 0; i < len; i = i + 1) {
                GrowthCleanerHelper.a(uFileArray[i]);
             }
          }
       }
       return b;
    }
    public static final void b(File p0,ArrayList p1,ArrayList p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, GrowthCleanerHelper.class, "4")) {
          return;
       }
       a.p(p0, "$this$filterApkTo");
       a.p(p1, "apkFiles");
       a.p(p2, "notSearchFiles");
       if (p0.exists() && p0.isDirectory()) {
          File[] uFileArray = p0.listFiles();
          if (uFileArray != null) {
             List list = ArraysKt___ArraysKt.qa(uFileArray);
             if (list != null) {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   String obj1 = obj;
                   boolean b = false;
                   if (obj1.isFile()) {
                      obj1 = obj1.getName();
                      a.o(obj1, "it.name");
                      if (u.H1(obj1, ".apk", b, 2, null)) {
                         b = true;
                      }
                   }
                   if (b) {
                      uArrayList.add(obj);
                   }
                }
                p1.addAll(uArrayList);
                p1 = new ArrayList();
                Iterator iterator1 = list.iterator();
                while (iterator1.hasNext()) {
                   Object obj2 = iterator1.next();
                   if (obj2.isDirectory()) {
                      p1.add(obj2);
                   }
                }
                p2.addAll(p1);
             }
          }
       }
       return;
    }
    public static final String c(int p0){
       Application obj;
       String str;
       GrowthCleanerHelper growthCleane = GrowthCleanerHelper.class;
       if (PatchProxy.isSupport(growthCleane)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, growthCleane, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.B;
       if (obj != null) {
          Resources resources = obj.getResources();
          if (resources != null) {
             str = resources.getString(p0);
             if (str != null) {
             label_002d :
                a.o(str, "AppEnv.APP?.resources?.getString\(id\) ?: \"\"");
                return str;
             }
          }
       }
       str = "";
       goto label_002d ;
    }
    public static long d(File p0,p p1,int p2,Object p3){
       long l;
       Object obj = null;
       GrowthCleanerHelper$getFileSize$1 iNSTANCE = (p2 & 0x02)? GrowthCleanerHelper$getFileSize$1.INSTANCE: obj;
       obj = PatchProxy.applyTwoRefs(p0, iNSTANCE, obj, GrowthCleanerHelper.class, "10");
       if (obj != PatchProxyResult.class) {
          l = obj.longValue();
       }else {
          a.p(iNSTANCE, "filter");
          l = GrowthCleanerHelper.g(p0, 0, iNSTANCE);
       }
       return l;
    }
    public static final String e(File p0){
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, GrowthCleanerHelper.class, "15");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = "";
       if (p0 != null) {
          try{
             String name = p0.getName();
             a.o(name, "name");
             if (u.q2(name, ".", false, 2, obj)) {
                String name1 = p0.getName();
                a.o(name1, "name");
                int i = 1;
                if (name1 != null) {
                   name1 = name1.substring(i);
                   a.o(name1, "\(this as java.lang.String\).substring\(startIndex\)");
                   obj1 = name1;
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
             }else {
                obj1 = p0.getName();
             }
          }catch(java.lang.Exception e0){
          }
       }
       return obj1;
    }
    public static final boolean f(File p0,File p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, GrowthCleanerHelper.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (p1 != null && !p1.isFile()) {
          for (p0 = p0.getParentFile(); p0 != null; p0 = p0.getParentFile()) {
             int i = a.g(p0.getParentFile(), p0) ^ 1;
             if (i) {
                if (a.g(p0, p1)) {
                   return 1;
                }
             }
          }
       }
       return false;
    }
    public static final long g(File p0,int p1,p p2){
       if (PatchProxy.isSupport(GrowthCleanerHelper.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, null, GrowthCleanerHelper.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = 0;
       if (p0 == null) {
          return l;
       }else if(p0.isFile()){
          if (p2.invoke(p0, Integer.valueOf(p1)).booleanValue()) {
             l = p0.length();
          }
          return l;
       }else {
          File[] uFileArray = p0.listFiles();
          a.o(uFileArray, "fileList");
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             a.o(oobject, "item");
             int i1 = p1 + 1;
             if (p2.invoke(oobject, Integer.valueOf(i1)).booleanValue()) {
                l = l + GrowthCleanerHelper.g(oobject, i1, p2);
             }
             i = i + 1;
          }
       }
    }
    public static final List h(){
       Object[] objArray1;
       Object[] objArray = null;
       ArrayList obj = PatchProxy.apply(objArray, objArray, GrowthCleanerHelper.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       File externalStor = Environment.getExternalStorageDirectory();
       if (externalStor != null) {
          File uFile = new File(externalStor, "data");
          int i = 1;
          String str = (uFile.exists() && uFile.isDirectory())? 1: null;
          if (!str) {
             objArray1 = objArray;
          }
          if (uFile != null) {
             obj.add(uFile);
          }
          uFile = new File(externalStor, ".data");
          File uFile1 = (uFile.exists() && uFile.isDirectory())? 1: null;
          if (!uFile1) {
             objArray1 = objArray;
          }
          if (uFile != null) {
             obj.add(uFile);
          }
          uFile = new File(new File(externalStor, "data"), "data");
          uFile1 = (uFile.exists() && uFile.isDirectory())? 1: null;
          if (!uFile1) {
             objArray1 = objArray;
          }
          if (uFile != null) {
             obj.add(uFile);
          }
          uFile = new File(new File(externalStor, ".data"), "data");
          if (!uFile.exists() || !uFile.isDirectory()) {
             i = 0;
          }
          if (i) {
             objArray = uFile;
          }
          if (objArray != null) {
             obj.add(objArray);
          }
       }
       return obj;
    }
    public static final void i(File p0,List p1,List p2,ArrayList p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, GrowthCleanerHelper.class, "8")) {
          return;
       }
       if (p0 != null && p0.exists() == true) {
          File[] uFileArray = p0.listFiles();
          if (uFileArray != null) {
             ArrayList uArrayList = new ArrayList();
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                String str = GrowthCleanerHelper.e(oobject);
                a.o(oobject, "it");
                if (oobject.isDirectory()) {
                   a.o(str, "filePackage");
                   int i1 = 2;
                   if (!u.q2(str, "com.", false, i1, null) && (!u.q2(str, "cn.", false, i1, null) && (u.q2(str, "me.", false, i1, null) || (u.q2(str, "net.", false, i1, null) && (p2 == null || (p2.contains(str) && !p1.contains(str))))))) {
                      str = 1;
                   label_0072 :
                      if (str) {
                         uArrayList.add(oobject);
                      }
                      i = i + 1;
                   }
                }
                str = null;
                goto label_0072 ;
             }
             p3.addAll(uArrayList);
          }
       }
       return;
    }
}
