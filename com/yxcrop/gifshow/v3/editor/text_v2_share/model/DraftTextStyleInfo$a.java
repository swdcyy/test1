package com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import com.kwai.common.draft.model.CommonDraftTextAssetModel$ResourceType;
import java.lang.Enum;

public final class DraftTextStyleInfo$a implements Parcelable$Creator	// class@000bcc
{

    public void DraftTextStyleInfo$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftTextStyleInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       DraftTextStyleInfo uDraftTextSt = new DraftTextStyleInfo(p0.readString(), p0.readFloat(), p0.readFloat(), p0.readFloat(), p0.readString(), TextStyleValue.CREATOR.createFromParcel(p0), p0.readInt(), p0.readInt(), p0.readString(), p0.readString(), Enum.valueOf(CommonDraftTextAssetModel$ResourceType.class, p0.readString()));
       return obj;
    }
    public final Object[] newArray(int p0){
       DraftTextStyleInfo[] uDraftTextSt = new DraftTextStyleInfo[p0];
       return uDraftTextSt;
    }
}
