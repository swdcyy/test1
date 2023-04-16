package com.kuaishou.live.core.voiceparty.playway.shared.viewbinder.KwaiImageViewBinderKt$a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import msd.l;
import msd.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import kotlin.jvm.internal.a;
import java.lang.Number;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import o1.f;
import java.util.List;
import java.util.Collection;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Objects;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;

public final class KwaiImageViewBinderKt$a implements Observer	// class@00188a
{
    public final KwaiBindableImageView b;
    public final l c;
    public final l d;
    public final p e;

    public void KwaiImageViewBinderKt$a(KwaiBindableImageView p0,l p1,l p2,p p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiImageViewBinderKt$a.class, "1")) {
          return;
       }
       if (p0 != null && (a.g(p0, this.b.getTag()) ^ 0x01)) {
          int i = this.c.invoke(p0).intValue();
          Resources$Theme theme = null;
          if (i) {
             KwaiImageViewBinderKt$a tb = this.b;
             tb.setPlaceHolderImage(f.c(tb.getResources(), i, theme));
          }else {
             this.b.setPlaceHolderImage(theme);
          }
          List list = this.d.invoke(p0);
          if (list.isEmpty() ^ 0x01) {
             a$a uoa = a.d();
             uoa.b(":ks-features:ft-live:live");
             uoa.d(ImageSource.FEED_AVATAR);
             d uod = Fresco.newDraweeControllerBuilder().r(uoa.a());
             int i1 = 0;
             ImageRequest[] imageRequest = new ImageRequest[i1];
             Object[] objArray = list.toArray(imageRequest);
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
             uod.v(objArray, i1);
             uod.y(this.b.getController());
             a.o(uod, "Fresco.newDraweeControll¡­OldController\(controller\)");
             KwaiImageViewBinderKt$a te = this.e;
             if (te != null) {
                b uob = te.invoke(this.b, p0);
                if (uob != null) {
                   uod.s(uob);
                }
             }
             this.b.setController(uod.e());
          }
       }else if(p0 == null){
          this.b.i0();
       }
       this.b.setTag(p0);
       return;
    }
}
