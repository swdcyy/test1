package com.kwai.chat.kwailink.utils.AndroidUtils;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.Exception;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.io.IOException;
import java.io.FileNotFoundException;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class AndroidUtils	// class@000a6f
{
    public static String sProcessName;

    public void AndroidUtils(){
       super();
    }
    public static int checkPermission(Context p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(AndroidUtils.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, AndroidUtils.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       try{
          return p0.checkPermission(p1, p2, p3);
       }catch(java.lang.RuntimeException e0){
          return -1;
       }
    }
    public static String getProcessName(Context p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, AndroidUtils.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(AndroidUtils.sProcessName)) {
          return AndroidUtils.sProcessName;
       }
       try{
          int i = Process.myPid();
          ActivityManager systemServic = p0.getSystemService("activity");
          if (systemServic != null) {
             List runningAppPr = systemServic.getRunningAppProcesses();
             if (runningAppPr != null) {
                Iterator iterator = runningAppPr.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
                      if (runningAppPr1.pid == i) {
                         AndroidUtils.sProcessName = runningAppPr1.processName;
                      }
                   }
                }
             }
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       if (TextUtils.isEmpty(AndroidUtils.sProcessName)) {
          try{
             BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/cmdline")));
             obj = "";
             int i1 = uBufferedRea.read();
             while (i1 > 0) {
                obj = obj+(char)i1;
             }
             AndroidUtils.sProcessName = obj;
             uBufferedRea.close();
          }catch(java.io.FileNotFoundException e3){
             e3.printStackTrace();
          }catch(java.io.IOException e3){
             e3.printStackTrace();
          }
       }
    }
    public static Intent registerReceiverWithoutException(Context p0,BroadcastReceiver p1,IntentFilter p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, AndroidUtils.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p1 != null) {
          return UniversalReceiver.e(p0, p1, p2);
       }
       return null;
    }
}
