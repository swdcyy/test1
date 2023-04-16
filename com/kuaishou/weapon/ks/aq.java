package com.kuaishou.weapon.ks.aq;
import java.lang.Object;
import java.lang.String;
import android.os.Process;
import java.lang.Integer;
import java.io.File;
import java.util.HashSet;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;
import java.lang.CharSequence;

public class aq	// class@0011ce
{
    public String[] a;

    public void aq(){
       String[] stringArray = new String[]{"/sbin/.magisk/","/sbin/.core/mirror","/sbin/.core/img","/sbin/.core/db-0/magisk.db"};
       this.a = stringArray;
    }
    public int a(){
       Object[] objArray = new Object[]{Integer.valueOf(Process.myPid())};
       String str = String.format("/proc/%d/mounts", objArray);
       try{
          File uFile = new File(str);
          HashSet hashSet = new HashSet();
          FileInputStream uFileInputSt = new FileInputStream(uFile);
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(uFileInputSt));
          String str1 = uBufferedRea.readLine();
          while (str1 != null) {
             aq ta = this.a;
             int len = ta.length;
             int i = 0;
             while (i < len) {
                if (str1.contains(ta[i])) {
                   hashSet.add(str1);
                }else {
                   i = i + 1;
                }
             }
          }
          uBufferedRea.close();
          uFileInputSt.close();
          return hashSet.size();
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
}
