package com.RNFetchBlob.RNFetchBlob$f;
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
import java.io.OutputStream;
import java.lang.Exception;

public class RNFetchBlob$f implements Runnable	// class@000d4f
{
    public final String b;
    public final ReadableArray c;
    public final Promise d;
    public final RNFetchBlob e;

    public void RNFetchBlob$f(RNFetchBlob p0,String p1,ReadableArray p2,Promise p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       RNFetchBlob$f tb = this.b;
       RNFetchBlob$f tc = this.c;
       RNFetchBlob$f td = this.d;
       HashMap e = b.e;
       try{
          File uFile = new File(tb);
          if (!uFile.createNewFile()) {
             td.reject("EEXIST", "File at path `"+tb+"` already exists");
          }else {
             FileOutputStream uFileOutputS = new FileOutputStream(uFile);
             byte[] uobyteArray = new byte[tc.size()];
             for (int i = 0; i < tc.size(); i = i + 1) {
                uobyteArray[i] = (byte)tc.getInt(i);
             }
             uFileOutputS.write(uobyteArray);
             td.resolve(tb);
          }
       }catch(java.lang.Exception e0){
          td.reject("EUNSPECIFIED", e0.getLocalizedMessage());
       }
       return;
    }
}
