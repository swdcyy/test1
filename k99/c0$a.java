package k99.c0$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import k99.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rkd.b;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public class c0$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@002b6b
{
    public final c0 b;

    public void c0$a(c0 p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c0$a.class, "1")) {
          return;
       }
       if (b.g()) {
          return;
       }
       this.b.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       ImageMeta$AtlasCoverSize[] atlasSizes = this.b.r.getAtlasSizes();
       if (atlasSizes != null) {
          c0$a tb = this.b;
          c0 s = tb.s;
          if (atlasSizes.length > s && atlasSizes[s].mHeight - null) {
             int measuredWidt = tb.q.getMeasuredWidth();
             if (!measuredWidt) {
                return;
             }else {
                FrameLayout$LayoutParams layoutParams = this.b.p.getLayoutParams();
                layoutParams.width = measuredWidt;
                this.b.p.setLayoutParams(layoutParams);
             }
          }
       }
       return;
    }
}
