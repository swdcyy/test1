package com.yxcorp.gifshow.v3.editor.sticker.model.EditVoteStickerDrawerData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditVoteStickerDrawerData;

public final class EditVoteStickerDrawerData$a implements Parcelable$Creator	// class@001270
{

    public void EditVoteStickerDrawerData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditVoteStickerDrawerData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new EditVoteStickerDrawerData(p0.readString(), p0.readString(), p0.readString());
    }
    public final Object[] newArray(int p0){
       EditVoteStickerDrawerData[] uEditVoteSti = new EditVoteStickerDrawerData[p0];
       return uEditVoteSti;
    }
}
