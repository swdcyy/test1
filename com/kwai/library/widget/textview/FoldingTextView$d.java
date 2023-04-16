package com.kwai.library.widget.textview.FoldingTextView$d;
import android.view.View$OnTouchListener;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.Spannable$Factory;
import android.text.Spannable;
import android.text.Layout;
import android.text.style.ClickableSpan;
import java.lang.Class;

public class FoldingTextView$d implements View$OnTouchListener	// class@000a3a
{
    public static FoldingTextView$d b;

    public void FoldingTextView$d(){
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       Spannable spannable = Spannable$Factory.getInstance().newSpannable(p0.getText());
       int action = p1.getAction();
       int i = 0;
       if (action == 1 || !action) {
          Layout layout = p0.getLayout();
          ClickableSpan[] spans = spannable.getSpans(layout.getOffsetForHorizontal(layout.getLineForVertical((((int)p1.getY() - p0.getTotalPaddingTop()) + p0.getScrollY())), (float)(((int)p1.getX() - p0.getTotalPaddingLeft()) + p0.getScrollX())), layout.getOffsetForHorizontal(layout.getLineForVertical((((int)p1.getY() - p0.getTotalPaddingTop()) + p0.getScrollY())), (float)(((int)p1.getX() - p0.getTotalPaddingLeft()) + p0.getScrollX())), ClickableSpan.class);
          if (spans.length) {
             if (action == 1) {
                spans[i].onClick(p0);
             }
             i = true;
          }
       }
       return i;
    }
}
