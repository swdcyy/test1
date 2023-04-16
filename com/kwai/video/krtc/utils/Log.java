package com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.utils.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.io.File;
import android.content.Context;
import java.lang.IllegalArgumentException;
import com.kwai.video.krtc.AryaManager$LogParam;

public class Log	// class@0008b9
{
    public static Context a;

    static {
       c.a();
    }
    public void Log(){
       super();
    }
    public static String a(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Log.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"| "+p1;
    }
    public static String a(String p0,String p1,Throwable p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, Log.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"| "+p1+" "+p2.getMessage();
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "4")) {
          return;
       }
       Log.nativeLog(0, Log.a(p0, p1));
       return;
    }
    public static void d(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Log.class, "5")) {
          return;
       }
       Log.nativeLog(0, Log.a(p0, p1, p2));
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "10")) {
          return;
       }
       Log.nativeLog(3, Log.a(p0, p1));
       return;
    }
    public static void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Log.class, "11")) {
          return;
       }
       Log.nativeLog(3, Log.a(p0, p1, p2));
       return;
    }
    public static String getDocumentPathAndroid(){
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, objArray, Log.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Log.a;
       if (obj == null) {
          return "";
       }
       File externalFile = obj.getExternalFilesDir(objArray);
       if (externalFile == null) {
          return "";
       }
       if (!externalFile.exists()) {
          externalFile.mkdirs();
       }
       return externalFile.getAbsolutePath();
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "6")) {
          return;
       }
       Log.nativeLog(1, Log.a(p0, p1));
       return;
    }
    public static void i(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Log.class, "7")) {
          return;
       }
       Log.nativeLog(1, Log.a(p0, p1, p2));
       return;
    }
    public static void initialize(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Log.class, "1")) {
          return;
       }
       if (p0 == null) {
          throw new IllegalArgumentException("Application context cannot be null for Log.initialize.");
       }
       Log.a = p0;
       return;
    }
    public static native void nativeLog(int p0,String p1);
    public static native void nativeSetLogParam(AryaManager$LogParam p0);
    public static void setLogParam(AryaManager$LogParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Log.class, "12")) {
          return;
       }
       Log.nativeSetLogParam(p0);
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "8")) {
          return;
       }
       Log.nativeLog(2, Log.a(p0, p1));
       return;
    }
    public static void w(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Log.class, "9")) {
          return;
       }
       Log.nativeLog(2, Log.a(p0, p1, p2));
       return;
    }
}
