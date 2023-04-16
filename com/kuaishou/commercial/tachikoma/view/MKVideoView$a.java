package com.kuaishou.commercial.tachikoma.view.MKVideoView$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.kuaishou.commercial.tachikoma.view.MKVideoView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import m0d.l;
import android.graphics.Bitmap;

public class MKVideoView$a implements ImageCallback	// class@00168d
{
    public final MKVideoView b;

    public void MKVideoView$a(MKVideoView p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MKVideoView$a.class, "1")) {
          return;
       }
       l.a(this, p0);
       this.b.d("load poster completed ");
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
