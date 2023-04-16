package com.RNFetchBlob.a;
import okhttp3.RequestBody;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Boolean;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.io.File;
import java.lang.StringBuilder;
import android.content.ContextWrapper;
import java.io.FileOutputStream;
import java.util.ArrayList;
import com.facebook.react.bridge.ReadableArray;
import com.RNFetchBlob.a$b;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReactContext;
import com.RNFetchBlob.c;
import android.content.Context;
import com.RNFetchBlob.b;
import java.lang.CharSequence;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.lang.Exception;
import android.content.ContentResolver;
import android.net.Uri;
import android.util.Base64;
import java.util.Iterator;
import java.io.IOException;
import java.io.FileInputStream;
import java.lang.Throwable;
import java.io.ByteArrayInputStream;
import okhttp3.MediaType;
import okio.c;
import com.RNFetchBlob.RNFetchBlobReq;
import java.util.HashMap;
import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import com.RNFetchBlob.a$a;
import java.lang.Enum;
import com.RNFetchBlob.RNFetchBlobReq$RequestType;

public class a extends RequestBody	// class@000d64
{
    public WeakReference a;
    public InputStream b;
    public long c;
    public ReadableArray d;
    public String e;
    public String f;
    public RNFetchBlobReq$RequestType g;
    public MediaType h;
    public File i;
    public int j;
    public Boolean k;

