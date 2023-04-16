package com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditTagStickerElementData;

public final class EditTagStickerElementData$a implements Parcelable$Creator	// class@00126e
{

    public void EditTagStickerElementData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditTagStickerElementData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new EditTagStickerElementData(p0.readString());
    }
    public final Object[] newArray(int p0){
       EditTagStickerElementData[] uEditTagStic = new EditTagStickerElementData[p0];
       return uEditTagStic;
    }
}
