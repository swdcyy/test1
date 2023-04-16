package com.RNFetchBlob.RNFetchBlob$b;
import java.lang.Runnable;
import com.RNFetchBlob.RNFetchBlob;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Object;
import com.RNFetchBlob.b;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.ContextWrapper;
import java.lang.CharSequence;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import android.os.SystemClock;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.System;
import android.util.Base64;
import java.lang.StringBuilder;
import java.lang.Exception;

public class RNFetchBlob$b implements Runnable	// class@000d4b
{
    public final ReactApplicationContext b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final RNFetchBlob h;

    public void RNFetchBlob$b(RNFetchBlob p0,ReactApplicationContext p1,String p2,String p3,int p4,int p5,String p6){
       this.h = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       super();
    }
    public void run(){
       String str3;
       InputStream inputStream;
       int i1;
       int i4;
       byte[] uobyteArray1;
       RNFetchBlob$b uob = this;
       b uob1 = new b(uob.b);
       RNFetchBlob$b c = uob.c;
       RNFetchBlob$b d = uob.d;
       RNFetchBlob$b e = uob.e;
       RNFetchBlob$b f = uob.f;
       RNFetchBlob$b g = uob.g;
       String str = "bundle-assets://";
       String str1 = "base64";
       String str2 = b.h(uob1.a, c);
       if (str2 != null) {
          c = str2;
       }
       try{
          if (d.equalsIgnoreCase(str1)) {
             str3 = 4095;
          label_002d :
             if (e <= null) {
                e = str3;
             }
             if (str2 != null && c.startsWith(str)) {
                inputStream = SplitAssetHelper.open(uob1.a.getAssets(), c.replace(str, ""));
             }else if(str2 == null){
                inputStream = uob1.a.getContentResolver().openInputStream(Uri.parse(c));
             }else {
                inputStream = new FileInputStream(new File(c));
             }
             try{
                byte[] uobyteArray = new byte[e];
                long l = -1;
                int i = 0;
                if (d.equalsIgnoreCase("utf8")) {
                   CharsetEncoder uCharsetEnco = Charset.forName("UTF-8").newEncoder();
                   i1 = inputStream.read(uobyteArray);
                   while (i1 != l) {
                      uCharsetEnco.encode(ByteBuffer.wrap(uobyteArray).asCharBuffer());
                      uob1.b(g, "data", new String(uobyteArray, i, i1));
                      if (f > null) {
                         SystemClock.sleep((long)f);
                      }
                      l = -1;
                      i = 0;
                   }
                }else if(d.equalsIgnoreCase("ascii")){
                   int i3 = inputStream.read(uobyteArray);
                   while (i3 != -1) {
                      WritableArray writableArra = Arguments.createArray();
                      for (i4 = 0; i4 < i3; i4 = i4 + 1) {
                         writableArra.pushInt(uobyteArray[i4]);
                      }
                      WritableMap writableMap = Arguments.createMap();
                      writableMap.putString("event", "data");
                      writableMap.putArray("detail", writableArra);
                      uob1.b.emit(g, writableMap);
                      if (f > null) {
                         SystemClock.sleep((long)f);
                      }
                   }
                }else if(d.equalsIgnoreCase(str1)){
                   i1 = inputStream.read(uobyteArray);
                   while (i1 != -1) {
                      i4 = 2;
                      if (i1 < e) {
                         uobyteArray1 = new byte[i1];
                         System.arraycopy(uobyteArray, 0, uobyteArray1, 0, i1);
                         uob1.b(g, "data", Base64.encodeToString(uobyteArray1, i4));
                      }else {
                         uob1.b(g, "data", Base64.encodeToString(uobyteArray, i4));
                      }
                      if (f > null) {
                         SystemClock.sleep((long)f);
                      }
                   }
                }else {
                   uob1.c(g, "error", "EINVAL", "Unrecognized encoding `"+d+"`, should be one of `base64`, `utf8`, `ascii`");
                   uobyteArray1 = 1;
                label_0124 :
                   if (!i) {
                      uob1.b(g, "end", "");
                   }
                   inputStream.close();
                }
                int i2 = 0;
                i = 0;
                goto label_0124 ;
             }catch(java.lang.Exception e0){
                uob1.c(g, "error", "EUNSPECIFIED", "Failed to convert data to "+d+" encoded string. This might be because this encoding cannot be used for this data.");
                e0.printStackTrace();
             }
          }else {
             str3 = 4096;
             goto label_002d ;
          }
       }catch(java.io.FileNotFoundException e0){
          uob1.c(g, "error", "ENOENT", "No such file \'"+e0+"\'");
       }catch(java.lang.Exception e0){
       }
       return;
    }
}
