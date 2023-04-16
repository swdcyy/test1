package com.RNFetchBlob.RNFetchBlobReq$a;
import okhttp3.Callback;
import com.RNFetchBlob.RNFetchBlobReq;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.ref.WeakReference;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Callback;
import android.content.Context;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.Class;
import java.net.SocketTimeoutException;
import okhttp3.Response;
import l4.a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReactContext;
import android.app.DownloadManager;
import java.util.Objects;
import okhttp3.Headers;
import com.facebook.react.bridge.ReadableArray;
import java.lang.CharSequence;
import com.facebook.react.bridge.WritableArray;
import java.util.Iterator;
import java.util.ArrayList;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.Throwable;
import cb.a;
import com.RNFetchBlob.RNFetchBlobReq$b;
import java.lang.Enum;
import okhttp3.ResponseBody;
import m4.b;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.RNFetchBlob.b;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import com.RNFetchBlob.RNFetchBlobReq$ResponseFormat;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class RNFetchBlobReq$a implements Callback	// class@000d5e
{
    public final RNFetchBlobReq a;

    public void RNFetchBlobReq$a(RNFetchBlobReq p0){
       this.a = p0;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       Object[] objArray;
       ReactApplicationContext reactApplica = this.a.b.get();
       int i = 3;
       if (reactApplica == null) {
          objArray = new Object[i];
          objArray[0] = "onFailure:The context has been destroyed unexpectedly.";
          objArray[1] = null;
          objArray[2] = null;
          this.a.k.invoke(objArray);
          this.a.e();
          return;
       }else {
          RNFetchBlobReq.a(reactApplica, this.a.d);
          RNFetchBlobReq$a ta = this.a;
          if (ta.r == null) {
             ta.r = Arguments.createMap();
          }
          if (p1.getClass().equals(SocketTimeoutException.class)) {
             this.a.r.putBoolean("timeout", 1);
             objArray = new Object[i];
             objArray[0] = "The request timed out.";
             objArray[1] = null;
             objArray[2] = null;
             this.a.k.invoke(objArray);
          }else {
             Object[] objArray1 = new Object[i];
             objArray1[0] = p1.getLocalizedMessage();
             objArray1[1] = null;
             objArray1[2] = null;
             this.a.k.invoke(objArray1);
          }
          this.a.e();
          return;
       }
    }
    public void onResponse(Call p0,Response p1){
       String str1;
       String str2;
       String str4;
       boolean b;
       RNFetchBlobReq$a ta;
       Headers headers;
       ResponseBody responseBody;
       Object[] objArray1;
       Object[] objArray2;
       CharsetEncoder uCharsetEnco;
       a d = this.a.c.d;
       String str = "";
       if (d != null) {
          str1 = "title";
          str2 = (d.hasKey(str1))? this.a.c.d.getString(str1): str;
          str1 = "description";
          String str3 = (d.hasKey(str1))? d.getString(str1): str;
          str1 = "mime";
          str1 = (d.hasKey(str1))? d.getString(str1): "text/plain";
          str4 = str1;
          str1 = "mediaScannable";
          b = (d.hasKey(str1))? d.getBoolean(str1): false;
          str1 = "notification";
          boolean b1 = (d.hasKey(str1))? d.getBoolean(str1): false;
          ReactApplicationContext reactApplica = this.a.b.get();
          if (reactApplica != null) {
             ta = this.a;
             reactApplica.getSystemService("download").addCompletedDownload(str2, str3, b, str4, ta.h, ta.l, b1);
          }
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       str1 = ta.c(p1.headers(), "Content-Type");
       String str5 = "text/";
       int i = str1.equalsIgnoreCase(str5) ^ 1;
       String str6 = "application/json";
       int i1 = str1.equalsIgnoreCase(str6) ^ 1;
       if (ta.c.n != null) {
          int i2 = 0;
          while (true) {
             if (i2 < ta.c.n.size()) {
                if ((str1.toLowerCase()).contains((ta.c.n.getString(i2)).toLowerCase())) {
                   str1 = 1;
                label_00c6 :
                   Object[] objArray = (i1 || (!i || str1))? 1: null;
                   WritableMap writableMap = Arguments.createMap();
                   writableMap.putInt("status", p1.code());
                   writableMap.putString("state", "2");
                   writableMap.putString("taskId", ta.d);
                   writableMap.putBoolean("timeout", ta.s);
                   WritableMap writableMap1 = Arguments.createMap();
                   for (i2 = 0; i2 < p1.headers().size(); i2 = i2 + 1) {
                      writableMap1.putString(p1.headers().name(i2), p1.headers().value(i2));
                   }
                   WritableArray writableArra = Arguments.createArray();
                   Iterator iterator = ta.t.iterator();
                   while (iterator.hasNext()) {
                      writableArra.pushString(iterator.next());
                   }
                   writableMap.putArray("redirects", writableArra);
                   writableMap.putMap("headers", writableMap1);
                   headers = p1.headers();
                   String str7 = "respType";
                   if (objArray) {
                      writableMap.putString(str7, "blob");
                   }else {
                      String str8 = "content-type";
                      if ((ta.c(headers, str8)).equalsIgnoreCase(str5)) {
                         writableMap.putString(str7, "text");
                      }else if((ta.c(headers, str8)).contains(str6)){
                         writableMap.putString(str7, "json");
                      }else {
                         writableMap.putString(str7, str);
                      }
                   }
                   try{
                      ta.b.get().getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("RNFetchBlobState", writableMap);
                   }catch(java.lang.Exception e3){
                      a.h("RNFetchBlobReq", "Error emitting state event", e3);
                   }
                   int i3 = RNFetchBlobReq$b.b[ta.p.ordinal()];
                   str2 = "path";
                   str6 = "UTF-8";
                   str4 = "utf8";
                   if (i3 != 1) {
                      try{
                         if (i3 != 2) {
                            try{
                               objArray = new Object[]{null,str4,new String(p1.body().bytes(), str6)};
                               ta.k.invoke(objArray);
                            }catch(java.io.IOException e0){
                               objArray = new Object[]{"RNFetchBlob failed to encode response data to UTF8 string.",null};
                               ta.k.invoke(objArray);
                            }
                         }else {
                            responseBody = p1.body();
                            try{
                               responseBody.bytes();
                               if (responseBody != null) {
                                  objArray = (!responseBody.e - responseBody.contentLength() || (!responseBody.contentLength() - -1 && responseBody.h != null))? 1: null;
                                  if (!objArray) {
                                     objArray = new Object[]{"Download interrupted.",null};
                                     ta.k.invoke(objArray);
                                  }
                               }
                               str = (ta.h).replace("?append=true", e0);
                               ta.h = str;
                               objArray2 = new Object[]{null,str2,str};
                               ta.k.invoke(objArray2);
                            }catch(java.lang.Exception e0){
                            }
                         }
                      }catch(java.lang.ClassCastException e0){
                         if (responseBody) {
                            objArray1 = new Object[]{"Unexpected FileStorage response file length: "+responseBody.contentLength(),null};
                            ta.k.invoke(objArray1);
                         }else {
                            objArray1 = new Object[]{"Unexpected FileStorage response with no file.",null};
                            ta.k.invoke(objArray1);
                         }
                      }
                   }else if(objArray != null && ta.c.i.booleanValue()){
                      str = b.d(ta.b.get(), ta.d);
                      InputStream inputStream = p1.body().byteStream();
                      FileOutputStream uFileOutputS = new FileOutputStream(new File(str));
                      byte[] uobyteArray = new byte[0x2800];
                      i1 = inputStream.read(uobyteArray);
                      while (i1 != -1) {
                         uFileOutputS.write(uobyteArray, 0, i1);
                      }
                      inputStream.close();
                      uFileOutputS.flush();
                      uFileOutputS.close();
                      objArray2 = new Object[]{null,str2,str};
                      ta.k.invoke(objArray2);
                   }else {
                      byte[] uobyteArray1 = p1.body().bytes();
                      uCharsetEnco = Charset.forName(str6).newEncoder();
                      if (ta.q == RNFetchBlobReq$ResponseFormat.BASE64) {
                         objArray2 = new Object[]{null,"base64",Base64.encodeToString(uobyteArray1, 2)};
                         ta.k.invoke(objArray2);
                      }else {
                         try{
                            uCharsetEnco.encode(ByteBuffer.wrap(uobyteArray1).asCharBuffer());
                            Object[] objArray3 = new Object[]{null,str4,new String(uobyteArray1)};
                            ta.k.invoke(objArray3);
                         }catch(java.nio.charset.CharacterCodingException e0){
                            if (ta.q == RNFetchBlobReq$ResponseFormat.UTF8) {
                               objArray2 = new Object[]{null,str4,new String(e0)};
                               ta.k.invoke(objArray2);
                            }else {
                               objArray2 = new Object[]{null,"base64",Base64.encodeToString(e0, 2)};
                               ta.k.invoke(objArray2);
                            }
                         }catch(java.io.IOException e0){
                            objArray = new Object[]{"RNFetchBlob failed to encode response data to BASE64 string.",null};
                            ta.k.invoke(objArray);
                         }
                      }
                   }
                }else {
                   i2 = i2 + 1;
                }
             }
          }
       }
       uCharsetEnco = 0;
       goto label_00c6 ;
    }
}
