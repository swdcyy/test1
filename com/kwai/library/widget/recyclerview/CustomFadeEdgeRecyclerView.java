package com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Boolean;
import android.view.View;
import android.os.Build;
import java.util.Locale;
import java.lang.String;
import java.lang.CharSequence;
import android.view.ViewGroup;

public class CustomFadeEdgeRecyclerView extends RecyclerView	// class@0009b7
{
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    public void CustomFadeEdgeRecyclerView(Context p0){
       super(p0, null);
    }
    public void CustomFadeEdgeRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void CustomFadeEdgeRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.l0);
       this.b = typedArray.getBoolean(3, false);
       this.c = typedArray.getBoolean(false, false);
       this.d = typedArray.getBoolean(1, false);
       this.e = typedArray.getBoolean(2, false);
       typedArray.recycle();
       this.x();
    }
    public void CustomFadeEdgeRecyclerView(Context p0,Boolean p1,Boolean p2,Boolean p3,Boolean p4){
       int i = 0;
       super(p0, null, i);
       this.b = i;
       this.c = i;
       boolean b = (p3 == null)? false: p3.booleanValue();
       this.d = b;
       if (p4 != null) {
          i = p4.booleanValue();
       }
       this.e = i;
       this.x();
       return;
    }
    public float getBottomFadingEdgeStrength(){
       float bottomFading = (this.c != null)? super.getBottomFadingEdgeStrength(): 0;
       return bottomFading;
    }
    public float getLeftFadingEdgeStrength(){
       float leftFadingEd = (this.d != null)? super.getLeftFadingEdgeStrength(): 0;
       return leftFadingEd;
    }
    public float getRightFadingEdgeStrength(){
       float rightFadingE = (this.e != null)? super.getRightFadingEdgeStrength(): 0;
       return rightFadingE;
    }
    public float getTopFadingEdgeStrength(){
       float topFadingEdg = (this.b != null)? super.getTopFadingEdgeStrength(): 0;
       return topFadingEdg;
    }
    public void setEnableBottomFadingEdge(boolean p0){
       this.c = p0;
    }
    public void setEnableLeftFadingEdge(boolean p0){
       this.d = p0;
    }
    public void setEnableRightFadingEdge(boolean p0){
       this.e = p0;
    }
    public void setEnableTopFadingEdge(boolean p0){
       this.b = p0;
    }
    public final void x(){
       if (!((Build.MANUFACTURER).toLowerCase(Locale.US)).contains("meitu")) {
          boolean b = false;
          boolean b1 = (this.b != null || this.c != null)? true: false;
          this.setVerticalFadingEdgeEnabled(b1);
          if (this.d != null || this.e != null) {
             b = true;
          }
          this.setHorizontalFadingEdgeEnabled(b);
       }
       return;
    }
}
