package com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.app.Activity;
import x9a.d0;
import kotlin.jvm.internal.a;
import java.util.Objects;
import kzc.d;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$DialogOnViewStateCallback;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import com.yxcorp.gifshow.model.response.dialog.KemCommonConfirmCancelDialogResponse;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import x9a.r;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import m0d.l;

public final class KemCommonConfirmCancelDialog$b implements ImageCallback	// class@001aa7
{
    public final KemCommonConfirmCancelDialog b;

    public void KemCommonConfirmCancelDialog$b(KemCommonConfirmCancelDialog p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KemCommonConfirmCancelDialog$b.class, "1")) {
          return;
       }
       if (!p0 instanceof BitmapDrawable) {
          return;
       }
       Bitmap bitmap = p0.getBitmap();
       if (bitmap != null) {
          KemCommonConfirmCancelDialog$b tb = this.b;
          Activity uActivity = tb.a();
          a.o(uActivity, "activity");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidTwoRefs(uActivity, bitmap, tb, KemCommonConfirmCancelDialog.class, "2") && tb.c()) {
             d uod = new d(uActivity);
             uod.Z0(64);
             uod.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062050)));
             uod.A(true);
             KemCommonConfirmCancelDialogResponse kemCommonCon = tb.b();
             a.o(kemCommonCon, "data");
             uod.L(new KemCommonConfirmCancelDialog$DialogOnViewStateCallback(kemCommonCon, bitmap));
             uod.Y(new r(tb));
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
