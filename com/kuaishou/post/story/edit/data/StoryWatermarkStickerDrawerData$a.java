package com.kuaishou.post.story.edit.data.StoryWatermarkStickerDrawerData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.edit.data.StoryWatermarkStickerDrawerData;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;

public final class StoryWatermarkStickerDrawerData$a implements Parcelable$Creator	// class@000ad1
{

    public void StoryWatermarkStickerDrawerData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryWatermarkStickerDrawerData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       int i = p0.readInt();
       ArrayList uArrayList = new ArrayList(i);
       for (; i; i = i - 1) {
          uArrayList.add(p0.readSerializable());
       }
       return new StoryWatermarkStickerDrawerData(uArrayList, p0.readString(), p0.readString());
    }
    public final Object[] newArray(int p0){
       StoryWatermarkStickerDrawerData[] storyWaterma = new StoryWatermarkStickerDrawerData[p0];
       return storyWaterma;
    }
}
