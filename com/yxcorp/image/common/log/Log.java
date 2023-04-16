package com.yxcorp.image.common.log.Log;
import com.yxcorp.image.common.log.Log$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.common.log.Log$LEVEL;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class Log	// class@001375
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
    public static void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "14")) {
          return;
       }
       Log.d(Log$LEVEL.ERROR, p0, p1, null);
       return;
    }
    public static void b(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Log.class, "15")) {
          return;
       }
       Log.d(Log$LEVEL.ERROR, p0, p1, p2);
       return;
    }
    public static void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "9")) {
          return;
       }
       Log.d(Log$LEVEL.INFO, p0, p1, null);
       return;
    }
    public static void d(Log$LEVEL p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, Log.class, "1")) {
          return;
       }
       if (Log.b) {
          Log$b a = Log.a;
          if (a != null) {
             String str = PatchProxy.applyOneRefs(p1, null, Log.class, "23");
             if (str != PatchProxyResult.class) {
             }else if(p1 != null && !p1.isEmpty()){
                str = "KwaiImage:"+p1;
             }else {
                str = "KwaiImage";
             }
             a.a(p0, str, p2, p3);
          }
       }
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "11")) {
          return;
       }
       Log.d(Log$LEVEL.WARN, p0, p1, null);
       return;
    }
}
