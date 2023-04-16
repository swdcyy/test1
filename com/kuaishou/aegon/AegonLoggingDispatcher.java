package com.kuaishou.aegon.AegonLoggingDispatcher;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import bo.p;

public class AegonLoggingDispatcher	// class@0005d9
{
    public static p a;

    public void AegonLoggingDispatcher(){
       super();
    }
    public static void Log(int p0,String p1,String p2){
       if (PatchProxy.isSupport(AegonLoggingDispatcher.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, AegonLoggingDispatcher.class, "2")) {
          return;
       }
       AegonLoggingDispatcher.a(p0, p1, p2);
       return;
    }
    public static void a(int p0,String p1,String p2){
       if (PatchProxy.isSupport(AegonLoggingDispatcher.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, AegonLoggingDispatcher.class, "1")) {
          return;
       }
       p a = AegonLoggingDispatcher.a;
       if (a != null) {
          a.Log(p0, p1, p2);
       }
       return;
    }
}
