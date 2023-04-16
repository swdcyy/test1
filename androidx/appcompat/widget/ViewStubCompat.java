package androidx.appcompat.widget.ViewStubCompat;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import ag6.a;
import android.view.ViewGroup$LayoutParams;
import java.lang.ref.WeakReference;
import java.lang.Object;
import androidx.appcompat.widget.ViewStubCompat$a;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.IllegalStateException;
import android.graphics.Canvas;

public final class ViewStubCompat extends View	// class@000635
{
    public int b;
    public int c;
    public WeakReference d;
    public LayoutInflater e;
    public ViewStubCompat$a f;

    public void ViewStubCompat(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ViewStubCompat(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.c6, p2, 0);
       this.c = typedArray.getResourceId(2, -1);
       this.b = typedArray.getResourceId(1, 0);
       this.setId(typedArray.getResourceId(0, -1));
       typedArray.recycle();
       this.setVisibility(8);
       this.setWillNotDraw(1);
    }
    public View a(){
       ViewParent parent = this.getParent();
       if (!parent instanceof ViewGroup) {
          throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
       }
       if (this.b == null) {
          throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
       }
       ViewStubCompat te = this.e;
       if (te == null) {
          te = LayoutInflater.from(this.getContext());
       }
       View view = a.c(te, this.b, parent, false);
       ViewStubCompat tc = this.c;
       if (tc != -1) {
          view.setId(tc);
       }
       int i = parent.indexOfChild(this);
       parent.removeViewInLayout(this);
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       if (layoutParams != null) {
          parent.addView(view, i, layoutParams);
       }else {
          parent.addView(view, i);
       }
       this.d = new WeakReference(view);
       ViewStubCompat tf = this.f;
       if (tf != null) {
          tf.a(this, view);
       }
       return view;
    }
    public void dispatchDraw(Canvas p0){
    }
    public void draw(Canvas p0){
    }
    public int getInflatedId(){
       return this.c;
    }
    public LayoutInflater getLayoutInflater(){
       return this.e;
    }
    public int getLayoutResource(){
       return this.b;
    }
    public void onMeasure(int p0,int p1){
       this.setMeasuredDimension(0, 0);
    }
    public void setInflatedId(int p0){
       this.c = p0;
    }
    public void setLayoutInflater(LayoutInflater p0){
       this.e = p0;
    }
    public void setLayoutResource(int p0){
       this.b = p0;
    }
    public void setOnInflateListener(ViewStubCompat$a p0){
       this.f = p0;
    }
    public void setVisibility(int p0){
       ViewStubCompat td = this.d;
       if (td != null) {
          View view = td.get();
          if (view != null) {
             view.setVisibility(p0);
          }else {
             throw new IllegalStateException("setVisibility called on un-referenced view");
          }
       }else {
          super.setVisibility(p0);
          if (!p0 || p0 == 4) {
             this.a();
          }
       }
       return;
    }
}
