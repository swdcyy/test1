package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import r19.g;
import lq.f;
import erd.g;
import crd.b;
import lnc.b9;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import lnc.a1;
import com.kuaishou.android.model.mix.w;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.b;
import android.view.View$OnClickListener;
import r19.i;
import java.lang.Runnable;
import android.view.View;
import ekd.m1;
import io.reactivex.subjects.PublishSubject;

public class c extends PresenterV2	// class@0016d9
{
    public TextView p;
    public QPhoto q;
    public PublishSubject r;
    public b s;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.X7(this.q.observePostChange().subscribe(new g(this), f.b));
       this.P8(this.q);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       b9.a(this.s);
       return;
    }
    public final void P8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       if (TextUtils.x(p0.getDisclaimerMessage())) {
          this.p.setVisibility(8);
       }else {
          this.p.setVisibility(0);
          Drawable drawable = ContextCompat.getDrawable(this.getContext(), R.drawable.arg_RES_7f080a84);
          drawable.setBounds(0, 0, a1.d(R.dimen.arg_RES_7f070295), a1.d(R.dimen.arg_RES_7f070295));
          this.p.setCompoundDrawablesRelative(drawable, null, null, null);
          this.p.setCompoundDrawablePadding(a1.e(8.00f));
          this.p.setText((p0.getDisclaimerMessage()).replace("\\n", "\n"));
          if (w.s0(this.q)) {
             this.p.setOnClickListener(new b(this));
          }else {
             this.p.setOnClickListener(null);
          }
          this.p.post(new i(this));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3a04);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("AD_DISCLAIMER_HEIGHT_CHANGE");
       return;
    }
}
