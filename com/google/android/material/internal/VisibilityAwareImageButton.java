package com.google.android.material.internal.VisibilityAwareImageButton;
import android.widget.ImageButton;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class VisibilityAwareImageButton extends ImageButton	// class@0016a4
{
    public int b;

    public void VisibilityAwareImageButton(Context p0){
       super(p0, null);
    }
    public void VisibilityAwareImageButton(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VisibilityAwareImageButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = this.getVisibility();
    }
    public final void c(int p0,boolean p1){
       super.setVisibility(p0);
       if (p1) {
          this.b = p0;
       }
       return;
    }
    public final int getUserSetVisibility(){
       return this.b;
    }
    public void setVisibility(int p0){
       this.c(p0, true);
    }
}
