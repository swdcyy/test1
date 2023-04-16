package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$recommend$4$onStart$1$a;
import android.content.DialogInterface$OnCancelListener;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$recommend$4$onStart$1;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import q87.c;
import grd.d;

public final class MultiTakePictureController$recommend$4$onStart$1$a implements DialogInterface$OnCancelListener	// class@000ee8
{
    public final MultiTakePictureController$recommend$4$onStart$1 b;

    public void MultiTakePictureController$recommend$4$onStart$1$a(MultiTakePictureController$recommend$4$onStart$1 p0){
       this.b = p0;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$recommend$4$onStart$1$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(MultiTakePictureController.V.c(), "recommend cancel", objArray);
       this.b.this$0.dispose();
       return;
    }
}
