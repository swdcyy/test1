package com.tencent.mm.opensdk.utils.Log;
import java.lang.Object;
import java.lang.String;
import com.tencent.mm.opensdk.utils.ILog;

public class Log	// class@000f1f
{
    public static ILog logImpl;

    public void Log(){
       super();
    }
    public static void d(String p0,String p1){
       ILog logImpl = Log.logImpl;
       if (logImpl == null) {
       }else {
          logImpl.d(p0, p1);
       }
       return;
    }
    public static void e(String p0,String p1){
       ILog logImpl = Log.logImpl;
       if (logImpl == null) {
       }else {
          logImpl.e(p0, p1);
       }
       return;
    }
    public static void i(String p0,String p1){
       ILog logImpl = Log.logImpl;
       if (logImpl == null) {
       }else {
          logImpl.i(p0, p1);
       }
       return;
    }
    public static void setLogImpl(ILog p0){
       Log.logImpl = p0;
    }
    public static void v(String p0,String p1){
       ILog logImpl = Log.logImpl;
       if (logImpl == null) {
       }else {
          logImpl.v(p0, p1);
       }
       return;
    }
    public static void w(String p0,String p1){
       ILog logImpl = Log.logImpl;
       if (logImpl == null) {
       }else {
          logImpl.w(p0, p1);
       }
       return;
    }
}
