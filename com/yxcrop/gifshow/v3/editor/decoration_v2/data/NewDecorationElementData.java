package com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData$a;
import java.util.List;
import android.graphics.RectF;
import nsd.u;
import java.lang.String;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import android.os.Parcel;
import kotlin.jvm.internal.a;
import android.os.Parcelable;

public class NewDecorationElementData extends EditBaseDrawerData	// class@000a30
{
    public List G;
    public int H;
    public RectF I;
    public static final Parcelable$Creator CREATOR;

    static {
       NewDecorationElementData.CREATOR = new NewDecorationElementData$a();
    }
    public void NewDecorationElementData(){
       super(null, 0, null, 7, null);
    }
    public void NewDecorationElementData(List p0,int p1,RectF p2){
       BaseDrawerData uBaseDrawerD = this;
       super(null, 0, 0, 0, 0, 0, 0, false, false, 0, 1023, null);
       uBaseDrawerD.G = p0;
       uBaseDrawerD.H = p1;
       uBaseDrawerD.I = p2;
       uBaseDrawerD.N(0);
    }
    public void NewDecorationElementData(List p0,int p1,RectF p2,int p3,u p4){
       ArrayList uArrayList = (p3 & 0x01)? new ArrayList(): null;
       if (p3 & 0x02) {
          p1 = 256;
       }
       super(uArrayList, p1, null);
       return;
    }
    public final List A0(){
       return this.G;
    }
    public int B0(){
       return this.H;
    }
    public final void C0(List p0){
       this.G = p0;
    }
    public final void D0(int p0){
       if (PatchProxy.isSupport(NewDecorationElementData.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, NewDecorationElementData.class, "2")) {
          return;
       }
       int i = 256;
       if (this.H() && !this.z0(p0)) {
          this.b(i);
       }else if(!this.H() && this.z0(p0)){
          this.c(i);
       }
       if (this.G() && !this.y0(p0)) {
          this.b(4096);
       }else if(!this.G() && this.y0(p0)){
          this.c(4096);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(NewDecorationElementData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewDecorationElementData.class, "3")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeStringList(this.G);
       p0.writeInt(this.H);
       p0.writeParcelable(this.I, p1);
       return;
    }
    public final boolean y0(int p0){
       boolean b = ((p0 & 16) == 16)? true: false;
       return b;
    }
    public final boolean z0(int p0){
       int i = 1;
       if ((p0 & i) == i) {
       }else {
          i = false;
       }
       return i;
    }
}
