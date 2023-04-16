package com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import aw9.c;
import wba.h0;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;
import android.os.Parcel;
import java.lang.Integer;

public class EditBaseDrawerData extends BaseDrawerData	// class@000f14
{
    public int A;
    public int B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public String w;
    public int x;
    public double y;
    public double z;
    public static final Parcelable$Creator CREATOR;

    static {
       EditBaseDrawerData.CREATOR = new EditBaseDrawerData$a();
    }
    public void EditBaseDrawerData(){
       super(null, 0, 0, 0, 0, 0, 0, false, false, 0, 1023, null);
    }
    public void EditBaseDrawerData(EditBaseDrawerData p0){
       a.p(p0, "editBaseDrawerData");
       super(null, 0, 0, 0, 0, 0, 0, false, false, 0, 1023, null);
       this.a(p0);
    }
    public void EditBaseDrawerData(String p0,int p1,double p2,double p3,int p4,int p5,float p6,boolean p7,boolean p8,int p9){
       a.p(p0, "decorationId");
       super(null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, false, 0, 0x1fffff, null);
       this.w = p0;
       this.x = p1;
       this.y = p2;
       this.z = p3;
       this.A = p4;
       this.B = p5;
       this.C = p6;
       this.D = p7;
       this.E = p8;
       this.F = p9;
    }
    public void EditBaseDrawerData(String p0,int p1,double p2,double p3,int p4,int p5,float p6,boolean p7,boolean p8,int p9,int p10,u p11){
       int i = p10;
       String str = (i & 0x01)? "": p0;
       int i1 = (i & 0x02)? -1: p1;
       int i2 = 0;
       int i3 = (i & 0x04)? i2: p2;
       if (!(i & 0x08)) {
          i2 = p3;
       }
       int i4 = 0;
       int i5 = (i & 0x10)? 0: p4;
       int i6 = (i & 0x20)? 0: p5;
       int i7 = (i & 0x40)? 0x3f800000: p6;
       int i8 = (i & 0x0080)? 0: p7;
       int i9 = (i & 0x0100)? 0: p8;
       if (!(i & 0x0200)) {
          i4 = p9;
       }
       super(str, i1, i3, i2, i5, i6, i7, i8, i9, i4);
       return;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditBaseDrawerData.class, "1")) {
          return;
       }
       a.p(p0, "editBaseDrawerData");
       super.a(p0);
       if (p0 instanceof EditBaseDrawerData) {
          this.p0(p0.i0());
          this.x = p0.x;
          this.y = p0.y;
          this.z = p0.z;
          this.A = p0.A;
       }
       return;
    }
    public String d0(){
       Object obj = PatchProxy.apply(null, this, EditBaseDrawerData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.d0()+",\ndecorationId:"+this.i0()+",  layerIndex:"+this.x+",\n"+"range:["+c.a((float)this.y)+" - "+c.a((float)(this.y + this.z))+']';
    }
    public h0 e0(){
       Object obj = PatchProxy.apply(null, this, EditBaseDrawerData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       h0 oh0 = new h0(this.w(), this.x(), this.A(), this.z(), StickerTextValueType.EditElement, this.m(), this.d(), this.i0());
       obj.l(this.q());
       return obj;
    }
    public int f0(){
       return this.F;
    }
    public final float h0(){
       return this.C;
    }
    public String i0(){
       return this.w;
    }
    public final double j0(){
       return this.z;
    }
    public final boolean k0(){
       return this.D;
    }
    public final int l0(){
       return this.x;
    }
    public final double m0(){
       return this.y;
    }
    public final boolean n0(){
       return this.E;
    }
    public final void o0(float p0){
       this.C = p0;
    }
    public void p0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditBaseDrawerData.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.w = p0;
       return;
    }
    public final void q0(double p0){
       this.z = p0;
    }
    public final void t0(boolean p0){
       this.E = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditBaseDrawerData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EditBaseDrawerData\(decorationId="+this.i0()+", "+"layerIndex="+this.x+", startTime="+this.y+", duration = "+this.z+')'+super.toString();
    }
    public final void u0(boolean p0){
       this.D = p0;
    }
    public final void v0(int p0){
       this.x = p0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(EditBaseDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EditBaseDrawerData.class, "6")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.w);
       p0.writeInt(this.x);
       p0.writeDouble(this.y);
       p0.writeDouble(this.z);
       p0.writeInt(this.A);
       p0.writeInt(this.B);
       p0.writeFloat(this.C);
       p0.writeInt(this.D);
       p0.writeInt(this.E);
       p0.writeInt(this.F);
       return;
    }
    public final void x0(double p0){
       this.y = p0;
    }
}
