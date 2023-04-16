package com.RNFetchBlob.RNFetchBlob$e;
import java.lang.Runnable;
import com.RNFetchBlob.RNFetchBlob;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.RNFetchBlob.b;
import java.io.File;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Exception;

public class RNFetchBlob$e implements Runnable	// class@000d4e
{
    public final String b;
    public final String c;
    public final String d;
    public final Promise e;
    public final RNFetchBlob f;

    public void RNFetchBlob$e(RNFetchBlob p0,String p1,String p2,String p3,Promise p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       int b;
       RNFetchBlob$e tb = this.b;
       RNFetchBlob$e tc = this.c;
       RNFetchBlob$e td = this.d;
       RNFetchBlob$e te = this.e;
       HashMap e = b.e;
       try{
          File uFile = new File(tb);
          b = uFile.createNewFile();
          if (td.equals("uri")) {
             File uFile1 = new File(tc.replace("RNFetchBlob-file://", ""));
             if (!uFile1.exists()) {
                te.reject("ENOENT", "Source file : "+tc+" does not exist");
             }else {
                FileInputStream uFileInputSt = new FileInputStream(uFile1);
                FileOutputStream uFileOutputS = new FileOutputStream(uFile);
                byte[] uobyteArray = new byte[0x2800];
                b = uFileInputSt.read(uobyteArray);
                while (b > 0) {
                   uFileOutputS.write(uobyteArray, 0, b);
                   b = uFileInputSt.read(uobyteArray);
                }
                uFileInputSt.close();
                uFileOutputS.close();
             label_0098 :
                te.resolve(tb);
             }
          }else if(!b){
             te.reject("EEXIST", "File `"+tb+"` already exists");
          }else {
             new FileOutputStream(uFile).write(b.j(tc, td));
             goto label_0098 ;
          }
       }catch(java.lang.Exception e0){
          te.reject("EUNSPECIFIED", e0.getLocalizedMessage());
       }
       return;
    }
}
