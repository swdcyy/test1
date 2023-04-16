package com.yxcorp.image.fresco.wrapper.b;
import m0d.d;
import android.content.Context;
import java.lang.String;
import com.yxcorp.image.fresco.wrapper.a$g;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.fresco.wrapper.a;
import android.graphics.Bitmap;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import m0d.l;
import java.lang.Throwable;
import com.yxcorp.image.fresco.wrapper.a$h;

public final class b implements d	// class@001a13
{
    public final Context b;
    public final String c;
    public final a$g d;

    public void b(Context p0,String p1,a$g p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.g(this.b, p0, this.c, this.d);
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       b td = this.d;
       if (td instanceof a$h) {
          td.onError(p0);
       }
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
