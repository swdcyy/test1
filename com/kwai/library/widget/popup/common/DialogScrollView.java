package com.kwai.library.widget.popup.common.DialogScrollView;
import android.widget.ScrollView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kwai.library.widget.popup.common.DialogScrollView$a;

public class DialogScrollView extends ScrollView	// class@00097d
{
    public DialogScrollView$a b;

    public void DialogScrollView(Context p0){
       super(p0);
    }
    public void DialogScrollView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void DialogScrollView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       boolean b;
       super.onScrollChanged(p0, p1, p2, p3);
       if (this.b != null && this.getChildCount() > 0) {
          p0 = 0;
          if ((this.getChildAt(p0).getBottom() - (this.getHeight() + this.getScrollY())) <= 0) {
             b = true;
          }
          this.b.a(b);
       }
       return;
    }
    public void setOnScrollChangedListener(DialogScrollView$a p0){
       this.b = p0;
    }
}
