package com.kuaishou.post.story.edit.model.StoryNormalStickerDrawer$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.edit.model.StoryNormalStickerDrawer;

public class StoryNormalStickerDrawer$a implements Parcelable$Creator	// class@000b20
{

    public void StoryNormalStickerDrawer$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       StoryNormalStickerDrawer storyNormalS = PatchProxy.applyOneRefs(p0, this, StoryNormalStickerDrawer$a.class, "1");
       if (storyNormalS != PatchProxyResult.class) {
       }else {
          storyNormalS = new StoryNormalStickerDrawer(p0);
       }
       return storyNormalS;
    }
    public Object[] newArray(int p0){
       StoryNormalStickerDrawer[] storyNormalS = new StoryNormalStickerDrawer[p0];
       return storyNormalS;
    }
}
