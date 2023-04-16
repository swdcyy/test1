package com.yxcorp.gifshow.profile.collect.dialog.b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import h2c.d;
import android.app.Activity;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import com.yxcorp.utility.Log;
import java.util.Objects;
import com.yxcorp.gifshow.profile.collect.dialog.KemBottomDialogNewResponse;
import kzc.d;
import u07.t$a;
import u07.a;
import android.widget.ImageView$ScaleType;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import com.kwai.library.widget.popup.common.c$b;
import h2c.a;
import u07.u;
import com.yxcorp.gifshow.profile.collect.dialog.a;
import h2c.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import android.graphics.Bitmap;
import m0d.l;

public class b implements ImageCallback	// class@00129c
{
    public final Activity b;
    public final d c;

    public void b(d p0,Activity p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (!p0 instanceof BitmapDrawable) {
          return;
       }
       Log.g("KemBottomDialogNew", "drawable fetch complete");
       b tc = this.c;
       b tb = this.b;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidTwoRefs(tb, p0, tc, d.class, "3")) {
          d a = tc.a;
          if (a != null && tc.b(a)) {
             a = a.b(new d(tb));
             a.Z0(165);
             a.C0(p0);
             a.F0(ImageView$ScaleType.CENTER);
             a.X0(TextUtils.i(tc.a.mTitle, ""));
             a.z0(TextUtils.i(tc.a.mContent, ""));
             a.T0(TextUtils.i(tc.a.mButtonContent, ""));
             a.w0(true);
             a.A(true);
             a.u0(new a(tc, tb));
             a.s0(a.b);
             a.Y(new c(tc));
          }
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
