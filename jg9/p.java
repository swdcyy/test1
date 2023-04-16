package jg9.p;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$b;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiPicturePreviewHelper;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import android.view.View;

public final class p implements PreviewViewPager$b	// class@002aab
{
    public final MultiPicturePreviewHelper b;

    public void p(MultiPicturePreviewHelper p0){
       this.b = p0;
       super();
    }
    public void K7(float p0){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, op, "1")) {
          return;
       }
       View view = this.b.c();
       if (view != null) {
          view.setAlpha(p0);
       }
       return;
    }
}
