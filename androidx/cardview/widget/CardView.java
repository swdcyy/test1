package androidx.cardview.widget.CardView;
import android.widget.FrameLayout;
import c1.a;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import androidx.cardview.widget.CardView$a;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.content.res.Resources;
import c1.b;
import c1.c;
import android.view.View;
import android.view.View$MeasureSpec;
import java.lang.Math;

public class CardView extends FrameLayout	// class@000652
{
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public final Rect f;
    public final Rect g;
    public final b h;
    public static final int[] i;
    public static final c j;

    static {
       int[] ointArray = new int[]{0x1010031};
       CardView.i = ointArray;
       CardView.j = new a();
    }
    public void CardView(Context p0){
       super(p0, null);
    }
    public void CardView(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0401b2);
    }
    public void CardView(Context p0,AttributeSet p1,int p2){
       ColorStateList colorStateLi;
       super(p0, p1, p2);
       Rect rect = new Rect();
       this.f = rect;
       this.g = new Rect();
       CardView$a uoa = new CardView$a(this);
       this.h = uoa;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.H, p2, R.style.arg_RES_7f1100e5);
       p2 = 2;
       boolean i = 3;
       boolean b = false;
       if (typedArray.hasValue(p2)) {
          colorStateLi = typedArray.getColorStateList(p2);
       }else {
          TypedArray typedArray1 = this.getContext().obtainStyledAttributes(CardView.i);
          int color = typedArray1.getColor(b, b);
          typedArray1.recycle();
          float[] uofloatArray = new float[i];
          Color.colorToHSV(color, uofloatArray);
          p2 = (uofloatArray[p2] - 0x3f000000 > 0)? this.getResources().getColor(R.color.arg_RES_7f06011b): this.getResources().getColor(R.color.arg_RES_7f06011a);
          colorStateLi = ColorStateList.valueOf(p2);
       }
       ColorStateList uColorStateL = colorStateLi;
       float dimension = typedArray.getDimension(i, 0);
       float dimension1 = typedArray.getDimension(4, 0);
       float dimension2 = typedArray.getDimension(5, 0);
       this.b = typedArray.getBoolean(7, b);
       i = true;
       this.c = typedArray.getBoolean(6, i);
       int dimensionPix = typedArray.getDimensionPixelSize(8, b);
       rect.left = typedArray.getDimensionPixelSize(10, dimensionPix);
       rect.top = typedArray.getDimensionPixelSize(12, dimensionPix);
       rect.right = typedArray.getDimensionPixelSize(11, dimensionPix);
       rect.bottom = typedArray.getDimensionPixelSize(9, dimensionPix);
       float f = (dimension1 - dimension2 > 0)? dimension1: dimension2;
       this.d = typedArray.getDimensionPixelSize(b, b);
       this.e = typedArray.getDimensionPixelSize(i, b);
       typedArray.recycle();
       CardView.j.g(uoa, p0, uColorStateL, dimension, dimension1, f);
       return;
    }
    public static void d(CardView p0,int p1,int p2,int p3,int p4){
       super.setPadding(p1, p2, p3, p4);
    }
    public static void e(CardView p0,int p1){
       super.setMinimumWidth(p1);
    }
    public static void g(CardView p0,int p1){
       super.setMinimumHeight(p1);
    }
    public ColorStateList getCardBackgroundColor(){
       return CardView.j.a(this.h);
    }
    public float getCardElevation(){
       return CardView.j.k(this.h);
    }
    public int getContentPaddingBottom(){
       return this.f.bottom;
    }
    public int getContentPaddingLeft(){
       return this.f.left;
    }
    public int getContentPaddingRight(){
       return this.f.right;
    }
    public int getContentPaddingTop(){
       return this.f.top;
    }
    public float getMaxCardElevation(){
       return CardView.j.c(this.h);
    }
    public boolean getPreventCornerOverlap(){
       return this.c;
    }
    public float getRadius(){
       return CardView.j.l(this.h);
    }
    public boolean getUseCompatPadding(){
       return this.b;
    }
    public void h(int p0,int p1,int p2,int p3){
       this.f.set(p0, p1, p2, p3);
       CardView.j.n(this.h);
    }
    public void onMeasure(int p0,int p1){
       c j = CardView.j;
       if (!j instanceof a) {
          int mode = View$MeasureSpec.getMode(p0);
          CardView uCardView = 0x40000000;
          if (mode == Integer.MIN_VALUE || mode == uCardView) {
             p0 = View$MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil((double)j.m(this.h)), View$MeasureSpec.getSize(p0)), mode);
          }
          mode = View$MeasureSpec.getMode(p1);
          if (mode == Integer.MIN_VALUE || mode == uCardView) {
             p1 = View$MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil((double)j.b(this.h)), View$MeasureSpec.getSize(p1)), mode);
          }
          super.onMeasure(p0, p1);
       }else {
          super.onMeasure(p0, p1);
       }
       return;
    }
    public void setCardBackgroundColor(int p0){
       CardView.j.o(this.h, ColorStateList.valueOf(p0));
    }
    public void setCardBackgroundColor(ColorStateList p0){
       CardView.j.o(this.h, p0);
    }
    public void setCardElevation(float p0){
       CardView.j.e(this.h, p0);
    }
    public void setMaxCardElevation(float p0){
       CardView.j.j(this.h, p0);
    }
    public void setMinimumHeight(int p0){
       this.e = p0;
       super.setMinimumHeight(p0);
    }
    public void setMinimumWidth(int p0){
       this.d = p0;
       super.setMinimumWidth(p0);
    }
    public void setPadding(int p0,int p1,int p2,int p3){
    }
    public void setPaddingRelative(int p0,int p1,int p2,int p3){
    }
    public void setPreventCornerOverlap(boolean p0){
       if (p0 != this.c) {
          this.c = p0;
          CardView.j.i(this.h);
       }
       return;
    }
    public void setRadius(float p0){
       CardView.j.f(this.h, p0);
    }
    public void setUseCompatPadding(boolean p0){
       if (this.b != p0) {
          this.b = p0;
          CardView.j.h(this.h);
       }
       return;
    }
}
