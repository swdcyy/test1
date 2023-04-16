package com.kwai.library.widget.textview.KwaiBaseTextView;
import com.kwai.library.widget.textview.ExtraSpaceFrameLayout$a;
import ekd.g0;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ekd.n1;
import android.view.ViewConfiguration;
import com.kwai.library.widget.textview.KwaiBaseTextView$a;
import android.view.View;
import android.view.MotionEvent;
import java.lang.System;
import java.lang.Runnable;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.method.MovementMethod;
import android.text.Spannable;
import android.text.Layout;
import android.text.style.ClickableSpan;
import java.lang.Class;
import android.text.Selection;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import com.yxcorp.utility.RadiusStyle;
import android.content.res.Resources;

public class KwaiBaseTextView extends AppCompatTextView implements ExtraSpaceFrameLayout$a, g0	// class@000a45
{
    public long f;
    public long g;
    public int[] h;
    public int[] i;
    public int j;
    public boolean k;
    public final Runnable l;
    public HashMap m;

    public void KwaiBaseTextView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void KwaiBaseTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void KwaiBaseTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.k = true;
       this.j = n1.e(p0, p1, 0);
       this.g = (long)ViewConfiguration.getLongPressTimeout();
       int[] ointArray = new int[true];
       ointArray[0] = 0x10100a7;
       this.h = ointArray;
       ointArray = new int[true];
       ointArray[0] = -16842919;
       this.i = ointArray;
       this.l = new KwaiBaseTextView$a(this);
    }
    public void KwaiBaseTextView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public int getBackgroundRadius(){
       return this.j;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       KwaiBaseTextView tj = this.j;
       if (tj > null) {
          n1.c(this, tj);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       CharSequence text;
       a.p(p0, "event");
       if (!this.p() || this.k == null) {
          return super.onTouchEvent(p0);
       }
       long l = System.currentTimeMillis();
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action == 3) {
                this.r();
                this.removeCallbacks(this.l);
                this.setPressed(false);
                this.f = 0;
             }
          }else {
             this.r();
             this.removeCallbacks(this.l);
             this.s(false, true);
             if (!this.isLongClickable() || (l - this.f) - this.g < 0) {
                text = this.getText();
                a.o(text, "text");
                if (!this.q(p0, text)) {
                   this.performClick();
                }
             }
             this.f = 0;
          }
       }else {
          CharSequence text1 = this.getText();
          a.o(text1, "text");
          boolean b = this.q(p0, text1);
          if (!b && (!this.isClickable() || !this.isLongClickable())) {
             return false;
          }else {
             this.s(true, (b ^ true));
             if (this.isLongClickable()) {
                this.postDelayed(this.l, this.g);
                this.f = l;
             }
          }
       }
       return true;
    }
    public final boolean p(){
       boolean b = (this.getMovementMethod() != null || (this.onCheckIsTextEditor() && (this.isEnabled() && (this.getText() instanceof Spannable && this.getLayout() != null))))? true: false;
       return b;
    }
    public final boolean q(MotionEvent p0,CharSequence p1){
       if (this.p() && p1 instanceof Spannable) {
          int action = p0.getAction();
          if (action == 1 || !action) {
             int i = ((int)p0.getX() - this.getTotalPaddingLeft()) + this.getScrollX();
             Layout layout = this.getLayout();
             int lineForVerti = layout.getLineForVertical((((int)p0.getY() - this.getTotalPaddingTop()) + this.getScrollY()));
             try{
                float f = (float)i;
                ClickableSpan[] spans = p1.getSpans(layout.getOffsetForHorizontal(lineForVerti, f), layout.getOffsetForHorizontal(lineForVerti, f), ClickableSpan.class);
                if (spans.length) {
                   if (action == 1) {
                      spans[0].onClick(this);
                   }else {
                      Selection.setSelection(p1, p1.getSpanStart(spans[0]), p1.getSpanEnd(spans[0]));
                   }
                   return true;
                }else {
                   this.r();
                }
             }catch(java.lang.ArrayIndexOutOfBoundsException e0){
             }
          }
       }
       return false;
    }
    public final void r(){
       if (this.getText() instanceof Spannable) {
          CharSequence text = this.getText();
          Objects.requireNonNull(text, "null cannot be cast to non-null type android.text.Spannable");
          Selection.removeSelection(text);
       }
       return;
    }
    public final void s(boolean p0,boolean p1){
       Drawable background;
       KwaiBaseTextView th;
       this.setPressed(p0);
       if (this.getBackground() == null) {
          return;
       }
       if (p1) {
          background = this.getBackground();
          a.o(background, "background");
          th = (p0)? this.h: this.i;
          background.setState(th);
       }else {
          background = this.getBackground();
          a.o(background, "background");
          th = (p0)? this.i: this.h;
          background.setState(th);
       }
       return;
    }
    public final void setAllowCustomOnTouchEvent(boolean p0){
       this.k = p0;
    }
    public void setBackgroundRadius(RadiusStyle p0){
       Context context = this.getContext();
       a.o(context, "context");
       a.m(p0);
       this.j = (int)context.getResources().getDimension(p0.radiusId);
    }
}
