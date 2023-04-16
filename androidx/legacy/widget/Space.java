package androidx.legacy.widget.Space;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import java.lang.Math;
import android.graphics.Canvas;

public class Space extends View	// class@0007b5
{

    public void Space(Context p0){
       super(p0, null);
    }
    public void Space(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void Space(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (!this.getVisibility()) {
          this.setVisibility(4);
       }
       return;
    }
    public static int a(int p0,int p1){
       int mode = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       if (mode != Integer.MIN_VALUE) {
          if (mode == 0x40000000) {
             p0 = p1;
          }
       }else {
          p0 = Math.min(p0, p1);
       }
       return p0;
    }
    public void draw(Canvas p0){
    }
    public void onMeasure(int p0,int p1){
       this.setMeasuredDimension(Space.a(this.getSuggestedMinimumWidth(), p0), Space.a(this.getSuggestedMinimumHeight(), p1));
    }
}
