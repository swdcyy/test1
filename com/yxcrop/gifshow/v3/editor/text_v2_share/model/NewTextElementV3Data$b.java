package com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementV3Data$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementV3Data;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import java.lang.Enum;

public final class NewTextElementV3Data$b implements Parcelable$Creator	// class@000bd5
{

    public void NewTextElementV3Data$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewTextElementV3Data$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       boolean b = (p0.readInt())? true: false;
       String str = p0.readString();
       Object obj1 = DraftTextStyleInfo.CREATOR.createFromParcel(p0);
       int i = p0.readInt();
       DraftTTSInfo uDraftTTSInf = (p0.readInt())? DraftTTSInfo.CREATOR.createFromParcel(p0): null;
       NewTextElementV3Data newTextEleme = new NewTextElementV3Data(b, str, obj1, i, uDraftTTSInf, p0.readInt(), Enum.valueOf(BaseDrawerData$CustomButtonMode.class, p0.readString()), p0.readInt());
       return obj;
    }
    public final Object[] newArray(int p0){
       NewTextElementV3Data[] newTextEleme = new NewTextElementV3Data[p0];
       return newTextEleme;
    }
}
