package com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager$TextColors$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.post.story.edit.decoration.text.StoryTextDataManager$TextColors;

public class StoryTextDataManager$TextColors$a implements Parcelable$Creator	// class@000ada
{

    public void StoryTextDataManager$TextColors$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       StoryTextDataManager$TextColors textColors = PatchProxy.applyOneRefs(p0, this, StoryTextDataManager$TextColors$a.class, "1");
       if (textColors != PatchProxyResult.class) {
       }else {
          textColors = new StoryTextDataManager$TextColors(p0);
       }
       return textColors;
    }
    public Object[] newArray(int p0){
       StoryTextDataManager$TextColors[] textColorsAr = new StoryTextDataManager$TextColors[p0];
       return textColorsAr;
    }
}
