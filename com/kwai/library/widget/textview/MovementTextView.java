package com.kwai.library.widget.textview.MovementTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import h27.l;
import android.view.ViewConfiguration;
import android.widget.TextView;
import android.text.method.MovementMethod;
import java.lang.CharSequence;
import android.text.Spannable;
import android.text.Layout;
import android.view.MotionEvent;
import android.text.style.ClickableSpan;
import java.lang.Class;
import java.lang.Object;
import android.view.View;
import android.text.Selection;
import android.graphics.drawable.Drawable;
import java.lang.System;
import java.lang.Runnable;

public class MovementTextView extends AppCompatTextView	// class@000a5b
{
    public long f;
    public long g;
    public int[] h;
    public int[] i;
    public Runnable j;

    public void MovementTextView(Context p0){
       super(p0, null);
    }
    public void MovementTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void MovementTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.j = new l(this);
       this.g = (long)ViewConfiguration.getLongPressTimeout();
       int[] ointArray = new int[]{0x10100a7};
       this.h = ointArray;
       int[] ointArray1 = new int[]{-16842919};
       this.i = ointArray1;
    }
    public static void p(MovementTextView p0){
       p0.s();
       p0.t(true, true);
       p0.performLongClick();
    }
    private boolean q(){
       boolean b = (this.getMovementMethod() != null || (this.onCheckIsTextEditor() && (this.isEnabled() && (this.getText() instanceof Spannable && this.getLayout() != null))))? true: false;
       return b;
    }
    private boolean r(MotionEvent p0,CharSequence p1){
       if (this.q() && p1 instanceof Spannable) {
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
                   this.s();
                }
             }catch(java.lang.ArrayIndexOutOfBoundsException e0){
             }
          }
       }
       return false;
    }
    private void s(){
       if (this.getText() instanceof Spannable) {
          Selection.removeSelection(this.getText());
       }
       return;
    }
    private void t(boolean p0,boolean p1){
       Drawable background;
       MovementTextView th;
       this.setPressed(p0);
       if (this.getBackground() == null) {
          return;
       }
       if (p1) {
          background = this.getBackground();
          th = (p0)? this.h: this.i;
          background.setState(th);
       }else {
          background = this.getBackground();
          th = (p0)? this.i: this.h;
          background.setState(th);
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       if (!this.q()) {
          return super.onTouchEvent(p0);
       }
       long l = System.currentTimeMillis();
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action == 3) {
                this.s();
                this.removeCallbacks(this.j);
                this.setPressed(false);
                this.f = 0;
             }
          }else {
             this.s();
             this.removeCallbacks(this.j);
             this.t(false, true);
             if (!this.isLongClickable() || ((l - this.f) - this.g < 0 && !this.r(p0, this.getText()))) {
                this.performClick();
             }
             this.f = 0;
          }
       }else {
          boolean b = this.r(p0, this.getText());
          if (!b && (!this.isClickable() || !this.isLongClickable())) {
             return false;
          }else {
             this.t(true, (b ^ true));
             if (this.isLongClickable()) {
                this.postDelayed(this.j, this.g);
                this.f = l;
             }
          }
       }
       return true;
    }
}
