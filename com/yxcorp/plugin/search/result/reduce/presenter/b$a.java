package com.yxcorp.plugin.search.result.reduce.presenter.b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.plugin.search.result.reduce.presenter.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Editable;
import android.widget.EditText;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import com.yxcorp.plugin.search.utils.f0$c;
import com.kwai.library.widget.popup.common.c;
import lnc.a1;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;

public class b$a extends m	// class@00232c
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (TextUtils.x(this.c.p.getText())) {
          return;
       }
       b$a tc = this.c;
       tc.w.d(tc.p.getText().toString(), this.c.r.getText().toString());
       this.c.v.q(4);
       i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1044af), 1);
       n.C(this.c.getActivity());
       return;
    }
}
