package com.kwai.framework.security.a;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import android.content.Context;
import java.lang.StringBuffer;
import java.io.File;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.kuaishou.android.security.base.exception.KSException;
import java.lang.Integer;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel$MapMode;
import java.nio.MappedByteBuffer;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import java.math.BigInteger;
import java.io.IOException;

public final class a	// class@000cdd
{
    public static long a;
    public static long b;
    public static List c;
    public static boolean d;
    public static boolean e;

    static {
       a.c = new ArrayList();
       a.d = false;
       a.e = true;
    }
    public void a(){
       super();
    }
    public static void a(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
          return;
       }
       a.c.add(p0);
       return;
    }
    public static void b(Context p0){
       String packageResou;
       File[] uFileArray;
       int len;
       int i6;
       object oobject;
       Object[] objArray1;
       StringBuffer str = "-->\r\n";
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, null, uoa, "3")) {
          return;
       }
       StringBuffer str1 = "";
       int i = 0;
       int i1 = 1;
       try{
          packageResou = p0.getPackageResourcePath();
          String separator = File.separator;
          File uFile = new File(packageResou.substring(i, packageResou.lastIndexOf(separator))+separator+"lib"+separator);
          if (uFile.exists()) {
             str1 = str1+uFile.getAbsolutePath()+str;
             uFileArray = uFile.listFiles();
             len = uFileArray.length;
             i6 = 0;
             while (i6 < len) {
                oobject = uFileArray[i6];
                if (oobject.exists()) {
                   str1 = str1+"\t"+oobject.getName()+str;
                   StringBuffer str2 = "";
                   File[] uFileArray1 = oobject.listFiles();
                   int len1 = uFileArray1.length;
                   int i7 = 0;
                   while (i7 < len1) {
                      object oobject1 = uFileArray1[i7];
                      objArray1 = new Object[2];
                      objArray1[i] = oobject1.getName();
                      objArray1[i1] = a.f(oobject1);
                      str2 = str2+String.format("\t\t%s[%s]\r\n", objArray1);
                      i7 = i7 + 1;
                      objArray1 = 0;
                   }
                   str1 = str1+str2;
                }
                i6 = i6 + 1;
                objArray1 = null;
             }
          }
          str = "\t/system/lib\r\n";
          File[] uFileArray2 = new File("/system/lib").listFiles();
          int len2 = uFileArray2.length;
          for (len = 0; len < len2; len = len + 1) {
             object oobject2 = uFileArray2[len];
             Object[] objArray2 = new Object[2];
             objArray2[i] = oobject2.getName();
             objArray2[i1] = a.f(oobject2);
             str = str+String.format("\t\t%s[%s]\r\n", objArray2);
          }
          StringBuffer str3 = "\t/vendor/lib\r\n";
          uFileArray = new File("/vendor/lib").listFiles();
          len = uFileArray.length;
          for (i6 = 0; i6 < len; i6 = i6 + 1) {
             oobject = uFileArray[i6];
             Object[] objArray3 = new Object[2];
             objArray3[i] = oobject.getName();
             objArray3[i1] = a.f(oobject);
             str3 = str3+String.format("\t\t%s[%s]\r\n", objArray3);
          }
          str1 = str1+str+str3;
       }catch(java.lang.Exception e0){
       }
       Object[] objArray = new Object[]{a.c(),str1};
       str = String.format("%s alllibinfo[%s]", objArray);
       if (!PatchProxy.applyVoidOneRefs(str, null, uoa, "4")) {
          int i2 = str.length();
          int i3 = 2000;
          int i4 = 0;
          while (i < 200) {
             packageResou = "storm";
             if (i2 > i3) {
                Log.g(packageResou, str.substring(i4, i3));
                i4 = i3 + 2000;
                i = i + 1;
                int i5 = i4;
                i4 = i3;
                i3 = i5;
             }else {
                Log.d(packageResou, str.substring(i4, i2));
                break ;
             }
          }
       }
       return;
    }
    public static String c(){
       Object[] objArray;
       StringBuffer obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       Iterator iterator = a.c.iterator();
       while (iterator.hasNext()) {
          Exception uException = iterator.next();
          if (uException instanceof KSException) {
             objArray = new Object[]{Integer.valueOf(uException.getErrorCode()),uException.getMessage()};
             obj = obj+String.format("KSException errcode[%d] msg[%s]", objArray);
          }else {
             objArray = new Object[]{uException.getMessage()};
             obj = obj+String.format("Exception msg[%s]", objArray);
          }
       }
       return obj;
    }
    public static long d(){
       return a.a;
    }
    public static long e(){
       return a.b;
    }
    public static String f(File p0){
       String str;
       FileInputStream obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new FileInputStream(p0);
          MessageDigest instance = MessageDigest.getInstance("MD5");
          instance.update(obj.getChannel().map(FileChannel$MapMode.READ_ONLY, 0, p0.length()));
          str = new BigInteger(1, instance.digest()).toString(16);
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       try{
          obj.close();
       }catch(java.io.IOException e8){
          e8.printStackTrace();
       }
       return str;
    }
    public static void g(boolean p0){
       a.d = p0;
    }
    public static void h(boolean p0){
       a.e = p0;
    }
}
