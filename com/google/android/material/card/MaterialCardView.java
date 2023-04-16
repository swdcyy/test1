package com.google.android.material.card.MaterialCardView;
import androidx.cardview.widget.CardView;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import ck.k;
import yj.a;

public class MaterialCardView extends CardView	// class@00166b
{
    public final a k;

    public void MaterialCardView(Context p0){
       super(p0, null);
    }
    public void MaterialCardView(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0405f9);
    }
    public void MaterialCardView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[0];
       TypedArray typedArray = k.h(p0, p1, c$b.g3, p2, R.style.arg_RES_7f1104d2, ointArray);
       a uoa = new a(this);
       this.k = uoa;
       uoa.e(typedArray);
       typedArray.recycle();
    }
    public int getStrokeColor(){
       return this.k.c();
    }
    public int getStrokeWidth(){
       return this.k.d();
    }
    public void setRadius(float p0){
       super.setRadius(p0);
       this.k.h();
    }
    public void setStrokeColor(int p0){
       this.k.f(p0);
    }
    public void setStrokeWidth(int p0){
       this.k.g(p0);
    }
}
