package com.yxcorp.gifshow.widget.textview.ClickablePressedSpanTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import android.view.ViewConfiguration;
import rzc.b;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.text.method.MovementMethod;
import java.lang.CharSequence;
import android.text.Spannable;
import android.text.Layout;
import lnc.o7;
import android.text.style.ReplacementSpan;
import android.view.View;
import java.lang.Runnable;
import java.lang.Math;
import java.lang.System;
import android.text.style.ClickableSpan;
import android.text.Selection;
import java.lang.Number;
import android.graphics.drawable.Drawable;

public class ClickablePressedSpanTextView extends AppCompatTextView	// class@0019cb
{
    public boolean f;
    public o7 g;
    public ClickableSpan h;
    public long i;
    public long j;
    public int[] k;
    public int[] l;
    public boolean m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public Runnable r;
    public static final int s;

    public void ClickablePressedSpanTextView(Context p0){
       super(p0, null);
    }
    public void ClickablePressedSpanTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ClickablePressedSpanTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = false;
       this.q = ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
       this.r = new b(this);
       this.j = (long)ViewConfiguration.getLongPressTimeout();
       int[] ointArray = new int[]{0x10100a7};
       this.k = ointArray;
       int[] ointArray1 = new int[]{-16842919};
       this.l = ointArray1;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int b1;
       o7[] obj1;
       int b2;
       object oobject;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MovementMethod obj = PatchProxy.applyOneRefs(p0, this, ClickablePressedSpanTextView.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object[] objArray = null;
       obj = PatchProxy.apply(objArray, this, ClickablePressedSpanTextView.class, "4");
       boolean b = false;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(this.f == null && (this.getMovementMethod() != null || (this.onCheckIsTextEditor() && (this.isEnabled() && (this.getText() instanceof Spannable && this.getLayout() != null))))){
          b1 = true;
       }else {
          b1 = false;
       }
       if (!b1) {
          return super.onTouchEvent(p0);
       }else if(this.getMovementMethod() != null && this.m != null){
          obj = this.getMovementMethod();
          Spannable text = (this.getText() instanceof Spannable)? this.getText(): objArray;
          obj.onTouchEvent(this, text, p0);
       }
       CharSequence text1 = this.getText();
       if (!PatchProxy.applyVoidTwoRefs(p0, text1, this, ClickablePressedSpanTextView.class, "2") && text1 instanceof Spannable) {
          int action = p0.getAction();
          if (action) {
             if (action == 1 || action == 3) {
                this.r();
             }
          }else {
             action = this.p(p0);
             if (action >= 0) {
                obj1 = text1.getSpans(action, action, o7.class);
                if (obj1 != null && obj1.length > 0) {
                   action = obj1.length;
                   int i1 = 0;
                   while (true) {
                      if (i1 < action) {
                         oobject = obj1[i1];
                         if (!oobject instanceof ReplacementSpan) {
                            i1 = i1 + 1;
                         }
                      }else {
                         oobject = obj1[b];
                      }
                   }
                }else {
                   oobject = objArray;
                }
                if (this.g != oobject) {
                   this.r();
                   this.g = oobject;
                }
                if (this.g != null) {
                   oobject.a(this, true);
                }
             }
          }
       }
       b1 = p0.getAction();
       if (b1) {
          if (b1 != 1) {
             if (b1 != 0.00f) {
                if (b1 == 3) {
                   this.q();
                   this.removeCallbacks(this.r);
                   this.setPressed(b);
                   this.i = 0;
                }
             }else {
                b1 = this.n - (int)p0.getX();
                int i = this.o - (int)p0.getY();
                if (this.p != null || (Math.abs(b1) >= this.q || Math.abs(i) >= this.q)) {
                   this.p = true;
                   this.q();
                   this.removeCallbacks(this.r);
                   this.setPressed(b);
                }
             }
          }else {
             this.q();
             this.removeCallbacks(this.r);
             this.s(b, true);
             if (!this.isLongClickable() || ((System.currentTimeMillis() - this.i) - this.j < 0 && this.p == null)) {
                p0 = PatchProxy.apply(objArray, this, ClickablePressedSpanTextView.class, "7");
                if (p0 != patchProxyRe) {
                   b = p0.booleanValue();
                }else {
                   ClickablePressedSpanTextView th = this.h;
                   if (th != null) {
                      th.onClick(this);
                      b = true;
                   }
                }
                if (!b) {
                   this.performClick();
                }
             }
          label_0163 :
             this.i = 0;
          }
       }else {
          this.p = b;
          this.n = (int)p0.getX();
          this.o = (int)p0.getY();
          obj1 = PatchProxy.applyOneRefs(p0, this, ClickablePressedSpanTextView.class, "6");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else {
             CharSequence text2 = this.getText();
             this.h = objArray;
             if (text2 instanceof Spannable) {
                b2 = this.p(p0);
                if (b2 >= 0) {
                   ClickableSpan[] spans = text2.getSpans(b2, b2, ClickableSpan.class);
                   if (spans != null && spans.length > 0) {
                      objArray = spans[b];
                   }
                   this.h = objArray;
                   if (objArray != null) {
                      Selection.setSelection(text2, text2.getSpanStart(objArray), text2.getSpanEnd(objArray));
                      b2 = true;
                   }else {
                      Selection.removeSelection(text2);
                   }
                }
             }
             b2 = false;
          }
          if (!b2 && (!this.isClickable() || !this.isLongClickable())) {
             return b;
          }else {
             this.s(true, (b2 ^ true));
             if (this.isLongClickable()) {
                this.postDelayed(this.r, this.j);
                this.i = System.currentTimeMillis();
             }
          }
       }
       return true;
    }
    public final int p(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClickablePressedSpanTextView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((int)p0.getY() - this.getTotalPaddingTop()) + this.getScrollY();
       Layout layout = this.getLayout();
       int lineForVerti = layout.getLineForVertical(i);
       float f = (float)(((int)p0.getX() - this.getTotalPaddingLeft()) + this.getScrollX());
       if (f - layout.getLineLeft(lineForVerti) >= 0 && (f - layout.getLineRight(lineForVerti) <= 0 && (i < layout.getLineTop(lineForVerti) || i > layout.getLineBottom(lineForVerti)))) {
          return -1;
       }
       try{
          i = layout.getOffsetForHorizontal(lineForVerti, f);
          int i1 = 1;
          int i2 = this.getText().length() - i1;
          lineForVerti = layout.getEllipsisCount(lineForVerti);
          if (!(this.getText().toString()).contains("бн")) {
             i1 = 0;
          }
          if (i > (i2 - Math.max(lineForVerti, i1))) {
             return -1;
          }else if(layout.getPrimaryHorizontal(i) - f > 0){
             i--;
          }
          return i;
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
       }
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, ClickablePressedSpanTextView.class, "8")) {
          return;
       }
       if (this.getText() instanceof Spannable) {
          Selection.removeSelection(this.getText());
       }
       return;
    }
    public final void r(){
       if (PatchProxy.applyVoid(null, this, ClickablePressedSpanTextView.class, "1")) {
          return;
       }
       ClickablePressedSpanTextView tg = this.g;
       if (tg != null) {
          tg.a(this, false);
       }
       return;
    }
    public final void s(boolean p0,boolean p1){
       Drawable background;
       ClickablePressedSpanTextView tk;
       if (PatchProxy.isSupport(ClickablePressedSpanTextView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ClickablePressedSpanTextView.class, "9")) {
          return;
       }
       this.setPressed(p0);
       if (this.getBackground() == null) {
          return;
       }
       if (p1) {
          background = this.getBackground();
          tk = (p0)? this.k: this.l;
          background.setState(tk);
       }else {
          background = this.getBackground();
          tk = (p0)? this.l: this.k;
          background.setState(tk);
       }
       return;
    }
    public void setForceHandlePressSpan(boolean p0){
       this.f = p0;
    }
    public void setScrollAble(boolean p0){
       this.m = p0;
    }
}
