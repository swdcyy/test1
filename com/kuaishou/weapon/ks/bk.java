package com.kuaishou.weapon.ks.bk;
import java.lang.Object;
import java.lang.String;
import android.os.Build;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.weapon.ks.bh;
import com.kuaishou.weapon.ks.bj;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.Integer;

public class bk	// class@0011e7
{

    public void bk(){
       super();
    }
    public static String a(){
       String cPU_ABI2 = Build.CPU_ABI2;
       StringBuilder str = Build.CPU_ABI;
       if (!TextUtils.isEmpty(cPU_ABI2)) {
          str = str+";"+cPU_ABI2;
       }
       String str1 = bh.a("ro.product.cpu.abilist");
       if (!TextUtils.isEmpty(str1)) {
          str = str+";"+str1;
       }
       return str;
    }
    public static bj b(){
       String[] stringArray;
       String str1;
       FileInputStream uFileInputSt = new FileInputStream(new File("/proc/cpuinfo"));
       InputStreamReader inputStreamR = new InputStreamReader(uFileInputSt);
       BufferedReader uBufferedRea = new BufferedReader(inputStreamR);
       bj uobj = new bj();
       int i = 0;
       String str = uBufferedRea.readLine();
       while (str != null) {
          if (TextUtils.isEmpty(str)) {
             continue ;
          }else if(str.contains("Processor")){
             stringArray = str.split(":");
             if (stringArray == null) {
                continue ;
             }else {
                str1 = (stringArray[1]).trim();
                if (!TextUtils.isEmpty(str1)) {
                   uobj.b(str1);
                }
             }
          }
          if (str.contains("processor")) {
             stringArray = str.split(":");
             if (stringArray == null) {
                continue ;
             }else {
                str1 = (stringArray[1]).trim();
                if (!TextUtils.isEmpty(str1)) {
                   i = Integer.parseInt(str1) + 1;
                }
             }
          }
          if (str.contains("Hardware")) {
             String[] stringArray1 = str.split(":");
             if (stringArray1 == null) {
                continue ;
             }else {
                object oobject = stringArray1[1];
                if (!TextUtils.isEmpty(oobject)) {
                   uobj.a(oobject);
                }
             }
          }
       }
       uobj.a(i);
       uBufferedRea.close();
       inputStreamR.close();
       uFileInputSt.close();
       return uobj;
    }
}
