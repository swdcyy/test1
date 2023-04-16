package com.yxcorp.gifshow.social.profile.EmptyProfileViewHelper$Companion$fillMaterial$1;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.yxcorp.gifshow.social.profile.EmptyProfileViewHelper$Companion$fillMaterial$1$a;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.social.profile.EmptyProfileViewHelper$Companion$fillMaterial$1$b;
import com.yxcorp.gifshow.social.profile.EmptyProfileViewHelper$Companion$fillMaterial$1$onCompletedBitmap$disposable$3;
import pjc.a;
import msd.l;
import erd.g;
import crd.b;

public final class EmptyProfileViewHelper$Companion$fillMaterial$1 implements ImageCallback	// class@001d69
{
    public final KwaiImageView b;

    public void EmptyProfileViewHelper$Companion$fillMaterial$1(KwaiImageView p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmptyProfileViewHelper$Companion$fillMaterial$1.class, "1")) {
          return;
       }
       if (p0 != null) {
          t ot = t.just(p0).map(EmptyProfileViewHelper$Companion$fillMaterial$1$a.b).subscribeOn(d.c).observeOn(d.a);
          EmptyProfileViewHelper$Companion$fillMaterial$1$b uCompanion$f = new EmptyProfileViewHelper$Companion$fillMaterial$1$b(this);
          EmptyProfileViewHelper$Companion$fillMaterial$1$onCompletedBitmap$disposable$3 iNSTANCE = EmptyProfileViewHelper$Companion$fillMaterial$1$onCompletedBitmap$disposable$3.INSTANCE;
          if (iNSTANCE != null) {
             iNSTANCE = new a(iNSTANCE);
          }
          ot.subscribe(uCompanion$f, iNSTANCE);
       }
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
