package androidx.constraintlayout.widget.Placeholder;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour;
import android.view.ViewGroup;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.Typeface;
import android.graphics.Rect;
import java.lang.String;
import android.view.ViewParent;

public class Placeholder extends View	// class@0006bc
{
    public int b;
    public View c;
    public int d;

    public void Placeholder(Context p0){
       super(p0);
       this.b = -1;
       this.c = null;
       this.d = 4;
       this.a(null);
    }
    public void Placeholder(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = -1;
       this.c = null;
       this.d = 4;
       this.a(p1);
    }
    public void Placeholder(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = -1;
       this.c = null;
       this.d = 4;
       this.a(p1);
    }
    public final void a(AttributeSet p0){
       super.setVisibility(this.d);
       this.b = -1;
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.b0);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          while (i < indexCount) {
             int index = typedArray.getIndex(i);
             if (!index) {
                this.b = typedArray.getResourceId(index, this.b);
             }else if(index == 1){
                this.d = typedArray.getInt(index, this.d);
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       return;
    }
    public void b(ConstraintLayout p0){
       if (this.c == null) {
          return;
       }
       ConstraintLayout$LayoutParams layoutParams = this.getLayoutParams();
       ConstraintLayout$LayoutParams layoutParams1 = this.c.getLayoutParams();
       layoutParams1.n0.X0(0);
       ConstraintWidget$DimensionBehaviour fIXED = ConstraintWidget$DimensionBehaviour.FIXED;
       if (layoutParams.n0.B() != fIXED) {
          layoutParams.n0.Y0(layoutParams1.n0.U());
       }
       if (layoutParams.n0.R() != fIXED) {
          layoutParams.n0.z0(layoutParams1.n0.y());
       }
       layoutParams1.n0.X0(8);
       return;
    }
    public void c(ConstraintLayout p0){
       if (this.b == -1 && !this.isInEditMode()) {
          this.setVisibility(this.d);
       }
       View view = p0.findViewById(this.b);
       this.c = view;
       if (view != null) {
          view.b0 = true;
          this.c.setVisibility(0);
          this.setVisibility(0);
       }
       return;
    }
    public View getContent(){
       return this.c;
    }
    public int getEmptyVisibility(){
       return this.d;
    }
    public void onDraw(Canvas p0){
       if (this.isInEditMode()) {
          p0.drawRGB(223, 223, 223);
          Paint paint = new Paint();
          paint.setARGB(255, 210, 210, 210);
          paint.setTextAlign(Paint$Align.CENTER);
          paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
          Rect rect = new Rect();
          p0.getClipBounds(rect);
          paint.setTextSize((float)rect.height());
          paint.setTextAlign(Paint$Align.LEFT);
          paint.getTextBounds("?", 0, 1, rect);
          p0.drawText("?", ((((float)rect.width() / 2.00f) - ((float)rect.width() / 2.00f)) - (float)rect.left), ((((float)rect.height() / 2.00f) + ((float)rect.height() / 2.00f)) - (float)rect.bottom), paint);
       }
       return;
    }
    public void setContentId(int p0){
       if (this.b == p0) {
          return;
       }
       Placeholder tc = this.c;
       if (tc != null) {
          tc.setVisibility(0);
          this.c.getLayoutParams().b0 = false;
          this.c = null;
       }
       this.b = p0;
       if (p0 != -1) {
          View view = this.getParent().findViewById(p0);
          if (view != null) {
             view.setVisibility(8);
          }
       }
       return;
    }
    public void setEmptyVisibility(int p0){
       this.d = p0;
    }
}
