package com.kuaishou.live.core.show.photoalbum.cropper.b;
import android.os.AsyncTask;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.content.Context;
import android.widget.FrameLayout;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.photoalbum.cropper.b$a;
import com.kuaishou.live.core.show.photoalbum.cropper.c$a;
import com.kuaishou.live.core.show.photoalbum.cropper.c;
import android.graphics.Bitmap;
import com.kuaishou.live.core.show.photoalbum.cropper.c$b;
import java.lang.Exception;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$e;

public final class b extends AsyncTask	// class@000d6b
{
    public final WeakReference a;
    public final Uri b;
    public final Context c;
    public final int d;
    public final int e;

    public void b(CropImageView p0,Uri p1){
       super();
       this.b = p1;
       this.a = new WeakReference(p0);
       this.c = p0.getContext();
       DisplayMetrics uDisplayMetr = c.c(p0.getResources());
       DisplayMetrics density = uDisplayMetr.density;
       float f = 0x3f800000;
       double d = (density - f > 0)? (double)(f / density): 0x3ff0000000000000;
       this.d = (int)((double)uDisplayMetr.widthPixels * d);
       this.e = (int)((double)uDisplayMetr.heightPixels * d);
       return;
    }
    public Object doInBackground(Object[] p0){
       b$a uoa;
       try{
          uoa = PatchProxy.applyOneRefs(p0, this, b.class, "1");
          if (uoa != PatchProxyResult.class) {
          }else if(!this.isCancelled()){
             c$a uoa1 = c.k(this.c, this.b, this.d, this.e);
             if (!this.isCancelled()) {
                c$b uob = c.y(uoa1.a, this.c, this.b);
                uoa = new b$a(this.b, uob.a, uoa1.b, uob.b);
             }
          }
          uoa = null;
       }catch(java.lang.Exception e5){
          uoa = new b$a(this.b, e5);
       }
          return uoa;
    }
    public void onPostExecute(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else if(p0 != null){
          int i = 0;
          if (!this.isCancelled()) {
             CropImageView uCropImageVi = this.a.get();
             if (uCropImageVi != null) {
                i = 1;
                if (!PatchProxy.applyVoidOneRefs(p0, uCropImageVi, CropImageView.class, "45")) {
                   uCropImageVi.I = null;
                   uCropImageVi.h();
                   if (p0.e == null) {
                      b$a d = p0.d;
                      uCropImageVi.j = d;
                      uCropImageVi.f(p0.b, 0, p0.a, p0.c, d);
                   }
                   CropImageView x = uCropImageVi.x;
                   if (x != null) {
                      x.a(uCropImageVi, p0.a, p0.e);
                   }
                }
             }
          }
          if (!i) {
             p0 = p0.b;
             if (p0 != null) {
                p0.recycle();
             }
          }
       }
       return;
    }
}
