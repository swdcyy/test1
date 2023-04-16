package com.yxcorp.gifshow.dialog.kem.g$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.gifshow.dialog.kem.g;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.app.Activity;
import x9a.d0;
import java.util.Objects;
import kzc.d;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.dialog.kem.g$b;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import com.yxcorp.gifshow.model.response.dialog.KemCommonDialogResponse;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import x9a.u;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import m0d.l;

public class g$a implements ImageCallback	// class@001ab5
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       if (!p0 instanceof BitmapDrawable) {
          return;
       }
       Bitmap bitmap = p0.getBitmap();
       if (bitmap == null) {
          return;
       }
       g$a tb = this.b;
       Activity uActivity = tb.a();
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(uActivity, bitmap, tb, g.class, "2") && tb.c()) {
          d uod = new d(uActivity);
          uod.Z0(67);
          uod.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062050)));
          uod.L(new g$b(uActivity, tb.b(), bitmap));
          uod.Y(new u(tb));
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
