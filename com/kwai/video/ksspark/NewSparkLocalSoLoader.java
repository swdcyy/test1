package com.kwai.video.ksspark.NewSparkLocalSoLoader;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import java.lang.StringBuilder;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.lang.System;
import java.lang.Exception;

public class NewSparkLocalSoLoader	// class@00092c
{
    public static boolean autoLoadSo = true;
    public static boolean isSparkSoLoaded;

    public void NewSparkLocalSoLoader(){
       super();
    }
    public static void loadSoFromSdcard(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, NewSparkLocalSoLoader.class, "1")) {
          return;
       }
       String str = "/sdcard/libconverter.so";
       if (new File(str).exists() && !NewSparkLocalSoLoader.isSparkSoLoaded) {
          boolean b = false;
          NewSparkLocalSoLoader.autoLoadSo = b;
          File dir = p0.getDir("libs", b);
          dir.getAbsolutePath();
          String str1 = dir.getPath()+"/libconverter.so";
          try{
             FileInputStream uFileInputSt = new FileInputStream(new File(str));
             BufferedInputStream uBufferedInp = new BufferedInputStream(uFileInputSt);
             FileOutputStream uFileOutputS = new FileOutputStream(new File(str1));
             BufferedOutputStream uBufferedOut = new BufferedOutputStream(uFileOutputS);
             byte[] uobyteArray = new byte[5120];
             int i = uBufferedInp.read(uobyteArray);
             while (i != -1) {
                uBufferedOut.write(uobyteArray, b, i);
             }
             uBufferedOut.flush();
             uBufferedInp.close();
             uBufferedOut.close();
             uFileOutputS.close();
             uFileInputSt.close();
          }catch(java.lang.Exception e0){
             "copy Library failed "+e0;
          }
          try{
             System.load(str1);
             NewSparkLocalSoLoader.isSparkSoLoaded = true;
          }catch(java.lang.Exception e8){
             e8.printStackTrace();
          }
       }
    }
}
