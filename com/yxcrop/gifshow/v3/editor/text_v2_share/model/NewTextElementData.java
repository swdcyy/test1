package com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData$a;
import nsd.u;
import lnc.a1;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData$b;
import java.lang.String;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import android.graphics.RectF;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.System;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import android.os.Parcel;
import java.io.Serializable;
import java.lang.Enum;
import android.os.Parcelable;

public final class NewTextElementData extends NewTextBaseElementData	// class@000bd3
{
    public final boolean R;
    public String S;
    public DraftTextStyleInfo T;
    public final int U;
    public int U0;
    public TextDrawConfigParam V;
    public BaseDrawerData$CustomButtonMode V0;
    public DynamicTextParams W;
    public RectF W0;
    public String X;
    public int X0;
    public final DraftTTSInfo Y;
    public final String Z;
    public static final Parcelable$Creator CREATOR;
    public static final int Y0;
    public static final int Z0;
    public static final int a1;
    public static final NewTextElementData$a b1;

    static {
       NewTextElementData.b1 = new NewTextElementData$a(null);
       NewTextElementData.Y0 = a1.e(24.00f);
       NewTextElementData.Z0 = a1.e(20.00f);
       NewTextElementData.a1 = a1.e(6.00f);
       NewTextElementData.CREATOR = new NewTextElementData$b();
    }
    public void NewTextElementData(boolean p0,String p1,DraftTextStyleInfo p2,int p3,TextDrawConfigParam p4,DynamicTextParams p5,String p6,DraftTTSInfo p7,String p8,int p9,BaseDrawerData$CustomButtonMode p10,RectF p11,int p12){
       int i = this;
       Object obj = p1;
       Object obj1 = p2;
       Object obj2 = p6;
       Object obj3 = p8;
       Object obj4 = p10;
       a.p(obj, "text");
       a.p(obj1, "textStyleInfo");
       a.p(obj2, "sk2cUnzipPath");
       a.p(obj3, "outputImageFile");
       a.p(obj4, "customIconMode");
       super(p0, p1, p3, p7, p9, p10, p2);
       i.R = p0;
       i.S = obj;
       i.T = obj1;
       i.U = p3;
       i.V = p4;
       i.W = p5;
       i.X = obj2;
       i.Y = p7;
       i.Z = obj3;
       i.U0 = p9;
       i.V0 = obj4;
       i.W0 = p11;
       i.X0 = p12;
       this.p0(String.valueOf(System.currentTimeMillis()));
       this.P0(this);
    }
    public void NewTextElementData(boolean p0,String p1,DraftTextStyleInfo p2,int p3,TextDrawConfigParam p4,DynamicTextParams p5,String p6,DraftTTSInfo p7,String p8,int p9,BaseDrawerData$CustomButtonMode p10,RectF p11,int p12,int p13,u p14){
       int i = p13;
       int i1 = (i & 0x08)? 0: p3;
       int i2 = 0;
       TextDrawConfigParam textDrawConf = (i & 0x10)? i2: p4;
       DynamicTextParams uDynamicText = (i & 0x20)? i2: p5;
       String str = "";
       String str1 = (i & 0x40)? str: p6;
       DraftTTSInfo uDraftTTSInf = (i & 0x0080)? i2: p7;
       String str2 = (i & 0x0100)? str: p8;
       int i3 = (i & 0x0200)? 4097: p9;
       BaseDrawerData$CustomButtonMode uCustomButto = (i & 0x0400)? BaseDrawerData$CustomButtonMode.NONE: p10;
       RectF rectF = (i & 0x0800)? i2: p11;
       int i4 = (i & 0x1000)? 0: p12;
       super(p0, p1, p2, i1, textDrawConf, uDynamicText, str1, uDraftTTSInf, str2, i3, uCustomButto, rectF, i4);
       return;
    }
    public int B0(){
       return this.U0;
    }
    public boolean C(){
       Object obj = PatchProxy.apply(null, this, NewTextElementData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((this.B0() & 4096) == 4096)? true: false;
       return b;
    }
    public BaseDrawerData$CustomButtonMode E0(){
       return this.V0;
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
       return this.Y;
    }
    public boolean J0(){
       return this.R;
    }
    public void K0(int p0){
       this.U0 = p0;
    }
    public void M0(BaseDrawerData$CustomButtonMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementData.class, "14")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.V0 = p0;
       return;
    }
    public void N0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementData.class, "11")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.S = p0;
       return;
    }
    public void O0(DraftTextStyleInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementData.class, "12")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.T = p0;
       return;
    }
    public void P0(NewDecorationElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementData.class, "1")) {
          return;
       }
       a.p(p0, "elementData");
       if (p0 instanceof NewTextElementData) {
          super.P0(p0);
          if (!PatchProxy.applyVoidOneRefs(p0, this, NewTextElementData.class, "2")) {
             a.p(p0, "elementData");
             this.a1(p0);
             this.b1(p0);
          }
       }
       return;
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(NewTextElementData.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NewTextElementData.class, "6")) {
          return;
       }
       if (!p0 && this.C()) {
          this.K0((this.B0() ^ 0x1000));
       }else if(p0 && !this.C()){
          this.K0((this.B0() | 0x1000));
       }
       return;
    }
    public final NewTextElementData Q0(int p0,String p1,double p2,double p3,List p4,float p5,float p6,int p7){
       if (PatchProxy.isSupport(NewTextElementData.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Double.valueOf(p2),Double.valueOf(p3),p4,Float.valueOf(p5),Float.valueOf(p6),Integer.valueOf(p7)};
          Object obj = PatchProxy.apply(objArray, this, NewTextElementData.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "identifier");
       this.K0(p7);
       this.v0(p0);
       this.p0(p1);
       this.x0(p2);
       this.q0(p3);
       this.C0(p4);
       this.Y(p5);
       this.Z(p6);
       return this;
    }
    public RectF R0(){
       return this.W0;
    }
    public final String S0(){
       return this.Z;
    }
    public final DynamicTextParams T0(){
       return this.W;
    }
    public final String U0(){
       return this.X;
    }
    public final TextDrawConfigParam V0(){
       return this.V;
    }
    public final void W0(DynamicTextParams p0){
       this.W = p0;
    }
    public final void Y0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementData.class, "13")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.X = p0;
       return;
    }
    public final void Z0(TextDrawConfigParam p0){
       this.V = p0;
    }
    public final void a1(NewTextElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextElementData.class, "3")) {
          return;
       }
       a.p(p0, "elementData");
       int i = (p0.J0())? 3: 1;
       this.T(i);
       this.N(BaseDrawer.DECORATION_OUT_BOX_DISTANCE_IN_BOX_WIDTH);
       this.O(NewTextElementData.a1);
       this.S(p0.G0().j());
       this.K(p0.G0().b());
       this.v0(p0.l0());
       this.x0(p0.m0());
       this.q0(p0.j0());
       this.Y(p0.w());
       this.Z(p0.x());
       this.b0(p0.G0().i());
       this.a0(p0.G0().h());
       this.K(p0.G0().b());
       if (p0.R0() != null) {
          RectF rectF = p0.R0();
          a.m(rectF);
          this.V(rectF);
       }
       return;
    }
    public final void b1(NewTextElementData p0){
       Object obj = this;
       TextDrawConfigParam obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, NewTextElementData.class, "4")) {
          return;
       }
       a.p(obj1, "elementData");
       if (p0.J0()) {
          NewTextElementData v = obj.V;
          obj1 = (v != null)? TextDrawConfigParam.b(v, 0, NewTextElementData.Z0, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, 0, null, null, null, null, false, 0, 0, 0, 0, 0, null, null, 0x3fffffd, null): null;
          obj.V = obj1;
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewTextElementData.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof NewTextElementData) {
          return false;
       }
       if (this.J0() != p0.J0() || (!a.g(this.F0(), p0.F0()) || (!a.g(this.i0(), p0.i0()) || (this.l0() != p0.l0() || (this.m0() - p0.m0() || (this.j0() - p0.j0() || (!a.g(this.G0(), p0.G0()) || (this.H0() != p0.H0() || (!a.g(this.V, p0.V) || (!a.g(this.W, p0.W) || (!a.g(this.X, p0.X) || (this.B0() != p0.B0() || (!a.g(this.I0(), p0.I0()) || (!a.g(this.Z, p0.Z) || (!a.g(this.A0(), p0.A0()) || (this.w() - p0.w() || (this.x() - p0.x() || this.E0() != p0.E0()))))))))))))))))) {
          b = false;
       }
       return b;
    }
    public int f0(){
       return this.X0;
    }
    public BaseDrawerData$CustomButtonMode j(){
       Object obj = PatchProxy.apply(null, this, NewTextElementData.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E0();
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(NewTextElementData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewTextElementData.class, "15")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.R);
       p0.writeString(this.S);
       this.T.writeToParcel(p0, 0);
       p0.writeInt(this.U);
       NewTextElementData tV = this.V;
       if (tV != null) {
          p0.writeInt(1);
          tV.writeToParcel(p0, 0);
       }else {
          p0.writeInt(0);
       }
       p0.writeSerializable(this.W);
       p0.writeString(this.X);
       tV = this.Y;
       if (tV != null) {
          p0.writeInt(1);
          tV.writeToParcel(p0, 0);
       }else {
          p0.writeInt(0);
       }
       p0.writeString(this.Z);
       p0.writeInt(this.U0);
       p0.writeString(this.V0.name());
       p0.writeParcelable(this.W0, p1);
       p0.writeInt(this.X0);
       return;
    }
}
