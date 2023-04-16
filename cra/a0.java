package cra.a0;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import cra.z;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kzc.d;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import cra.z$b;
import com.yxcorp.gifshow.model.response.dialog.KemDialog9Response;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import cra.a0$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import android.graphics.Bitmap;
import m0d.l;

public final class a0 implements ImageCallback	// class@002373
{
    public final z b;

    public void a0(z p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
          return;
       }
       if (!p0 instanceof Drawable) {
          return;
       }
       d uod = new d(this.b.a());
       uod.Z0(138);
       uod.w(new ColorDrawable(a1.a(R.color.arg_RES_7f062050)));
       uod.A(false);
       uod.L(new z$b(this.b.a(), this.b.b(), p0));
       uod.Y(new a0$a(this));
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
