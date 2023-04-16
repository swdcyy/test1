package com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementV3Data;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementV3Data$a;
import nsd.u;
import lnc.a1;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementV3Data$b;
import java.lang.String;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.System;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.util.SizeF;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.util.List;
import java.lang.Number;
import java.util.Objects;
import android.os.Parcel;
import java.lang.Integer;
import java.lang.Enum;

public final class NewTextElementV3Data extends NewTextBaseElementData	// class@000bd6
{
    public final boolean R;
    public String S;
    public DraftTextStyleInfo T;
    public final int U;
    public final DraftTTSInfo V;
    public int W;
    public BaseDrawerData$CustomButtonMode X;
    public int Y;
    public static final Parcelable$Creator CREATOR;
    public static final int U0;
    public static final NewTextElementV3Data$a V0;
    public static final int Z;

    static {
       NewTextElementV3Data.V0 = new NewTextElementV3Data$a(null);
       NewTextElementV3Data.Z = a1.e(10.00f);
       NewTextElementV3Data.U0 = a1.e(16.00f);
       NewTextElementV3Data.CREATOR = new NewTextElementV3Data$b();
    }
    public void NewTextElementV3Data(boolean p0,String p1,DraftTextStyleInfo p2,int p3,DraftTTSInfo p4,int p5,BaseDrawerData$CustomButtonMode p6,int p7){
       int i = this;
       Object obj = p6;
       a.p(p1, "text");
       a.p(p2, "textStyleInfo");
       a.p(obj, "customIconMode");
       super(p0, p1, p3, p4, p5, p6, p2);
       i.R = p0;
       i.S = p1;
       i.T = p2;
       i.U = p3;
       i.V = p4;
       i.W = p5;
       i.X = obj;
       i.Y = p7;
       this.p0(String.valueOf(System.currentTimeMillis()));
       this.P0(this);
    }
    public int B0(){
       return this.W;
    }
    public boolean C(){
       Object obj = PatchProxy.apply(null, this, NewTextElementV3Data.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((this.B0() & 4096) == 4096)? true: false;
       return b;
    }
    public BaseDrawerData$CustomButtonMode E0(){
       return this.X;
    }
    public String F0(){
       return this.S;
    }
    public DraftTextStyleInfo G0(){
       return this.T;
    }
    public int H0(){
       return this.U;
    }
    public DraftTTSInfo I0(){
       return this.V;
    }
    public boolean J0(){
       return this.R;
    }
    public void K0(int p0){
       this.W = p0;
    }
    public void M0(BaseDrawerData$CustomButtonMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementV3Data.class, "13")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.X = p0;
       return;
    }
    public void N0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementV3Data.class, "11")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.S = p0;
       return;
    }
    public void O0(DraftTextStyleInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementV3Data.class, "12")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.T = p0;
       return;
    }
    public void P0(NewDecorationElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementV3Data.class, "2")) {
          return;
       }
       a.p(p0, "elementData");
       super.P0(p0);
       this.Q0(new SizeF(p0.i(), p0.f()));
       if (p0 instanceof NewTextElementV3Data) {
          NewTextElementV3Data newTextEleme = p0;
          this.O0(newTextEleme.G0());
          int i = (newTextEleme.J0())? 3: 1;
          this.T(i);
          this.S(newTextEleme.G0().j());
          this.v0(p0.l0());
          this.x0(p0.m0());
          this.q0(p0.j0());
          this.Y(p0.w());
          this.Z(p0.x());
          this.b0(p0.A());
          this.a0(p0.z());
       }
       return;
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(NewTextElementV3Data.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NewTextElementV3Data.class, "4")) {
          return;
       }
       if (!p0 && this.C()) {
          this.K0((this.B0() ^ 0x1000));
       }else if(p0 && !this.C()){
          this.K0((this.B0() | 0x1000));
       }
       return;
    }
    public final void Q0(SizeF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementV3Data.class, "1")) {
          return;
       }
       a.p(p0, "size");
       this.P(p0.getWidth());
       this.M(p0.getHeight());
       this.N(NewTextElementV3Data.U0);
       this.O(NewTextElementV3Data.Z);
       return;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewTextElementV3Data.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof NewTextElementV3Data) {
          return false;
       }
       if (this.J0() != p0.J0() || (!a.g(this.F0(), p0.F0()) || (!a.g(this.i0(), p0.i0()) || (this.l0() != p0.l0() || (this.m0() - p0.m0() || (this.j0() - p0.j0() || (!a.g(this.G0(), p0.G0()) || (this.H0() != p0.H0() || (this.B0() != p0.B0() || (!a.g(this.I0(), p0.I0()) || (!a.g(this.A0(), p0.A0()) || (this.w() - p0.w() || (this.x() - p0.x() || (this.A() - p0.A() || (this.E0() != p0.E0() || (this.i() - p0.i() || this.f() - p0.f())))))))))))))))) {
          b = false;
       }
       return b;
    }
    public int f0(){
       return this.Y;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, NewTextElementV3Data.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Objects.hashCode(this.i0());
    }
    public BaseDrawerData$CustomButtonMode j(){
       Object obj = PatchProxy.apply(null, this, NewTextElementV3Data.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E0();
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(NewTextElementV3Data.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewTextElementV3Data.class, "14")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.R);
       p0.writeString(this.S);
       this.T.writeToParcel(p0, 0);
       p0.writeInt(this.U);
       NewTextElementV3Data tV = this.V;
       if (tV != null) {
          p0.writeInt(1);
          tV.writeToParcel(p0, 0);
       }else {
          p0.writeInt(0);
       }
       p0.writeInt(this.W);
       p0.writeString(this.X.name());
       p0.writeInt(this.Y);
       return;
    }
}
