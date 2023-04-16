package com.kwai.performance.stability.crash.monitor.util.c;
import java.io.Closeable;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import java.lang.Runtime;
import java.lang.Process;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.Object;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.lang.Throwable;

public class c	// class@000e43
{

    public static void a(Closeable p0){
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
    public static List b(String[] p0,int p1){
       int i;
       int i1;
       ArrayList uArrayList = new ArrayList(20);
       try{
          i = 0;
          Process process = Runtime.getRuntime().exec(p0);
          try{
             InputStream inputStream = process.getInputStream();
             try{
                OutputStream outputStream = process.getOutputStream();
                try{
                   InputStream errorStream = process.getErrorStream();
                   try{
                      InputStreamReader inputStreamR = new InputStreamReader(inputStream);
                      try{
                         BufferedReader uBufferedRea = new BufferedReader(inputStreamR);
                         for (String str = uBufferedRea.readLine(); str != null && uArrayList.size() < p1; str = uBufferedRea.readLine()) {
                            uArrayList.add(str);
                         }
                         process.waitFor();
                         if (process.exitValue()) {
                            throw new IOException("Command line returned OS error code \'"+process.exitValue()+"\' for command "+Arrays.asList(p0));
                         }
                         if (p1 > 0 && uArrayList.isEmpty()) {
                            throw new IOException("Command line did not return any info for command "+Arrays.asList(p0));
                         }
                         c.a(inputStream);
                         c.a(outputStream);
                         c.a(errorStream);
                         c.a(uBufferedRea);
                         process.destroy();
                         return uArrayList;
                      }catch(java.lang.InterruptedException e9){
                      }
                   }catch(java.lang.InterruptedException e9){
                      i1 = i;
                   }
                }catch(java.lang.InterruptedException e9){
                }
                i1 = i;
             }catch(java.lang.InterruptedException e9){
             }
             int i3 = i;
             goto label_00b9 ;
          }catch(java.lang.InterruptedException e9){
             int i2 = i;
             goto label_00b8 ;
          }
       }catch(java.lang.InterruptedException e9){
          i1 = i;
       }
       throw new IOException("Command line threw an InterruptedException for command "+Arrays.asList(p0), e9);
    }
}
