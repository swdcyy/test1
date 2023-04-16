package com.facebook.react.modules.blob.FileReaderModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.modules.blob.BlobModule;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.StringBuilder;
import android.util.Base64;

public class FileReaderModule extends ReactContextBaseJavaModule	// class@00127b
{

    public void FileReaderModule(ReactApplicationContext p0){
       super(p0);
    }
    public final BlobModule getBlobModule(String p0){
       p0 = PatchProxy.applyOneRefs(p0, this, FileReaderModule.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          return reactApplica.getNativeModule(BlobModule.class);
       }
       return null;
    }
    public String getName(){
       return "FileReaderModule";
    }
    public void readAsDataURL(ReadableMap p0,Promise p1){
       String str = "type";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FileReaderModule.class, "3")) {
          return;
       }
       BlobModule blobModule = this.getBlobModule("readAsDataURL");
       if (blobModule == null) {
          p1.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
          return;
       }else {
          byte[] uobyteArray = blobModule.resolve(p0.getString("blobId"), p0.getInt("offset"), p0.getInt("size"));
          if (uobyteArray == null) {
             p1.reject("ERROR_INVALID_BLOB", "The specified blob is invalid");
             return;
          }else {
             try{
                StringBuilder str1 = "data:";
                str1 = (p0.hasKey(str) && !(p0.getString(str)).isEmpty())? str1+p0.getString(str): str1+"application/octet-stream";
                p1.resolve(str1+";base64,"+Base64.encodeToString(uobyteArray, 2));
             }catch(java.lang.Exception e6){
                p1.reject(e6);
             }
             return;
          }
       }
    }
    public void readAsText(ReadableMap p0,String p1,Promise p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FileReaderModule.class, "2")) {
          return;
       }
       BlobModule blobModule = this.getBlobModule("readAsText");
       if (blobModule == null) {
          p2.reject(new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
          return;
       }else {
          byte[] uobyteArray = blobModule.resolve(p0.getString("blobId"), p0.getInt("offset"), p0.getInt("size"));
          if (uobyteArray == null) {
             p2.reject("ERROR_INVALID_BLOB", "The specified blob is invalid");
             return;
          }else {
             try{
                p2.resolve(new String(uobyteArray, p1));
             }catch(java.lang.Exception e7){
                p2.reject(e7);
             }
             return;
          }
       }
    }
}
