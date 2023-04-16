package com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.Closeable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.InputStream;
import com.kwai.robust.PatchProxyResult;
import java.io.ByteArrayOutputStream;
import android.util.Base64OutputStream;
import java.io.OutputStream;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.camera.ImageStoreManager$b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.camera.ImageStoreManager$a;
import android.os.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;

public class ImageStoreManager extends ReactContextBaseJavaModule	// class@001287
{

    public void ImageStoreManager(ReactApplicationContext p0){
       super(p0);
    }
    public static void closeQuietly(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ImageStoreManager.class, "3")) {
          return;
       }
       try{
          p0.close();
          return;
       }catch(java.io.IOException e0){
       }
    }
    public String convertInputStreamToBase64OutputStream(InputStream p0){
       ByteArrayOutputStream obj = PatchProxy.applyOneRefs(p0, this, ImageStoreManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ByteArrayOutputStream();
       Base64OutputStream uBase64Outpu = new Base64OutputStream(obj, 2);
       byte[] uobyteArray = new byte[8192];
       int i = p0.read(uobyteArray);
       while (i > -1) {
          uBase64Outpu.write(uobyteArray, 0, i);
       }
       ImageStoreManager.closeQuietly(uBase64Outpu);
       return obj.toString();
    }
    public void getBase64ForTag(String p0,Callback p1,Callback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ImageStoreManager.class, "1")) {
          return;
       }
       ImageStoreManager$b uob = new ImageStoreManager$b(this, this.getReactApplicationContext(), p0, p1, p2, null);
       Void[] voidArray = new Void[0];
       v0.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, voidArray);
       return;
    }
    public String getName(){
       return "ImageStoreManager";
    }
}
