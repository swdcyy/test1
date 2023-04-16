package com.facebook.react.modules.camera.ImageStoreManager$b;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.modules.camera.ImageStoreManager;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.camera.ImageStoreManager$a;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.ContentResolver;
import android.content.ContextWrapper;
import android.net.Uri;
import java.io.InputStream;
import java.io.IOException;
import java.io.Closeable;
import java.io.FileNotFoundException;

public class ImageStoreManager$b extends GuardedAsyncTask	// class@001286
{
    public final String a;
    public final Callback b;
    public final Callback c;
    public final ImageStoreManager d;

    public void ImageStoreManager$b(ImageStoreManager p0,ReactContext p1,String p2,Callback p3,Callback p4,ImageStoreManager$a p5){
       this.d = p0;
       super(p1);
       this.a = p2;
       this.b = p3;
       this.c = p4;
    }
    public void doInBackgroundGuarded(Object[] p0){
       int i;
       try{
          if (PatchProxy.applyVoidOneRefs(p0, this, ImageStoreManager$b.class, "1")) {
          }else {
             i = 1;
             InputStream inputStream = this.d.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(this.a));
             try{
                Object[] objArray1 = new Object[i];
                objArray1[0] = this.d.convertInputStreamToBase64OutputStream(inputStream);
                this.b.invoke(objArray1);
             }catch(java.io.IOException e2){
                Object[] objArray2 = new Object[i];
                objArray2[0] = e2.getMessage();
                this.c.invoke(objArray2);
             }
             ImageStoreManager.closeQuietly(inputStream);
          }
       }catch(java.io.FileNotFoundException e1){
          Object[] objArray = new Object[i];
          objArray[0] = e1.getMessage();
          this.c.invoke(objArray);
       }
       return;
    }
}
