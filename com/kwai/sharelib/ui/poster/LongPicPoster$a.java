package com.kwai.sharelib.ui.poster.LongPicPoster$a;
import erd.g;
import com.kwai.sharelib.ui.poster.LongPicPoster;
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
import op7.f;
import mp7.c;
import com.kwai.sharelib.model.TkConfig;
import yo7.b;
import com.kwai.sharelib.ui.poster.PosterType;
import android.view.View;
import np7.d;
import np7.d$a;

public final class LongPicPoster$a implements g	// class@00171a
{
    public final LongPicPoster b;
    public final s c;
    public final int d;
    public final int e;

    public void LongPicPoster$a(LongPicPoster p0,s p1,int p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       f uof;
       if (PatchProxy.applyVoidOneRefs(p0, this, LongPicPoster$a.class, "1")) {
       }else {
          LongPicPoster$a tc = this.c;
          ImageView imageView = LongPicPoster.p(this.b);
          LongPicPoster b = this.b.b;
          if (b == null) {
             a.S("longPosterLayout");
          }
          Objects.requireNonNull(b, "null cannot be cast to non-null type android.view.ViewGroup");
          a.o(p0, "result");
          tc.invoke(imageView, b, Integer.valueOf(this.d), Integer.valueOf(this.e), p0);
          LongPicPoster.p(this.b).setScaleType(ImageView$ScaleType.FIT_XY);
          LongPicPoster.p(this.b).setImageBitmap(p0);
          if (this.b.t() != null) {
             p0 = this.b;
             if (p0.g != null) {
                p0 = p0.u();
                if (p0 != null) {
                   uof = this.b.t();
                   a.m(uof);
                   p0.h(uof.n());
                }
                p0 = this.b.r();
                if (p0 != null) {
                   uof = this.b.t();
                   a.m(uof);
                   p0.f(uof.n());
                }
             }
          }
          p0 = this.b.r();
          if (p0 != null) {
             p0.i(PosterType.LONG_PIC.getValue());
          }
          p0 = this.b.u();
          if (p0 != null) {
             p0.f(PosterType.LONG_PIC.getValue(), LongPicPoster.o(this.b));
          }
          p0 = this.b;
          ImageView imageView1 = LongPicPoster.p(p0);
          if (!PatchProxy.applyVoidOneRefs(imageView1, p0, LongPicPoster.class, "16")) {
             a.p(imageView1, "imageView");
             d$a.l(p0, imageView1);
          }
       }
       return;
    }
}