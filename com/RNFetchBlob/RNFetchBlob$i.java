package com.RNFetchBlob.RNFetchBlob$i;
import java.lang.Runnable;
import com.RNFetchBlob.RNFetchBlob;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.Context;
import com.RNFetchBlob.b;
import java.lang.CharSequence;
import android.content.res.AssetManager;
import android.content.res.AssetFileDescriptor;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.io.InputStream;
import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.lang.StringBuilder;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import android.util.Base64;
import java.lang.Exception;
import java.io.FileNotFoundException;

public class RNFetchBlob$i implements Runnable	// class@000d52
{
    public final String b;
    public final String c;
    public final Promise d;
    public final RNFetchBlob e;

    public void RNFetchBlob$i(RNFetchBlob p0,String p1,String p2,Promise p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       String localizedMes;
       int i1;
       byte[] uobyteArray;
       InputStream inputStream;
       int i2;
       ReactApplicationContext reactApplica = this.e.getReactApplicationContext();
       RNFetchBlob$i tb = this.b;
       RNFetchBlob$i tc = this.c;
       RNFetchBlob$i td = this.d;
       String str = "bundle-assets://";
       String str1 = b.h(reactApplica, tb);
       if (str1 != null) {
          tb = str1;
       }
       try{
          int i = 0;
          if (str1 != null && str1.startsWith(str)) {
             str = tb.replace(str, "");
             i1 = (int)SplitAssetHelper.openFd(reactApplica.getAssets(), str).getLength();
             uobyteArray = new byte[i1];
             inputStream = SplitAssetHelper.open(reactApplica.getAssets(), str);
             i2 = inputStream.read(uobyteArray, i, i1);
             inputStream.close();
          label_0080 :
             if (i2 < i1) {
                td.reject("EUNSPECIFIED", "Read only "+i2+" bytes of "+i1);
             }else {
                localizedMes = tc.toLowerCase();
                int i3 = -1;
                i2 = localizedMes.hashCode();
                if (i2 != -1396204209) {
                   if (i2 != 0x36ef71) {
                      if (i2 == 0x58caf51 && localizedMes.equals("ascii")) {
                         i3 = 1;
                      }
                   }else if(localizedMes.equals("utf8")){
                      i3 = 2;
                   }
                }else if(localizedMes.equals("base64")){
                   i3 = 0;
                }
                if (i3) {
                   if (i3 != 1) {
                      if (i3 != 2) {
                         td.resolve(new String(uobyteArray));
                      }else {
                         td.resolve(new String(uobyteArray));
                      }
                   }else {
                      WritableArray writableArra = Arguments.createArray();
                      i3 = uobyteArray.length;
                      for (; i < i3; i = i + 1) {
                         writableArra.pushInt(uobyteArray[i]);
                      }
                      td.resolve(writableArra);
                   }
                }else {
                   td.resolve(Base64.encodeToString(uobyteArray, 2));
                }
             }
          }else if(str1 == null){
             inputStream = reactApplica.getContentResolver().openInputStream(Uri.parse(tb));
             i1 = inputStream.available();
             uobyteArray = new byte[i1];
             i2 = inputStream.read(uobyteArray);
             inputStream.close();
             goto label_0080 ;
          }else {
             File uFile = new File(tb);
             i1 = (int)uFile.length();
             uobyteArray = new byte[i1];
             FileInputStream uFileInputSt = new FileInputStream(uFile);
             uFileInputSt.close();
             i2 = uFileInputSt.read(uobyteArray);
             goto label_0080 ;
          }
       }catch(java.io.FileNotFoundException e0){
          localizedMes = e0.getLocalizedMessage();
          String str2 = "EISDIR";
          if (localizedMes.contains(str2)) {
             td.reject(str2, "Expecting a file but \'"+tb+"\' is a directory; "+localizedMes);
          }else {
             td.reject("ENOENT", "No such file \'"+tb+"\'; "+localizedMes);
          }
       }catch(java.lang.Exception e0){
          td.reject("EUNSPECIFIED", e0.getLocalizedMessage());
       }
       return;
    }
}
