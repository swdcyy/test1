package com.kuaishou.weapon.ks.am;
import java.lang.Object;
import android.os.Build;
import java.lang.String;
import java.lang.ProcessBuilder;
import java.lang.Process;
import java.lang.StringBuffer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;

public class am	// class@0011c9
{

    public void am(){
       super();
    }
    public static boolean b(){
       if (("nokia").equalsIgnoreCase(Build.MANUFACTURER) && (("Nokia_N1").equalsIgnoreCase(Build.DEVICE) || ("N1").equalsIgnoreCase(Build.MODEL))) {
          return false;
       }
       try{
          String[] stringArray = new String[]{"/system/bin/cat","/proc/cpuinfo"};
          StringBuffer str = "";
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(new ProcessBuilder(stringArray).start().getInputStream(), "utf-8"));
          String str1 = uBufferedRea.readLine();
          while (!TextUtils.isEmpty(str1)) {
             str = str+str1;
          }
          uBufferedRea.close();
          str1 = (str).toLowerCase();
          if (!str1.contains("intel") && (str1.contains("x86") || str1.contains("amd"))) {
             return true;
          }
          return false;
       }catch(java.io.IOException e0){
          return false;
       }
    }
    public final String a(String p0){
       String str = null;
       try{
          File uFile = new File(p0);
          if (uFile.exists() && uFile.canRead()) {
             byte[] uobyteArray = new byte[1024];
             FileInputStream uFileInputSt = new FileInputStream(uFile);
             String str1 = str;
             int i = uFileInputSt.read(uobyteArray);
             while (i != -1) {
                str1 = new String(uobyteArray, 0, i);
                if (i > 0) {
                   break ;
                }
             }
             uFileInputSt.close();
             str = str1;
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean a(){
       String str = "/proc/tty/drivers";
       String str1 = "/proc/cpuinfo";
       int i = 0;
       try{
          str = this.a(str);
          boolean b = true;
          str = (!TextUtils.isEmpty(str) && str.contains("goldfish"))? 1: 0;
          if (!str) {
             str1 = this.a(str1);
             if (!TextUtils.isEmpty(str1) && str1.contains("goldfish")) {
             label_002f :
                return b;
             }
          }
          b = str;
          goto label_002f ;
       }catch(java.lang.Exception e0){
          return i;
       }
    }
}
