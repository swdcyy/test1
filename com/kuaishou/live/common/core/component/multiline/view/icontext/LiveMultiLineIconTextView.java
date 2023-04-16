package com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.widget.TextView;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import ub.a;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$a;
import lnc.a1;
import com.kuaishou.live.common.core.component.multiline.view.icontext.LiveMultiLineIconTextView$b;
import android.util.Size;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LiveMultiLineIconTextView extends FrameLayout	// class@0015c9
{
    public ConstraintLayout b;
    public View c;
    public KwaiCDNImageView d;
    public TextView e;
    public TextView f;
    public LiveMultiLineIconTextView$a g;
    public HashMap h;

    public void LiveMultiLineIconTextView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void LiveMultiLineIconTextView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
    }
    public void LiveMultiLineIconTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       FrameLayout.inflate(p0, R.layout.arg_RES_7f0d0cb2, this);
       if (PatchProxy.applyVoid(null, this, LiveMultiLineIconTextView.class, "1")) {
       }else {
          View view = this.findViewById(R.id.live_multi_line_icon_text_container);
          a.o(view, "findViewById\(R.id.live_m¡­line_icon_text_container\)");
          this.b = view;
          view = this.findViewById(R.id.live_multi_line_icon_container);
          a.o(view, "findViewById\(R.id.live_multi_line_icon_container\)");
          this.c = view;
          view = this.findViewById(R.id.live_multi_line_icon_text_icon);
          a.o(view, "findViewById\(R.id.live_multi_line_icon_text_icon\)");
          this.d = view;
          view = this.findViewById(R.id.live_multi_line_icon_text_text_in_icon);
          a.o(view, "findViewById\(R.id.live_m¡­e_icon_text_text_in_icon\)");
          this.e = view;
          view = this.findViewById(R.id.live_multi_line_icon_text_text);
          a.o(view, "findViewById\(R.id.live_multi_line_icon_text_text\)");
          this.f = view;
       }
       Typeface typeface = d0.a("fonts/AvenirNext-BoldItalic.ttf", p0);
       if (typeface != null) {
          LiveMultiLineIconTextView te = this.e;
          if (te == null) {
             a.S("textInIconView");
          }
          te.setTypeface(typeface);
       }
       return;
    }
    public final void setIcon(int p0){
       LiveMultiLineIconTextView tc;
       ViewGroup$LayoutParams layoutParams;
       LiveMultiLineIconTextView tf;
       if (PatchProxy.isSupport(LiveMultiLineIconTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveMultiLineIconTextView.class, "2")) {
          return;
       }
       int i = -1;
       String str = "iconContainer";
       if (!p0) {
          tc = this.c;
          if (tc == null) {
             a.S(str);
          }
          tc.setVisibility(8);
          tc = this.f;
          if (tc == null) {
             a.S("textView");
          }
          layoutParams = tc.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          layoutParams.q = 0;
          layoutParams.p = i;
          layoutParams.setMarginStart(0);
          tf = this.f;
          if (tf == null) {
             a.S("textView");
          }
          tf.setLayoutParams(layoutParams);
       }else {
          LiveMultiLineIconTextView tc1 = this.c;
          if (tc1 == null) {
             a.S(str);
          }
          tc1.setVisibility(0);
          LiveMultiLineIconTextView td = this.d;
          if (td == null) {
             a.S("iconView");
          }
          KwaiCDNImageView.q0(td, p0, 0, null, 6, null);
          tc = this.f;
          if (tc == null) {
             a.S("textView");
          }
          layoutParams = tc.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
          layoutParams.q = i;
          layoutParams.p = 0x7f0a21b4;
          tf = this.g;
          if (tf != null) {
             a.m(tf);
             i = tf.b();
          }else {
             i = a1.e(2.00f);
          }
          layoutParams.setMarginStart(i);
          tf = this.f;
          if (tf == null) {
             a.S("textView");
          }
          tf.setLayoutParams(layoutParams);
       }
       return;
    }
    public final void setLayoutConfig(LiveMultiLineIconTextView$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineIconTextView.class, "5")) {
          return;
       }
       a.p(p0, "layoutConfig");
       this.g = p0;
       LiveMultiLineIconTextView tb = this.b;
       if (tb == null) {
          a.S("containerView");
       }
       tb.getLayoutParams().height = p0.a;
       tb = this.b;
       if (tb == null) {
          a.S("containerView");
       }
       tb.setPadding(p0.c().a, p0.c().c, p0.c().b, p0.c().d);
       tb = this.c;
       String str = "iconContainer";
       if (tb == null) {
          a.S(str);
       }
       ViewGroup$LayoutParams layoutParams = tb.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       layoutParams.width = p0.a().getWidth();
       layoutParams.height = p0.a().getHeight();
       tb = this.e;
       if (tb == null) {
          a.S("textInIconView");
       }
       tb.setTextSize(0, (float)p0.e);
       tb = this.f;
       if (tb == null) {
          a.S("textView");
       }
       tb.setTextSize(0, (float)p0.f);
       tb = this.c;
       if (tb == null) {
          a.S(str);
       }
       if (!tb.getVisibility()) {
          tb = this.f;
          if (tb == null) {
             a.S("textView");
          }
          layoutParams = tb.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.setMarginStart(p0.b());
       }
       tb = this.b;
       if (tb == null) {
          a.S("containerView");
       }
       tb.setMinWidth(p0.g);
       return;
    }
    public final void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineIconTextView.class, "4")) {
          return;
       }
       LiveMultiLineIconTextView tf = this.f;
       if (tf == null) {
          a.S("textView");
       }
       tf.setText(p0);
       return;
    }
    public final void setTextInIcon(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineIconTextView.class, "3")) {
          return;
       }
       LiveMultiLineIconTextView te = this.e;
       if (te == null) {
          a.S("textInIconView");
       }
       te.setText(p0);
       te = this.e;
       if (te == null) {
          a.S("textInIconView");
       }
       int i = (TextUtils.x(p0))? 8: 0;
       te.setVisibility(i);
       return;
    }
}
