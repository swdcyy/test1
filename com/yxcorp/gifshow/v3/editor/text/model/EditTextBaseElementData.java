package com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import nsd.u;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.RectF;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public class EditTextBaseElementData extends EditBaseDrawerData	// class@001464
{
    public TextDrawConfigParam G;
    public String H;
    public TextChangeParam I;
    public int J;
    public int K;
    public int L;
    public TextStyleValue M;
    public static final Parcelable$Creator CREATOR;

    static {
       EditTextBaseElementData.CREATOR = new EditTextBaseElementData$a();
    }
    public void EditTextBaseElementData(EditTextBaseElementData p0){
       a.p(p0, "editTextBaseElementData");
       super(p0.G, null, null, 0, 0, 0, null, 126, null);
       this.a(p0);
    }
    public void EditTextBaseElementData(TextConfigParam p0){
       a.p(p0, "textConfigParam");
       super(p0.i(), null, null, 0, 0, 0, null, 126, null);
       this.G0(p0);
    }
    public void EditTextBaseElementData(TextDrawConfigParam p0,String p1,TextChangeParam p2,int p3,int p4,int p5,TextStyleValue p6){
       Object obj = p0;
       a.p(obj, "textDrawConfigParam");
       a.p(p1, "decorationId");
       a.p(p2, "textChangeParam");
       a.p(p6, "customTextStyle");
       Object this = obj;
       super(p1, 0, 0, 0, 0, 0, 0, false, 0, 0, 1022, 0);
       this.G = this;
       this.H = p1;
       this.I = p2;
       this.J = p3;
       this.K = p4;
       this.L = p5;
       this.M = p6;
       this.N(0);
       this.T(1);
    }
    public void EditTextBaseElementData(TextDrawConfigParam p0,String p1,TextChangeParam p2,int p3,int p4,int p5,TextStyleValue p6,int p7,u p8){
       TextChangeParam textChangePa;
       int i2;
       String str = (p7 & 0x02)? String.valueOf(System.currentTimeMillis()): p1;
       TextStyleValue textStyleVal = null;
       if (p7 & 0x04) {
          textChangePa = new TextChangeParam(0, null, null, null, 0, 0, 0, 0, 0, 0, 1023, null);
       }else {
          TextStyleValue textStyleVal2 = textStyleVal;
       }
       int i = 0;
       textChangePa = (p7 & 0x08)? 0: p3;
       int i1 = (p7 & 0x10)? 0: p4;
       if (!(p7 & 0x20)) {
          i = p5;
       }
       if (p7 & 0x40) {
          TextStyleValue textStyleVal1 = new TextStyleValue(0, null, null, null, null, 0, null, false, 255, null);
       }
       super(p0, str, v1, textChangePa, i1, i, textStyleVal);
       return;
    }
    public final int A0(){
       return this.L;
    }
    public final String B0(){
       Object obj = PatchProxy.apply(null, this, EditTextBaseElementData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.I.b();
    }
    public final TextDrawConfigParam C0(){
       return this.G;
    }
    public final void D0(TextStyleValue p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElementData.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.M = p0;
       return;
    }
    public final void E0(int p0){
       this.L = p0;
    }
    public final void F0(TextDrawConfigParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElementData.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.G = p0;
       return;
    }
    public final void G0(TextConfigParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElementData.class, "1")) {
          return;
       }
       a.p(p0, "textConfigParam");
       TextConfigParam d = p0.d;
       if (!PatchProxy.applyVoidOneRefs(d, this, BaseDrawerData.class, "14")) {
          a.p(d, "<set-?>");
          this.r = d;
       }
       this.V(p0.c);
       int i = 256;
       if (p0.b()) {
          this.c(i);
       }else {
          this.b(i);
       }
       i = 4096;
       if (p0.a()) {
          this.c(i);
       }else {
          this.b(i);
       }
       if (p0.f()) {
          this.c(1);
       }else {
          this.b(1);
       }
       this.S(p0.j());
       this.G = p0.i();
       return;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElementData.class, "4")) {
          return;
       }
       a.p(p0, "editTextBaseElementData");
       super.a(p0);
       if (p0 instanceof EditTextBaseElementData) {
          this.I = p0.I;
          this.G = p0.G;
          this.J = p0.J;
          this.K = p0.K;
          this.L = p0.L;
          this.M = p0.M;
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public String i0(){
       return this.H;
    }
    public void p0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTextBaseElementData.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.H = p0;
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditTextBaseElementData.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+", EditTextBaseElementData"+"\(textDrawConfigParam="+this.G+", "+"textChangeParam="+this.I+", "+"textAssetWidth="+this.J+", textAssetHeight="+this.K+')';
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(EditTextBaseElementData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EditTextBaseElementData.class, "9")) {
          return;
       }
       a.p(p0, "parcel");
       this.G.writeToParcel(p0, 0);
       p0.writeString(this.H);
       this.I.writeToParcel(p0, 0);
       p0.writeInt(this.J);
       p0.writeInt(this.K);
       p0.writeInt(this.L);
       this.M.writeToParcel(p0, 0);
       return;
    }
    public final boolean y0(){
       EditTextBaseElementData tL = this.L;
       boolean b = ((tL & 0x0100) == 256 || (tL & 4096) == 4096)? true: false;
       return b;
    }
    public final TextStyleValue z0(){
       return this.M;
    }
}
