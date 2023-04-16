package j79.z;
import androidx.viewpager.widget.ViewPager$i;
import j79.x;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import u79.o;
import u79.a;
import androidx.lifecycle.LifecycleOwner;
import s79.a;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import com.yxcorp.gifshow.album.preview.d;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import j79.l0;
import r79.c;
import o79.d;
import ha9.c;

public final class z implements ViewPager$i	// class@0027a1
{
    public final x b;

    public void z(x p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(z.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, z.class, "1")) {
          return;
       }
       z tb = this.b;
       if (tb.h != null && !p0) {
          tb.h = false;
          PreviewViewPager previewViewP = tb.m.p();
          if (previewViewP != null) {
             PreviewViewPager.p(previewViewP, this.b.e.C(), null, 2, null);
          }
          this.b.e().nh(false);
       }
       return;
    }
    public void onPageSelected(int p0){
       float ratio;
       z oz = z.class;
       if (PatchProxy.isSupport(oz) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oz, "2")) {
          return;
       }
       oz = this.b;
       if (p0 == oz.f) {
          return;
       }
       oz.e.I(p0);
       oz = this.b;
       if (oz.f != -1) {
          String typeLoggerSt = oz.k.t0().getMedia().getTypeLoggerStr();
          int i = (p0 > this.b.f)? 3: 4;
          d.a(typeLoggerSt, i);
       }else {
          o oo1 = oz.e.C();
          if (oo1 != null) {
             oo1.f();
          }
       }
       this.b.h();
       this.b.k.R0(p0);
       this.b.e().lh();
       this.b.e().nh(p0);
       oz = this.b;
       oz.f = p0;
       MediaPreviewInfo mediaPreview = oz.k.A0().s(p0);
       PreviewViewPager previewViewP = this.b.m.p();
       if (previewViewP != null) {
          o oo = this.b.e.C();
          if (mediaPreview != null) {
             c media = mediaPreview.getMedia();
             if (media != null) {
                ratio = media.getRatio();
             label_00a0 :
                previewViewP.o(oo, Float.valueOf(ratio));
             }
          }
          ratio = 0;
          goto label_00a0 ;
       }
       return;
    }
}
