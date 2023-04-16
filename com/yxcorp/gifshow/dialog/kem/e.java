package com.yxcorp.gifshow.dialog.kem.e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.response.dialog.KemCommonAgreementDialogResponse;
import android.widget.CheckBox;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import x9a.j0;
import wkd.b;
import i89.d;
import brd.t;
import t45.d;
import brd.z;
import x9a.q;
import x9a.p;
import erd.g;
import crd.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;

public final class e implements View$OnClickListener	// class@001ab2
{
    public final KemCommonAgreementDialogResponse b;
    public final CheckBox c;
    public final c d;

    public void e(KemCommonAgreementDialogResponse p0,CheckBox p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       e tb = this.b;
       e td = this.d;
       j0.i(tb, "AGREE_NOW");
       if (this.c.isChecked()) {
          b.a(0x2c66a15d).d().observeOn(d.a).subscribe(new q(tb, td), new p(tb));
       }else if(!TextUtils.x(tb.mUnClickToast)){
          j0.j(tb, tb.mUnClickToast);
          i.d(R.style.arg_RES_7f11066a, tb.mUnClickToast);
       }
       return;
    }
}
