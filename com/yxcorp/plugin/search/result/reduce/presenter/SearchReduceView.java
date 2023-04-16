package com.yxcorp.plugin.search.result.reduce.presenter.SearchReduceView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout$LayoutParams;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.LinearLayout$LayoutParams;
import nfd.t0;
import k06.a;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import com.kuaishou.android.model.mix.QRecoTag;
import java.lang.Boolean;
import java.lang.CharSequence;

public class SearchReduceView extends FrameLayout	// class@002328
{
    public TextView b;
    public QRecoTag c;

    public void SearchReduceView(Context p0){
       super(p0, null);
    }
    public void SearchReduceView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SearchReduceView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchReduceView.class, "1")) {
       }else {
          FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
          layoutParams.gravity = 17;
          TextView textView = new TextView(p0);
          this.b = textView;
          textView.setTextSize(1, 13.00f);
          this.b.setEllipsize(TextUtils$TruncateAt.END);
          this.b.setMaxLines(1);
          this.b.setGravity(17);
          this.b.setTextColor(ContextCompat.getColorStateList(p0, R.color.arg_RES_7f0607cf));
          this.b.setLayoutParams(layoutParams);
          this.addView(this.b);
          LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(-1, t0.K);
          layoutParams1.bottomMargin = t0.i;
          this.setPadding(t0.k, 0, t0.k, 0);
          this.setLayoutParams(layoutParams1);
          a uoa = new a();
          uoa.f((float)t0.e);
          a uoa1 = uoa.j(p0, R.color.arg_RES_7f060774, 0x7f060774).h(p0, R.color.arg_RES_7f060774).l(p0, R.color.arg_RES_7f060774);
          uoa1.m(1);
          this.setBackground(uoa1.a());
       }
       return;
    }
    public void a(QRecoTag p0,boolean p1,boolean p2){
       int f;
       if (PatchProxy.isSupport(SearchReduceView.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, SearchReduceView.class, "2")) {
          return;
       }
       LinearLayout$LayoutParams layoutParams = this.getLayoutParams();
       if (p1) {
          layoutParams.weight = 0x3f800000;
          layoutParams.width = 0;
          f = (p2)? t0.f: t0.e;
          layoutParams.leftMargin = f;
          f = (p2)? t0.e: t0.f;
          layoutParams.rightMargin = f;
       }else {
          layoutParams.weight = 0;
          f = t0.f;
          layoutParams.leftMargin = f;
          layoutParams.rightMargin = f;
          layoutParams.width = -1;
       }
       this.setLayoutParams(layoutParams);
       this.c = p0;
       if (p0 == null) {
          this.b.setVisibility(8);
          this.setBackgroundColor(0);
       }else {
          this.b.setText(p0.mName);
       }
       return;
    }
}
