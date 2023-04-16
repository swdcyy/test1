package com.lsjwzh.widget.text.a;
import android.view.View;
import android.text.Layout;
import com.lsjwzh.widget.text.FastTextView;
import android.text.Spannable;
import android.view.MotionEvent;
import java.lang.Math;
import android.text.style.ClickableSpan;
import java.lang.Class;
import java.lang.Object;
import android.text.Selection;
import android.text.Spanned;
import com.lsjwzh.widget.text.a$a;

public class a	// class@001481
{

    public static int a(View p0,Layout p1,int p2,int p3){
       int paddingLeft;
       if (p0.getWidth() > p1.getWidth() && p0 instanceof FastTextView) {
          FastTextView uFastTextVie = p0;
          int i = uFastTextVie.getGravity() & 0x800007;
          if (i != 1) {
             paddingLeft = (i != 5)? p0.getPaddingLeft(): (p0.getPaddingLeft() + uFastTextVie.getInnerWidth()) - p1.getWidth();
          }else {
             paddingLeft = p0.getPaddingLeft() + ((uFastTextVie.getInnerWidth() - p1.getWidth()) / 2);
          }
          p2 = p2 - paddingLeft;
       }
       return p1.getOffsetForHorizontal(p3, (float)p2);
    }
    public static boolean b(View p0,Layout p1,Spannable p2,MotionEvent p3){
       int action = p3.getAction();
       if (action == 1 || !action) {
          ClickableSpan[] spans = p2.getSpans(a.a(p0, p1, (((int)p3.getX() - p0.getPaddingLeft()) + p0.getScrollX()), Math.min((p1.getLineCount() - 1), p1.getLineForVertical((((int)p3.getY() - p0.getPaddingTop()) + p0.getScrollY())))), a.a(p0, p1, (((int)p3.getX() - p0.getPaddingLeft()) + p0.getScrollX()), Math.min((p1.getLineCount() - 1), p1.getLineForVertical((((int)p3.getY() - p0.getPaddingTop()) + p0.getScrollY())))), ClickableSpan.class);
          if (spans.length) {
             if (action == 1) {
                spans[0].onClick(p0);
             }else {
                Selection.setSelection(p2, p2.getSpanStart(spans[0]), p2.getSpanEnd(spans[0]));
             }
             return 1;
          }else {
             Selection.removeSelection(p2);
          }
       }
       return 0;
    }
    public static boolean c(View p0,Layout p1,Spanned p2,Class p3,MotionEvent p4){
       int action = p4.getAction();
       if (action == 1 || !action) {
          a$a[] spans = p2.getSpans(a.a(p0, p1, (((int)p4.getX() - p0.getPaddingLeft()) + p0.getScrollX()), p1.getLineForVertical((((int)p4.getY() - p0.getPaddingTop()) + p0.getScrollY()))), a.a(p0, p1, (((int)p4.getX() - p0.getPaddingLeft()) + p0.getScrollX()), p1.getLineForVertical((((int)p4.getY() - p0.getPaddingTop()) + p0.getScrollY()))), p3);
          if (spans.length) {
             if (action == 1) {
                spans[0].onClick(p0);
             }else if(p2 instanceof Spannable){
                Selection.setSelection(p2, p2.getSpanStart(spans[0]), p2.getSpanEnd(spans[0]));
             }
             return true;
          }else if(p2 instanceof Spannable){
             Selection.removeSelection(p2);
          }
       }
       return 0;
    }
}
