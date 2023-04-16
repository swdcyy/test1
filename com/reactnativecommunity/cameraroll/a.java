package com.reactnativecommunity.cameraroll.a;
import android.media.MediaScannerConnection$OnScanCompletedListener;
import com.reactnativecommunity.cameraroll.CameraRollModule$d;
import java.lang.Object;
import java.lang.String;
import android.net.Uri;
import com.facebook.react.bridge.Promise;

public class a implements MediaScannerConnection$OnScanCompletedListener	// class@000b5c
{
    public final CameraRollModule$d a;

    public void a(CameraRollModule$d p0){
       this.a = p0;
       super();
    }
    public void onScanCompleted(String p0,Uri p1){
       if (p1 != null) {
          this.a.c.resolve(p1.toString());
       }else {
          this.a.c.reject("E_UNABLE_TO_SAVE", "Could not add image to gallery");
       }
       return;
    }
}
