package com.kwai.framework.debuglog.e;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.debuglog.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import f66.e;
import qkd.b;
import java.lang.Throwable;
import com.kwai.logger.KwaiLog;

public final class e implements Runnable	// class@000b27
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       File uFile;
       if (PatchProxy.applyVoid(null, null, g.class, "9")) {
       }else {
          String absolutePath = e.a.getAbsolutePath();
          String str = "logcat.log";
          try{
             uFile = new File(absolutePath, str);
             b.x(uFile);
          }catch(java.io.IOException e3){
             KwaiLog.f("DebugLoggerInit", "delete failed, path: ", uFile.getAbsolutePath(), e3);
          }
          absolutePath = e.a.getAbsolutePath();
          str = "kwailink";
          try{
             uFile = new File(absolutePath, str);
             b.x(uFile);
          }catch(java.io.IOException e3){
             KwaiLog.f("DebugLoggerInit", "delete failed, path: ", uFile.getAbsolutePath(), e3);
          }
          absolutePath = e.a.getAbsolutePath();
          str = "emotionsdk";
          try{
             uFile = new File(absolutePath, str);
             b.x(uFile);
          }catch(java.io.IOException e3){
             KwaiLog.f("DebugLoggerInit", "delete failed, path: ", uFile.getAbsolutePath(), e3);
          }
          absolutePath = e.a.getAbsolutePath();
          str = "netlog";
          try{
             uFile = new File(absolutePath, str);
             b.x(uFile);
          }catch(java.io.IOException e3){
             KwaiLog.f("DebugLoggerInit", "delete failed, path: ", uFile.getAbsolutePath(), e3);
          }
          absolutePath = e.a.getAbsolutePath();
          try{
             uFile = new File(absolutePath, "safe_mode");
             b.x(uFile);
          }catch(java.io.IOException e3){
             KwaiLog.f("DebugLoggerInit", "delete failed, path: ", uFile.getAbsolutePath(), e3);
          }
       }
    }
}
