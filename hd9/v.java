package hd9.v;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.library.widget.surface.SafeTextureView;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public final class v implements Runnable	// class@00262d
{
    public final d b;

    public void v(d p0){
       this.b = p0;
    }
    public final void run(){
       v tb = this.b;
       if (tb.w != null) {
          float f = (float)tb.w.getVideoWidth();
          float f1 = (float)tb.w.getVideoHeight();
          d uod = d.class;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), Float.valueOf(f1), tb, uod, "28")) {
             SafeTextureView textureView = tb.r.getTextureView();
             float f2 = (float)textureView.getWidth();
             float f3 = (float)textureView.getHeight();
             int i = 0;
             if (f3 - i && f1 - i) {
                f = f / f1;
                if ((f2 / f3) - f < 0) {
                   f3 = f2 / f;
                }else {
                   f2 = f3 * f;
                }
                RelativeLayout$LayoutParams layoutParams = textureView.getLayoutParams();
                layoutParams.width = (int)f2;
                layoutParams.height = (int)f3;
                layoutParams.addRule(14);
                textureView.setLayoutParams(layoutParams);
                tb.r.getImageView().setLayoutParams(layoutParams);
                layoutParams = tb.r.getLayoutParams();
                layoutParams.addRule(14);
                tb.r.setLayoutParams(layoutParams);
             }
          }
       }
       return;
    }
}
