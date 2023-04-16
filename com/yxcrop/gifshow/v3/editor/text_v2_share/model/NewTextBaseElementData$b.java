package com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextBaseElementData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import java.lang.Enum;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;

public final class NewTextBaseElementData$b implements Parcelable$Creator	// class@000bcf
{

    public void NewTextBaseElementData$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewTextBaseElementData$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       boolean b = (p0.readInt())? true: false;
       String str = p0.readString();
       int i = p0.readInt();
       DraftTTSInfo uDraftTTSInf = (p0.readInt())? DraftTTSInfo.CREATOR.createFromParcel(p0): null;
       NewTextBaseElementData newTextBaseE = new NewTextBaseElementData(b, str, i, uDraftTTSInf, p0.readInt(), Enum.valueOf(BaseDrawerData$CustomButtonMode.class, p0.readString()), DraftTextStyleInfo.CREATOR.createFromParcel(p0));
       return obj;
    }
    public final Object[] newArray(int p0){
       NewTextBaseElementData[] newTextBaseE = new NewTextBaseElementData[p0];
       return newTextBaseE;
    }
}
