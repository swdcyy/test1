package com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.element.EditLyricElementData;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.element.EditLyricElementData$a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Parcel;
import java.lang.Integer;
import urc.c;
import urc.b;
import kotlin.Pair;
import java.lang.Number;
import wba.h0;
import com.yxcorp.gifshow.edit.previewer.utils.StickerTextValueType;

public final class EditLyricElementData extends EditBaseDrawerData	// class@0010dc
{
    public String G;
    public static final Parcelable$Creator CREATOR;

    static {
       EditLyricElementData.CREATOR = new EditLyricElementData$a();
    }
    public void EditLyricElementData(String p0){
       Object obj = p0;
       a.p(obj, "mStyleId");
       Object this = obj;
       super(null, 0, 0, 0, 0, 0, 0, false, false, 0, 1023, 0);
       this.G = this;
       this.b(256);
       this.b(4096);
       this.b(0x100000);
       this.S(this.G);
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditLyricElementData.class, "2")) {
          return;
       }
       a.p(p0, "editBaseDrawerData");
       super.a(p0);
       if (p0 instanceof EditLyricElementData) {
          this.G = p0.G;
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(EditLyricElementData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EditLyricElementData.class, "3")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.G);
       return;
    }
    public final void y0(c p0,b p1,Pair p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EditLyricElementData.class, "1")) {
          return;
       }
       a.p(p0, "assetInfo");
       a.p(p1, "lyricInfo");
       a.p(p2, "size");
       this.p0(p0.a());
       this.T(2);
       this.v0(p0.c());
       this.x0(p0.b());
       this.q0(p0.d);
       this.P(p2.getFirst().floatValue());
       this.M(p2.getSecond().floatValue());
       h0 oh0 = new h0(p1.b(), p1.c(), p1.f(), p1.e(), StickerTextValueType.Draft, 0x3f800000, 0, p0.a(), 64, null);
       h0 oh01 = p2.getSecond().floatValue().b(StickerTextValueType.EditElement);
       this.Y(oh01.g());
       this.Z(oh01.h());
       this.b0(oh01.j());
       this.U(oh01.d());
       this.K(oh01.c());
       this.a0(oh01.i());
       this.W(oh01.f());
       return;
    }
}
