package com.yxcorp.image.fresco.wrapper.a$b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import android.widget.ImageView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xb.h;
import android.graphics.Bitmap;
import m0d.l;
import java.lang.Float;

public final class a$b implements ImageCallback	// class@001a0c
{
    public final ImageCallback b;
    public final ImageView c;

    public void a$b(ImageCallback p0,ImageView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       a$b tb = this.b;
       if (tb != null) {
          tb.onCompleted(p0);
       }
       if (p0 != null) {
          Drawable[] uDrawableArr = new Drawable[]{p0};
          h oh = new h(uDrawableArr);
          oh.h(300);
          this.c.setImageDrawable(oh);
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "2")) {
          return;
       }
       uob = this.b;
       if (uob != null) {
          uob.onProgress(p0);
       }
       return;
    }
}
