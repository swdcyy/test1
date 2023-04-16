package com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.google.android.flexbox.FlexItem;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.android.flexbox.FlexboxLayout$LayoutParams$a;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import android.os.Parcel;

public class FlexboxLayout$LayoutParams extends ViewGroup$MarginLayoutParams implements FlexItem	// class@0015fd
{
    public int b;
    public float c;
    public float d;
    public int e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public static final Parcelable$Creator CREATOR;

    static {
       FlexboxLayout$LayoutParams.CREATOR = new FlexboxLayout$LayoutParams$a();
    }
    public void FlexboxLayout$LayoutParams(int p0,int p1){
       super(new ViewGroup$LayoutParams(p0, p1));
       this.b = 1;
       this.c = 0;
       this.d = 0x3f800000;
       this.e = -1;
       this.f = 0xbf800000;
       this.g = -1;
       this.h = -1;
       this.i = 0xffffff;
       this.j = 0xffffff;
    }
    public void FlexboxLayout$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 1;
       this.c = 0;
       this.d = 0x3f800000;
       this.e = -1;
       this.f = 0xbf800000;
       this.g = -1;
       this.h = -1;
       this.i = 0xffffff;
       this.j = 0xffffff;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.K0);
       this.b = typedArray.getInt(8, 1);
       this.c = typedArray.getFloat(2, 0);
       this.d = typedArray.getFloat(3, 0x3f800000);
       this.e = typedArray.getInt(0, -1);
       this.f = typedArray.getFraction(1, 1, 1, 0xbf800000);
       this.g = typedArray.getDimensionPixelSize(7, -1);
       this.h = typedArray.getDimensionPixelSize(6, -1);
       this.i = typedArray.getDimensionPixelSize(5, 0xffffff);
       this.j = typedArray.getDimensionPixelSize(4, 0xffffff);
       this.k = typedArray.getBoolean(9, 0);
       typedArray.recycle();
    }
    public void FlexboxLayout$LayoutParams(Parcel p0){
       int i = 0;
       super(i, i);
       this.b = 1;
       this.c = 0;
       this.d = 0x3f800000;
       this.e = -1;
       this.f = 0xbf800000;
       this.g = -1;
       this.h = -1;
       this.i = 0xffffff;
       this.j = 0xffffff;
       this.b = p0.readInt();
       this.c = p0.readFloat();
       this.d = p0.readFloat();
       this.e = p0.readInt();
       this.f = p0.readFloat();
       this.g = p0.readInt();
       this.h = p0.readInt();
       this.i = p0.readInt();
       this.j = p0.readInt();
       if (p0.readByte()) {
          i = true;
       }
       this.k = i;
       this.bottomMargin = p0.readInt();
       this.leftMargin = p0.readInt();
       this.rightMargin = p0.readInt();
       this.topMargin = p0.readInt();
       this.height = p0.readInt();
       this.width = p0.readInt();
       return;
    }
    public void FlexboxLayout$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.b = 1;
       this.c = 0;
       this.d = 0x3f800000;
       this.e = -1;
       this.f = 0xbf800000;
       this.g = -1;
       this.h = -1;
       this.i = 0xffffff;
       this.j = 0xffffff;
    }
    public void FlexboxLayout$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.b = 1;
       this.c = 0;
       this.d = 0x3f800000;
       this.e = -1;
       this.f = 0xbf800000;
       this.g = -1;
       this.h = -1;
       this.i = 0xffffff;
       this.j = 0xffffff;
    }
    public void FlexboxLayout$LayoutParams(FlexboxLayout$LayoutParams p0){
       super(p0);
       this.b = 1;
       this.c = 0;
       this.d = 0x3f800000;
       this.e = -1;
       this.f = 0xbf800000;
       this.g = -1;
       this.h = -1;
       this.i = 0xffffff;
       this.j = 0xffffff;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
    }
    public boolean C3(){
       return this.k;
    }
    public void D2(int p0){
       this.j = p0;
    }
    public void V1(int p0){
       this.g = p0;
    }
    public int X0(){
       return this.bottomMargin;
    }
    public int Y1(){
       return this.leftMargin;
    }
    public int describeContents(){
       return 0;
    }
    public int g0(){
       return this.i;
    }
    public int getHeight(){
       return this.height;
    }
    public int getOrder(){
       return this.b;
    }
    public int getWidth(){
       return this.width;
    }
    public int l2(){
       return this.rightMargin;
    }
    public void l4(int p0){
       this.e = p0;
    }
    public void m3(int p0){
       this.b = p0;
    }
    public float n1(){
       return this.d;
    }
    public int n3(){
       return this.e;
    }
    public int p(){
       return this.h;
    }
    public void r(int p0){
       this.width = p0;
    }
    public void r0(int p0){
       this.i = p0;
    }
    public int s(){
       return this.g;
    }
    public void s0(boolean p0){
       this.k = p0;
    }
    public void setFlexBasisPercent(float p0){
       this.f = p0;
    }
    public void setFlexGrow(float p0){
       this.c = p0;
    }
    public void setFlexShrink(float p0){
       this.d = p0;
    }
    public void u(int p0){
       this.height = p0;
    }
    public int v(){
       return this.j;
    }
    public int w0(){
       return this.topMargin;
    }
    public void w1(int p0){
       this.h = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeFloat(this.c);
       p0.writeFloat(this.d);
       p0.writeInt(this.e);
       p0.writeFloat(this.f);
       p0.writeInt(this.g);
       p0.writeInt(this.h);
       p0.writeInt(this.i);
       p0.writeInt(this.j);
       p0.writeByte(this.k);
       p0.writeInt(this.bottomMargin);
       p0.writeInt(this.leftMargin);
       p0.writeInt(this.rightMargin);
       p0.writeInt(this.topMargin);
       p0.writeInt(this.height);
       p0.writeInt(this.width);
    }
    public float y1(){
       return this.c;
    }
    public float y3(){
       return this.f;
    }
}
