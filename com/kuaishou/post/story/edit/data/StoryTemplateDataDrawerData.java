package com.kuaishou.post.story.edit.data.StoryTemplateDataDrawerData;
import com.kuaishou.post.story.edit.data.StoryStickerDrawerData;
import com.kuaishou.post.story.edit.data.StoryTemplateDataDrawerData$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Parcel;
import java.lang.Integer;

public final class StoryTemplateDataDrawerData extends StoryStickerDrawerData	// class@000ad0
{
    public String x;
    public String y;
    public static final Parcelable$Creator CREATOR;

    static {
       StoryTemplateDataDrawerData.CREATOR = new StoryTemplateDataDrawerData$a();
    }
    public void StoryTemplateDataDrawerData(){
       super(null, null, 3, null);
    }
    public void StoryTemplateDataDrawerData(StoryTemplateDataDrawerData p0){
       a.p(p0, "storyLocationStickerDrawerData");
       super(null, null, 3, null);
       this.a(p0);
    }
    public void StoryTemplateDataDrawerData(String p0,String p1){
       a.p(p0, "date");
       a.p(p1, "textColor");
       super(0, 1, null);
       this.x = p0;
       this.y = p1;
    }
    public void StoryTemplateDataDrawerData(String p0,String p1,int p2,u p3){
       p1 = null;
       p0 = (p2 & 0x01)? "": p1;
       if (p2 & 0x02) {
          p1 = "#80FFFFFF";
       }
       super(p0, p1);
       return;
    }
    public void a(BaseDrawerData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryTemplateDataDrawerData.class, "1")) {
          return;
       }
       a.p(p0, "drawerData");
       super.a(p0);
       if (p0 instanceof StoryTemplateDataDrawerData) {
          this.x = p0.x;
          this.y = p0.y;
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public final String f0(){
       return this.x;
    }
    public final String h0(){
       return this.y;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(StoryTemplateDataDrawerData.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StoryTemplateDataDrawerData.class, "4")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.x);
       p0.writeString(this.y);
       return;
    }
}
