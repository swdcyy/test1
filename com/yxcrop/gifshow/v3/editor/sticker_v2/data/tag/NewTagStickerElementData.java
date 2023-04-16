package com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData$a;
import java.lang.String;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.graphics.RectF;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import android.os.Parcel;
import android.os.Parcelable;

public final class NewTagStickerElementData extends NewStickerElementData	// class@000a88
{
    public float Q;
    public String R;
    public Size S;
    public boolean T;
    public int U;
    public static final Parcelable$Creator CREATOR;

    static {
       NewTagStickerElementData.CREATOR = new NewTagStickerElementData$a();
    }
    public void NewTagStickerElementData(String p0,Size p1,boolean p2,int p3){
       a.p(p0, "mText");
       a.p(p1, "segmentFinalSize");
       super(5, 0, 0, 0, 0, 0, 62, null);
       this.R = p0;
       this.S = p1;
       this.T = p2;
       this.U = p3;
       this.b(4096);
       this.c(256);
       this.c(1);
       this.S("TAG_STICKER");
    }
    public int B0(){
       return this.U;
    }
    public void M0(int p0){
       this.U = p0;
    }
    public void R0(NewDecorationElementData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTagStickerElementData.class, "4")) {
          return;
       }
       a.p(p0, "elementData");
       super.R0(p0);
       if (p0 instanceof NewTagStickerElementData) {
          this.R = p0.R;
          this.Q = p0.Q;
       }
       return;
    }
    public final String S0(){
       return this.R;
    }
    public final Size T0(){
       return this.S;
    }
    public final void U0(Size p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTagStickerElementData.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.S = p0;
       return;
    }
    public final void V0(int p0,int p1){
       if (PatchProxy.isSupport(NewTagStickerElementData.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NewTagStickerElementData.class, "1")) {
          return;
       }
       float f = (float)p1;
       float f1 = 38.00f;
       if (((float)p0 / f) - 0x3f100000 > 0) {
          this.n().set((float)a1.e(0), (float)a1.e(0), (float)a1.e(f1), (float)a1.e(0));
          this.o().set((float)a1.e(0), (float)a1.e(0), (float)a1.e(f1), (float)a1.e(0));
       }else {
          float f2 = 0x3df5c28f * f;
          f = f * 0.25f;
          this.n().set((float)a1.e(16.00f), f2, (float)a1.e(f1), f);
          this.o().set((float)a1.e(16.00f), f2, (float)a1.e(f1), f);
       }
       return;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NewTagStickerElementData.class, "3")) {
          return;
       }
       a.p(p0, "editStickerBaseDrawerData");
       super.a(p0);
       if (p0 instanceof NewTagStickerElementData) {
          this.R = p0.R;
          this.Q = p0.Q;
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public BaseDrawerData$CustomButtonMode j(){
       BaseDrawerData$CustomButtonMode eDIT_TEXT = (this.T != null)? BaseDrawerData$CustomButtonMode.EDIT_TEXT: BaseDrawerData$CustomButtonMode.TIME_PANEL;
       return eDIT_TEXT;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(NewTagStickerElementData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NewTagStickerElementData.class, "7")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.R);
       p0.writeParcelable(this.S, p1);
       p0.writeInt(this.T);
       p0.writeInt(this.U);
       return;
    }
}
