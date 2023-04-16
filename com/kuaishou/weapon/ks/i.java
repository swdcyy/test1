package com.kuaishou.weapon.ks.i;
import java.lang.ThreadLocal;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import java.net.UnknownHostException;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StackTraceElement;
import java.lang.StringBuilder;

public class i	// class@001211
{
    public static int f = 255;
    public static ThreadLocal g;
    public static int h;

    static {
       i.g = new ThreadLocal();
    }
    public void i(){
       super();
    }
    public static String a(Throwable p0){
       String str = "";
       if (p0 == null) {
          return str;
       }
       Throwable throwable = p0;
       while (true) {
          if (throwable != null) {
             if (throwable instanceof UnknownHostException) {
                break ;
             }else {
                throwable = throwable.getCause();
             }
          }else {
             StringWriter stringWriter = new StringWriter();
             p0.printStackTrace(new PrintWriter(stringWriter));
             return stringWriter.toString();
          }
       }
       return str;
    }
    public static void a(int p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       StackTraceElement[] stackTrace = new Throwable().getStackTrace();
       if (stackTrace.length < 3) {
          return;
       }
       String fileName = stackTrace[2].getFileName();
       int lineNumber = stackTrace[2].getLineNumber();
       String methodName = stackTrace[2].getMethodName();
       int i = 0;
       int i1 = 5;
       if (fileName.length() > i1) {
          fileName = fileName.substring(i, (fileName.length() - i1));
       }
       StringBuilder str = i.g.get();
       if (str == null) {
          str = "";
          i.g.set(str);
       }
       _monitor_enter(str);
       str.setLength(i);
       i.h = i.h + 1;
       _monitor_exit(str+"["+i.h+"]["+fileName+':'+lineNumber+'.'+methodName+"] "+p1);
       return;
    }
    public static void a(String p0){
       int f = i.f;
       if (f == -1 || !f) {
          i.a(0, p0);
       }
       return;
    }
    public static void a(String p0,Throwable p1){
       int f = i.f;
       if (f == -1 || !f) {
          i.a(0, p0+"\n"+i.a(p1));
       }
       return;
    }
    public static void b(String p0){
       int f = i.f;
       if (f == -1 || (!f || f == 1)) {
          i.a(1, p0);
       }
       return;
    }
    public static void b(String p0,Throwable p1){
       int f = i.f;
       if (f == -1 || (!f || f == 1)) {
          i.a(1, p0+"\n"+i.a(p1));
       }
       return;
    }
    public static void c(String p0){
       int f = i.f;
       if (f == -1 || (!f || (f == 1 || f == 2))) {
          i.a(2, p0);
       }
       return;
    }
    public static void c(String p0,Throwable p1){
       int f = i.f;
       if (f == -1 || (!f || (f == 1 || f == 2))) {
          i.a(2, p0+"\n"+i.a(p1));
       }
       return;
    }
    public static void d(String p0){
    }
}
