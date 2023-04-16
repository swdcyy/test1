package com.kuaishou.merchant.basic.util.d$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.kuaishou.merchant.basic.util.d$b;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import m0d.l;

public class d$a implements ImageCallback	// class@0015d6
{
    public final d$b b;

    public void d$a(d$b p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       if (tb != null) {
          tb.onCompleted(p0);
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
