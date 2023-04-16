package com.RNFetchBlob.RNFetchBlob$h;
import java.lang.Runnable;
import com.RNFetchBlob.RNFetchBlob;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.Context;
import com.RNFetchBlob.b;
import java.lang.StringBuilder;
import java.io.File;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Exception;

public class RNFetchBlob$h implements Runnable	// class@000d51
{
    public final String b;
    public final String c;
    public final Callback d;
    public final RNFetchBlob e;

    public void RNFetchBlob$h(RNFetchBlob p0,String p1,String p2,Callback p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       Exception uException;
       OutputStream outputStream;
       String str1;
       Object[] objArray;
       Object[] objArray1;
       ReactApplicationContext reactApplica = this.e.getReactApplicationContext();
       RNFetchBlob$h tc = this.c;
       RNFetchBlob$h td = this.d;
       String str = b.h(reactApplica, this.b);
       try{
          int i = 0;
          if (!b.g(reactApplica, str)) {
             objArray1 = new Object[1];
             objArray1[i] = "Source file at path`"+str+"` does not exist";
             td.invoke(objArray1);
          }else if(!new File(tc).exists() && !new File(tc).createNewFile()){
             objArray1 = new Object[1];
             objArray1[i] = "Destination file at \'"+tc+"\' already exists";
             td.invoke(objArray1);
          }else {
             InputStream inputStream = b.e(reactApplica, str);
             try{
                FileOutputStream uFileOutputS = new FileOutputStream(tc);
                try{
                   uException = 0x2800;
                   byte[] uobyteArray = new byte[uException];
                   do {
                   } while (inputStream.read(uobyteArray) > 0);
                   try{
                      inputStream.close();
                      uFileOutputS.close();
                      str1 = "";
                   }catch(java.lang.Exception e0){
                      str1 = e0.getLocalizedMessage();
                   }
                }catch(java.lang.Exception e2){
                }
                InputStream inputStream1 = inputStream;
             }catch(java.lang.Exception e1){
                uException = e1;
                outputStream = null;
                goto label_00b0 ;
             }
          }
          return;
       }catch(java.lang.Exception e0){
          uException = e0;
          outputStream = null;
       }
       try{
          str1 = uException.getLocalizedMessage();
          if (0) {
             0.close();
          }
          if (outputStream) {
             outputStream.close();
          }
       }catch(java.lang.Exception e1){
          str1 = str1+e1.getLocalizedMessage();
       }
    }
}
