package com.yxcorp.gifshow.share.screenshot.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import h4d.a;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import uic.a;
import lnc.c3$a;
import lnc.c3;
import android.widget.TextView;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.text.TextPaint;
import android.net.Uri;

public class n extends PresenterV2	// class@001c60
{
    public KwaiImageView p;
    public TextView q;
    public LinearLayout r;
    public LinearLayout s;
    public LinearLayout t;
    public Uri u;
    public String v;

    public void n(){
       super();
    }
    public void E8(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, on, "5")) {
          a uoa = null;
          n on1 = (!TextUtils.x(this.v) && a.d(this.getContext()))? 1: null;
          if (!TextUtils.x(this.v) && a.b(this.getContext())) {
             uoa = 1;
          }
          if (!on1) {
             this.r.setVisibility(8);
             this.s.setVisibility(8);
             ConstraintLayout$LayoutParams layoutParams = this.t.getLayoutParams();
             layoutParams.p = 0x7f0a373c;
             layoutParams.leftMargin = a1.e(32.00f);
          }
          if (!uoa) {
             this.t.setVisibility(4);
          }
       }
       c3.c(this.u, new a(this));
       this.q.setText(R.string.arg_RES_7f1047a4);
       if (!PatchProxy.applyVoid(objArray, this, on, "4") && n.k(this.getActivity()) < a1.e(390.00f)) {
          this.r.getLayoutParams().leftMargin = a1.e(32.00f);
          this.t.getLayoutParams().rightMargin = a1.e(32.00f);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a373c);
       TextView textView = m1.f(p0, R.id.layout_title);
       this.q = textView;
       textView.getPaint().setFakeBoldText(true);
       this.r = m1.f(p0, 0x7f0a28f2);
       this.s = m1.f(p0, 0x7f0a289e);
       this.t = m1.f(p0, 0x7f0a28d4);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       this.u = this.t8("SCREEN_SHOT_URI");
       this.v = this.r8("SCREEN_SHOT_CONTENT_ID");
       return;
    }
}
