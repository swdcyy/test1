package com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.graphics.RectF;
import lnc.a1;
import android.os.Parcel;

public final class EditTagStickerElementData extends EditStickerBaseDrawerData	// class@00126f
{
    public float K;
    public String L;
    public static final Parcelable$Creator CREATOR;

    static {
       EditTagStickerElementData.CREATOR = new EditTagStickerElementData$a();
    }
    public void EditTagStickerElementData(String p0){
       a.p(p0, "mText");
       super(5, 0, 0, 0, 14, null);
       this.L = p0;
       this.b(4096);
       this.c(256);
       this.c(1);
       this.S("TAG_STICKER");
    }
    public final String E0(){
       return this.L;
    }
    public final void F0(int p0,int p1){
       if (PatchProxy.isSupport(EditTagStickerElementData.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, EditTagStickerElementData.class, "1")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, EditTagStickerElementData.class, "3")) {
          return;
       }
       a.p(p0, "editStickerBaseDrawerData");
       super.a(p0);
       if (p0 instanceof EditTagStickerElementData) {
          this.L = p0.L;
          this.K = p0.K;
       }
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(EditTagStickerElementData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EditTagStickerElementData.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.L);
       return;
    }
}
