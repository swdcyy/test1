package com.RNFetchBlob.RNFetchBlob$j;
import java.lang.Runnable;
import com.RNFetchBlob.RNFetchBlob;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.RNFetchBlob.b;
import java.io.File;
import java.lang.StringBuilder;
import java.io.FileOutputStream;
import java.lang.Integer;
import java.lang.Exception;

public class RNFetchBlob$j implements Runnable	// class@000d53
{
    public final String b;
    public final ReadableArray c;
    public final boolean d;
    public final Promise e;
    public final RNFetchBlob f;

    public void RNFetchBlob$j(RNFetchBlob p0,String p1,ReadableArray p2,boolean p3,Promise p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       RNFetchBlob$j tb = this.b;
       RNFetchBlob$j tc = this.c;
       RNFetchBlob$j td = this.d;
       RNFetchBlob$j te = this.e;
       String str = "ENOENT";
       try{
          File uFile = new File(tb);
          File parentFile = uFile.getParentFile();
          if (!uFile.exists()) {
             if (parentFile != null && (!parentFile.exists() && !parentFile.mkdirs())) {
                te.reject("ENOTDIR", "Failed to create parent directory of \'"+tb+"\'");
             }else if(!uFile.createNewFile()){
                te.reject(str, "File \'"+tb+"\' does not exist and could not be created");
             }else {
             label_0065 :
                FileOutputStream uFileOutputS = new FileOutputStream(uFile, td);
                byte[] uobyteArray = new byte[tc.size()];
                for (int i = 0; i < tc.size(); i = i + 1) {
                   uobyteArray[i] = (byte)tc.getInt(i);
                }
                uFileOutputS.write(uobyteArray);
                uFileOutputS.close();
                te.resolve(Integer.valueOf(tc.size()));
             }
          }else {
             goto label_0065 ;
          }
       }catch(java.io.FileNotFoundException e0){
          te.reject(str, "File \'"+e0+"\' does not exist and could not be created");
       }catch(java.lang.Exception e0){
          te.reject("EUNSPECIFIED", e0.getLocalizedMessage());
       }
       return;
    }
}
