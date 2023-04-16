package com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData$a;
import nsd.u;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData$b;
import java.util.List;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import android.os.Parcel;
import java.lang.Integer;

public class NewStickerElementData extends NewDecorationElementData	// class@000ad6
{
    public int J;
    public int K;
    public float L;
    public float M;
    public int N;
    public int O;
    public static final Parcelable$Creator CREATOR;
    public static final NewStickerElementData$a P;

    static {
       NewStickerElementData.P = new NewStickerElementData$a(null);
       NewStickerElementData.CREATOR = new NewStickerElementData$b();
    }
    public void NewStickerElementData(){
       super(0, 0, 0, 0, 0, 0, 63, null);
    }
    public void NewStickerElementData(int p0,int p1,float p2,float p3,int p4,int p5){
       super(null, 0, null, 7, null);
       this.J = p0;
       this.K = p1;
       this.L = p2;
       this.M = p3;
       this.N = p4;
       this.O = p5;
    }
    public void NewStickerElementData(int p0,int p1,float p2,float p3,int p4,int p5,int p6,u p7){
       int i = (p6 & 0x01)? 0: p0;
       int i1 = (p6 & 0x02)? -1: p1;
       int i2 = (p6 & 0x04)? 0: p2;
       int i3 = (p6 & 0x08)? 0: p3;
       int i4 = (p6 & 0x10)? 4113: p4;
       p6 = (p6 & 0x20)? 0: p5;
       super(i, i1, i2, i3, i4, p6);
       return;
    }
    public int B0(){
       return this.N;
    }
    public boolean C(){
       Object obj = PatchProxy.apply(null, this, NewStickerElementData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((this.B0() & 4096) == 4096)? true: false;
       return b;
    }
    public final int E0(){
       return this.J;
    }
    public final int F0(){
       return this.K;
    }
    public final float G0(){
       return this.M;
    }
    public final float H0(){
       return this.L;
    }
    public final boolean I0(){
       NewStickerElementData obj = PatchProxy.apply(null, this, NewStickerElementData.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.J;
       boolean b = true;
       int i = (obj == 6)? 1: 0;
       if (!i) {
          obj = (obj == 3)? 1: 0;
          if (!obj) {
             b = false;
          }
       }
       return b;
    }
    public final boolean J0(){
       boolean b = (this.J == 5)? true: false;
       return b;
    }
    public void K0(int p0){
       this.O = p0;
    }
    public void M0(int p0){
       this.N = p0;
    }
    public final void N0(int p0){
       this.J = p0;
    }
    public final void O0(int p0){
       this.K = p0;
    }
    public final void P0(float p0){
       this.M = p0;
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(NewStickerElementData.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NewStickerElementData.class, "3")) {
          return;
       }
       if (!p0 && this.C()) {
          this.M0((this.B0() ^ 0x1000));
       }else if(p0 && !this.C()){
          this.M0((this.B0() | 0x1000));
       }
       return;
    }
    public final void Q0(float p0){
       this.L = p0;
    }
    public void R0(NewDecorationElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewStickerElementData.class, "1")) {
          return;
       }
       a.p(p0, "elementData");
       if (p0 instanceof NewStickerElementData) {
          this.T(0);
          this.N(BaseDrawer.DECORATION_OUT_BOX_DISTANCE_IN_BOX_WIDTH);
          Objects.requireNonNull(NewTextElementData.b1);
          this.O(NewTextElementData.a1);
          this.v0(p0.l0());
          this.x0(p0.m0());
          this.q0(p0.j0());
          this.S(p0.l());
          this.Y(p0.w());
          this.Z(p0.x());
          this.b0(p0.A());
          this.a0(p0.z());
          this.K(p0.d());
          this.R(p0.k());
          this.P(p0.i());
          this.M(p0.f());
          NewStickerElementData newStickerEl = p0;
          this.L = newStickerEl.L;
          this.M = newStickerEl.M;
          this.J = newStickerEl.J;
          this.t0(p0.n0());
          this.C0(p0.A0());
          this.o0(p0.h0());
          this.M0(p0.B0());
       }
       this.D0(this.B0());
       return;
    }
    public int f0(){
       return this.O;
    }
    public BaseDrawerData$CustomButtonMode j(){
       return BaseDrawerData$CustomButtonMode.TIME_PANEL;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(NewStickerElementData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewStickerElementData.class, "6")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.J);
       p0.writeInt(this.K);
       p0.writeFloat(this.L);
       p0.writeFloat(this.M);
       p0.writeInt(this.N);
       p0.writeInt(this.O);
       return;
    }
}
