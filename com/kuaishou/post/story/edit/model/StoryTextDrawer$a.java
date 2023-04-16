package com.kuaishou.post.story.edit.model.StoryTextDrawer$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.edit.model.StoryTextDrawer;

public class StoryTextDrawer$a implements Parcelable$Creator	// class@000b27
{

    public void StoryTextDrawer$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       StoryTextDrawer storyTextDra = PatchProxy.applyOneRefs(p0, this, StoryTextDrawer$a.class, "1");
       if (storyTextDra != PatchProxyResult.class) {
       }else {
          storyTextDra = new StoryTextDrawer(p0);
       }
       return storyTextDra;
    }
    public Object[] newArray(int p0){
       StoryTextDrawer[] storyTextDra = new StoryTextDrawer[p0];
       return storyTextDra;
    }
}
