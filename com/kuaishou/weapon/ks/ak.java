package com.kuaishou.weapon.ks.ak;
import java.lang.Object;
import java.lang.String;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.StringBuilder;
import android.os.Process;
import java.io.Reader;
import java.lang.CharSequence;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ApplicationInfo;
import android.os.Debug;
import java.lang.Boolean;

public class ak	// class@0011c7
{

    public void ak(){
       super();
    }
    public static String a(){
       String str;
       BufferedReader uBufferedRea = null;
       try{
          BufferedReader uBufferedRea1 = new BufferedReader(new FileReader("/proc/"+Process.myPid()+"/status"));
          try{
             do {
                str = uBufferedRea1.readLine();
             } while (str.contains("TracerPid"));
             str = str.replace("\t", " ");
             try{
                uBufferedRea1.close();
                return e0;
             }catch(java.lang.Exception e0){
             }
          }catch(java.lang.Exception e0){
             uBufferedRea = uBufferedRea1;
             try{
                if (e0) {
                   e0.close();
                }
                return "";
             }catch(java.lang.Exception e0){
             }
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean a(Context p0){
       if ((p0.getPackageManager().getApplicationInfo(p0.getPackageName(), 8192).flags & 0x02) == 1) {
          return true;
       }
       return false;
    }
    public static boolean b(){
       return Boolean.valueOf(Debug.isDebuggerConnected()).booleanValue();
    }
}
