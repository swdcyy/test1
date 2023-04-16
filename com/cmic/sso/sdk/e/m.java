package com.cmic.sso.sdk.e.m;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.ProcessBuilder;
import java.lang.Process;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import java.lang.Exception;
import java.io.File;
import com.cmic.sso.sdk.e.c;
import java.lang.CharSequence;
import android.text.TextUtils;

public class m	// class@000f67
{

    public static String a(String[] p0){
       StringBuilder str = "";
       try{
          ProcessBuilder processBuild = new ProcessBuilder(p0);
          Process process = processBuild.start();
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(process.getInputStream()));
          String str1 = uBufferedRea.readLine();
          while (str1 != null) {
             str = str+str1;
          }
          process.getInputStream().close();
          process.destroy();
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return str;
    }
    public static boolean a(){
       String str = "root";
       String[] stringArray = new String[]{"/system/xbin/","/system/bin/","/system/sbin/","/sbin/","/vendor/bin/","/su/bin/"};
       int i = 0;
       int i1 = 0;
       while (i1 < 6) {
          try{
             String str1 = stringArray[i1]+"su";
             if (new File(str1).exists()) {
                stringArray = new String[]{"ls","-l",str1};
                String str2 = m.a(stringArray);
                c.b("cyb", "isRooted="+str2);
                if (!TextUtils.isEmpty(str2) && str2.indexOf(str) != str2.lastIndexOf(str)) {
                   i = true;
                }
                return i;
             }else {
                i1 = i1 + 1;
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
       return i;
    }
}
