package com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$a;
import com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView$b;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.graphics.Rect;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView$d;

public class CropImageView$a implements CropOverlayView$b	// class@000d5b
{
    public final CropImageView a;

    public void CropImageView$a(CropImageView p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       CropImageView$a uoa = CropImageView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.d(p0, true);
       uoa = this.a;
       CropImageView w = uoa.w;
       if (w != null && !p0) {
          w.a(uoa.getCropRect());
       }
       return;
    }
}
