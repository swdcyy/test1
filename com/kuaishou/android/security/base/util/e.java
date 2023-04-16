package com.kuaishou.android.security.base.util.e;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Calendar;
import android.text.format.DateFormat;
import java.lang.StringBuilder;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.io.FileInputStream;
import java.lang.StringBuffer;
import java.lang.Integer;
import java.lang.Boolean;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.lang.Exception;

public class e	// class@000f1c
{
    public LinkedList a;
    public LinkedList b;
    public String c;
    public static final char d;

    static {
       e.d = File.separatorChar;
    }
    public void e(String p0){
       super();
       this.a = new LinkedList();
       this.b = new LinkedList();
       this.c = "";
       this.c = p0;
    }
    public static File a(File p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p1 = (TextUtils.isEmpty(p1))? DateFormat.format("yyyyMMdd_kkmmss", Calendar.getInstance()).toString(): p1.trim();
       return new File(p0, p1+p2);
    }
    public static void a(File p0){
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, e.class, "5")) {
          return;
       }
       if (!p0.exists()) {
          throw new IllegalArgumentException(p0+" does not exist");
       }
       if (!p0.isDirectory()) {
          throw new IllegalArgumentException(p0+" is not a directory");
       }
       File[] uFileArray = p0.listFiles();
       if (uFileArray == null) {
          throw new IOException("Failed to list contents of "+p0);
       }
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          try{
             e.d(oobject);
          }catch(java.io.IOException e1){
          }
          i = i + 1;
       }
       if (obj == null) {
          return;
       }
       throw obj;
    }
    public static byte[] a(String p0){
       IOException iOException;
       File obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new File(p0);
       if (!obj.exists() || !obj.canRead()) {
          return null;
       }
       try{
          try{
             FileInputStream uFileInputSt = new FileInputStream(obj);
             StringBuffer str = "";
             byte[] uobyteArray = new byte[1024];
             int i = uFileInputSt.read(uobyteArray);
             while (i != -1) {
                str = str+new String(uobyteArray, 0, i);
             }
             byte[] bytes = (str).getBytes();
             try{
                uFileInputSt.close();
             }catch(java.io.IOException e6){
                e6.printStackTrace();
             }
             return bytes;
          }catch(java.io.IOException e0){
          }
          iOException.printStackTrace();
          if (p0 != null) {
             try{
                p0.close();
             }catch(java.io.IOException e6){
                e6.printStackTrace();
             }
          }
       }catch(java.io.IOException e6){
          iOException = e6;
          p0 = null;
          goto label_005c ;
       }
    }
    public static byte[] a(String p0,int p1){
       File obj;
       byte[] uobyteArray;
       FileInputStream uFileInputSt;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          return null;
       }else {
          obj = new File(p0);
          if (!obj.exists() || !obj.canRead()) {
             return null;
          }else {
             long l = obj.length();
             if (!l) {
                return null;
             }else if((long)p1 - l > 0){
                uobyteArray = new byte[(int)l];
             }else {
                uobyteArray = new byte[p1];
             }
             try{
                try{
                   uFileInputSt = new FileInputStream(obj);
                   uFileInputSt.read(uobyteArray);
                   try{
                      uFileInputSt.close();
                      uFileInputSt.close();
                   }catch(java.io.IOException e8){
                      e8.printStackTrace();
                   }
                   return uobyteArray;
                }catch(java.io.IOException e7){
                }
                e7.printStackTrace();
                if (uFileInputSt) {
                   try{
                      uFileInputSt.close();
                   }catch(java.io.IOException e7){
                      e7.printStackTrace();
                   }
                }
             }catch(java.io.IOException e7){
                uFileInputSt = null;
                goto label_005f ;
             }
          }
       }
    }
    public static void b(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "7")) {
          return;
       }
       if (!p0.exists()) {
          return;
       }
       if (!e.f(p0)) {
          e.a(p0);
       }
       if (p0.delete()) {
          return;
       }else {
          throw new IOException("Unable to delete directory "+p0+".");
       }
    }
    public static boolean c(){
       boolean b = (e.d == '\')? true: false;
       return b;
    }
    public static boolean c(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       try{
          if (p0.isDirectory()) {
             e.a(p0);
          }
          try{
             return p0.delete();
          }catch(java.lang.Exception e0){
             return e0;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static void d(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, e.class, "8")) {
          return;
       }
       if (p0.isDirectory()) {
          e.b(p0);
       }else {
          boolean b = p0.exists();
          if (!p0.delete()) {
             if (!b) {
                throw new FileNotFoundException("File does not exist: "+p0);
             }else {
                throw new IOException("Unable to delete file: "+p0);
             }
          }
       }
       return;
    }
    public static boolean e(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          if (!(p0.getParentFile().getCanonicalPath()).equals(p0.getCanonicalFile().getParentFile().getCanonicalPath()) || !(p0.getName()).equals(p0.getCanonicalFile().getName())) {
             b = true;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean f(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0, "File must not be null");
       if (e.c()) {
          return false;
       }
       if (p0.getParent() != null) {
          p0 = new File(p0.getParentFile().getCanonicalFile(), p0.getName());
       }
       return (p0.getCanonicalFile().equals(p0.getAbsoluteFile()) ^ 0x01);
    }
    public static boolean g(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       int i = 1;
       try{
          if (!p0.mkdirs()) {
             p0.mkdir();
          }
          if (p0.exists() && p0.canWrite()) {
             b = true;
          }
          return b;
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          if (p0.exists() && p0.canWrite()) {
             b = true;
          }
          return b;
       }
    }
    public static boolean h(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.exists())? true: false;
       return b;
    }
    public LinkedList a(){
       return this.a;
    }
    public LinkedList b(){
       return this.b;
    }
    public void d(){
       object oobject;
       if (PatchProxy.applyVoid(null, this, e.class, "12")) {
          return;
       }
       LinkedList linkedList = new LinkedList();
       File[] uFileArray = new File(this.c).listFiles();
       if (uFileArray == null) {
          return;
       }
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          oobject = uFileArray[i];
          if (oobject.isDirectory()) {
             linkedList.add(oobject);
          }else {
             this.b.add(oobject.getAbsolutePath());
          }
          i = i + 1;
       }
       while (!linkedList.isEmpty()) {
          File uFile = linkedList.removeFirst();
          if (uFile.isDirectory()) {
             File[] uFileArray1 = uFile.listFiles();
             if (uFileArray1 == null) {
                continue ;
             }else if(!uFileArray1.length){
                this.a.add(uFile.getAbsolutePath());
             }else {
                int len1 = uFileArray1.length;
                i = 0;
                while (i < len1) {
                   oobject = uFileArray1[i];
                   if (oobject.isDirectory()) {
                      linkedList.add(oobject);
                   }else {
                      this.b.add(oobject.getAbsolutePath());
                   }
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
}
