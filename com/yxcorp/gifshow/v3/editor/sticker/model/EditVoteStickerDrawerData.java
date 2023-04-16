package com.yxcorp.gifshow.v3.editor.sticker.model.EditVoteStickerDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditVoteStickerDrawerData$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;

public final class EditVoteStickerDrawerData extends EditStickerBaseDrawerData	// class@001271
{
    public String K;
    public String L;
    public String M;
    public static final Parcelable$Creator CREATOR;

    static {
       EditVoteStickerDrawerData.CREATOR = new EditVoteStickerDrawerData$a();
    }
    public void EditVoteStickerDrawerData(){
       super(null, null, null, 7, null);
    }
    public void EditVoteStickerDrawerData(EditVoteStickerDrawerData p0){
       a.p(p0, "editVoteStickerDrawerData");
       super(null, null, null, 7, null);
       this.a(p0);
    }
    public void EditVoteStickerDrawerData(String p0,String p1,String p2){
       a.p(p0, "question");
       a.p(p1, "optionOne");
       a.p(p2, "optionTwo");
       super(0, 0, 0, 0, 15, null);
       this.K = p0;
       this.L = p1;
       this.M = p2;
       this.N(0);
       this.O(0);
    }
    public void EditVoteStickerDrawerData(String p0,String p1,String p2,int p3,u p4){
       p1 = null;
       p0 = (p3 & 0x01)? "": p1;
       String str = (p3 & 0x02)? "": p1;
       if (p3 & 0x04) {
          p1 = "";
       }
       super(p0, str, p1);
       return;
    }
    public final String E0(){
       return this.L;
    }
    public final String F0(){
       return this.M;
    }
    public final String G0(){
       return this.K;
    }
    public final void H0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteStickerDrawerData.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.L = p0;
       return;
    }
    public final void I0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteStickerDrawerData.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.M = p0;
       return;
    }
    public final void J0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteStickerDrawerData.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.K = p0;
       return;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditVoteStickerDrawerData.class, "1")) {
          return;
       }
       a.p(p0, "editVoteStickerDrawerData");
       super.a(p0);
       if (p0 instanceof EditVoteStickerDrawerData) {
          this.K = p0.K;
          this.L = p0.L;
          this.M = p0.M;
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditVoteStickerDrawerData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+", EditVoteStickerDrawerData\(question=\'"+this.K+"\',optionOne = \'"+this.L+"\', optionTwo=\'"+this.M+"\'\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(EditVoteStickerDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EditVoteStickerDrawerData.class, "6")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.K);
       p0.writeString(this.L);
       p0.writeString(this.M);
       return;
    }
}
