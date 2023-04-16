package com.lsjwzh.widget.text.ClickableSpanLayoutView;
import com.lsjwzh.widget.text.FastTextLayoutView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.text.Layout;
import java.lang.CharSequence;
import android.text.Spannable;
import android.view.View;
import com.lsjwzh.widget.text.a;

public class ClickableSpanLayoutView extends FastTextLayoutView	// class@001479
{

    public void ClickableSpanLayoutView(Context p0){
       super(p0);
    }
    public void ClickableSpanLayoutView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ClickableSpanLayoutView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Layout textLayout = this.getTextLayout();
       if (textLayout != null) {
          CharSequence text = textLayout.getText();
          if (text instanceof Spannable && a.b(this, textLayout, text, p0)) {
             return true;
          }
       }
       return super.onTouchEvent(p0);
    }
}
