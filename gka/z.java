package gka.z;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;

public class z implements ViewTreeObserver$OnGlobalLayoutListener	// class@002b1f
{
    public final View b;
    public final ProgressFragment c;

    public void z(ProgressFragment p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, z.class, "1")) {
          return;
       }
       int width = this.b.getWidth();
       int height = this.b.getHeight();
       if (width > 0 && height > 0) {
          this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
          if (width != height && layoutParams != null) {
             width = Math.max(width, height);
             layoutParams.width = width;
             layoutParams.height = width;
             this.b.setLayoutParams(layoutParams);
          }
       }
       return;
    }
}
