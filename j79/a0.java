package j79.a0;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$d;
import j79.x;
import java.lang.Object;
import android.view.View;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LifecycleOwner;
import s79.a;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import o79.d;

public final class a0 implements PreviewViewPager$d	// class@002768
{
    public final x a;

    public void a0(x p0){
       this.a = p0;
       super();
    }
    public void a(View p0,Float p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a0.class, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       MediaPreviewFragment mediaPreview = this.a.e();
       float scaleX = p0.getScaleX();
       float translationX = p0.getTranslationX();
       float translationY = p0.getTranslationY();
       float f = (p1 != null)? p1.floatValue(): 0;
       mediaPreview.rh(scaleX, translationX, translationY, f);
       translationY = this.a.m.o();
       if (translationY != null) {
          translationY.setAlpha(0);
       }
       d.c();
       this.a.e().onBackPressed();
       return;
    }
}