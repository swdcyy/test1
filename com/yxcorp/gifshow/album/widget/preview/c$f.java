package com.yxcorp.gifshow.album.widget.preview.c$f;
import c79.d;
import com.yxcorp.gifshow.album.widget.preview.c;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import android.widget.ImageView;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView$b;

public class c$f implements d	// class@001b31
{
    public final c a;

    public void c$f(c p0){
       this.a = p0;
       super();
    }
    public void a(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$f.class, "2")) {
          return;
       }
       if (this.a.f.m() != null) {
          this.a.f.m().setVisibility(8);
       }
       c$f ta = this.a;
       ta.g = true;
       if (ta.f.w() != null && this.a.f.w().getImageCallback() != null) {
          this.a.f.w().getImageCallback().a(p0);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c$f.class, "1")) {
          return;
       }
       if (this.a.f.w() != null && this.a.f.w().getImageCallback() != null) {
          this.a.f.w().getImageCallback().b();
       }
       return;
    }
}
