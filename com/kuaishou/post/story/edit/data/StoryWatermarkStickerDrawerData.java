package com.kuaishou.post.story.edit.data.StoryWatermarkStickerDrawerData;
import com.kuaishou.post.story.edit.data.StoryStickerDrawerData;
import com.kuaishou.post.story.edit.data.StoryWatermarkStickerDrawerData$a;
import java.util.List;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Parcel;
import java.lang.Integer;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import java.io.Serializable;

public final class StoryWatermarkStickerDrawerData extends StoryStickerDrawerData	// class@000ad2
{
    public List x;
    public String y;
    public String z;
    public static final Parcelable$Creator CREATOR;

    static {
       StoryWatermarkStickerDrawerData.CREATOR = new StoryWatermarkStickerDrawerData$a();
    }
    public void StoryWatermarkStickerDrawerData(){
       super(null, null, null, 7, null);
    }
    public void StoryWatermarkStickerDrawerData(StoryWatermarkStickerDrawerData p0){
       a.p(p0, "storyWatermarkStickerDrawerData");
       super(null, null, null, 7, null);
       this.a(p0);
    }
    public void StoryWatermarkStickerDrawerData(List p0,String p1,String p2){
       a.p(p0, "resourceUrls");
       a.p(p1, "relatedClientId");
       a.p(p2, "resourceFilePath");
       super(4);
       this.x = p0;
       this.y = p1;
       this.z = p2;
    }
    public void StoryWatermarkStickerDrawerData(List p0,String p1,String p2,int p3,u p4){
       p1 = null;
       ArrayList uArrayList = (p3 & 0x01)? new ArrayList(): p1;
       p2 = (p3 & 0x02)? "": p1;
       if (p3 & 0x04) {
          p1 = "";
       }
       super(uArrayList, p2, p1);
       return;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryWatermarkStickerDrawerData.class, "1")) {
          return;
       }
       a.p(p0, "storyStickerDrawerData");
       super.a(p0);
       if (p0 instanceof StoryWatermarkStickerDrawerData) {
          this.x = p0.x;
          this.z = p0.z;
          this.y = p0.y;
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public final String f0(){
       return this.y;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(StoryWatermarkStickerDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StoryWatermarkStickerDrawerData.class, "5")) {
          return;
       }
       a.p(p0, "parcel");
       StoryWatermarkStickerDrawerData tx = this.x;
       p0.writeInt(tx.size());
       Iterator iterator = tx.iterator();
       while (iterator.hasNext()) {
          p0.writeSerializable(iterator.next());
       }
       p0.writeString(this.y);
       p0.writeString(this.z);
       return;
    }
}
