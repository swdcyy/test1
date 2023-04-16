package com.facebook.react.modules.camera.a;
import android.media.MediaScannerConnection$OnScanCompletedListener;
import com.facebook.react.modules.camera.CameraRollManager$c;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.Promise;

public class a implements MediaScannerConnection$OnScanCompletedListener	// class@001288
{
    public final CameraRollManager$c a;

    public void a(CameraRollManager$c p0){
       this.a = p0;
       super();
    }
    public void onScanCompleted(String p0,Uri p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       if (p1 != null) {
          this.a.c.resolve(p1.toString());
       }else {
          this.a.c.reject("E_UNABLE_TO_SAVE", "Could not add image to gallery");
       }
       return;
    }
}
