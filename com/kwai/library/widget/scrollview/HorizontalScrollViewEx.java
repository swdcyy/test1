package com.kwai.library.widget.scrollview.HorizontalScrollViewEx;
import android.widget.HorizontalScrollView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kwai.library.widget.scrollview.HorizontalScrollViewEx$a;

public class HorizontalScrollViewEx extends HorizontalScrollView	// class@0009e4
{
    public HorizontalScrollViewEx$a b;

    public void HorizontalScrollViewEx(Context p0){
       super(p0);
    }
    public void HorizontalScrollViewEx(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void HorizontalScrollViewEx(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       super.onScrollChanged(p0, p1, p2, p3);
       HorizontalScrollViewEx tb = this.b;
       if (tb != null) {
          tb.a(p0, p1, p2, p3);
       }
       return;
    }
    public void setOnScrollListener(HorizontalScrollViewEx$a p0){
       this.b = p0;
    }
}
