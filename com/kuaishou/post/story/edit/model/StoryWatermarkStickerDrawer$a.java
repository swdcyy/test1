package com.kuaishou.post.story.edit.model.StoryWatermarkStickerDrawer$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.edit.model.StoryWatermarkStickerDrawer;

public class StoryWatermarkStickerDrawer$a implements Parcelable$Creator	// class@000b29
{

    public void StoryWatermarkStickerDrawer$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       StoryWatermarkStickerDrawer storyWaterma = PatchProxy.applyOneRefs(p0, this, StoryWatermarkStickerDrawer$a.class, "1");
       if (storyWaterma != PatchProxyResult.class) {
       }else {
          storyWaterma = new StoryWatermarkStickerDrawer(p0);
       }
       return storyWaterma;
    }
    public Object[] newArray(int p0){
       StoryWatermarkStickerDrawer[] storyWaterma = new StoryWatermarkStickerDrawer[p0];
       return storyWaterma;
    }
}
