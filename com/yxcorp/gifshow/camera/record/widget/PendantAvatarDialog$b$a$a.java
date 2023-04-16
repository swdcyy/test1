package com.yxcorp.gifshow.camera.record.widget.PendantAvatarDialog$b$a$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import brd.v;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import brd.g;
import java.lang.RuntimeException;
import java.lang.Throwable;
import m0d.l;

public final class PendantAvatarDialog$b$a$a implements ImageCallback	// class@000fc9
{
    public final v b;

    public void PendantAvatarDialog$b$a$a(v p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantAvatarDialog$b$a$a.class, "1")) {
          return;
       }
       if (p0 instanceof BitmapDrawable) {
          this.b.onNext(p0.getBitmap());
       }else {
          this.b.onError(new RuntimeException("image request failed."));
       }
       this.b.onComplete();
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
