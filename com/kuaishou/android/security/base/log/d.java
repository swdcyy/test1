package com.kuaishou.android.security.base.log.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.util.Log;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.io.File;
import android.os.Environment;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.PrintWriter;
import java.lang.Exception;
import com.kuaishou.android.security.base.log.a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import android.os.Process;
import java.lang.Thread;

public class d	// class@0006a0
{
    public static boolean d = true;
    public static a e;
    public static String f;
    public static PrintWriter g;

    static {
       d.a(false);
    }
    public void d(){
       super();
    }
    public static int a(String p0,String p1,Throwable p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.d(p0, p1, p2);
    }
    public static int a(String p0,String p1,Throwable p2,Object[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.d(p0, d.a(p1, p3), p2);
    }
    public static int a(String p0,String p1,Object[] p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "16");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       p0 = d.a(p1, p2);
       int i = 0;
       int i1 = p0.length() / 2000;
       while (i <= i1) {
          i1 = i * 2000;
          i++;
          int i2 = i * 2000;
          if (i2 > p0.length()) {
             i2 = p0.length();
          }
          p0.substring(i1, i2);
       }
       return 0;
    }
    public static String a(String p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, d.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = (p0 == null)? "": p0;
       try{
          return String.format(str, p1);
       }catch(java.lang.RuntimeException e6){
          Object[] objArray = new Object[]{e6.getMessage(),p0};
          d.e("storm", "format error. reason=%s, format=%s", objArray);
          p1 = new Object[]{p0};
          return String.format(obj, p1);
       }
    }
    public static void a(){
       Object[] objArray1;
       Object[] objArray2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, d.class, "1")) {
          return;
       }
       try{
          String str = Environment.getExternalStorageDirectory()+"/"+d.f;
          try{
             FileOutputStream uFileOutputS = new FileOutputStream(str, true);
             try{
                OutputStreamWriter outputStream = new OutputStreamWriter(uFileOutputS);
                try{
                   BufferedWriter uBufferedWri = new BufferedWriter(outputStream);
                   PrintWriter printWriter = new PrintWriter(uBufferedWri, true);
                   try{
                      d.g = printWriter;
                      uFileOutputS.close();
                   }catch(java.lang.Exception e1){
                      e1.printStackTrace();
                   }
                   try{
                      outputStream.close();
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                }catch(java.io.IOException e0){
                }
             label_0087 :
                if (objArray != null) {
                   try{
                      objArray.close();
                   }catch(java.lang.Exception e1){
                      e1.printStackTrace();
                   }
                }
             }catch(java.io.IOException e0){
                objArray2 = objArray;
             }
             objArray = uFileOutputS;
             goto label_0087 ;
          }catch(java.io.IOException e0){
             objArray1 = objArray;
             objArray2 = objArray1;
             goto label_0060 ;
          }
       }catch(java.io.IOException e0){
          objArray1 = objArray;
          objArray2 = objArray1;
          goto label_0087 ;
       }
    }
    public static void a(a p0){
       d.e = p0;
    }
    public static void a(Class p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "11")) {
          return;
       }
       if (!d.d) {
          return;
       }
       if (p0 == null) {
          return;
       }
       d.e(p0.getName()+" Exception ");
       if (p1 == null) {
          return;
       }
       d.b(p1);
       return;
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "7")) {
          return;
       }
       if (d.d) {
          Object[] objArray = new Object[0];
          d.a("storm", "[*] Debug : "+p0, objArray);
       }
       return;
    }
    public static void a(Throwable p0){
       PatchProxy.applyVoidOneRefs(p0, null, d.class, "29");
    }
    public static void a(boolean p0){
       d.d = p0;
    }
    public static int b(String p0,String p1,Throwable p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.e(p0, p1, p2);
    }
    public static int b(String p0,String p1,Throwable p2,Object[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, d.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.e(p0, d.a(p1, p3), p2);
    }
    public static int b(String p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.e(p0, d.a(p1, p2));
    }
    public static void b(String p0){
       PatchProxy.applyVoidOneRefs(p0, null, d.class, "4");
    }
    public static void b(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "5")) {
          return;
       }
       if (d.d) {
          d.c("storm", p0, p1);
       }
       return;
    }
    public static void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "12")) {
          return;
       }
       PrintWriter g = d.g;
       if (g != null) {
          p0.printStackTrace(g);
       }
       return;
    }
    public static int c(String p0,String p1,Throwable p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.i(p0, p1, p2);
    }
    public static int c(String p0,String p1,Throwable p2,Object[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, d.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.i(p0, d.a(p1, p3), p2);
    }
    public static int c(String p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.i(p0, d.a(p1, p2));
    }
    public static void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "8")) {
          return;
       }
       if (d.d) {
          Object[] objArray = new Object[0];
          d.b("storm", "[-] Error : "+p0, objArray);
       }
       return;
    }
    public static void c(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "2")) {
          return;
       }
       a e = d.e;
       if (e != null) {
          e.a(p0);
       }
       return;
    }
    public static int d(String p0,String p1,Throwable p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.v(p0, p1, p2);
    }
    public static int d(String p0,String p1,Throwable p2,Object[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.v(p0, d.a(p1, p3), p2);
    }
    public static int d(String p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.v(p0, d.a(p1, p2));
    }
    public static void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "3")) {
          return;
       }
       if (d.d) {
          Object[] objArray = new Object[0];
          d.c("storm", "[*] Info : "+p0, objArray);
       }
       return;
    }
    public static int e(String p0,String p1,Throwable p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.w(p0, p1, p2);
    }
    public static int e(String p0,String p1,Throwable p2,Object[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, d.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.w(p0, d.a(p1, p3), p2);
    }
    public static int e(String p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Log.w(p0, d.a(p1, p2));
    }
    public static void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "10")) {
          return;
       }
       try{
          if (d.g != null) {
             String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
             d.g.println(str+" Pid\(\): "+Process.myPid()+" T"+Thread.currentThread().getId()+" "+p0);
             d.g.flush();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "6")) {
          return;
       }
       if (d.d) {
          Object[] objArray = new Object[0];
          d.d("storm", "[*] Verbose : "+p0, objArray);
       }
       return;
    }
    public static void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "9")) {
          return;
       }
       if (d.d) {
          Object[] objArray = new Object[0];
          d.e("storm", "[-] Warn : "+p0, objArray);
       }
       return;
    }
}
