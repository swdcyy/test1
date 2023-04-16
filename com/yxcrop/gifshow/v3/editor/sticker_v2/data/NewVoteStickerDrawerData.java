package com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData$a;
import nsd.u;
import lnc.a1;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.NewVoteStickerDrawerData$b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public final class NewVoteStickerDrawerData extends NewStickerElementData	// class@000a72
{
    public String Q;
    public String R;
    public String S;
    public String T;
    public boolean U;
    public boolean V;
    public int W;
    public static final Parcelable$Creator CREATOR;
    public static final int X;
    public static final NewVoteStickerDrawerData$a Y;

    static {
       NewVoteStickerDrawerData.Y = new NewVoteStickerDrawerData$a(null);
       NewVoteStickerDrawerData.X = a1.e(12.00f);
       NewVoteStickerDrawerData.CREATOR = new NewVoteStickerDrawerData$b();
    }
    public void NewVoteStickerDrawerData(){
       super(null, null, null, null, false, false, 0, 127, null);
    }
    public void NewVoteStickerDrawerData(NewVoteStickerDrawerData p0){
       a.p(p0, "editVoteStickerDrawerData");
       super(null, null, null, null, false, false, 0, 127, null);
       this.a(p0);
    }
    public void NewVoteStickerDrawerData(String p0,String p1,String p2,String p3,boolean p4,boolean p5,int p6){
       int i = this;
       Object obj = p1;
       Object obj1 = p2;
       Object obj2 = p3;
       a.p(p0, "question");
       a.p(obj, "optionOne");
       a.p(obj1, "optionTwo");
       a.p(obj2, "optionThree");
       super(3, 0, 0, 0, 0, 0, 62, null);
       i.Q = p0;
       i.R = obj;
       i.S = obj1;
       i.T = obj2;
       i.U = p4;
       i.V = p5;
       i.W = p6;
       this.c1();
    }
    public void NewVoteStickerDrawerData(String p0,String p1,String p2,String p3,boolean p4,boolean p5,int p6,int p7,u p8){
       int i3;
       int i = 0;
       String str = "";
       String str1 = (p7 & 0x01)? str: i;
       String str2 = (p7 & 0x02)? str: i;
       String str3 = (p7 & 0x04)? str: i;
       if (p7 & 0x08) {
          i = str;
       }
       int i1 = 0;
       str = (p7 & 0x10)? 0: p4;
       if (!(p7 & 0x20)) {
          i1 = p5;
       }
       int i2 = (p7 & 0x40)? 4097: p6;
       super(str1, str2, str3, i, str, i1, i2);
       return;
    }
    public int B0(){
       return this.W;
    }
    public void M0(int p0){
       this.W = p0;
    }
    public void R0(NewDecorationElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewVoteStickerDrawerData.class, "2")) {
          return;
       }
       a.p(p0, "elementData");
       super.R0(p0);
       if (p0 instanceof NewVoteStickerDrawerData) {
          this.c1();
          this.Q = p0.Q;
          this.R = p0.R;
          this.S = p0.S;
          this.T = p0.T;
       }
       return;
    }
    public final String S0(){
       return this.R;
    }
    public final String T0(){
       return this.T;
    }
    public final String U0(){
       return this.S;
    }
    public final String V0(){
       return this.Q;
    }
    public final boolean W0(){
       return this.V;
    }
    public final void Y0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewVoteStickerDrawerData.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.R = p0;
       return;
    }
    public final void Z0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewVoteStickerDrawerData.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.S = p0;
       return;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewVoteStickerDrawerData.class, "1")) {
          return;
       }
       a.p(p0, "editVoteStickerDrawerData");
       super.a(p0);
       if (p0 instanceof NewVoteStickerDrawerData) {
          this.Q = p0.Q;
          this.R = p0.R;
          this.S = p0.S;
          this.T = p0.T;
       }
       return;
    }
    public final void a1(boolean p0){
       this.U = p0;
    }
    public final void b1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewVoteStickerDrawerData.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.Q = p0;
       return;
    }
    public final void c1(){
       if (PatchProxy.applyVoid(null, this, NewVoteStickerDrawerData.class, "4")) {
          return;
       }
       if (this.V != null) {
          this.O0(2);
       }
       int x = NewVoteStickerDrawerData.X;
       this.N(x);
       this.O(x);
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BaseDrawerData$CustomButtonMode j(){
       BaseDrawerData$CustomButtonMode eDIT_TEXT = (this.U != null)? BaseDrawerData$CustomButtonMode.EDIT_TEXT: BaseDrawerData$CustomButtonMode.TIME_PANEL;
       return eDIT_TEXT;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NewVoteStickerDrawerData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+", EditVoteStickerDrawerData\(question=\'"+this.Q+"\',optionOne = \'"+this.R+"\',"+" optionTwo=\'"+this.S+"\', optionThree=\'"+this.T+"\'\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(NewVoteStickerDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewVoteStickerDrawerData.class, "9")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.Q);
       p0.writeString(this.R);
       p0.writeString(this.S);
       p0.writeString(this.T);
       p0.writeInt(this.U);
       p0.writeInt(this.V);
       p0.writeInt(this.W);
       return;
    }
}
