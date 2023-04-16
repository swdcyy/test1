package b4d.y0;
import java.lang.Runnable;
import b4d.v0$f;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.Bitmap;
import java.lang.Object;
import java.util.Objects;
import b4d.v0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.lang.Math;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.widget.ImageView$ScaleType;

public final class y0 implements Runnable	// class@0003a0
{
    public final v0$f b;
    public final KwaiImageView c;
    public final Bitmap d;
    public final Runnable e;

    public void y0(v0$f p0,KwaiImageView p1,Bitmap p2,Runnable p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       y0 tc = this.c;
       y0 td = this.d;
       y0 te = this.e;
       v0$f e = this.b.e;
       Objects.requireNonNull(e);
       if (PatchProxy.applyVoidTwoRefs(tc, td, e, v0.class, "19")) {
       }else {
          ViewGroup$LayoutParams layoutParams = tc.getLayoutParams();
          int k = e.K;
          layoutParams.height = k;
          k = (int)Math.min((float)e.L, ((float)k / (((float)td.getHeight() * 0x3f800000) / ((float)td.getWidth() + 0x3f800000))));
          layoutParams.width = k;
          layoutParams.width = Math.max(layoutParams.height, k);
          tc.setLayoutParams(layoutParams);
          if (e.u.mForceNewEditorStyle != null) {
             tc.setScaleType(ImageView$ScaleType.CENTER_CROP);
          }
          tc.setImageBitmap(td);
       }
       if (te != null) {
          te.run();
       }
       return;
    }
}
