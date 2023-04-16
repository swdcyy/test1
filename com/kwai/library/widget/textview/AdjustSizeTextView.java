package com.kwai.library.widget.textview.AdjustSizeTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.kwai.library.widget.textview.AdjustSizeTextView$a;

public class AdjustSizeTextView extends TextView	// class@000a2f
{
    public AdjustSizeTextView$a b;

    public void AdjustSizeTextView(Context p0){
       super(p0);
    }
    public void AdjustSizeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void AdjustSizeTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       AdjustSizeTextView tb = this.b;
       if (tb != null) {
          tb.onSizeChanged(p0, p1, p2, p3);
       }
       return;
    }
    public void setmSizeChangeListener(AdjustSizeTextView$a p0){
       this.b = p0;
    }
}
