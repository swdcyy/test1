package eightbitlab.com.blurview.BlurView;
import android.widget.FrameLayout;
import android.content.Context;
import aqd.g;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import aqd.d;
import android.view.View;
import android.view.ViewGroup;
import aqd.e;

public class BlurView extends FrameLayout	// class@000d1e
{
    public d b;
    public int c;
    public static final String d;

    static {
       BlurView.d = "BlurView";
    }
    public void BlurView(Context p0){
       super(p0);
       this.b = new g();
       this.a(null, 0);
    }
    public void BlurView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new g();
       this.a(p1, 0);
    }
    public void BlurView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new g();
       this.a(p1, p2);
    }
    public final void a(AttributeSet p0,int p1){
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.A, p1, 0);
       this.c = typedArray.getColor(0, 0);
       typedArray.recycle();
    }
    public void draw(Canvas p0){
       if (this.b.draw(p0)) {
          super.draw(p0);
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (!this.isHardwareAccelerated()) {
       }else {
          this.b.d(true);
       }
       return;
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.b.d(false);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.b.e();
    }
}
