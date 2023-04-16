package com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog;
import x9a.d0;
import com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$a;
import nsd.u;
import android.app.Activity;
import com.yxcorp.gifshow.model.response.dialog.KemCommonConfirmCancelDialogResponse;
import x9a.k0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.image.request.a;
import s0d.e;
import com.yxcorp.gifshow.dialog.kem.KemCommonConfirmCancelDialog$b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public final class KemCommonConfirmCancelDialog extends d0	// class@001aa8
{
    public static final KemCommonConfirmCancelDialog$a d;

    static {
       KemCommonConfirmCancelDialog.d = new KemCommonConfirmCancelDialog$a(null);
    }
    public void KemCommonConfirmCancelDialog(Activity p0,KemCommonConfirmCancelDialogResponse p1,k0 p2){
       a.p(p0, "activity");
       a.p(p1, "response");
       a.p(p2, "param");
       super(p0, p1, p2);
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, KemCommonConfirmCancelDialog.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(this.b().mImageUrl)) {
          a.d(a.u(this.b().mImageUrl).q(), new KemCommonConfirmCancelDialog$b(this));
       }
       return;
    }
}
