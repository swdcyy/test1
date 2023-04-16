package com.kuaishou.post.story.edit.data.StoryStickerDrawerData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.edit.data.StoryStickerDrawerData;

public final class StoryStickerDrawerData$a implements Parcelable$Creator	// class@000acd
{

    public void StoryStickerDrawerData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryStickerDrawerData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new StoryStickerDrawerData(p0.readInt());
    }
    public final Object[] newArray(int p0){
       StoryStickerDrawerData[] storySticker = new StoryStickerDrawerData[p0];
       return storySticker;
    }
}
