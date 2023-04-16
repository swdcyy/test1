package com.RNFetchBlob.RNFetchBlob$k;
import java.lang.Runnable;
import com.RNFetchBlob.RNFetchBlob;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.RNFetchBlob.b;
import java.io.File;
import java.lang.StringBuilder;
import android.content.Context;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.Integer;
import java.lang.Exception;

public class RNFetchBlob$k implements Runnable	// class@000d54
{
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Promise f;
    public final RNFetchBlob g;

    public void RNFetchBlob$k(RNFetchBlob p0,String p1,String p2,String p3,boolean p4,Promise p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void run(){
       String str;
       byte[] uobyteArray;
       FileOutputStream uFileOutputS;
       int i;
       ReactApplicationContext reactApplica = this.g.getReactApplicationContext();
       RNFetchBlob$k tb = this.b;
       RNFetchBlob$k tc = this.c;
       RNFetchBlob$k td = this.d;
       RNFetchBlob$k te = this.e;
       RNFetchBlob$k tf = this.f;
       try{
          str = "ENOENT";
          File uFile = new File(tb);
          File parentFile = uFile.getParentFile();
          if (!uFile.exists()) {
             if (parentFile != null && (!parentFile.exists() && !parentFile.mkdirs())) {
                tf.reject("EUNSPECIFIED", "Failed to create parent directory of \'"+tb+"\'");
             }else if(!uFile.createNewFile()){
                tf.reject(str, "File \'"+tb+"\' does not exist and could not be created");
             }else if(tc.equalsIgnoreCase("uri")){
                String str1 = b.h(reactApplica, td);
                File uFile1 = new File(str1);
                if (!uFile1.exists()) {
                   tf.reject(str, "No such file \'"+tb+"\' \(\'"+str1+"\'\)");
                }else {
                   uobyteArray = new byte[0x2800];
                   FileInputStream uFileInputSt = new FileInputStream(uFile1);
                   uFileOutputS = new FileOutputStream(uFile, te);
                   i = 0;
                   int i1 = uFileInputSt.read(uobyteArray);
                   while (i1 > 0) {
                      uFileOutputS.write(uobyteArray, 0, i1);
                      i = i + i1;
                   }
                   uFileInputSt.close();
                   uFileOutputS.close();
                }
             }else {
                uobyteArray = b.j(td, tc);
                uFileOutputS = new FileOutputStream(uFile, te);
                uFileOutputS.write(uobyteArray);
                i = uobyteArray.length;
                uFileOutputS.close();
             }
             tf.resolve(Integer.valueOf(i));
          }else {
             goto label_006f ;
          }
       }catch(java.io.FileNotFoundException e0){
          tf.reject(str, "File \'"+tb+"\' does not exist and could not be created, or it is a directory");
       }catch(java.lang.Exception e0){
          tf.reject("EUNSPECIFIED", e0.getLocalizedMessage());
       }
       return;
    }
}
