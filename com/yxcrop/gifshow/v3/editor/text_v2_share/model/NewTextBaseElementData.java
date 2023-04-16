package com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData$a;
import nsd.u;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData$b;
import java.lang.String;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.List;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import android.os.Parcel;
import java.lang.Integer;
import java.lang.Enum;

public class NewTextBaseElementData extends NewDecorationElementData	// class@000bd0
{
    public final boolean J;
    public String K;
    public final int L;
    public final DraftTTSInfo M;
    public int N;
    public BaseDrawerData$CustomButtonMode O;
    public DraftTextStyleInfo P;
    public static final Parcelable$Creator CREATOR;
    public static final NewTextBaseElementData$a Q;

    static {
       NewTextBaseElementData.Q = new NewTextBaseElementData$a(null);
       NewTextBaseElementData.CREATOR = new NewTextBaseElementData$b();
    }
    public void NewTextBaseElementData(boolean p0,String p1,int p2,DraftTTSInfo p3,int p4,BaseDrawerData$CustomButtonMode p5,DraftTextStyleInfo p6){
       a.p(p1, "text");
       a.p(p5, "customIconMode");
       a.p(p6, "textStyleInfo");
       super(null, 0, null, 7, null);
       this.J = p0;
       this.K = p1;
       this.L = p2;
       this.M = p3;
       this.N = p4;
       this.O = p5;
       this.P = p6;
    }
    public int B0(){
       return this.N;
    }
    public BaseDrawerData$CustomButtonMode E0(){
       return this.O;
    }
    public String F0(){
       return this.K;
    }
    public DraftTextStyleInfo G0(){
       return this.P;
    }
    public int H0(){
       return this.L;
    }
    public DraftTTSInfo I0(){
       return this.M;
    }
    public boolean J0(){
       return this.J;
    }
    public void K0(int p0){
       this.N = p0;
    }
    public void M0(BaseDrawerData$CustomButtonMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextBaseElementData.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.O = p0;
       return;
    }
    public void N0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextBaseElementData.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.K = p0;
       return;
    }
    public void O0(DraftTextStyleInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextBaseElementData.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.P = p0;
       return;
    }
    public void P0(NewDecorationElementData p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTextBaseElementData.class, str)) {
          return;
       }
       String str1 = "elementData";
       a.p(p0, str1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, NewDecorationElementData.class, str)) {
          a.p(p0, str1);
          this.K0(p0.B0());
          this.D0(this.B0());
       }
       if (p0 instanceof NewTextBaseElementData) {
          this.N0(p0.F0());
          this.M0(p0.E0());
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NewTextBaseElementData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NewTextBaseElementData\(isSubtitle="+this.J0()+", text=\'"+this.F0()+"\', timelineWidth="+this.H0()+", ttsInfo="+this.I0()+", controlType="+this.B0()+", customIconMode="+this.E0()+", textStyleInfo="+this.G0()+')'+super.toString();
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(NewTextBaseElementData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewTextBaseElementData.class, "6")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.J);
       p0.writeString(this.K);
       p0.writeInt(this.L);
       NewTextBaseElementData tM = this.M;
       if (tM != null) {
          p0.writeInt(1);
          tM.writeToParcel(p0, 0);
       }else {
          p0.writeInt(0);
       }
       p0.writeInt(this.N);
       p0.writeString(this.O.name());
       this.P.writeToParcel(p0, 0);
       return;
    }
}
