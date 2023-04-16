package com.kwai.nearby.local.presenter.secondary.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import java.lang.CharSequence;
import android.widget.TextView;
import ed7.b;
import erd.g;
import crd.b;
import brd.t;
import java.lang.Boolean;
import ekd.i;
import lnc.b5;
import com.yxcorp.utility.RomUtils;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import zf6.l;
import android.view.View;
import lnc.a1;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@000fcf
{
    public KwaiActionBar p;
    public View q;
    public View r;
    public TextView s;
    public PublishSubject t;
    public int u;

    public void a(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.p.j(j.n(this.getContext(), R.drawable.arg_RES_7f080623, 0x7f060148));
       if (this.getActivity() != null && this.getActivity().getIntent().getData() != null) {
          this.s.setText(x0.a(this.getActivity().getIntent().getData(), "tabName"));
       }
       a tt = this.t;
       if (tt != null) {
          this.X7(tt.subscribe(new b(this)));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.P8(true);
       return;
    }
    public final void P8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       int i = 0;
       if (i.c()) {
          int i1 = (!b5.a(this.getActivity()) || RomUtils.q())? n.A(this.getActivity()): 0;
          RelativeLayout$LayoutParams layoutParams = this.p.getLayoutParams();
          if (p0) {
             this.u = layoutParams.height;
          }
          layoutParams.height = this.u + i1;
          this.p.setLayoutParams(layoutParams);
          a tp = this.p;
          tp.setPadding(tp.getPaddingLeft(), i1, this.p.getPaddingRight(), this.p.getPaddingBottom());
          i.h(this.getActivity(), i, l.r());
          i = i1;
       }
       RelativeLayout$LayoutParams layoutParams1 = this.r.getLayoutParams();
       layoutParams1.height = (i + layoutParams1.height) + a1.e(16.00f);
       this.r.setLayoutParams(layoutParams1);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a3f7b);
       this.p = m1.f(p0, 0x7f0a3f6a);
       this.q = m1.f(p0, 0x7f0a125b);
       this.r = m1.f(p0, 0x7f0a1257);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.t = this.t8("ON_MULTI_WINDOW_MODE_CHANGED_EVENT");
       return;
    }
}
