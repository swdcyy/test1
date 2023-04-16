package com.kuaishou.post.story.edit.data.StoryTemplateDataDrawerData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.edit.data.StoryTemplateDataDrawerData;

public final class StoryTemplateDataDrawerData$a implements Parcelable$Creator	// class@000acf
{

    public void StoryTemplateDataDrawerData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryTemplateDataDrawerData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new StoryTemplateDataDrawerData(p0.readString(), p0.readString());
    }
    public final Object[] newArray(int p0){
       StoryTemplateDataDrawerData[] storyTemplat = new StoryTemplateDataDrawerData[p0];
       return storyTemplat;
    }
}
