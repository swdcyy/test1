package dl9.e;
import android.view.View$OnTouchListener;
import dl9.m;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.Spannable$Factory;
import android.text.Spannable;
import rzc.c;
import android.view.ViewConfiguration;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Math;
import android.text.Layout;
import android.text.style.ClickableSpan;
import java.lang.Class;

public final class e implements View$OnTouchListener	// class@001f5c
{
    public final m b;

    public void e(m p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       e tb = this.b;
       Objects.requireNonNull(tb);
       Spannable spannable = Spannable$Factory.getInstance().newSpannable(p0.getText());
       tb.H.a(p1, spannable, p0);
       int action = p1.getAction();
       boolean b = false;
       if (!action) {
          tb.D = b;
          tb.E = p1.getX();
          tb.F = p1.getY();
          tb.C.postDelayed(tb.Z, (long)ViewConfiguration.getLongPressTimeout());
       }else if(action == 2){
          m om = 0x41200000;
          if (Math.abs((tb.E - p1.getX())) - om > 0 || Math.abs((tb.F - p1.getY())) - om > 0) {
             tb.C.removeCallbacks(tb.Z);
             tb.p.setPressed(b);
          }
       }else if(action == 1 || action == 3){
          tb.C.removeCallbacks(tb.Z);
          tb.p.setPressed(b);
       }
       if (tb.D == null && (action == 1 || !action)) {
          int i = ((int)p1.getX() - p0.getPaddingLeft()) + p0.getScrollX();
          int i1 = ((int)p1.getY() - p0.getPaddingTop()) + p0.getScrollY();
          Layout layout = p0.getLayout();
          if (layout != null) {
             i1 = Math.min((layout.getLineCount() - 1), layout.getLineForVertical(i1));
             ClickableSpan[] uClickableSp = new ClickableSpan[b];
             try{
                float f = (float)i;
                int offsetForHor = layout.getOffsetForHorizontal(i1, f);
                if (i1 != (layout.getLineCount() - 1) || layout.getSecondaryHorizontal(spannable.length()) - f > 0) {
                   uClickableSp = spannable.getSpans(offsetForHor, offsetForHor, ClickableSpan.class);
                }
                if (action == 1) {
                   if (uClickableSp.length) {
                      uClickableSp[b].onClick(p0);
                   }else {
                      tb.p.performClick();
                   }
                   tb.p.setPressed(b);
                }else {
                   m p = tb.p;
                   if (!uClickableSp.length) {
                      b = true;
                   }
                   p.setPressed(b);
                }
             }catch(java.lang.ArrayIndexOutOfBoundsException e0){
                return b;
             }
          }
       }
       b = true;
       goto label_00fb ;
    }
}
