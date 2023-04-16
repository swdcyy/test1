package com.yxcorp.image.fresco.wrapper.a$c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xb.h;
import android.graphics.Bitmap;
import m0d.l;
import java.lang.Float;

public final class a$c implements ImageCallback	// class@001a0d
{
    public final AtomicBoolean b;
    public final ImageCallback c;
    public final ImageView d;
    public final AtomicInteger e;
    public final ImageRequest f;

    public void a$c(AtomicBoolean p0,ImageCallback p1,ImageView p2,AtomicInteger p3,ImageRequest p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       if (this.b.get()) {
          return;
       }
       boolean b = true;
       this.b.set(b);
       a$c tc = this.c;
       if (tc != null) {
          tc.onCompleted(p0);
       }
       if (p0 != null) {
          Drawable[] uDrawableArr = new Drawable[b];
          uDrawableArr[0] = p0;
          h oh = new h(uDrawableArr);
          oh.h(300);
          this.d.setImageDrawable(oh);
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "2")) {
          return;
       }
       if (this.c != null && (this.e.get() != -1 && (this.e.get() == this.f.hashCode() && !this.b.get()))) {
          this.e.set(this.f.hashCode());
          this.c.onProgress(p0);
       }
    label_0049 :
       return;
    }
}
