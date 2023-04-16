package com.kuaishou.post.story.edit.data.StoryNormalStickerDrawerData;
import com.kuaishou.post.story.edit.data.StoryStickerDrawerData;
import com.kuaishou.post.story.edit.data.StoryNormalStickerDrawerData$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Parcel;
import java.lang.Integer;

public final class StoryNormalStickerDrawerData extends StoryStickerDrawerData	// class@000acc
{
    public String x;
    public static final Parcelable$Creator CREATOR;

    static {
       StoryNormalStickerDrawerData.CREATOR = new StoryNormalStickerDrawerData$a();
    }
    public void StoryNormalStickerDrawerData(){
       super(null, 1, null);
    }
    public void StoryNormalStickerDrawerData(StoryNormalStickerDrawerData p0){
       a.p(p0, "storyNormalStickerDrawerData");
       super(null, 1, null);
       this.a(p0);
    }
    public void StoryNormalStickerDrawerData(String p0){
       a.p(p0, "stickerFilePath");
       super(0, 1, null);
       this.x = p0;
    }
    public void StoryNormalStickerDrawerData(String p0,int p1,u p2){
       p0 = (p1 & 0x01)? "": null;
       super(p0);
       return;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryNormalStickerDrawerData.class, "1")) {
          return;
       }
       a.p(p0, "storyNormalStickerDrawerData");
       super.a(p0);
       if (p0 instanceof StoryNormalStickerDrawerData) {
          this.x = p0.x;
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public final String f0(){
       return this.x;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(StoryNormalStickerDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StoryNormalStickerDrawerData.class, "3")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.x);
       return;
    }
}
