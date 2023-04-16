package com.yxcorp.gifshow.album.preview.MediaPreviewFragment$b;
import n79.a;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import java.lang.Object;
import u79.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import com.yxcorp.gifshow.album.preview.d;
import u79.a;
import java.lang.Float;
import java.util.Objects;
import android.view.View;
import android.view.ViewGroup;
import com.yxcorp.gifshow.album.preview.PreviewViewPager$a;

public class MediaPreviewFragment$b implements a	// class@001a29
{
    public final MediaPreviewFragment a;

    public void MediaPreviewFragment$b(MediaPreviewFragment p0){
       this.a = p0;
       super();
    }
    public o a(){
       Object obj = PatchProxy.apply(null, this, MediaPreviewFragment$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.ih().p() != null && this.a.ih().p().getAdapter() instanceof d) {
          return this.a.ih().p().getAdapter().C();
       }
       return null;
    }
    public void b(float p0){
       MediaPreviewFragment$b uob = MediaPreviewFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "2")) {
          return;
       }
       if (this.a.ih().p() != null) {
          float f = 0x3f800000 - p0;
          this.a.ih().p().l(f);
          PreviewViewPager previewViewP = this.a.ih().p();
          Objects.requireNonNull(previewViewP);
          if (!PatchProxy.isSupport(PreviewViewPager.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), previewViewP, PreviewViewPager.class, "13")) {
             PreviewViewPager r = previewViewP.r;
             if (r != null) {
                r.setTranslationX((previewViewP.i * f));
                r.setTranslationY((previewViewP.j * f));
             }
          }
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewFragment$b.class, "3")) {
          return;
       }
       if (this.a.ih().p() != null) {
          this.a.ih().p().setAlpha(0);
          this.a.ih().p().l(0);
          if (this.a.ih().p().getAttachmentDismissListener() != null) {
             this.a.ih().p().getAttachmentDismissListener().a(0, true);
          }
       }
       return;
    }
    public void d(float p0){
       MediaPreviewFragment$b uob = MediaPreviewFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (this.a.ih().p() != null) {
          this.a.ih().p().k(p0);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, MediaPreviewFragment$b.class, "4")) {
          return;
       }
       if (this.a.ih().p() != null) {
          this.a.ih().p().setAlpha(0x3f800000);
          this.a.ih().p().k(0x3f800000);
          if (this.a.ih().p().getAttachmentDismissListener() != null) {
             this.a.ih().p().getAttachmentDismissListener().a(0x3f800000, false);
          }
          o oo = this.a();
          if (oo != null) {
             oo.l();
          }
       }
       return;
    }
}
