package com.kuaishou.post.story.edit.data.StoryNormalStickerDrawerData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.edit.data.StoryNormalStickerDrawerData;

public final class StoryNormalStickerDrawerData$a implements Parcelable$Creator	// class@000acb
{

    public void StoryNormalStickerDrawerData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryNormalStickerDrawerData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new StoryNormalStickerDrawerData(p0.readString());
    }
    public final Object[] newArray(int p0){
       StoryNormalStickerDrawerData[] storyNormalS = new StoryNormalStickerDrawerData[p0];
       return storyNormalS;
    }
}
