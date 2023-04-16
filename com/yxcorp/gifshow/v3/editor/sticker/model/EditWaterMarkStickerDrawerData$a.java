package com.yxcorp.gifshow.v3.editor.sticker.model.EditWaterMarkStickerDrawerData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditWaterMarkStickerDrawerData;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;

public final class EditWaterMarkStickerDrawerData$a implements Parcelable$Creator	// class@001272
{

    public void EditWaterMarkStickerDrawerData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditWaterMarkStickerDrawerData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       int i = p0.readInt();
       ArrayList uArrayList = new ArrayList(i);
       for (; i; i = i - 1) {
          uArrayList.add(p0.readSerializable());
       }
       return new EditWaterMarkStickerDrawerData(uArrayList, p0.readString(), p0.readString());
    }
    public final Object[] newArray(int p0){
       EditWaterMarkStickerDrawerData[] uEditWaterMa = new EditWaterMarkStickerDrawerData[p0];
       return uEditWaterMa;
    }
}
