package com.yxcorp.gifshow.widget.KwaiActionBar$c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;

public class KwaiActionBar$c implements ViewTreeObserver$OnGlobalLayoutListener	// class@00186b
{
    public final KwaiActionBar b;

    public void KwaiActionBar$c(KwaiActionBar p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       this.b.e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       KwaiActionBar$c tb = this.b;
       if (tb.k == null) {
          return;
       }
       int i = 0;
       int i1 = (tb.d != null)? tb.getMeasuredWidth() - this.b.d.getLeft(): 0;
       KwaiActionBar c = this.b.c;
       int right = (c != null)? c.getRight(): 0;
       KwaiActionBar$c tb1 = this.b;
       if (this.b.e.getParent() == tb1) {
          RelativeLayout$LayoutParams layoutParams = tb1.e.getLayoutParams();
          int i2 = (i1 >= right)? 0: right - i1;
          layoutParams.rightMargin = i2;
          layoutParams = this.b.e.getLayoutParams();
          if (right < i1) {
             i = i1 - right;
          }
          layoutParams.leftMargin = i;
       }
       return;
    }
}
