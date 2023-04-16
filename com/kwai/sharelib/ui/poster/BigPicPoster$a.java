package com.kwai.sharelib.ui.poster.BigPicPoster$a;
import erd.g;
import com.kwai.sharelib.ui.poster.BigPicPoster;
import msd.s;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.ViewGroup;
import java.lang.Integer;
import android.widget.ImageView$ScaleType;
import yo7.b;
import com.kwai.sharelib.ui.poster.PosterType;
import android.view.View;
import mp7.c;
import np7.d;
import np7.d$a;

public final class BigPicPoster$a implements g	// class@00170e
{
    public final BigPicPoster b;
    public final s c;
    public final int d;
    public final int e;

    public void BigPicPoster$a(BigPicPoster p0,s p1,int p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BigPicPoster$a.class, "1")) {
       }else {
          BigPicPoster$a tc = this.c;
          ImageView imageView = BigPicPoster.p(this.b);
          BigPicPoster a = this.b.a;
          if (a == null) {
             a.S("bigPicLayout");
          }
          Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
          a.o(p0, "result");
          tc.invoke(imageView, a, Integer.valueOf(this.d), Integer.valueOf(this.e), p0);
          BigPicPoster.p(this.b).setScaleType(ImageView$ScaleType.FIT_XY);
          BigPicPoster.p(this.b).setImageBitmap(p0);
          p0 = this.b.s();
          if (p0 != null) {
             p0.i(PosterType.BIG_PIC.getValue());
          }
          p0 = this.b.e;
          if (p0 != null) {
             p0.f(PosterType.BIG_PIC.getValue(), BigPicPoster.o(this.b));
          }
          p0 = this.b;
          ImageView imageView1 = BigPicPoster.p(p0);
          if (!PatchProxy.applyVoidOneRefs(imageView1, p0, BigPicPoster.class, "16")) {
             a.p(imageView1, "imageView");
             d$a.l(p0, imageView1);
          }
       }
       return;
    }
}
