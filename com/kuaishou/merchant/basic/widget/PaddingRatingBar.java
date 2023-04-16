package com.kuaishou.merchant.basic.widget.PaddingRatingBar;
import androidx.appcompat.widget.AppCompatRatingBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.RatingBar;

public class PaddingRatingBar extends AppCompatRatingBar	// class@0015f9
{

    public void PaddingRatingBar(Context p0){
       super(p0);
    }
    public void PaddingRatingBar(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void PaddingRatingBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public synchronized void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(PaddingRatingBar.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, PaddingRatingBar.class, "1")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.setMeasuredDimension(RatingBar.resolveSizeAndState(((this.getMeasuredWidth() + this.getPaddingStart()) + this.getPaddingEnd()), p0, 0), this.getMeasuredHeight());
       return;
    }
}
