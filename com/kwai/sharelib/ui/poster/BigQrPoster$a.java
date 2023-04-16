package com.kwai.sharelib.ui.poster.BigQrPoster$a;
import erd.g;
import com.kwai.sharelib.ui.poster.BigQrPoster;
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

public final class BigQrPoster$a implements g	// class@001714
{
    public final BigQrPoster b;
    public final s c;
    public final int d;
    public final int e;

    public void BigQrPoster$a(BigQrPoster p0,s p1,int p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BigQrPoster$a.class, "1")) {
       }else {
          BigQrPoster$a tc = this.c;
          ImageView imageView = BigQrPoster.p(this.b);
          BigQrPoster a = this.b.a;
          if (a == null) {
             a.S("bigQrLayout");
          }
          Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.ViewGroup");
          a.o(p0, "result");
          tc.invoke(imageView, a, Integer.valueOf(this.d), Integer.valueOf(this.e), p0);
          BigQrPoster.p(this.b).setScaleType(ImageView$ScaleType.FIT_XY);
          BigQrPoster.p(this.b).setImageBitmap(p0);
          p0 = this.b.s();
          if (p0 != null) {
             p0.i(PosterType.BIG_QR.getValue());
          }
          p0 = this.b.e;
          if (p0 != null) {
             p0.f(PosterType.BIG_QR.getValue(), BigQrPoster.o(this.b));
          }
          p0 = this.b;
          ImageView imageView1 = BigQrPoster.p(p0);
          if (!PatchProxy.applyVoidOneRefs(imageView1, p0, BigQrPoster.class, "16")) {
             a.p(imageView1, "imageView");
             d$a.l(p0, imageView1);
          }
       }
       return;
    }
}
