package com.google.android.flexbox.FlexboxLayoutManager$LayoutParams;
import com.google.android.flexbox.FlexItem;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Parcel;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public class FlexboxLayoutManager$LayoutParams extends RecyclerView$LayoutParams implements FlexItem	// class@001600
{
    public float b;
    public float c;
    public int d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public static final Parcelable$Creator CREATOR;

    static {
       FlexboxLayoutManager$LayoutParams.CREATOR = new FlexboxLayoutManager$LayoutParams$a();
    }
    public void FlexboxLayoutManager$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.b = 0;
       this.c = 0x3f800000;
       this.d = -1;
       this.e = 0xbf800000;
       this.h = 0xffffff;
       this.i = 0xffffff;
    }
    public void FlexboxLayoutManager$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
       this.c = 0x3f800000;
       this.d = -1;
       this.e = 0xbf800000;
       this.h = 0xffffff;
       this.i = 0xffffff;
    }
    public void FlexboxLayoutManager$LayoutParams(Parcel p0){
       super(-2, -2);
       this.b = 0;
       this.c = 0x3f800000;
       this.d = -1;
       this.e = 0xbf800000;
       this.h = 0xffffff;
       this.i = 0xffffff;
       this.b = p0.readFloat();
       this.c = p0.readFloat();
       this.d = p0.readInt();
       this.e = p0.readFloat();
       this.f = p0.readInt();
       this.g = p0.readInt();
       this.h = p0.readInt();
       this.i = p0.readInt();
       boolean b = (p0.readByte())? true: false;
       this.j = b;
       this.bottomMargin = p0.readInt();
       this.leftMargin = p0.readInt();
       this.rightMargin = p0.readInt();
       this.topMargin = p0.readInt();
       this.height = p0.readInt();
       this.width = p0.readInt();
       return;
    }
    public void FlexboxLayoutManager$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.b = 0;
       this.c = 0x3f800000;
       this.d = -1;
       this.e = 0xbf800000;
       this.h = 0xffffff;
       this.i = 0xffffff;
    }
    public void FlexboxLayoutManager$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.b = 0;
       this.c = 0x3f800000;
       this.d = -1;
       this.e = 0xbf800000;
       this.h = 0xffffff;
       this.i = 0xffffff;
    }
    public void FlexboxLayoutManager$LayoutParams(RecyclerView$LayoutParams p0){
       super(p0);
       this.b = 0;
       this.c = 0x3f800000;
       this.d = -1;
       this.e = 0xbf800000;
       this.h = 0xffffff;
       this.i = 0xffffff;
    }
    public void FlexboxLayoutManager$LayoutParams(FlexboxLayoutManager$LayoutParams p0){
       super(p0);
       this.b = 0;
       this.c = 0x3f800000;
       this.d = -1;
       this.e = 0xbf800000;
       this.h = 0xffffff;
       this.i = 0xffffff;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = p0.j;
    }
    public boolean C3(){
       return this.j;
    }
    public void D2(int p0){
       this.i = p0;
    }
    public void V1(int p0){
       this.f = p0;
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
       return this.h;
    }
    public int getHeight(){
       return this.height;
    }
    public int getOrder(){
       return 1;
    }
    public int getWidth(){
       return this.width;
    }
    public int l2(){
       return this.rightMargin;
    }
    public void l4(int p0){
       this.d = p0;
    }
    public void m3(int p0){
       throw new UnsupportedOperationException("Setting the order in the FlexboxLayoutManager is not supported. Use FlexboxLayout if you need to reorder using the attribute.");
    }
    public float n1(){
       return this.c;
    }
    public int n3(){
       return this.d;
    }
    public int p(){
       return this.g;
    }
    public void r(int p0){
       this.width = p0;
    }
    public void r0(int p0){
       this.h = p0;
    }
    public int s(){
       return this.f;
    }
    public void s0(boolean p0){
       this.j = p0;
    }
    public void setFlexBasisPercent(float p0){
       this.e = p0;
    }
    public void setFlexGrow(float p0){
       this.b = p0;
    }
    public void setFlexShrink(float p0){
       this.c = p0;
    }
    public void u(int p0){
       this.height = p0;
    }
    public int v(){
       return this.i;
    }
    public int w0(){
       return this.topMargin;
    }
    public void w1(int p0){
       this.g = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeFloat(this.b);
       p0.writeFloat(this.c);
       p0.writeInt(this.d);
       p0.writeFloat(this.e);
       p0.writeInt(this.f);
       p0.writeInt(this.g);
       p0.writeInt(this.h);
       p0.writeInt(this.i);
       p0.writeByte(this.j);
       p0.writeInt(this.bottomMargin);
       p0.writeInt(this.leftMargin);
       p0.writeInt(this.rightMargin);
       p0.writeInt(this.topMargin);
       p0.writeInt(this.height);
       p0.writeInt(this.width);
    }
    public float y1(){
       return this.b;
    }
    public float y3(){
       return this.e;
    }
}
