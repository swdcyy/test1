package com.yxcorp.gifshow.relation.explore.search.d$a;
import android.text.TextWatcher;
import com.yxcorp.gifshow.relation.explore.search.d;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import qvb.n0;
import qvb.a;
import android.view.ViewGroup;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.EditText;
import android.view.View;
import com.yxcorp.utility.n;
import jac.f;
import com.yxcorp.gifshow.fragment.f;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.app.Application;
import o56.a;
import android.text.SpannableString;
import lnc.a1;
import android.widget.TextView;
import k2b.u1;

public class d$a implements TextWatcher	// class@001877
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, str)) {
          return;
       }
       d$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, d.class, "9")) {
          tb.p.p0();
          d p = tb.p;
          if (p != null && !p.isEmpty()) {
             tb.p.clear();
          }
          int i = 4;
          tb.w.setVisibility(i);
          if (TextUtils.x(p0)) {
             tb.u.setHint(R.string.arg_RES_7f100f55);
             n.Y(tb.v, i, true);
             tb.x.setVisibility(8);
          }else {
             p = tb.q;
             String str1 = p0.toString();
             Objects.requireNonNull(p);
             if (!PatchProxy.applyVoidOneRefs(str1, p, f.class, str)) {
                p.a.K(p.J0());
                Object[] objArray = new Object[true];
                objArray[0] = str1;
                p.m.setText(a1.l(a.b().getString(R.string.arg_RES_7f1044b8, objArray), str1, -45056));
             }
             n.Y(tb.v, false, true);
             tb.x.setVisibility(false);
          }
          if (!PatchProxy.applyVoid(null, tb, d.class, "11") && tb.t != null) {
             tb.t = false;
             u1.a();
          }
       }
    label_00a6 :
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
