package com.yxcorp.plugin.search.widget.SearchScrollSelectTextView$c;
import android.view.View$OnTouchListener;
import com.yxcorp.plugin.search.widget.SearchScrollSelectTextView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewParent;
import android.widget.TextView;

public class SearchScrollSelectTextView$c implements View$OnTouchListener	// class@0007e5
{
    public final SearchScrollSelectTextView b;

    public void SearchScrollSelectTextView$c(SearchScrollSelectTextView p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       SearchScrollSelectTextView$c obj = PatchProxy.applyTwoRefs(p0, p1, this, SearchScrollSelectTextView$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.k = p1.getX();
       this.b.l = p1.getY();
       this.b.m = p0.getScrollY();
       if (!p1.getAction()) {
          this.b.n = p1.getY();
          obj = this.b;
          obj.w = obj.n;
          p0.getParent().requestDisallowInterceptTouchEvent(true);
       }
       if (p1.getAction() == 2) {
          obj = this.b;
          obj.x = true;
          float f = (obj.p + obj.n) - p1.getY();
          obj = this.b;
          if (obj.y != null && obj.q - (float)obj.getHeight() > 0) {
             obj = this.b;
             if (((obj.o + obj.n) - p1.getY()) <= 0) {
                obj = this.b;
                obj.scrollBy(false, (int)(obj.o * 0xbf800000));
                this.b.o = 0;
             }else {
                obj = this.b;
                obj = this.b;
                SearchScrollSelectTextView q1 = obj.q;
                if ((((obj.o + obj.n) - p1.getY()) + (float)this.b.getHeight()) - q1 >= 0) {
                   obj.scrollBy(false, (int)((q1 - obj.o) - (float)obj.getHeight()));
                   obj = this.b;
                   obj.o = obj.q - (float)obj.getHeight();
                }else {
                   obj.scrollBy(false, (int)(obj.n - p1.getY()));
                   obj = this.b;
                   SearchScrollSelectTextView.a(obj, (obj.n - p1.getY()));
                }
             }
          }
          obj = this.b;
          if (f - obj.p > 0 && f - obj.q < 0) {
             obj.p = f;
          }
          obj.n = p1.getY();
          p0.getParent().requestDisallowInterceptTouchEvent(true);
       }
       if (p1.getAction() == 1) {
          obj = this.b;
          if (!obj.w - obj.n) {
             obj.x = false;
          }
          obj = this.b;
          p0.getParent().requestDisallowInterceptTouchEvent(false);
          SearchScrollSelectTextView$c tb = this.b;
          if (tb.x != null && tb.y != null) {
             tb.x = false;
             if (tb.q - (float)tb.getHeight() > 0) {
                tb = this.b;
                if (((tb.o + tb.n) - p1.getY()) <= 0) {
                   tb = this.b;
                   tb.scrollBy(false, (int)(tb.o * 0xbf800000));
                   tb.o = 0;
                }else {
                   tb = this.b;
                   tb = this.b;
                   SearchScrollSelectTextView q = tb.q;
                   if ((((tb.o + tb.n) - p1.getY()) + (float)this.b.getHeight()) - q >= 0) {
                      tb.scrollBy(false, (int)((q - tb.o) - (float)tb.getHeight()));
                      tb = this.b;
                      tb.o = tb.q - (float)tb.getHeight();
                   }else {
                      tb.scrollBy(false, (int)(tb.n - p1.getY()));
                      tb = this.b;
                      SearchScrollSelectTextView.a(tb, (tb.n - p1.getY()));
                   }
                }
             }
             tb.n = p1.getY();
             return true;
          }
       }
    label_01ab :
       return false;
    }
}
