package com.yxcorp.gifshow.dialog.kem.a;
import x9a.d0;
import android.app.Activity;
import com.yxcorp.gifshow.model.response.dialog.KemAdvanceCommonDialogResponse;
import x9a.k0;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.dialog.KemCommonDialogResponse;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.image.request.a;
import s0d.e;
import com.yxcorp.gifshow.dialog.kem.a$a;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public class a extends d0	// class@001aad
{

    public void a(Activity p0,KemAdvanceCommonDialogResponse p1,k0 p2){
       super(p0, p1, p2);
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(this.b().mMaterialUrl)) {
          a.d(a.u(this.b().mMaterialUrl).q(), new a$a(this));
       }
       return;
    }
}
