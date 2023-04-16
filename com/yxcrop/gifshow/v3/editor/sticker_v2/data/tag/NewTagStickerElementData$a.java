package com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.tag.NewTagStickerElementData;
import java.lang.ClassLoader;
import android.os.Parcelable;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;

public final class NewTagStickerElementData$a implements Parcelable$Creator	// class@000a87
{

    public void NewTagStickerElementData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewTagStickerElementData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       String str = p0.readString();
       Size size = p0.readParcelable(NewTagStickerElementData.class.getClassLoader());
       boolean b = (p0.readInt())? true: false;
       return new NewTagStickerElementData(str, size, b, p0.readInt());
    }
    public final Object[] newArray(int p0){
       NewTagStickerElementData[] newTagSticke = new NewTagStickerElementData[p0];
       return newTagSticke;
    }
}
