package androidx.constraintlayout.widget.Guideline;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;

public class Guideline extends View	// class@0006bb
{

    public void Guideline(Context p0){
       super(p0);
       super.setVisibility(8);
    }
    public void Guideline(Context p0,AttributeSet p1){
       super(p0, p1);
       super.setVisibility(8);
    }
    public void Guideline(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       super.setVisibility(8);
    }
    public void draw(Canvas p0){
    }
    public void onMeasure(int p0,int p1){
       this.setMeasuredDimension(0, 0);
    }
    public void setGuidelineBegin(int p0){
       ConstraintLayout$LayoutParams layoutParams = this.getLayoutParams();
       layoutParams.a = p0;
       this.setLayoutParams(layoutParams);
    }
    public void setGuidelineEnd(int p0){
       ConstraintLayout$LayoutParams layoutParams = this.getLayoutParams();
       layoutParams.b = p0;
       this.setLayoutParams(layoutParams);
    }
    public void setGuidelinePercent(float p0){
       ConstraintLayout$LayoutParams layoutParams = this.getLayoutParams();
       layoutParams.c = p0;
       this.setLayoutParams(layoutParams);
    }
    public void setVisibility(int p0){
    }
}
