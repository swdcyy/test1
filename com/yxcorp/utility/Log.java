package com.yxcorp.utility.Log;
import com.yxcorp.utility.Log$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.utility.Log$LEVEL;
import ekd.e0;
import java.lang.StringBuilder;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import java.net.UnknownHostException;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.IOException;

public final class Log	// class@0013fa
{
    public static Log$b a;
    public static boolean b;

    static {
       Log.a = Log$b.a;
       Log.b = true;
    }
    public void Log(){
       super();
    }
    public static void a(String p0,Throwable p1){
       Log.i(Log$LEVEL.ERROR, p0, p1.getMessage(), p1);
       if (e0.a) {
          Toast.makeText(e0.b, p1.getMessage()+"Ïê¼ûlogcat", 0).show();
       }
       return;
    }
    public static void b(String p0,String p1){
       Log.i(Log$LEVEL.DEBUG, p0, p1, null);
    }
    public static void c(String p0,String p1,Throwable p2){
       Log.i(Log$LEVEL.DEBUG, p0, p1, p2);
    }
    public static void d(String p0,String p1){
       Log.i(Log$LEVEL.ERROR, p0, p1, null);
    }
    public static void e(String p0,String p1,Throwable p2){
       Log.i(Log$LEVEL.ERROR, p0, p1, p2);
    }
    public static String f(Throwable p0){
       String str = "";
       if (p0 == null) {
          return str;
       }
       Throwable throwable = p0;
       while (true) {
          if (throwable != null) {
             if (throwable instanceof UnknownHostException) {
                return str;
             }
             throwable = throwable.getCause();
          }else {
             try{
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                p0.printStackTrace(printWriter);
                printWriter.flush();
                str = stringWriter.toString();
                stringWriter.close();
                break ;
             }catch(java.io.IOException e3){
                e3.printStackTrace();
             }
          }
       }
       return str;
    }
    public static void g(String p0,String p1){
       Log.i(Log$LEVEL.INFO, p0, p1, null);
    }
    public static void h(String p0,String p1,Throwable p2){
       Log.i(Log$LEVEL.INFO, p0, p1, p2);
    }
    public static void i(Log$LEVEL p0,String p1,String p2,Throwable p3){
       if (!Log.b) {
          return;
       }
       Log.a.a(p0, p1, p2, p3);
       return;
    }
    public static void j(String p0,Throwable p1){
       Log.i(Log$LEVEL.ERROR, p0, Log.f(p1), null);
    }
    public static void k(Throwable p0){
       Log.j("@crash", p0);
    }
    public static void l(String p0,String p1){
       Log.i(Log$LEVEL.VERBOSE, p0, p1, null);
    }
    public static void m(String p0,String p1,Throwable p2){
       Log.i(Log$LEVEL.VERBOSE, p0, p1, p2);
    }
    public static void n(String p0,String p1){
       Log.i(Log$LEVEL.WARN, p0, p1, null);
    }
    public static void o(String p0,String p1,Throwable p2){
       Log.i(Log$LEVEL.WARN, p0, p1, p2);
    }
    public static void p(String p0,Throwable p1){
       Log.i(Log$LEVEL.WARN, null, p0, p1);
    }
}
