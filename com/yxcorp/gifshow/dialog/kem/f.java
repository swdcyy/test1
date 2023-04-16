package com.yxcorp.gifshow.dialog.kem.f;
import x9a.d0;
import android.app.Activity;
import com.yxcorp.gifshow.model.response.dialog.KemCommonAgreementDialogResponse;
import x9a.k0;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import zf6.k;
import kzc.d;
import u07.t$a;
import u07.a;
import android.net.Uri;
import com.yxcorp.gifshow.model.response.dialog.KemCommonAgreementDialogResponse$AdmireButton;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.gifshow.dialog.kem.f$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;

public class f extends d0	// class@001ab4
{

    public void f(Activity p0,KemCommonAgreementDialogResponse p1,k0 p2){
       super(p0, p1, p2);
    }
    public final String d(){
       Object[] objArray = null;
       KemCommonAgreementDialogResponse obj = PatchProxy.apply(objArray, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.b().mImageUrl)) {
          return objArray;
       }
       obj = this.b().mImageUrl;
       if (!TextUtils.x(this.b().mImageUrlDark)) {
          obj = (k.d())? this.b().mImageUrlDark: this.b().mImageUrl;
       }
    label_004b :
       return obj;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       if (this.d() == null) {
          return;
       }
       if (this.c()) {
          KemCommonAgreementDialogResponse kemCommonAgr = this.b();
          Activity uActivity = this.a();
          d uod = a.a(new d(uActivity));
          uod.Z0(97);
          uod.G0(Uri.parse(this.d()));
          uod.X0(kemCommonAgr.mTitle);
          uod.z0(kemCommonAgr.mContent);
          uod.T0(kemCommonAgr.mButton.mText);
          uod.L(new PopupInterface$g(R.layout.arg_RES_7f0d02e4));
          uod.Y(new f$a(this, kemCommonAgr, uActivity));
       }
       return;
    }
}
