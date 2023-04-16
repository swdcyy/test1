package com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;

public final class DraftTTSInfo$a implements Parcelable$Creator	// class@000bca
{

    public void DraftTTSInfo$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DraftTTSInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       DraftTTSInfo uDraftTTSInf = new DraftTTSInfo(p0.readInt(), p0.readInt(), p0.readDouble(), p0.readDouble(), p0.readInt(), p0.readString(), p0.readString());
       return obj;
    }
    public final Object[] newArray(int p0){
       DraftTTSInfo[] uDraftTTSInf = new DraftTTSInfo[p0];
       return uDraftTTSInf;
    }
}
