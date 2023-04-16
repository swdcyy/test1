package com.yxcorp.gifshow.v3.editor.sticker.model.EditWaterMarkStickerDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditWaterMarkStickerDrawerData$a;
import java.util.List;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.io.Serializable;

public final class EditWaterMarkStickerDrawerData extends EditStickerBaseDrawerData	// class@001273
{
    public List K;
    public String L;
    public String M;
    public static final Parcelable$Creator CREATOR;

    static {
       EditWaterMarkStickerDrawerData.CREATOR = new EditWaterMarkStickerDrawerData$a();
    }
    public void EditWaterMarkStickerDrawerData(){
       super(null, null, null, 7, null);
    }
    public void EditWaterMarkStickerDrawerData(EditWaterMarkStickerDrawerData p0){
       a.p(p0, "editWaterMarkStickerDrawerData");
       super(null, null, null, 7, null);
       this.a(p0);
    }
    public void EditWaterMarkStickerDrawerData(List p0,String p1,String p2){
       a.p(p0, "resourceUrls");
       a.p(p1, "relatedClientId");
       a.p(p2, "resourceFilePath");
       super(0, 0, 0, 0, 15, null);
       this.K = p0;
       this.L = p1;
       this.M = p2;
    }
    public void EditWaterMarkStickerDrawerData(List p0,String p1,String p2,int p3,u p4){
       p1 = null;
       ArrayList uArrayList = (p3 & 0x01)? new ArrayList(): p1;
       p2 = (p3 & 0x02)? "": p1;
       if (p3 & 0x04) {
          p1 = "";
       }
       super(uArrayList, p2, p1);
       return;
    }
    public final String E0(){
       return this.L;
    }
    public final String F0(){
       return this.M;
    }
    public final List G0(){
       return this.K;
    }
    public final void H0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditWaterMarkStickerDrawerData.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.L = p0;
       return;
    }
    public final void I0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditWaterMarkStickerDrawerData.class, "5")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.M = p0;
       return;
    }
    public final void J0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditWaterMarkStickerDrawerData.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.K = p0;
       return;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditWaterMarkStickerDrawerData.class, "1")) {
          return;
       }
       a.p(p0, "editWaterMarkStickerDrawerData");
       super.a(p0);
       if (p0 instanceof EditWaterMarkStickerDrawerData) {
          this.L = p0.L;
          this.M = p0.M;
          this.K = p0.K;
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditWaterMarkStickerDrawerData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString()+", EditWaterMarkStickerDrawerData\(resourceUrls="+this.K+", "+"relatedClientId=\'"+this.L+"\', resourceFilePath=\'"+this.M+"\'\)";
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(EditWaterMarkStickerDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EditWaterMarkStickerDrawerData.class, "6")) {
          return;
       }
       a.p(p0, "parcel");
       EditWaterMarkStickerDrawerData tK = this.K;
       p0.writeInt(tK.size());
       Iterator iterator = tK.iterator();
       while (iterator.hasNext()) {
          p0.writeSerializable(iterator.next());
       }
       p0.writeString(this.L);
       p0.writeString(this.M);
       return;
    }
}
