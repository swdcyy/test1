package com.facebook.react.modules.camera.ImageEditingManager$b;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.camera.ImageEditingManager$a;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.modules.camera.ImageEditingManager$b$a;
import java.io.FilenameFilter;
import java.lang.Void;
import android.content.Context;

public class ImageEditingManager$b extends GuardedAsyncTask	// class@001282
{
    public final Context a;

    public void ImageEditingManager$b(ReactContext p0){
       super(p0);
       this.a = p0;
    }
    public void ImageEditingManager$b(ReactContext p0,ImageEditingManager$a p1){
       super(p0);
    }
    public final void a(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageEditingManager$b.class, "2")) {
          return;
       }
       File[] uFileArray = p0.listFiles(new ImageEditingManager$b$a(this));
       if (uFileArray != null) {
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             uFileArray[i].delete();
          }
       }
       return;
    }
    public void doInBackgroundGuarded(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageEditingManager$b.class, "1")) {
       }else {
          this.a(this.a.getCacheDir());
          File externalCach = this.a.getExternalCacheDir();
          if (externalCach != null) {
             this.a(externalCach);
          }
       }
       return;
    }
}
