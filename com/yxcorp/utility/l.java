package com.yxcorp.utility.l;
import java.lang.String;
import com.yxcorp.utility.l$b;
import java.lang.Object;
import java.lang.Runtime;
import java.lang.Process;
import com.yxcorp.utility.l$a;
import java.io.InputStream;
import java.lang.Thread;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import com.yxcorp.utility.k;
import java.lang.Throwable;

public class l	// class@001413
{

    public static Object a(String p0,l$b p1){
       Process process = Runtime.getRuntime().exec(p0);
       l$a uoa = new l$a(process.getErrorStream());
       uoa.start();
       BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(process.getInputStream()));
       uBufferedRea.close();
       uoa.join();
       process.waitFor();
       process.destroy();
       return p1.a(uBufferedRea);
    }
    public static String b(String p0){
       try{
          return l.a(p0, k.a);
       }catch(java.io.IOException e0){
          return null;
       }catch(java.lang.InterruptedException e0){
       }
    }
}
