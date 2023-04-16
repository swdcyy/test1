package com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;

public final class EditStickerBaseDrawerData$a implements Parcelable$Creator	// class@00126c
{

    public void EditStickerBaseDrawerData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditStickerBaseDrawerData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new EditStickerBaseDrawerData(p0.readInt(), p0.readInt(), p0.readFloat(), p0.readFloat());
    }
    public final Object[] newArray(int p0){
       EditStickerBaseDrawerData[] uEditSticker = new EditStickerBaseDrawerData[p0];
       return uEditSticker;
    }
}
