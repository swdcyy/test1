package com.kuaishou.post.story.edit.data.StoryStickerDrawerData;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import com.kuaishou.post.story.edit.data.StoryStickerDrawerData$a;
import nsd.u;
import java.lang.String;
import android.graphics.RectF;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Parcel;
import java.lang.Integer;

public class StoryStickerDrawerData extends BaseDrawerData	// class@000ace
{
    public int w;
    public static final Parcelable$Creator CREATOR;

    static {
       StoryStickerDrawerData.CREATOR = new StoryStickerDrawerData$a();
    }
    public void StoryStickerDrawerData(){
       super(0, 1, null);
    }
    public void StoryStickerDrawerData(int p0){
       this.w = p0;
    }
    public void StoryStickerDrawerData(int p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = 0;
       }
       super(p0);
       return;
    }
    public void StoryStickerDrawerData(StoryStickerDrawerData p0){
       a.p(p0, "storyStickerDrawerData");
       super(0, 1, null);
       this.a(p0);
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryStickerDrawerData.class, "1")) {
          return;
       }
       a.p(p0, "storyStickerDrawerData");
       super.a(p0);
       if (p0 instanceof StoryStickerDrawerData) {
          this.w = p0.w;
       }
       return;
    }
    public final int e0(){
       return this.w;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(StoryStickerDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StoryStickerDrawerData.class, "2")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(this.w);
       return;
    }
}
