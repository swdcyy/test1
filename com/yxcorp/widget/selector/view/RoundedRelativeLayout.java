package com.yxcorp.widget.selector.view.RoundedRelativeLayout;
import android.widget.RelativeLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$b;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$a;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import com.yxcorp.widget.selector.view.RoundedRelativeLayout$d;
import android.view.ViewGroup;
import android.view.View;

public class RoundedRelativeLayout extends RelativeLayout	// class@0009eb
{
    public final RoundedRelativeLayout$d b;
    public final boolean c;
    public float d;
    public int e;
    public static final float f;
    public static final boolean g;

    static {
       RoundedRelativeLayout.f = (float)a1.d(0x7f071104);
       RoundedRelativeLayout.g = true;
    }
    public void RoundedRelativeLayout(Context p0){
       super(p0, null);
    }
    public void RoundedRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundedRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       RoundedRelativeLayout$b uob = (RoundedRelativeLayout.g)? new RoundedRelativeLayout$b(this): new RoundedRelativeLayout$a(this);
       this.b = uob;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.I4);
       this.d = typedArray.getDimension(1, RoundedRelativeLayout.f);
       this.c = typedArray.getBoolean(0, 0);
       typedArray.recycle();
       this.setCornerRadius(this.d);
       return;
    }
    public void dispatchDraw(Canvas p0){
       this.b.c(p0, true);
       super.dispatchDraw(p0);
       this.b.b(p0, true);
    }
    public void draw(Canvas p0){
       this.b.c(p0, false);
       super.draw(p0);
       this.b.b(p0, false);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.b.a(p0, p1);
    }
    public void setCornerRadius(float p0){
       this.d = p0;
       this.b.d(p0);
    }
    public void setRadiusDirection(int p0){
       this.b.e(p0);
    }
}
