package com.kuaishou.webkit.internal.Logger;
import com.kuaishou.webkit.internal.Logger$1;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.webkit.internal.Logger$Delegate;
import java.lang.StringBuilder;

public class Logger	// class@001320
{
    public static Logger$Delegate sDefaultDelegate;
    public static Logger$Delegate sDelegate;

    static {
       Logger$1 u1 = new Logger$1();
       Logger.sDefaultDelegate = u1;
       Logger.sDelegate = u1;
    }
    public void Logger(){
       super();
    }
    public static void d(String p0,String p1){
       Logger.log(3, p0, p1);
    }
    public static void e(String p0,String p1){
       Logger.log(6, p0, p1);
    }
    public static void i(String p0,String p1){
       Logger.log(4, p0, p1);
    }
    public static void log(int p0,String p1,String p2){
       Logger.sDelegate.log(p0, Logger.normalizeTag(p1), p2);
    }
    public static String normalizeTag(String p0){
       if (p0.startsWith("kwv_")) {
          return p0;
       }
       return "kwv_"+p0;
    }
    public static void setDelegate(Logger$Delegate p0){
       Logger.sDelegate = (p0 != null)? p0: Logger.sDefaultDelegate;
       return;
    }
    public static void v(String p0,String p1){
       Logger.log(2, p0, p1);
    }
    public static void w(String p0,String p1){
       Logger.log(5, p0, p1);
    }
}
