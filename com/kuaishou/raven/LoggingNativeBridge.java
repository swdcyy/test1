package com.kuaishou.raven.LoggingNativeBridge;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import es4.a;

public class LoggingNativeBridge	// class@000e8c
{
    public static a a;

    public void LoggingNativeBridge(){
       super();
    }
    public static void Log(int p0,String p1){
       LoggingNativeBridge loggingNativ = LoggingNativeBridge.class;
       if (PatchProxy.isSupport(loggingNativ) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, loggingNativ, "1")) {
          return;
       }
       a a = LoggingNativeBridge.a;
       if (a != null) {
          a.a(p0, p1);
       }
       return;
    }
}
