package com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public class EditStickerBaseDrawerData extends EditBaseDrawerData	// class@00126d
{
    public int G;
    public int H;
    public float I;
    public float J;
    public static final Parcelable$Creator CREATOR;

    static {
       EditStickerBaseDrawerData.CREATOR = new EditStickerBaseDrawerData$a();
    }
    public void EditStickerBaseDrawerData(){
       super(0, 0, 0, 0, 15, null);
    }
    public void EditStickerBaseDrawerData(int p0,int p1,float p2,float p3){
       int i = this;
       super(null, 0, 0, 0, 0, 0, 0, false, false, 0, 1023, null);
       i.G = p0;
       i.H = p1;
       i.I = p2;
       i.J = p3;
    }
    public void EditStickerBaseDrawerData(int p0,int p1,float p2,float p3,int p4,u p5){
       if (p4 & 0x01) {
          p0 = 0;
       }
       if (p4 & 0x02) {
          p1 = -1;
       }
       if (p4 & 0x04) {
          p2 = 0;
       }
       if (p4 & 0x08) {
          p3 = 0;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public void EditStickerBaseDrawerData(EditStickerBaseDrawerData p0){
       a.p(p0, "editStickerBaseDrawerData");
       super(0, 0, 0, 0, 15, null);
       this.a(p0);
    }
    public final float A0(){
       return this.I;
    }
    public final void B0(int p0){
       this.G = p0;
    }
    public final void C0(float p0){
       this.J = p0;
    }
    public final void D0(float p0){
       this.I = p0;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditStickerBaseDrawerData.class, "1")) {
          return;
       }
       a.p(p0, "editStickerBaseDrawerData");
       super.a(p0);
       if (p0 instanceof EditStickerBaseDrawerData) {
          this.G = p0.G;
          this.I = p0.I;
          this.J = p0.J;
       }
       return;
    }
    public String d0(){
       Object obj = PatchProxy.apply(null, this, EditStickerBaseDrawerData.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.d0()+",\nstickerOriginSize:["+this.I+" *"+this.J+']';
    }
    public int describeContents(){
       return 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditStickerBaseDrawerData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+", EditStickerBaseDrawerData\(editStickerType="+this.G+", "+"stickerOriginWidth="+this.I+", stickerOriginHeight="+this.J+')';
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(EditStickerBaseDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EditStickerBaseDrawerData.class, "4")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.G);
       p0.writeInt(this.H);
       p0.writeFloat(this.I);
       p0.writeFloat(this.J);
       return;
    }
    public final int y0(){
       return this.G;
    }
    public final float z0(){
       return this.J;
    }
}
