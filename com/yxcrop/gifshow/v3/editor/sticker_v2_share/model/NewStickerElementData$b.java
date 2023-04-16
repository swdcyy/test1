package com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.model.NewStickerElementData;

public final class NewStickerElementData$b implements Parcelable$Creator	// class@000ad5
{

    public void NewStickerElementData$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewStickerElementData$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       NewStickerElementData newStickerEl = new NewStickerElementData(p0.readInt(), p0.readInt(), p0.readFloat(), p0.readFloat(), p0.readInt(), p0.readInt());
       return obj;
    }
    public final Object[] newArray(int p0){
       NewStickerElementData[] newStickerEl = new NewStickerElementData[p0];
       return newStickerEl;
    }
}
