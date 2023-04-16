package j79.s;
import androidx.viewpager.widget.ViewPager$i;
import j79.q;
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
import java.util.Objects;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import android.widget.ImageView;
import com.yxcorp.gifshow.album.widget.preview.f;

public final class s implements ViewPager$i	// class@002793
{
    public final q b;

    public void s(q p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(s.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, s.class, "1")) {
          return;
       }
       s tb = this.b;
       if (tb.h != null && !p0) {
          tb.h = false;
          PreviewViewPager previewViewP = tb.n.p();
          if (previewViewP != null) {
             PreviewViewPager.p(previewViewP, this.b.e.C(), null, 2, null);
          }
          this.b.j();
          this.b.e().nh(false);
       }
       return;
    }
    public void onPageSelected(int p0){
       int i;
       float ratio;
       ImageView imageView1;
       o oo1;
       ImageView imageView2;
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, os, "2")) {
          return;
       }
       os = this.b;
       if (p0 == os.f) {
          return;
       }
       os.e.I(p0);
       os = this.b;
       if (os.f != -1) {
          String typeLoggerSt = os.l.t0().getMedia().getTypeLoggerStr();
          i = (p0 > this.b.f)? 3: 4;
          d.a(typeLoggerSt, i);
       }else {
          o oo3 = os.e.C();
          if (oo3 != null) {
             oo3.f();
          }
       }
       this.b.j();
       this.b.l.R0(p0);
       this.b.e().lh();
       this.b.e().nh(p0);
       os = this.b;
       os.f = p0;
       MediaPreviewInfo mediaPreview = os.l.A0().s(p0);
       PreviewViewPager previewViewP = this.b.n.p();
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
       if (this.b.l.J0()) {
          this.b.e.B();
          os = this.b;
          Objects.requireNonNull(os);
          q oq = q.class;
          if (!PatchProxy.isSupport(oq) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), os, oq, "6")) {
             previewViewP = os.n.p();
             int i1 = 0;
             i = (previewViewP != null)? previewViewP.getChildCount(): 0;
             int i2 = 0;
             ImageView imageView = null;
             while (i2 < i) {
                PreviewViewPager previewViewP1 = os.n.p();
                View childAt = (previewViewP1 != null)? previewViewP1.getChildAt(i2): imageView;
                if (!childAt instanceof ViewGroup) {
                   childAt = imageView;
                }
                childAt = (childAt != null)? childAt.getChildAt(i1): imageView;
                if (!childAt instanceof KsAlbumVideoPlayerView) {
                   imageView1 = imageView;
                }
                if (imageView1 != null) {
                   imageView = imageView1.getPlayerStatusView();
                }
                int i3 = (os.i != null)? 0: 8;
                if (imageView != null) {
                   imageView.setVisibility(i3);
                }
                i2 = i2 + 1;
             }
             if (p0 > 0) {
                oo1 = os.e.D((p0 - 1));
                if (!oo1 instanceof f) {
                   oo1 = imageView;
                }
                if (oo1 != null) {
                   oo1.z(os.i);
                }
             }
             oo1 = os.e.D(p0);
             if (!oo1 instanceof f) {
                imageView2 = imageView;
             }
             if (imageView2 != null) {
                imageView2.z(os.i);
             }
             if (p0 < (os.e.j() - 1)) {
                p0++;
                o oo2 = os.e.D(p0);
                if (oo2 instanceof f) {
                   imageView = oo2;
                }
                if (imageView != null) {
                   imageView.z(os.i);
                }
             }
          }
       }
       return;
    }
}
