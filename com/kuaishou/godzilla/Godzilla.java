package com.kuaishou.godzilla.Godzilla;
import com.kuaishou.godzilla.b;
import java.lang.Object;
import com.kuaishou.godzilla.Godzilla$LibraryLoader;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.godzilla.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.godzilla.Godzilla$Logger;

public class Godzilla	// class@00088f
{
    public static boolean sDebug;
    public static boolean sInitialized;
    public static Godzilla$Logger sLogger;

    static {
       Godzilla.sLogger = b.a;
       Godzilla.sInitialized = false;
    }
    public void Godzilla(){
       super();
    }
    public static synchronized void initialize(Godzilla$LibraryLoader p0){
       a a;
       _monitor_enter(Godzilla.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, Godzilla.class, "1")) {
          _monitor_exit(Godzilla.class);
          return;
       }else if(Godzilla.sInitialized){
          _monitor_exit(Godzilla.class);
          return;
       }else if(p0 == null){
          a = a.a;
       }
       a.loadLibrary("godzilla");
       Godzilla.sInitialized = true;
       _monitor_exit(Godzilla.class);
       return;
    }
    public static synchronized boolean isInitialized(){
       _monitor_enter(Godzilla.class);
       _monitor_exit(Godzilla.class);
       return Godzilla.sInitialized;
    }
    public static void lambda$static$0(String p0,String p1){
    }
    public static void logd(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Godzilla.class, "2")) {
          return;
       }
       Godzilla.logd("Godzilla:", p0);
       return;
    }
    public static void logd(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Godzilla.class, "3")) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       if (Godzilla.sDebug) {
          Godzilla$Logger sLogger = Godzilla.sLogger;
          if (sLogger != null) {
             sLogger.log(p0, p1);
          }
       }
       return;
    }
    public static void logi(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Godzilla.class, "4")) {
          return;
       }
       Godzilla.logi("Godzilla:", p0);
       return;
    }
    public static void logi(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Godzilla.class, "5")) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       Godzilla$Logger sLogger = Godzilla.sLogger;
       if (sLogger != null) {
          sLogger.log(p0, p1);
       }
       return;
    }
    public static void setDebug(boolean p0){
       Godzilla.sDebug = p0;
    }
    public static void setLogger(Godzilla$Logger p0){
       Godzilla.sLogger = p0;
    }
}
