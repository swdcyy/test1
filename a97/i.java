package a97.i;
import java.io.File;
import t87.f;
import android.content.Context;
import a97.c;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.String;
import java.lang.Object;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import t87.a;

public class i	// class@000088
{

    public static File a(){
       return new File(c.d(f.d), System.currentTimeMillis()+"_"+"logger.zip");
    }
    public static boolean b(File p0){
       ConnectivityManager systemServic;
       a uoa;
       boolean b1;
       NetworkInfo activeNetwor1;
       String str = "connectivity";
       Context d = f.d;
       boolean b = false;
       int i = 1;
       try{
          systemServic = d.getSystemService(str);
          if (systemServic != null) {
             activeNetwor1 = systemServic.getActiveNetworkInfo();
             if (activeNetwor1 != null && activeNetwor1.isAvailable()) {
                uoa = 1;
             }
          }
          uoa = null;
       }catch(java.lang.Exception e0){
       }
       if (uoa) {
          long l = p0.length();
          if (f.c.c != null) {
             d = f.d;
             try{
                systemServic = d.getSystemService(e0);
                if (systemServic != null) {
                   activeNetwor1 = systemServic.getActiveNetworkInfo();
                   if (activeNetwor1 != null && i == activeNetwor1.getType()) {
                      d = 1;
                   }
                }
                d = null;
             }catch(java.lang.Exception e0){
             }
             if (!d) {
                d = f.d;
                int i1 = -1;
                try{
                   ConnectivityManager systemServic1 = d.getSystemService(e0);
                   if (systemServic1 != null) {
                      NetworkInfo activeNetwor = systemServic1.getActiveNetworkInfo();
                      if (activeNetwor != null) {
                         i1 = activeNetwor.getType();
                      }
                   }
                }catch(java.lang.Exception e0){
                }
                if (i1 != 4 && l - 0x100000 >= 0) {
                   b1 = false;
                label_006e :
                   if (b1 && (p0.exists() || p0.length())) {
                      b = true;
                   }
                }
             }
          }
       label_006d :
          b1 = true;
          goto label_006e ;
       }
    label_0081 :
       return b;
    }
}
