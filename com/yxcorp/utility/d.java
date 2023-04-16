package com.yxcorp.utility.d;
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
import ekd.p;
import java.lang.Throwable;

public class d	// class@0009bb
{

    public static List a(String[] p0,int p1){
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
                         p.c(inputStream);
                         p.d(outputStream);
                         p.c(errorStream);
                         p.e(uBufferedRea);
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
