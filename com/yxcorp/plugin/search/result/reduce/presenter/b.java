package com.yxcorp.plugin.search.result.reduce.presenter.b;
import ucd.n;
import hed.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.FragmentActivity;
import nfd.g0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.EditText;
import android.text.Editable;
import k06.a;
import nfd.t0;
import android.content.Context;
import android.view.View;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import ekd.r;
import lnc.a1;
import android.widget.TextView;
import java.lang.Runnable;
import java.lang.StringBuilder;
import hed.g;
import android.text.TextWatcher;
import com.yxcorp.utility.n;
import ekd.m1;
import android.view.View$OnClickListener;
import com.yxcorp.plugin.search.result.reduce.presenter.b$a;
import com.yxcorp.plugin.search.result.reduce.presenter.b$b;
import hed.e;
import android.view.View$OnFocusChangeListener;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.plugin.search.utils.f0$c;

public class b extends n	// class@00232e
{
    public EditText p;
    public TextView q;
    public TextView r;
    public TextView s;
    public View t;
    public final Runnable u;
    public c v;
    public f0$c w;
    public String x;

    public void b(){
       super();
       this.u = new f(this);
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       g0 e = g0.s0(this.getActivity()).e;
       this.x = e;
       if (!TextUtils.x(e)) {
          this.p.setText(this.x);
          b tp = this.p;
          tp.setSelection(tp.getText().length());
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "5")) {
          a uoa = new a();
          uoa.f((float)t0.m);
          this.m8().setBackground(uoa.h(this.getContext(), R.color.arg_RES_7f060774).a());
          uoa = new a();
          uoa.f((float)t0.i);
          uoa.k(r.b(this.getContext(), R.color.arg_RES_7f060797));
          uoa.m(a1.e(0x3f800000));
          this.t.setBackground(uoa.h(this.getContext(), R.color.arg_RES_7f06076a).a());
          uoa = new a();
          uoa.f((float)t0.A);
          Context context = this.getContext();
          int i = (TextUtils.x(this.x))? 0x7f0607f0: 0x7f060751;
          this.r.setBackground(uoa.h(context, i).a());
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          this.p.postDelayed(this.u, 500);
          this.q.setText(this.p.getText().length()+"/"+200);
          this.p.addTextChangedListener(new g(this));
          this.m8().setTranslationY((float)n.c(this.getContext(), 185.00f));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0c94);
       this.p = m1.f(p0, 0x7f0a0ca2);
       this.q = m1.f(p0, 0x7f0a0c92);
       this.r = m1.f(p0, 0x7f0a0c7f);
       this.s = m1.f(p0, 0x7f0a3e33);
       this.m8().setOnClickListener(null);
       this.P8(this.r, new b$a(this));
       this.R8(p0, new b$b(this), R.id.ll_back);
       this.p.setFocusableInTouchMode(true);
       this.p.setOnFocusChangeListener(new e(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.v = this.r8("SEARCH_REDUCE_EDIT_POPUP");
       this.w = this.r8("SEARCH_REDUCE_EDIT_LISTENER_POPUP");
       return;
    }
}