    public void a(ReactApplicationContext p0,String p1){
       super();
       this.c = 0;
       this.j = 0;
       this.k = Boolean.FALSE;
       this.a = new WeakReference(p0);
       this.e = p1;
    }
    public a a(boolean p0){
       this.k = Boolean.valueOf(p0);
       return this;
    }
    public final File b(){
       File uFile2;
       a$b uob;
       int i1;
       long l1;
       String str5;
       InputStream inputStream;
       a$b a;
       String str11;
       int i2;
       InputStream inputStream1;
       a uoa = this;
       String str = "RNFetchBlob-"+uoa.e;
       Object obj = uoa.a.get();
       File uFile = null;
       if (obj == null) {
          return uFile;
       }
       File uFile1 = File.createTempFile("rnfb-form-tmp", "", obj.getCacheDir());
       FileOutputStream uFileOutputS = new FileOutputStream(uFile1);
       ArrayList uArrayList = new ArrayList();
       a$b obj1 = uoa.a.get();
       long l = 0;
       int i = 0;
       String str1 = "RNFetchBlob-content://";
       String str2 = "RNFetchBlob-file://";
       while (i < uoa.d.size()) {
          try{
             uFile2 = uFile1;
             uob = new a$b(uoa, uoa.d.getMap(i));
             uArrayList.add(uob);
             a$b d = uob.d;
             if (d == null) {
                c.a(obj1, "RNFetchBlob multipart request builder has found a field without `data` property, the field `"+uob.a+"` will be removed implicitly.");
             }else if(uob.b != null){
                if (d.startsWith(str2)) {
                   String str4 = b.h(obj1, d.substring(19));
                   if (b.f(str4)) {
                      i1 = SplitAssetHelper.open(obj1.getAssets(), str4.replace("bundle-assets://", "")).available();
                   }else {
                      l1 = new File(b.h(obj1, str4)).length();
                   label_0128 :
                      l = l + l1;
                   }
                }else if(d.startsWith(str1)){
                   str5 = d.substring(22);
                   try{
                      inputStream = obj1.getContentResolver().openInputStream(Uri.parse(str5));
                      try{
                         l = l + (long)inputStream.available();
                      label_010f :
                         inputStream.close();
                      }catch(java.lang.Exception e0){
                      }
                      c.a(obj1, "Failed to estimate form data length from content URI:"+str5+", "+e0.getLocalizedMessage());
                      if (inputStream) {
                         goto label_010f ;
                      }
                   }catch(java.lang.Exception e0){
                      inputStream = null;
                      goto label_00ef ;
                   }
                }else {
                   i1 = Base64.decode(d, 0).length;
                }
             }else {
                i1 = d.getBytes().length;
             }
             l1 = (long)i1;
             goto label_0128 ;
          }catch(java.lang.Exception e0){
             c.a(obj1, e0.getLocalizedMessage());
          }
             i = i + 1;
             uFile1 = uFile2;
             String str3 = null;
       }
       uFile2 = uFile1;
       uoa.c = l;
       Iterator iterator = uArrayList.iterator();
       String str6 = "--";
       while (iterator.hasNext()) {
          uob = iterator.next();
          obj1 = uob.d;
          a = uob.a;
          if (a != null) {
             if (obj1 == null) {
                continue ;
             }else {
                String str7 = str6+str+"\r\n";
                Iterator iterator1 = iterator;
                str5 = "\r\n\r\n";
                String str8 = str;
                str = "Content-Type: ";
                String str9 = "\r\n";
                str6 = "\"\r\n";
                String str10 = str1;
                str1 = "Content-Disposition: form-data; name=\"";
                if (uob.b != null) {
                   uFileOutputS.write((str7+str1+a+"\"; filename=\""+uob.b+str6+str+uob.c+str5).getBytes());
                   if (obj1.startsWith(str2)) {
                      str = b.h(obj, obj1.substring(19));
                      if (b.f(str)) {
                         try{
                            uoa.d(SplitAssetHelper.open(obj.getAssets(), str.replace("bundle-assets://", "")), uFileOutputS);
                         }catch(java.io.IOException e0){
                            c.a(obj, "Failed to create form data asset :"+str+", "+e0.getLocalizedMessage());
                         }
                      }else {
                         File uFile3 = new File(b.h(obj, str));
                         if (uFile3.exists()) {
                            uoa.d(new FileInputStream(uFile3), uFileOutputS);
                         }else {
                            c.a(obj, "Failed to create form data from path :"+str+", file not exists.");
                         }
                      }
                   }else {
                      str = str10;
                      if (obj1.startsWith(str)) {
                         str6 = obj1.substring(22);
                         try{
                            inputStream1 = obj.getContentResolver().openInputStream(Uri.parse(str6));
                            try{
                               uoa.d(inputStream1, uFileOutputS);
                            label_024d :
                               inputStream1.close();
                            }catch(java.lang.Exception e0){
                            }
                            c.a(obj, "Failed to create form data from content URI:"+str6+", "+e0.getLocalizedMessage());
                            if (inputStream1) {
                               goto label_024d ;
                            }
                         }catch(java.lang.Exception e0){
                            inputStream1 = null;
                            goto label_0258 ;
                         }
                      }else {
                         uFileOutputS.write(Base64.decode(obj1, 0));
                      }
                      str11 = str;
                   }
                   i2 = 0;
                }else {
                   str11 = str10;
                   uFileOutputS.write((str7+str1+a+str6+str+uob.c+str5).getBytes());
                   uFileOutputS.write((uob.d).getBytes());
                }
                uFileOutputS.write(str9.getBytes());
                str1 = str11;
                iterator = iterator1;
                str = str8;
             }
          }else {
             i2 = 0;
          }
       }
       uFileOutputS.write((str6+str+"--\r\n").getBytes());
       uFileOutputS.flush();
       uFileOutputS.close();
       return uFile2;
    }
    public final InputStream c(){
       String str1;
       String str = "error when getting request stream: ";
       if ((this.f).startsWith("RNFetchBlob-file://")) {
          str1 = b.h(this.a.get(), (this.f).substring(19));
          if (b.f(str1)) {
             return SplitAssetHelper.open(this.a.get().getAssets(), str1.replace("bundle-assets://", ""));
          }
          str1 = b.h(this.a.get(), str1);
          try{
             File uFile = new File(str1);
             if (!uFile.exists()) {
                uFile.createNewFile();
             }
             return new FileInputStream(uFile);
          }catch(java.lang.Exception e0){
             throw new Exception(str+e0.getLocalizedMessage());
          }
       }else if((this.f).startsWith("RNFetchBlob-content://")){
          str1 = (this.f).substring(22);
          try{
             return this.a.get().getContentResolver().openInputStream(Uri.parse(str1));
          }catch(java.lang.Exception e1){
             throw new Exception("error when getting request stream for content URI: "+str1, e1);
          }
       }else {
          try{
             return new ByteArrayInputStream(Base64.decode(this.f, 0));
          }catch(java.lang.Exception e0){
             throw new Exception(str+e0.getLocalizedMessage());
          }
       }
    }
    public long contentLength(){
       long l = (this.k.booleanValue())? -1: this.c;
       return l;
    }
    public MediaType contentType(){
       return this.h;
    }
    public final void d(InputStream p0,FileOutputStream p1){
       byte[] uobyteArray = new byte[0x2800];
       int i = p0.read(uobyteArray);
       while (i > 0) {
          p1.write(uobyteArray, 0, i);
       }
       p0.close();
       return;
    }
    public final void e(InputStream p0,c p1){
       WritableMap writableMap;
       ReactApplicationContext reactApplica;
       byte[] uobyteArray = new byte[0x2800];
       long l = 0;
       int i = 0;
       int i1 = p0.read(uobyteArray, i, 0x2800);
       while (i1 > 0) {
          p1.write(uobyteArray, i, i1);
          l = l + (long)i1;
          a te = this.e;
          RNFetchBlobProgressConfig rNFetchBlobP = (!RNFetchBlobReq.y.containsKey(te))? null: RNFetchBlobReq.y.get(te);
          if (rNFetchBlobP != null) {
             a tc = this.c;
             if (tc) {
                float f = (float)l / (float)tc;
                if (rNFetchBlobP.a(f)) {
                   writableMap = Arguments.createMap();
                   writableMap.putString("taskId", this.e);
                   writableMap.putString("written", String.valueOf(l));
                   writableMap.putString("total", String.valueOf(this.c));
                   reactApplica = this.a.get();
                   if (reactApplica == null) {
                      continue ;
                   }
                }
             }
          }
          reactApplica.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("RNFetchBlobProgress-upload", writableMap);
       }
       p0.close();
       return;
    }
    public final void f(){
       if (this.i != null) {
          this.b = new FileInputStream(this.i);
          return;
       }else {
          try{
             int i = a$a.a[this.g.ordinal()];
             if (i != 1) {
                if (i == 2) {
                   this.b = new ByteArrayInputStream((this.f).getBytes());
                }
             }else {
                this.b = this.c();
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          return;
       }
    }
    public a g(ReadableArray p0){
       this.d = p0;
       try{
          this.i = this.b();
          this.b = new FileInputStream(this.i);
          this.c = this.i.length();
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          c.a(this.a.get(), "RNFetchBlob failed to create request multipart body :"+e4.getLocalizedMessage());
       }
       return this;
    }
    public a h(String p0){
       this.f = p0;
       if (p0 == null) {
          this.f = "";
          this.g = RNFetchBlobReq$RequestType.AsIs;
       }
       try{
          int i = a$a.a[this.g.ordinal()];
          if (i != 1) {
             if (i == 2) {
                this.c = (long)(this.f).getBytes().length;
                this.b = new ByteArrayInputStream((this.f).getBytes());
             }
          }else {
             InputStream inputStream = this.c();
             this.b = inputStream;
             this.c = (long)inputStream.available();
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          c.a(this.a.get(), "RNFetchBlob failed to create single content request body :"+e4.getLocalizedMessage()+"\r\n");
       }
       return this;
    }
    public a i(MediaType p0){
       this.h = p0;
       return this;
    }
    public a j(RNFetchBlobReq$RequestType p0){
       this.g = p0;
       return this;
    }
    public void writeTo(c p0){
       try{
          if (this.b == null) {
             this.f();
          }
          this.e(this.b, p0);
          this.b = null;
       }catch(java.lang.Exception e3){
          c.a(this.a.get(), e3.getLocalizedMessage());
          e3.printStackTrace();
       }
       return;
    }
}
