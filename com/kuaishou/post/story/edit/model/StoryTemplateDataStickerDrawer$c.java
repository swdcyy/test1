package com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer$c;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer;

public class StoryTemplateDataStickerDrawer$c implements Parcelable$Creator	// class@000b25
{

    public void StoryTemplateDataStickerDrawer$c(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       StoryTemplateDataStickerDrawer storyTemplat = PatchProxy.applyOneRefs(p0, this, StoryTemplateDataStickerDrawer$c.class, "1");
       if (storyTemplat != PatchProxyResult.class) {
       }else {
          storyTemplat = new StoryTemplateDataStickerDrawer(p0);
       }
       return storyTemplat;
    }
    public Object[] newArray(int p0){
       StoryTemplateDataStickerDrawer[] storyTemplat = new StoryTemplateDataStickerDrawer[p0];
       return storyTemplat;
    }
}
